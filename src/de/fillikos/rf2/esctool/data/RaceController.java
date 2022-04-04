package de.fillikos.rf2.esctool.data;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.service.webui.httpss.Connection;
import de.fillikos.rf2.service.webui.httpss.model.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.User;

public class RaceController {

    private int anzahlStartgruppen;
    private int[] startLapPosition;
    private boolean setBeginnStartprozedur = false;
    private boolean[] startgruppeGo;
    private String[] gridPositionGridLeader;
    private boolean serververlassen = false;
    private Connection server;
    private SessionInfo sessionInfo;

    public RaceController() {

    }

    public void handleRace(SessionInfo sessionInfo, User[] users) {
        SessionInfo sessionInfoOld = this.sessionInfo;
        this.sessionInfo = sessionInfo;
        if (this.sessionInfo.getGamePhase().equals("5") && sessionInfoOld.getGamePhase().equals("4")) {
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
                for (User u : users) {
                    //TODO if für verschiedene Klassen erstellen
                    if (u.getCarClass().equals("SP9 GT3") ||
                            u.getCarClass().equals("Cup2")) {
                        int position = Integer.parseInt(u.getPosition());
                        if (startPos > position) {
                            gridPositionGridLeader[i] = String.valueOf(position);
                            startPos = position;
                        }
                    }
                }
                for (User u : users) {
                    if (u.getPosition().equals(gridPositionGridLeader[i]) &&
                            (u.getLapsCompleted().equals("0") || u.getLapsCompleted().equals("1"))) {
                        if (setBeginnStartprozedur) {
                            if (Float.parseFloat(u.getLapDistance()) > Float.parseFloat(sessionInfo.getLapDistance()) * 0.9) {
                                Controller.setAktualisierungsrate(300);
                            }
                            if (Float.parseFloat(u.getLapDistance()) > startLapPosition[0] || u.getLapsCompleted().equals("1")) {
                                System.out.println("Start " + i + ". Startgruppe");
                                server.sendchat(i + ". Startgruppe Go Go Go");
                                startgruppeGo[i] = false;
                                if (i < (startgruppeGo.length - 1)) {
                                    startgruppeGo[i + 1] = true;
                                }
                                Controller.setAktualisierungsrate(500);
                            }
                        }
                        if (!setBeginnStartprozedur && Float.parseFloat(u.getLapDistance()) > Float.parseFloat(sessionInfo.getLapDistance()) * 0.5) {
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

    private int generateRandomStartPos() {
        int startPos = 0;
        for (int i = 0; i < anzahlStartgruppen; i++) {
            do {
                startLapPosition[i] = ((int) (24110 + (Math.random() * 1000)));
            } while (startLapPosition[i] > Integer.parseInt(this.sessionInfo.getLapDistance()) - 15);
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
        for (int i = 0; i < anzahlStartgruppen; i++) {
            startgruppeGo[i] = false;
            startLapPosition[i] = generateRandomStartPos();
        }
        startgruppeGo[0] = true;
    }

    public int[] getStartLapPosition() {
        return startLapPosition;
    }

    public void setStartLapPosition(int[] startLapPosition) {
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

    public String[] getGridPositionGridLeader() {
        return gridPositionGridLeader;
    }

    public void setGridPositionGridLeader(String[] gridPositionGridLeader) {
        this.gridPositionGridLeader = gridPositionGridLeader;
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
}
