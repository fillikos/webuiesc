package de.fillikos.rf2.esctool.data.esctool;

import de.fillikos.rf2.esctool.data.hotlap.Hotlap;
import de.fillikos.rf2.service.webui.httpss.model.Connection;
import de.fillikos.rf2.service.webui.httpss.model.FileModel;
import de.fillikos.rf2.service.webui.httpss.model.sessioninfo.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import java.io.File;
import java.util.ArrayList;
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
            server.loadData();


            if (old != null) {
                old.clear();
                if (aktuell != null) {
                    for (User u : aktuell) {
                        old.put(u.getDriverName(), u);
                    }
                }
            }


            aktuell = server.getStandings();

            sessionInfoOld = sessionInfo;
            sessionInfo = server.getSessionInfo();

            // Bei Sessionwechel werden die Altwerte für handleESC() geleert


            // 'TESTDAY' 'PRACTICE1' 'QUALIFY1' 'WARMUP' 'RACE1'
            if (sessionInfo.getSessionEnum() != null) {
                switch (sessionInfo.getSessionEnum()) {
                    case TESTDAY:
                    case PRACTICE:
                    case WARMUP:

                        break;
                    case QUALIFY:
                        new Thread(new Runnable() {
                            @Override
                            public void run() {

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



}
