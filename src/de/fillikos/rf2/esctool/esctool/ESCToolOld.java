package de.fillikos.rf2.esctool.esctool;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.fillikos.rf2.esctool.grid.DataController;
import de.fillikos.rf2.esctool.hotlap.Hotlap;
import de.fillikos.rf2.service.webui.httpss.Connection;
import de.fillikos.rf2.service.webui.httpss.model.FileModel;
import de.fillikos.rf2.service.webui.httpss.model.PitState;
import de.fillikos.rf2.service.webui.httpss.model.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.User;

import javax.swing.*;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class ESCToolOld {

    private Connection server;
    private HashMap<String, User> oldHash, old;
    private User[] aktuell;
    private ArrayList<String> fahrer;
    private ArrayList<FileModel> strafen;
    private long time2;
    private SessionInfo sessionInfo, sessionInfoOld;
    private boolean ersteSGGo, zweiteSGGo, rennende, serververlassen;
    private float[] startLapPosition;
    private int anzahlStartgruppen = 2;
    private String[] gridPositionGridLeader;
    private int aktualisierungsrate = 500;
    private boolean[] setAktualisierungsrate, setBeginnStartprozedur;
    private boolean start = false;
    private boolean gridIniErstellt = false;
    private File qualixml = new File("D:\\VRrF2LN\\Server\\Train\\UserData\\Log\\Results");
    private ArrayList<Hotlap> hotlap;


    public ESCToolOld() {
//        server = new Connection("http://localhost:", "5397");  // lokales rF2
//        server = new Connection("http://89.163.146.67:", "5715");  // rF2LN L
//        server = new Connection("http://89.163.146.67:", "5725");  // rF2LN R
//        server = new Connection("http://89.163.146.67:", "5735");  // rF2LN T
        oldHash = new HashMap<>();
        strafen = new ArrayList<FileModel>();
        fahrer = new ArrayList<>();
        time2 = System.currentTimeMillis();
        sessionInfo = new SessionInfo();
        sessionInfoOld = new SessionInfo();
        aktuell = null;
        old = new HashMap<>();
        ersteSGGo = true;
        zweiteSGGo = false;
        startLapPosition = new float[anzahlStartgruppen];
        gridPositionGridLeader = new String[anzahlStartgruppen];
        gridPositionGridLeader[0] = "1";
        gridPositionGridLeader[1] = "27";
        setAktualisierungsrate = new boolean[anzahlStartgruppen];
        setAktualisierungsrate[0] = true;
        setAktualisierungsrate[1] = true;
        setBeginnStartprozedur = new boolean[anzahlStartgruppen];
        setBeginnStartprozedur[0] = false;
        setBeginnStartprozedur[1] = false;
        rennende = true;
        serververlassen = false;
        generateRandomStartPos();
        hotlap = new ArrayList<Hotlap>();
    }

    private void generateRandomStartPos() {
        for (int i = 0; i < anzahlStartgruppen; i++) {
            do {
                startLapPosition[i] = ((int) (24110 + (Math.random() * 1000)));
//                System.out.println(startPos[i]);
            } while (startLapPosition[i] > 24310);
        }
    }

    public void start(Connection connection) {
        System.out.println("Beginn Aufzeichnung");
        server = connection;
        while (start) {
//            System.out.println("start - while");
//            System.out.println(gridPositionGridLeader[1]);
//            System.out.println("T1: " + (System.currentTimeMillis() - time2));
//            time2 = System.currentTimeMillis();
//            long time = System.currentTimeMillis();
            server.loadData();
//            System.out.println(System.currentTimeMillis() - time);
            if (old != null) {
                old.clear();
                if (aktuell != null) {
                    for (User u : aktuell) {
                        old.put(u.getDriverName(), u);
                    }
                }
            }
            aktuell = server.getStandings();
            if (old.size() > 0) {
                for (User u : aktuell) {
                    if (old.containsKey(u.getDriverName())) {
//                        System.out.println("Driver: " + u.getDriverName() + " old: " + old.get(u.getDriverName()).getLapsCompleted() + " aktuell: " + u.getLapsCompleted());
                        // Lap Counter hat sich geändert
                        if (!u.getLapsCompleted().equals(old.get(u.getDriverName()).getLapsCompleted())) {
                            System.out.println("TEST");
                            hotlap.add(new Hotlap(sessionInfo, u));
                            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                            String timeString = df.format(new Date());

                            ObjectMapper om = new ObjectMapper();
                            try {
                                om.writeValue(Paths.get(qualixml + "\\" + timeString + "_" + sessionInfo.getServerName() + "_" + sessionInfo.getSessionEnum().toString() + ".hl").toFile(), hotlap);
                            } catch (IOException var5) {
                                var5.printStackTrace();
                            }
                        }

                    }
                }
            }
            sessionInfoOld = sessionInfo;
            sessionInfo = server.getSessionInfo();
            // Bei Sessionwechel werden die Altwerte für handleESC() geleert

            if (sessionInfo.getSessionEnum() != sessionInfoOld.getSessionEnum()) {
                oldHash.clear();
                fahrer.clear();
                System.out.println("geleert");
            }

            // 'TESTDAY' 'PRACTICE1' 'QUALIFY1' 'WARMUP' 'RACE1'
            if (sessionInfo.getSessionEnum() != null) {
                switch (sessionInfo.getSessionEnum()) {
                    case TESTDAY:
                    case PRACTICE:
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                handleQualify();
                            }
                        }).start();
                        break;
                    case WARMUP:
                        /**
                         * sessionInfo.getEndEventTimt()  ==>  15 Minuten + 30 Sekunden  ==> 930.0
                         * sessionInfo.getCurrentEventTime()
                         */
                        long endEventTime = Long.parseLong(sessionInfo.getEndEventTime().substring(0, sessionInfo.getEndEventTime().indexOf(".")));
                        long currentEventTime = Long.parseLong(sessionInfo.getCurrentEventTime().substring(0, sessionInfo.getCurrentEventTime().indexOf(".")));
//                        System.out.println(sessionInfo);
//                        System.out.println("endEventTime: " + endEventTime +
//                                " endEventTime-60: " + (endEventTime - 60) +
//                                " currentEventTime: " + currentEventTime);
                        //60 Sekunden vor Ende des WarmUps wird die Automatische Startaufstellung durchlaufen
                        if (!gridIniErstellt && ((endEventTime - 30) < currentEventTime)) {
                            gridIniErstellt = true;
                            new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    //1. Alle Q1.xml Dateien vom heutigen Tag aus dem Results Verzeichnis sammeln
                                    DateFormat df = new SimpleDateFormat("yyyy_MM_dd_");
                                    String timeString = df.format(new Date());

                                    FileFilter ff = new FileFilter() {
                                        @Override
                                        public boolean accept(File pathname) {
                                            if (pathname.toString().contains("Q1.xml") &&
                                                    pathname.toString().contains(timeString)) {
                                                return true;
                                            }
                                            return false;
                                        }
                                    };

                                    //2. Die größte Datei wird verwendet
                                    File[] files = qualixml.listFiles(ff);
                                    File file = new File("D:\\");
                                    if (files.length != 0) {
                                        file = files[0];
                                        if (files.length > 1) {
                                            for (File f : files) {
                                                if (f.length() > file.length()) {
                                                    file = f;
                                                }
                                            }
                                        }
                                    }

                                    //3. Ist eine QualiXML vorhanden und ausgewählt wird die Grid.ini und die Strafen.ini erstellt
                                    DataController dc = new DataController();
                                    if (!file.toString().equals("D:\\")) {
                                        System.out.println(file.toString());
                                        dc.load24h(file, server, new JTextField());
                                        System.out.println("grid.ini und strafen.ini wurden erstellt");
                                        //4. Nach dem erstellen wird die grid.ini ausgeführt
                                        server.sendchat("/batch grid.ini");
                                        System.out.println("grid.ini wurde ausgeführt");
                                    }
                                }
                            }).start();
                        }
                        break;
                    case QUALIFY:
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                handleQualify();
                            }
                        }).start();
//                        System.out.println(System.currentTimeMillis() - time);
                        break;
                    case RACE:
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                handleRace();
                            }
                        }).start();
//                        System.out.println(System.currentTimeMillis() - time);
                        break;
                }
            }

            try {
//                System.out.println("stop - while");
                Thread.sleep(aktualisierungsrate);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ende Aufzeichnung");
    }

    private void handleRace() {
        if (sessionInfo.getGamePhase().equals("5") && sessionInfoOld.getGamePhase().equals("4")) {
            System.out.println("Start des Rennens");
            System.out.println("1. Startgruppe Los");
            server.sendchat("1. Startgruppe Los");
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(150 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("2. Startgruppe Los");
                    server.sendchat("2. Startgruppe Los");
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(210 * 1_000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Strafen.ini wurde ausgeführt");
                    server.sendchat("/batch strafen.ini");
                }
            }).start();
        }

        //Gridleader laps = 0
        // -> lapDistance > 24000
        //  -> lapDistance > startPosition
        //   -> Go Go Go
        if (ersteSGGo) {
            for (User u : aktuell) {
                if (u.getPosition().equals(gridPositionGridLeader[0]) &&
                        (u.getLapsCompleted().equals("0") || u.getLapsCompleted().equals("1"))) {
                    if (setBeginnStartprozedur[0]) {
                        if (setAktualisierungsrate[0] && Float.parseFloat(u.getLapDistance()) > 24_000) {
                            aktualisierungsrate = 300;
                            setAktualisierungsrate[0] = false;
                        }
                        if (Float.parseFloat(u.getLapDistance()) > startLapPosition[0] || u.getLapsCompleted().equals("1")) {
                            System.out.println("Start 1. Startgruppe");
                            server.sendchat("1. Startgruppe Go Go Go");
                            ersteSGGo = false;
                            aktualisierungsrate = 500;
                            zweiteSGGo = true;
                        }
                    }
                    if (!setBeginnStartprozedur[0] && Float.parseFloat(u.getLapDistance()) > 2_000 && Float.parseFloat(u.getLapDistance()) < 4_000) {
                        setBeginnStartprozedur[0] = true;
                    }
                }
            }
        }
        if (zweiteSGGo) {
            int startPos = 100;
            for (User u : aktuell) {
                if (!u.getCarClass().equals("SP9 GT3") &&
                        !u.getCarClass().equals("Cup2")) {
//                    System.out.println("Fahrzeugklasse: " + u.getCarClass() +
//                            " Position: " + u.getPosition() +
//                            " GridLeaderPos: " + startPos);
                    int position = Integer.parseInt(u.getPosition());
                    if (startPos > position) {
                        gridPositionGridLeader[1] = String.valueOf(position);
                        startPos = position;
                    }
                }
            }
            for (User u : aktuell) {
                if (u.getPosition().equals(gridPositionGridLeader[1])) {
//                    System.out.println("position: " + u.getPosition() +
//                            " lapDistance: " + u.getLapDistance() +
//                            " startLapPosition: " + startLapPosition[1]);
//                    System.out.println(u.getLapDistance() + " < " + startPos[0]);
//                    if(setBeginnStartprozedur[1]) {
                    if (setAktualisierungsrate[1] && Float.parseFloat(u.getLapDistance()) > 24_000) {
                        aktualisierungsrate = 300;
                        setAktualisierungsrate[1] = false;
                    }
                    if (Float.parseFloat(u.getLapDistance()) > startLapPosition[1] || u.getLapsCompleted().equals("1")) {
                        System.out.println("Start 2. Startgruppe");
                        server.sendchat("2. Startgruppe Go Go Go");
                        zweiteSGGo = false;
                        aktualisierungsrate = 500;
                    }
//                    }
//                    if (!setBeginnStartprozedur[1] && Float.parseFloat(u.getLapDistance()) > 1000 && Float.parseFloat(u.getLapDistance()) < 2000) {
//                        setBeginnStartprozedur[1] = true;
//                    }
                }
            }
        }
        if (sessionInfo.getGamePhase().equals("8")) {
            if (rennende) {
                System.out.println("Rennen beendet, Fahrt in die Box wird Kontrolliert");
                fahrer.clear();
                oldHash.clear();
                rennende = false;
            }
            handleQualify();

            boolean alleDrin = true;
            for (User u : aktuell) {
                if (u.getFinishStatus().equals("FSTAT_NONE")) {
                    alleDrin = false;
                }
            }
            if (alleDrin && !serververlassen) {
                serververlassen = true;
                System.out.println("Der Server kann jetzt verlassen werden.");
                server.sendchat("Der Server kann jetzt verlassen werden.");
            }
        }
    }

    private void handleQualify() {
        for (User u : aktuell) {
            if (oldHash.containsKey(u.getDriverName())) {
                PitState pitOld = oldHash.get(u.getDriverName()).getPitStateEnum();
                PitState pitNew = u.getPitStateEnum();

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        handleESCRule(u, pitNew, pitOld, sessionInfo.getCurrentEventTime());
                    }
                }).start();

            } else {
                oldHash.put(u.getDriverName(), u);
            }
        }
    }

    private void handleESCRule(User u, PitState pitNew, PitState pitOld, String timeCode) {
//        System.out.println("start - handleESCRule");
        if (pitOld != pitNew) {
            boolean write = false;
            String klartext = "";

            /*
             * 0 == NONE = OnTrack
             * 1 == REQUEST = OnTrack PitStop Requested
             * 2 = InPitLane
             * 3 = Pitting
             * 4 == EXITING = ExitingPitLane == Vehicle in Garage
             * ENTERING
             * STOPPED
             */
            switch (pitNew) {
                case NONE:
                    switch (pitOld) {
                        case INPITLANE:
                        case PITTING:
                        case ENTERING:
                        case STOPPED:
                            break;
                        case EXITING:
                            if (fahrer.contains(u.getDriverName())) {
                                klartext = u.getDriverName() + " ist aus der Box gefahren.";
                                write = true;
                            }
//                            System.out.println(u.getDriverName() + " ist aus der Box gefahren.");
                            break;
                        case REQUEST:
//                            System.out.println(u.getDriverName() + " hat Boxenstoppanforderung abgebrochen.");
                            break;
                    }
                    break;
                case REQUEST:
                    switch (pitOld) {
                        case NONE:
//                            System.out.println(u.getDriverName() + " hat Boxenstopp angefordert.");
                            break;
                        case INPITLANE:
                        case PITTING:
                        case STOPPED:
                        case ENTERING:
                            break;
                        case EXITING:
                            //Muss händisch geprüft werden, in der Box ein Abbruch führt zu einem pitState'NONE'
                            //somit ein ESC auch innerhalb der Box (Boxenausfahrt) nicht zu erkennen
//                            System.out.println(u.getDriverName() + " hat in der Box einen Boxenstopp angefordert.");
                            break;
                    }
                    break;
                case INPITLANE:
                    switch (pitOld) {
                        case NONE:
                        case STOPPED:
                        case ENTERING:
                        case EXITING:
                        case PITTING:
                        case REQUEST:
                            break;
                    }
                    break;
                case PITTING:
                    switch (pitOld) {
                        case NONE:
                        case STOPPED:
                        case ENTERING:
                        case EXITING:
                        case INPITLANE:
                        case REQUEST:
                            break;
                    }
                    break;
                case EXITING:
                    switch (pitOld) {
                        case NONE:
                        case REQUEST:
//                            System.out.println(u.getDriverName() + " hat auf der Strecke ESC gedrückt.");
                            //Wichtig auch für die Auswertung nach dem Rennen
                            klartext = u.getDriverName() + " hat ESC gedrückt.";
                            write = true;
                            break;
                        case INPITLANE:
                        case PITTING:
                            break;
                        case ENTERING:
//                            System.out.println(u.getDriverName() + " hat in der Box ESC gedrückt.");
                            break;
                        case STOPPED:
//                            System.out.println(u.getDriverName() + " Boxenstop beendet.");
                            break;
                    }
                case ENTERING:
                    switch (pitOld) {
                        case NONE:
//                            System.out.println(u.getDriverName() + " ist in die Box gefahren.");
                            break;
                        case REQUEST:
//                            System.out.println(u.getDriverName() + " ist in die Box gefahren.");
                            break;
                        case INPITLANE:
                        case STOPPED:
                        case ENTERING:
                        case EXITING:
                        case PITTING:
                            break;
                    }
                    break;
                case STOPPED:
                    switch (pitOld) {
                        case NONE:
                        case EXITING:
                        case PITTING:
                        case INPITLANE:
                        case REQUEST:
                            break;
                        case ENTERING:
//                            System.out.println(u.getDriverName() + " Boxenstop beginnt.");
                            break;
                    }
                    break;
            }
//            System.out.println("Änderung im pitState bei: " + u.getDriverName() + " pitStateOld: " + pitOld + " zu pitState: " + pitNew);

            if (write) {
                strafen.add(new FileModel(
                        u.getDriverName(),
                        u.getFullTeamName(),
                        timeCode,
                        pitOld,
                        pitNew,
                        klartext));
                System.out.println(strafen);
                if (!fahrer.contains(u.getDriverName())) {
                    fahrer.add(u.getDriverName());
                }
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String timeString = df.format(new Date());
                server.writeFile(qualixml + "\\" + timeString + "_" + sessionInfo.getServerName() + "_" + sessionInfo.getSessionEnum().toString() + ".te", strafen);
            }
            oldHash.replace(u.getDriverName(), u);
        }
//        System.out.println("stopp - handleESCRule");

    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public boolean isStart() {
        return start;
    }

    public SessionInfo getSessionInfo() {
        return sessionInfo;
    }

    public String getGridPositionGridLeader() {
        return gridPositionGridLeader[1];
    }

    public void setGridPositionGridLeader(String gridPositionGridLeader) {
        this.gridPositionGridLeader[1] = gridPositionGridLeader;
    }

    public Connection getServer() {
        return server;
    }

    public File getQualixml() {
        return qualixml;
    }
}
