package de.fillikos.rf2.esctool.data;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.service.webui.httpss.model.Connection;
import de.fillikos.rf2.service.webui.httpss.model.sessioninfo.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import java.util.ArrayList;

public class RaceController {

    private int anzahlStartgruppen = 0;
    private float[] startLapPosition = new float[0];
    private boolean setBeginnStartprozedur = false;
    private boolean[] startgruppeGo = new boolean[0];
    private boolean serververlassen = false;
    private Connection server;
    private SessionInfo sessionInfo = new SessionInfo();
    private ArrayList<ArrayList<String>> startgruppeClass = new ArrayList<>();

    public RaceController() {

    }

    public void handleRace(SessionInfo sessionInfo, User[] users) {
        SessionInfo sessionInfoOld = this.sessionInfo;
        this.sessionInfo = sessionInfo;
        System.out.println(sessionInfoOld.getGamePhase() + " " + sessionInfo.getGamePhase());
        if (sessionInfoOld.getGamePhase().equals("4") && sessionInfo.getGamePhase().equals("5")) {
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

        for (int i = 0; i < startgruppeGo.length; i++) {
            if (startgruppeGo[i]) {
                int startPos = 100;
                String gridLeader = "";
                for (User user : users) {
                    if (startgruppe(user, startgruppeClass.get(i))) {
//                    if (u.getCarClass().equals("SP9 GT3") ||
//                            u.getCarClass().equals("Cup2")) {
                        int position = Integer.parseInt(user.getPosition());
                        if (startPos > position) {
                            gridLeader = String.valueOf(position);
                            startPos = position;
                        }
                    }
                }
                System.out.println("startPos: " + startPos);
                for (User user : users) {
                    if (user.getPosition().equals(gridLeader) &&
                            (user.getLapsCompleted().equals("0") || user.getLapsCompleted().equals("1"))) {
                        if (setBeginnStartprozedur) {
                            if (Float.parseFloat(user.getLapDistance()) > Float.parseFloat(sessionInfo.getLapDistance()) * 0.8) {
                                Controller.setAktualisierungsrate(300);
                            }
                            if (Float.parseFloat(user.getLapDistance()) > startLapPosition[0] || user.getLapsCompleted().equals("1")) {
                                System.out.println("Start " + (i + 1) + ". Startgruppe");
                                server.sendchat((i + 1) + ". Startgruppe Go Go Go");
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

    private boolean startgruppe(User user, ArrayList<String> startgruppeClass) {
        for (int i = 0; i < startgruppeClass.size(); i++) {
            if (user.getCarClass().equals(startgruppeClass.get(i))) {
                return true;
            }
        }
        return false;
    }

    private float generateRandomStartPos() {
        float startPos = 0;
        for (int i = 0; i < 1; i++) {
            do {
                startPos = ((int) (24110 + (Math.random() * 1000)));
            } while (startPos > Float.parseFloat(sessionInfo.getLapDistance()) - 15.0);
        }
        return startPos;
    }

    public void setServer(Connection connection) {
        this.server = connection;
    }

    public int getAnzahlStartgruppen() {
        return anzahlStartgruppen;
    }

    public void setAnzahlStartgruppen(int anzahlStartgruppen) {
        this.anzahlStartgruppen = anzahlStartgruppen;
        startgruppeGo = new boolean[anzahlStartgruppen];
        startLapPosition = new float[anzahlStartgruppen];
        for (int i = 0; i < anzahlStartgruppen; i++) {
            startgruppeGo[i] = false;
            startLapPosition[i] = generateRandomStartPos();
        }
        startgruppeGo[0] = true;
    }

    public ArrayList<ArrayList<String>> getStartgruppeClass() {
        return startgruppeClass;
    }

    public void setStartgruppeClass(ArrayList<ArrayList<String>> startgruppeClass) {
        this.startgruppeClass = startgruppeClass;
        setAnzahlStartgruppen(startgruppeClass.size());
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
