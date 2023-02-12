package de.fillikos.rf2.esctool.data.grid;

import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PluginClient {

    /**
     * #FahrzeugNummer#FahrerName#Platzierung
     */
    private ArrayList<String> fahrer;
    private Boolean schleife = true;
    private short oldSequence = -1;
    private int m_currentSequence = -1;
    private Queue<ByteBuffer> m_buffers = new LinkedList<>();

    public PluginClient() {
        fahrer = new ArrayList<String>();
    }

    public void load() {
        int port = 6789;
        try {
            InetAddress address = InetAddress.getByName("localhost");
            DatagramSocket socket = new DatagramSocket(port);
//            System.out.println("UDP Listener gestartet auf Port: " +  address.getHostAddress() + ":" + port);

            while (schleife) {

                byte[] buffer = new byte[512];
                DatagramPacket response = new DatagramPacket(buffer, buffer.length);
                socket.receive(response);

                String quote = new String(buffer, 0, response.getLength());

//                System.out.println("-----------------------------------------");
                byte[] data = response.getData();
                handle(data);

//                System.out.println("----------------------------------Ein Schleifen druchlauf durchlaufen");
            }
        } catch (UnknownHostException | SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handle(byte[] data) {
        ByteBuffer bb = ByteBuffer.allocate(data.length);
        bb.order(ByteOrder.LITTLE_ENDIAN);
        bb.put(data);
        bb.rewind();
        byte protocolVersion = bb.get();
        byte packet = bb.get();
        short sequence = bb.getShort();

        if (oldSequence == -1) {
            oldSequence = sequence;
        } else if (sequence != oldSequence) {
            schleife = false;
        }

//        System.out.println("packet " + protocolVersion + "/" + packet + "/" + sequence);

        if (protocolVersion != 1) {
//            m_logService.log(LogService.LOG_WARNING, "Unknown protocol version " + protocolVersion + ", parsing might fail");
            System.out.println("******************************UNKNOWN PROTOCOL******************************");
        }

        // TODO add proper sequence and packet order checking
        if (m_currentSequence == -1) {
            m_currentSequence = sequence;
        }
        if (m_currentSequence != sequence) {
        }

        if (packet == 0 && !m_buffers.isEmpty()) {
            ByteBuffer dest = ByteBuffer.allocate(m_buffers.size() * 512);
            dest.order(ByteOrder.LITTLE_ENDIAN);
            byte[] tmp = new byte[512 - 4];
            ByteBuffer b = m_buffers.poll();
            while (b != null) {
                int remaining = b.remaining();
                b.get(tmp, 0, remaining);
                dest.put(tmp, 0, remaining);
                b = m_buffers.poll();
            }
            dest.rewind();
            try {
                process(dest, sequence);
            } catch (Exception e) {
//                m_logService.log(LogService.LOG_WARNING, "Error parsing data", e);
                System.out.println("Error parsing data------------------------------");
            }

            // clear the queue
            m_buffers.clear();
        }
        // add to the queue
        m_buffers.add(bb);
    }

    private void process(ByteBuffer bb, short sequence) {
//        System.out.println("Processing buffer " + bb.capacity());

        int type = bb.get();
        if (type == 1) {
            // telemetry data
            // ignore for now
            System.out.println("ignoring telem data");
        } else if (type == 2) {
            try {
                // scoring data
                String trackName = getString(bb, 64);
                int session = bb.getInt();
                double eventTime = bb.getDouble();
                double endEventTime = bb.getDouble();
                double trackLapDistance = bb.getDouble();
                int numberOfVehicles = bb.getInt();
                if (numberOfVehicles > 128) {
                    // highly unlikely
                    System.out.println("???????????");
                    return;
                }
                int gamePhase = bb.get();
                int yellowFlagState = bb.get();
                int[] sectorFlags = new int[3];
                sectorFlags[0] = bb.get();
                sectorFlags[1] = bb.get();
                sectorFlags[2] = bb.get();
                int startLight = bb.get();
                int numRedLights = bb.get();

                //
                // Get Weather data
                //
                // TODO Values currently set to 0 until the weatherdata can be read from the plugin
                float darkCloud = 0f;
                float raining = 0f;
                float ambientTemp = 0f;
                float windX = 0f;
                float windY = 0f;
                float windZ = 0f;
                float onPathWetness = 0f;
                float offPathWetness = 0f;

//                WeatherData weatherData = new WeatherData(darkCloud, raining, ambientTemp, windX, windY, windZ, onPathWetness, offPathWetness);
                // End weather data
//                VehicleData[] vehicleData = new VehicleData[numberOfVehicles];
                List<String> driverAktuell = new ArrayList<>();
                for (int i = 0; i < numberOfVehicles; i++) {
                    double xPosition = bb.getDouble();
                    double zPosition = bb.getDouble();
                    int place = bb.get();
                    double lapDistance = bb.getDouble();
                    double pathLateral = bb.getDouble();
                    double speed = bb.getDouble();
                    String vehicleName = getString(bb, 64);
                    String driverName = getString(bb, 32);
                    String vehicleClass = getString(bb, 32);
                    int totalLaps = bb.getShort();
                    double bestSector1 = bb.getDouble();
                    double bestSector2 = bb.getDouble();
                    double bestLapTime = bb.getDouble();
                    double lastSector1 = bb.getDouble();
                    double lastSector2 = bb.getDouble();
                    double lastLapTime = bb.getDouble();
                    double currentSector1 = bb.getDouble();
                    double currentSector2 = bb.getDouble();
                    double timeBehindLeader = bb.getDouble();
                    int lapsBehindLeader = bb.getInt();
                    double timeBehindNext = bb.getDouble();
                    int lapsBehindNext = bb.getInt();
                    int numberOfPitstops = bb.getShort();
                    int numberOfPenalties = bb.getShort();
                    boolean inPits = bb.get() != 0;
                    int sector = bb.get();
                    int finishStatus = bb.get();
//                    vehicleData[i] = new VehicleData(xPosition, zPosition, place, lapDistance, pathLateral, speed,
//                            vehicleName, driverName, vehicleClass, totalLaps, bestSector1, bestSector2, bestLapTime,
//                            lastSector1, lastSector2, lastLapTime, currentSector1, currentSector2, timeBehindLeader, lapsBehindLeader, timeBehindNext, lapsBehindNext, numberOfPitstops,
//                            numberOfPenalties, inPits, sector, finishStatus);
//                    System.out.println(vehicleData[i].toString());
                    String[] nummer = vehicleName.split("##");
                    if (nummer.length > 1) {
                        fahrer.add(String.format("##%s##%s##%s##%s", nummer[1].substring(0, 3), driverName, place, vehicleClass));
                    } else {

                    }

                }

                String resultStreamData = getVarString(bb);
//                ScoringData sd = new ScoringData(trackName, session, trackLapDistance, eventTime, endEventTime, gamePhase, yellowFlagState, sectorFlags, startLight, numRedLights, numberOfVehicles, vehicleData, resultStreamData, weatherData);
//                sendData(sd);
            } catch (Exception e) {
                System.out.println("Error process--------------------");
                e.printStackTrace();
            }
        }
    }

    public static String getString(ByteBuffer bb, int length) {
        byte[] name = new byte[length];
        for (int i = 0; i < name.length; i++) {
            byte b = bb.get();
            if (b == 0) {
                String string = new String(name, 0, i);
                return string;
            } else {
                name[i] = b;
            }
        }
        String string = new String(name);
        return string;
    }

    public String getVarString(ByteBuffer bb) {
        int length = bb.getInt();
        if (length < 1 || length > 8000) {
            if (length != 0) {
//                m_logService.log(LogService.LOG_WARNING, "String too long or short (" + length + "), returning empty string");
                System.out.println("String too long or short");
            }
            return "";
        }
        byte[] name = new byte[length];
        for (int i = 0; i < name.length; i++) {
            byte b = bb.get();
            if (b == 0) {
                return new String(name, 0, i);
            } else {
                name[i] = b;
            }
        }
        return new String(name);
    }

    public ArrayList<String> getList() {
        return fahrer;
    }
}
