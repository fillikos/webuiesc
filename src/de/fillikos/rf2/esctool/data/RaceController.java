package de.fillikos.rf2.esctool.data;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.esctool.view.config.ModConfig;
import de.fillikos.rf2.service.webui.httpss.model.Connection;
import de.fillikos.rf2.service.webui.httpss.model.sessioninfo.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

public class RaceController {

    private float[] startLapPosition = new float[0];
    private String[] startLap = new String[0];
    private boolean setBeginnStartprozedur = false;
    private boolean[] startgruppeGo = new boolean[0];
    private boolean serverKannVerlassenWerden = false;
    private boolean isGespeichertSKVW = false;
    private Connection server;
    private SessionInfo sessionInfo = new SessionInfo();
    private boolean startgruppenInitialized = false;
    private boolean isGesendet = false;
    private File rfDir;
    private User[] users;
    private User[] usersOld;
    private ModConfig modConfig;
    private final List<String> userServerVerlassen = new ArrayList<>();

    public RaceController() {

    }

    public void handleRace(SessionInfo sessionInfo, User[] users, ModConfig modConfig, File rfDir, Connection server) {
        this.server = server;
        usersOld = this.users;
        this.users = users;
        this.modConfig = modConfig;
        this.rfDir = rfDir;
        SessionInfo sessionInfoOld = this.sessionInfo;
        this.sessionInfo = sessionInfo;

        // Startgruppen initialisieren (Startposition festlegen)
        if (!startgruppenInitialized) {
            settingUpStartgruppen();
            startgruppenInitialized = true;
        }

        // Bei Startfreigabe (rF2 intern = Rennfreigabe)
        if (sessionInfoOld.getGamePhase().equals("4") && sessionInfo.getGamePhase().equals("5")) {
            // Startfreigabe per chat
            if (modConfig.isFreigabeEinfuehrungsrundeChat()) {
                startfreigabe();
            }
            // Strafendatei laden
            if (modConfig.isStrafenLaden()) {
                startMessage(modConfig.getTimeToDoStrafen() * 1_000, "/batch strafen.ini");
            }
        }

        // Wenn Rennfreigabe by chat erfolgen soll
        if (modConfig.isRennfreigabeByChat()) {
            for (int i = 0; i < startgruppeGo.length; i++) {
                checkRennfreigabe(i);
            }
        }

        // Wenn Führender das Rennen beendet
        if (sessionInfo.getGamePhase().equals("8")) {
            // Wenn alle Fahrzeuge das Rennen beendet haben, kann der Server verlassen werden
            if (!serverKannVerlassenWerden) {
                if (checkAllVehiclesInBox()) serverKannVerlassenWerden = true;
            }
            // Server verlassen zwischen Rennende und alle Fahrzeugen haben das Rennen beendet
            if (modConfig.isServerVerlassen() && !serverKannVerlassenWerden) {
                checkServerVorErlaubnisVerlassen();
            }
            if (modConfig.isServerVerlassen() && serverKannVerlassenWerden && !isGespeichertSKVW) {
                // 1540:40:14360.0 / 15940.0
                // 4:25:40.1 / 15940.1
                SimpleDateFormat df = new SimpleDateFormat("H:mm:ss");
                userServerVerlassen.add("zulässig ab TC " +
                        df.format(Long.parseLong(sessionInfo.getCurrentEventTime().substring(0, sessionInfo.getCurrentEventTime().indexOf("."))) * 1_000) +
                        sessionInfo.getCurrentEventTime().substring(sessionInfo.getCurrentEventTime().indexOf(".")) + " / "
                        + sessionInfo.getCurrentEventTime() + " (jeweils Serverzeit aus dem Logfile, nicht der Zeitpunkt im Replay)");
                write();
                isGespeichertSKVW = true;
            }
            // Wenn alle Fahrzeuge das Rennen beendet haben, Nachricht zum Verlassen des Servers senden
            if (modConfig.isServerVerlassenMessage() && serverKannVerlassenWerden && !isGesendet) {
                server.sendchat("Der Server kann jetzt verlassen werden.");
                isGesendet = true;
            }
        }
    }

    private boolean checkAllVehiclesInBox() {
        for (User u : users) {
            if (u.getFinishStatus().equals("FSTAT_NONE")) {
                return false;
            }
        }
        return true;
    }

    private void checkServerVorErlaubnisVerlassen() {
        for (User user: users) {
            for (User userOld: usersOld) {
                if (user.getDriverName().equals(userOld.getDriverName())) {
                    if (!user.getInControl().equals(userOld.getInControl())) {
                        userServerVerlassen.add("- #" + user.getCarNumber() + ", " + user.getPitGroup() + " (TC " + sessionInfo.getCurrentEventTime() + ")");
                    }
                    break;
                }
            }
        }
    }

    private void startfreigabe() {
        if (modConfig.getStartgruppeClass().size() > 1) {
            // 1. Startgruppe direkt los
            server.sendchat("1. Startgruppe Los");
            for (int i = 1; i < modConfig.getStartgruppeClass().size(); i++) {
                startMessage(modConfig.getTimeBetweenSG() * 1_000 * i, (i + 1) + ". Startgruppe Los");
            }
        } else {
            server.sendchat("Start der Einfuehrungsrunde");
        }
    }

    private void startMessage(long time, String message) {
        new Thread(() -> {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            server.sendchat(message);
        }).start();
    }

    private void checkRennfreigabe(int i) {
        if (startgruppeGo[i]) {
            String gridLeader = findGridLeader(i);
            for (User user : users) {
                if (user.getPosition().equals(gridLeader) &&
                        (user.getLapsCompleted().equals("0") || user.getLapsCompleted().equals("1"))) {
                    checkFirstPosition(i, user);
                    break;
                }
            }
        }
    }

    private void checkFirstPosition(int i, User user) {
        if (setBeginnStartprozedur) {
            Controller.addError(user.getDriverName() + " " + user.getLapDistance() + " " + startLapPosition[i] + " " + user.getLapsCompleted() + " " + sessionInfo.getCurrentEventTime());
            if (Float.parseFloat(user.getLapDistance()) > Float.parseFloat(sessionInfo.getLapDistance()) * 0.8) {
                Controller.setAktualisierungsrate(300);
            }
            if (Float.parseFloat(user.getLapDistance()) > startLapPosition[i] && user.getLapsCompleted().equals(startLap[i])) {
                startSignalStartgruppe(i);
            }
        }
        if (!setBeginnStartprozedur &&
                Float.parseFloat(user.getLapDistance()) > Float.parseFloat(sessionInfo.getLapDistance()) * 0.1 &&
                Float.parseFloat(user.getLapDistance()) < Float.parseFloat(sessionInfo.getLapDistance()) * 0.15) {
            setBeginnStartprozedur = true;
        }
    }

    private void startSignalStartgruppe(int i) {
        Controller.addError("Start " + (i + 1) + ". Startgruppe");
        if (modConfig.getStartgruppeClass().get(0).get(0).equals("ALL")) {
            server.sendchat("Go Go Go");
        } else {
            server.sendchat((i + 1) + ". Startgruppe Go Go Go");
        }
        if (modConfig.isStartAuswertung()) {
            doStartAuswertung(i);
        }
        startgruppeGo[i] = false;
        if (i < (startgruppeGo.length - 1)) {
            startgruppeGo[i + 1] = true;
        }
        if ( startgruppeGo.length == (i + 1) ) {
            Controller.setAktualisierungsrate(500);
        }
    }

    public void doStartAuswertung(int startgrp) {
        Controller.addWarning("RaceController.doStartAuswertung() Abstandsauswertung für die " + startgrp + ". Startgruppe wird ausgeführt");
        new Thread(() -> StartAuswertung.createStartauswertung(users, rfDir, startgrp)).start();
    }

    private String findGridLeader(int i) {
        int startPos = 100;
        String gridLeader = "";
        for (User user : users) {
            if (startgruppe(user, modConfig.getStartgruppeClass().get(i))) {
                int position = Integer.parseInt(user.getPosition());
                if (startPos > position) {
                    gridLeader = String.valueOf(position);
                    startPos = position;
                }
            }
        }
        return gridLeader;
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

    public void settingUpStartgruppen() {
        int anzahlStartgruppen = modConfig.getStartgruppeClass().size();
        int minStartPos = modConfig.getMinStartPos();
        int maxStartPos = modConfig.getMaxStartPos();
        startgruppeGo = new boolean[anzahlStartgruppen];
        startLapPosition = new float[anzahlStartgruppen];
        startLap = new String[anzahlStartgruppen];
        for (int i = 0; i < anzahlStartgruppen; i++) {
            startgruppeGo[i] = false;
            startLapPosition[i] = generateRandomStartPos(minStartPos, maxStartPos);
            if (startLapPosition[i] < maxStartPos || startLapPosition[i] == 0.00f) {
                startLap[i] = "1";
            } else {
                startLap[i] = "0";
            }
        }
        startgruppeGo[0] = true;
    }

    private float generateRandomStartPos(int minStartPos, int maxStartPos) {
        if (minStartPos == 0 && maxStartPos == 0) {
            return 0.00f;
        }
        float startPos = new Random().nextInt(maxStartPos - minStartPos + 1) + Float.parseFloat(sessionInfo.getLapDistance()) + minStartPos;
        if (startPos > Float.parseFloat(sessionInfo.getLapDistance())) {
            startPos = startPos - Float.parseFloat(sessionInfo.getLapDistance());
        }
        return startPos;
    }

    private void write() {
        try {
            Files.write(Paths.get(rfDir + "\\UserData\\Log\\Results\\" + Controller.getDateFileFormat() + "R_ServerVerlassen.txt"), userServerVerlassen);
        } catch (IOException e) {
            Controller.addError(Arrays.toString(e.getStackTrace()));
            e.printStackTrace();
        }
    }

    public Connection getServer() {
        return server;
    }

    public void setServer(Connection connection) {
        this.server = connection;
    }

    public SessionInfo getSessionInfo() {
        return sessionInfo;
    }

    public void setSessionInfo(SessionInfo sessionInfo) {
        this.sessionInfo = sessionInfo;
    }
}
