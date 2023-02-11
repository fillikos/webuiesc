package de.fillikos.rf2.esctool.data;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.esctool.view.config.ModConfig;
import de.fillikos.rf2.service.webui.httpss.model.Connection;
import de.fillikos.rf2.service.webui.httpss.model.sessioninfo.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class RaceController {

    private float[] startLapPosition = new float[0];
    private String[] startLap = new String[0];
    private boolean setBeginnStartprozedur = false;
    private boolean[] startgruppeGo = new boolean[0];
    private boolean serververlassen = false;
    private Connection server;
    private SessionInfo sessionInfo = new SessionInfo();
    private boolean startgruppenInitialized = false;
    private File rfDir;
    private User[] users;
    private ModConfig modConfig;

    public RaceController() {

    }

    public void handleRace(SessionInfo sessionInfo, User[] users, ModConfig modConfig, File rfDir) {
        this.users = users;
        this.modConfig = modConfig;
        this.rfDir = rfDir;
        if (!startgruppenInitialized) {
            startgruppenInitialized = true;
            settingUpStartgruppen(modConfig.getStartgruppeClass().size(), modConfig.getMinStartPos(), modConfig.getMaxStartPos());
            for (float v : startLapPosition) {
                if (v < (Float.parseFloat(sessionInfo.getLapDistance()) - modConfig.getMinStartPos()) ||
                        v < 0) {
                    startgruppenInitialized = false;
                }
            }
        }
        SessionInfo sessionInfoOld = this.sessionInfo;
        this.sessionInfo = sessionInfo;
        System.out.println(modConfig.isFreigabeEinfuehrungsrundeChat());
        if (modConfig.isFreigabeEinfuehrungsrundeChat() && sessionInfoOld.getGamePhase().equals("4") && sessionInfo.getGamePhase().equals("5")) {
            if (modConfig.getStartgruppeClass().size() > 1) {
                System.out.println("Start des Rennens");
                if (modConfig.getStartgruppeClass().get(0).get(0).equals("ALL")) {
                    System.out.println("Los");
                    server.sendchat("Start der Einfuehrungsrunde");
                } else {
                    System.out.println("1. Startgruppe Los");
                    server.sendchat("1. Startgruppe Los");
                }

                // Beginn bei 1, da bei einer Startgruppe keine weiteren freigegeben werden
                for (int i = 1; i < modConfig.getStartgruppeClass().size(); i++) {
                    long startgruppe = i + 1;
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(modConfig.getTimeBetweenSG() * 1_000 * (startgruppe - 1));
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(startgruppe + ". Startgruppe Los");
                            server.sendchat(startgruppe + ". Startgruppe Los");
                        }
                    }).start();
                }
            }


            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(modConfig.getTimeToDoStrafen() * 1_000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Strafen.ini wurde ausgeführt");
                    server.sendchat("/batch strafen.ini");
                }
            }).start();
        }

        if (modConfig.isRennfreigabeByChat()) {
            for (int i = 0; i < startgruppeGo.length; i++) {
                if (startgruppeGo[i]) {
                    String gridLeader = findGridLeader(i);

                    for (User user : users) {
                        if (user.getPosition().equals(gridLeader) &&
                                (user.getLapsCompleted().equals("0") || user.getLapsCompleted().equals("1"))) {
                            System.out.println(user.getLapsCompleted() + " " + user.getLapDistance() + " " + startLapPosition[i]);
                            if (setBeginnStartprozedur) {
                                Controller.addError(user.getDriverName() + " " + user.getLapDistance() + " " + startLapPosition[i] + " " + user.getLapsCompleted() + " " + sessionInfo.getCurrentEventTime());
                                if (Float.parseFloat(user.getLapDistance()) > Float.parseFloat(sessionInfo.getLapDistance()) * 0.8) {
                                    Controller.setAktualisierungsrate(300);
                                }
                                // TODO StartRunde mit einfügen, ob vor oder nach der Ziellinie die Startfreigabe erfolgen soll
                                if (Float.parseFloat(user.getLapDistance()) > startLapPosition[i] && user.getLapsCompleted().equals(startLap[i])) {
                                    Controller.addError("Start " + (i + 1) + ". Startgruppe");
                                    if (modConfig.getStartgruppeClass().get(0).get(0).equals("ALL")) {
                                        writeUsers(users, i + 1);
                                        server.sendchat("Go Go Go");
                                    } else {
                                        writeUsers(users, i+1);
                                        server.sendchat((i + 1) + ". Startgruppe Go Go Go");
                                    }
                                    startgruppeGo[i] = false;
                                    if (i < (startgruppeGo.length - 1)) {
                                        startgruppeGo[i + 1] = true;
                                    }
                                    Controller.setAktualisierungsrate(500);
                                }
                            }
                            if (!setBeginnStartprozedur &&
                                    Float.parseFloat(user.getLapDistance()) > Float.parseFloat(sessionInfo.getLapDistance()) * 0.5 &&
                                    Float.parseFloat(user.getLapDistance()) < Float.parseFloat(sessionInfo.getLapDistance()) * 0.7) {
                                setBeginnStartprozedur = true;
                            }
                            break;
                        }
                    }
                }
            }
        }

        if (sessionInfo.getGamePhase().equals("8")) {
            boolean alleDrin = true;
            for (User u : users) {
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

    private String findGridLeader(int i) {
        int startPos = 100;
        String gridLeader = "";
        for (User user : users) {
            if (startgruppe(user, modConfig.getStartgruppeClass().get(i))) {
                // Test für variable Startfreigabe vor und nach Start / Ziel
                // negative LapDistance muss umgerechnet werden oä
                if (user.getLapDistance().charAt(0) == '-') {
                    System.out.println(user.getLapDistance());
                }
                int position = Integer.parseInt(user.getPosition());
                if (startPos > position) {
                    gridLeader = String.valueOf(position);
                    startPos = position;
                }
            }
        }
        System.out.println("startPos: " + startPos);
        return gridLeader;
    }

    private void writeUsers(User[] users, int i) {
        StartAuswertung auswertung = new StartAuswertung(users);
        auswertung.getGaps();
        System.out.println("RaceController.writeUsers()");
        Controller.addWarning("RaceController: writeUsers() " + Arrays.toString(users));
        File file = new File(rfDir + "\\UserData\\Log\\Results\\Users_Startfreigabe_" + i + "_Startgruppe.txt");
        System.out.println("users: " + Arrays.toString(users));
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write(auswertung.getErgebnis().toString());
            br.write("\n\n");
            br.write(Arrays.toString(users));
        } catch (IOException e) {
            Controller.addError("Fehler beim Schreiben der Users_Startfreigabe.txt:\n" + Arrays.toString(e.getStackTrace()));
        }
    }

    private boolean startgruppe(User user, ArrayList<String> startgruppeClass) {
        if (startgruppeClass.get(0).equals("ALL")) return true;
        for (String carClass : startgruppeClass) {
            if (user.getCarClass().equals(carClass)) {
                return true;
            }
        }
        return false;
    }

    private float generateRandomStartPos(int minStartPos, int maxStartPos) {
        if (minStartPos == 0 && maxStartPos == 0) {
            return Float.parseFloat(sessionInfo.getLapDistance());
        }
        float startPos = 0;
        if (minStartPos < 0) {
            try {
                do {
                    startPos = (float) (
                            (Float.parseFloat(sessionInfo.getLapDistance()) + maxStartPos) -
                                    (Float.parseFloat(sessionInfo.getLapDistance()) + minStartPos) +
                                    (Math.random() * 1_000)
                    );
                } while (startPos < (Float.parseFloat(sessionInfo.getLapDistance() + maxStartPos) ) &&
                        startPos > (Float.parseFloat(sessionInfo.getLapDistance() + minStartPos) ));
            } catch (NumberFormatException e) {
                Controller.addError("Fehler beim erstellen der RandomStartPos");
                startgruppenInitialized = false;
            }
            if (startPos > Float.parseFloat(sessionInfo.getLapDistance())) {
                startPos = startPos - Float.parseFloat(sessionInfo.getLapDistance());
            }
        } else {
            try {
                do {
                    startPos = (float) (maxStartPos - minStartPos + (Math.random() * 1_000) );
                } while (startPos < maxStartPos  && startPos > minStartPos );
            } catch (NumberFormatException e) {
                Controller.addError("Fehler beim erstellen der RandomStartPos");
                startgruppenInitialized = false;
            }
        }
        System.out.println("StartPos: " + startPos);
        return startPos;
    }

    public void setServer(Connection connection) {
        this.server = connection;
    }

    public void settingUpStartgruppen(int anzahlStartgruppen, int minStartPos, int maxStartPos) {
        startgruppeGo = new boolean[anzahlStartgruppen];
        startLapPosition = new float[anzahlStartgruppen];
        startLap = new String[anzahlStartgruppen];
        for (int i = 0; i < anzahlStartgruppen; i++) {
            startgruppeGo[i] = false;
            startLapPosition[i] = generateRandomStartPos(minStartPos, maxStartPos);
            if (startLapPosition[i] < maxStartPos) {
                startLap[i] = "1";
            } else {
                startLap[i] = "0";
            }
        }
        startgruppeGo[0] = true;
    }

    public float[] getStartLapPosition() {
        return startLapPosition;
    }

    public void setStartLapPosition(float[] startLapPosition) {
        this.startLapPosition = startLapPosition;
    }

    public boolean isSetBeginnStartprozedur() {
        return setBeginnStartprozedur;
    }

    public void setSetBeginnStartprozedur(boolean setBeginnStartprozedur) {
        this.setBeginnStartprozedur = setBeginnStartprozedur;
    }

    public boolean[] getStartgruppeGo() {
        return startgruppeGo;
    }

    public void setStartgruppeGo(boolean[] startgruppeGo) {
        this.startgruppeGo = startgruppeGo;
    }

    public boolean isSerververlassen() {
        return serververlassen;
    }

    public void setSerververlassen(boolean serververlassen) {
        this.serververlassen = serververlassen;
    }

    public Connection getServer() {
        return server;
    }

    public SessionInfo getSessionInfo() {
        return sessionInfo;
    }

    public void setSessionInfo(SessionInfo sessionInfo) {
        this.sessionInfo = sessionInfo;
    }

}
