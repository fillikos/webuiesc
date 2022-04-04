package de.fillikos.rf2.esctool.data.sonstiges;

import de.fillikos.rf2.service.webui.httpss.Connection;
import de.fillikos.rf2.service.webui.httpss.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class RedFlagStart {

    private Connection server;
    private ArrayList<User> startaufstellung, aufzeichnung;
    private ArrayList<String> lapAddieren;
    private HashMap<String, User> serverliste;
    private boolean is24h = true;

    public RedFlagStart() {
        startaufstellung = new ArrayList<>();
//        server = new Connection("http://localhost:", "5397");
        server = new Connection("http://89.163.146.67:", "51725");
//        server = new Connection("http://89.163.146.67:", "51715");

//        server = new Connection("http://89.163.146.67:", "51735");

        lapAddieren = new ArrayList<>();
        serverliste = new HashMap<>();
    }

    private void erstelleGrid() {
        File file = new File("G:\\SteamLibrary\\steamapps\\common\\rFactor 2\\UserData\\Log\\Results\\grid");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            int position = 1;
            for (User user : startaufstellung) {
                br.write(String.format("/editgrid %d V:%s",
                        position++,
                        user.getVehicleName()));
                System.out.println(user.getCarNumber() + " " +
                        user.getVehicleName() + " " +
                        user.getDriverName() + " " +
                        user.getPosition() + " " +
                        user.getLapDistance());
                br.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void runGrid() {
        //Welche Positionen (lapDistance) waren vorher
        getAufzeichnung();
        //Wer ist auf dem Server und will fahren
        getServerListe();

        int i = 1;
        for (User u : aufzeichnung) {
            if (is24h) {
                if (serverliste.containsKey(u.getCarNumber())) {
                    serverliste.get(u.getCarNumber()).setPosition(String.valueOf(i++));
                    serverliste.get(u.getCarNumber()).setLapsCompleted(u.getLapsCompleted());
                }
            } else {
                if (serverliste.containsKey(u.getDriverName())) {
//                    System.out.println(u.getDriverName());
//                    System.out.println(u.getPosition() + " " + u.getLapsCompleted());
//                    System.out.println(serverliste.get(u.getDriverName()).getPosition() + " " + serverliste.get(u.getDriverName()).getLapsCompleted());
                    serverliste.get(u.getDriverName()).setPosition(String.valueOf(i++));
                    serverliste.get(u.getDriverName()).setLapsCompleted(u.getLapsCompleted());
//                    System.out.println(serverliste.get(u.getDriverName()).getPosition() + " " + serverliste.get(u.getDriverName()).getLapsCompleted());
                }
            }
        }
        for (String s : serverliste.keySet()) {
            startaufstellung.add(serverliste.get(s));
        }
        sortPosition(startaufstellung);
        erstelleGrid();
    }

    public void runStartprozedur() {
        for (User user : startaufstellung) {
            server.sendchat("/w " + user.getDriverName() + " Go Go Go " + user.getDriverName());
            System.out.println(new Date().toString());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void getAufzeichnung() {
        server.loadFile("D:\\rF2LN\\aufzeichnung210630225345.log");
        aufzeichnung = server.getStandingsArray();
        sortLapDistance(aufzeichnung);
    }

    public void getServerListe() {
        server.loadStandings();
        ArrayList<User> liste = server.getStandingsArray();
        int i = 100;
        for (User u : liste) {
            u.setPosition(String.valueOf(i++));
            if (is24h) {
                serverliste.put(u.getCarNumber(), u);
            } else {
                serverliste.put(u.getDriverName(), u);
            }

        }
    }

    private void sortLapDistance(ArrayList<User> liste) {
//        System.out.println(liste);
        for (int i = 0; i < liste.size(); i++) {
            for (int j = 0; j < liste.size() - 1; j++) {
                int v1 = 0;
                try {
                    v1 = Integer.parseInt(liste.get(j).getLapDistance());
                } catch (NumberFormatException e) {
                    v1 = Integer.parseInt(liste.get(j).getLapDistance().substring(0, liste.get(j).getLapDistance().indexOf(".")));
                }
                int v2 = 0;
                try {
                    try {
                        v2 = Integer.parseInt(liste.get(j + 1).getLapDistance());
                    } catch (NumberFormatException e) {
                        v2 = Integer.parseInt(liste.get(j + 1).getLapDistance().substring(0, liste.get(j + 1).getLapDistance().indexOf(".")));
                    }
//                    System.out.println(v1 + " " + v2);

                    if (v1 < v2) {
                        User temp = liste.get(j);
                        liste.set(j, liste.get(j + 1));
                        liste.set(j + 1, temp);
                    }
                } catch (NullPointerException e) {
//                    System.out.println("letzter");
                }
            }
        }
//        System.out.println(liste);

    }

    private void sortPosition(ArrayList<User> liste) {
        for (int i = 0; i < liste.size(); i++) {
            for (int j = 0; j < liste.size() - 1; j++) {
                int v1 = Integer.parseInt(liste.get(j).getPosition());
                try {
                    int v2 = Integer.parseInt(liste.get(j + 1).getPosition());
                    if (v1 > v2) {
                        User temp = liste.get(j);
                        liste.set(j, liste.get(j + 1));
                        liste.set(j + 1, temp);
                    }
                } catch (NullPointerException e) {
//                    System.out.println("letzter");
                }
            }
        }
    }

    public void runLaps() {
        getFirstPlace();
        String history = readHistory();
//        System.out.println(history);
        String[] teams = history.split("\\[\\{");
//        System.out.println(teams.length);


        HashMap<String, String> lapsDone = new HashMap<>();
        for (int i = 1; i < teams.length; i++) {
            String[] lastLap = teams[i].split("\\{");
            System.out.println(lastLap[lastLap.length - 1]);
            int laps = 0;
            String fahrer = teams[i].substring(
                    teams[i].indexOf("\"driverName\":\"") + 15,
                    teams[i].indexOf("\"", teams[i].indexOf(",\"driverName\":\"") + 15));
            String nummer = lastLap[lastLap.length - 1].substring(
                    lastLap[lastLap.length - 1].indexOf(" #") + 2,
                    lastLap[lastLap.length - 1].indexOf("\"", lastLap[lastLap.length - 1].indexOf(" #") + 2));
            String vehicleName = teams[i].substring(
                    teams[i].indexOf("\"vehicleName\":\"") + 15,
                    teams[i].indexOf("\"", teams[i].indexOf("\"vehicleName\":\"") + 15));
            laps = Integer.parseInt(lastLap[lastLap.length - 1].substring(
                    lastLap[lastLap.length - 1].indexOf("\"totalLaps\":") + 12,
                    lastLap[lastLap.length - 1].indexOf(",", lastLap[lastLap.length - 1].indexOf("\"totalLaps\":") + 12)));

            if (lapAddieren.contains(vehicleName)) {
                laps = laps + 1;
            }

//            System.out.println(fahrer + " " + nummer + " " + laps);

            if (is24h) {
                lapsDone.put(nummer, String.valueOf(laps));
            } else {
                lapsDone.put(fahrer, String.valueOf(laps));
            }
        }

        File file = new File("G:\\SteamLibrary\\steamapps\\common\\rFactor 2\\UserData\\Log\\Results\\laps");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            for (User user : startaufstellung) {
                br.write(String.format("/changelaps +%s V:%s",
                        lapsDone.get(user.getCarNumber()) != null ? lapsDone.get(user.getCarNumber()) : "0",
                        user.getVehicleName()));
//                System.out.println(user.getCarNumber() + " " +
//                        user.getVehicleName() + " " +
//                        user.getDriverName() + " " +
//                        user.getPosition() + " " +
//                        user.getLapsCompleted());
                br.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getFirstPlace() {
        for (User u : aufzeichnung) {
            if (u.getPosition().equals("1")) {
                setLapPosition(u.getLapDistance());
            }
        }
    }

    private void setLapPosition(String lapDistance) {
        int firstLapDistance = 0;
        try {
            firstLapDistance = Integer.parseInt(lapDistance);
        } catch (NumberFormatException e) {
            firstLapDistance = Integer.parseInt(lapDistance.substring(0, lapDistance.indexOf(".")));
        }
        int diff = 25309 - firstLapDistance;

        for (User u : aufzeichnung) {
            int userLapDistance = 0;
            try {
                userLapDistance = Integer.parseInt(u.getLapDistance());
            } catch (NumberFormatException e) {
                userLapDistance = Integer.parseInt(u.getLapDistance().substring(0, u.getLapDistance().indexOf(".")));
            }
            if (userLapDistance > firstLapDistance) {
                u.setLapDistance(String.valueOf(userLapDistance + diff - 25309));

                lapAddieren.add(u.getVehicleName());
            } else {
                u.setLapDistance(String.valueOf(userLapDistance + diff));
            }
        }
    }

    private String readHistory() {
        File file = new File("D:\\rF2LN\\history210704121818.log");
        StringBuilder string = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            for (String line; (line = br.readLine()) != null; ) {
                string.append(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return string.toString();
    }

    public void getFahrerListe() {
        String history = readHistory();
//        System.out.println(history);
        String[] teams = history.split("\\[");
        System.out.println(teams.length);

        ArrayList<String> fahrerList = new ArrayList<>();
        for (int i = 1; i < teams.length; i++) {
//            System.out.println(teams[i]);
            String[] teamsList = teams[i].split("\\{");
            System.out.println(teams[i].substring(
                    teams[i].indexOf("vehicleName") + 14,
                    teams[i].indexOf("\"", teams[i].indexOf("vehicleName") + 15)
            ));
            for (int j = 1; j < teamsList.length; j++) {
                String fahrer = teamsList[j].substring(
                        teamsList[j].indexOf("\"driverName\":\"") + 14,
                        teamsList[j].indexOf("\"", teams[i].indexOf(",\"driverName\":\"") + 15));
                if (!fahrerList.contains(fahrer)) {
                    fahrerList.add(fahrer);
                    System.out.println(fahrer);
                }
                if (j == teamsList.length - 1) {
                    System.out.println(teamsList[j].substring(
                            teamsList[j].indexOf("position") + 10,
                            teamsList[j].indexOf(",", teams[i].indexOf("position") + 10)
                    ));
                }
            }

        }
        System.out.println(fahrerList);
        System.out.println(fahrerList.size());
    }
}
