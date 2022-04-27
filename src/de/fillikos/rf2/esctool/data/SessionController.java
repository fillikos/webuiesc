package de.fillikos.rf2.esctool.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.esctool.data.esctool.ESCTool;
import de.fillikos.rf2.esctool.data.grid.GridIniTool;
import de.fillikos.rf2.esctool.data.hotlap.Hotlap;
import de.fillikos.rf2.esctool.view.config.ModConfig;
import de.fillikos.rf2.service.webui.httpss.model.Connection;
import de.fillikos.rf2.service.webui.httpss.model.sessioninfo.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class SessionController {

    private RaceController raceController = new RaceController();
    private User[] users, usersOld;
    private SessionInfo sessionInfo = new SessionInfo();
    private SessionInfo sessionInfoOld = new SessionInfo();
    private final ArrayList<String> manuellChatGesendet = new ArrayList<>();
    private final ArrayList<String> qualiEnd = new ArrayList<>();
    private ESCTool escTool = new ESCTool();
    private List<Hotlap> hotlaps = new ArrayList<>();
    private File rfDir = new File("D:\\VRrF2LN\\Server\\Train\\UserData\\Log\\Results");
    private boolean recordHotlaps = true;
    private boolean gridIniErstellt = false;
    private Connection server;
    private boolean rennende = false;
    private final ArrayList<String> garageSpotsAssigned = new ArrayList<>();
    private boolean fromUI = true;
    private ModConfig modConfig;
    private HashMap<String, Integer> doppel = new HashMap<>();

    public SessionController() {

    }

    public ESCTool getEscTool() {
        return escTool;
    }

    public void setEscTool(ESCTool escTool) {
        this.escTool = escTool;
    }

    public void setNewData(User[] users, SessionInfo sessionInfo, ModConfig modConfig) {
        Controller.addLog("SessionController.setNewData()");
        this.modConfig = modConfig;
        sessionInfoOld = this.sessionInfo;
        this.sessionInfo = sessionInfo;
        if (this.users != null) {
            this.usersOld = this.users;
        } else {
            this.usersOld = new User[0];
        }
        this.users = users;

        // 1. ESCTool einfach mal immer starten, Regulierung vom Logging über PitVorgang
        new Thread(() -> {
            Controller.addLog("SessionController -> handleESCRule()");
            escTool.handleESCRule(users, sessionInfo, modConfig);
        }).start();

        // 2. Runden Aufzeichnung
        if (modConfig.isRecordHotlaps()) {
            Controller.addLog("SessionController -> hotlap() recordHotlaps: " + modConfig.isRecordHotlaps());
            hotlap();
        }

        // 3. Sessionwechsel
        if (!sessionInfo.getSession().equals(sessionInfoOld.getSession())) {
            Controller.addWarning("SessionController -> Sessionwechsel: -> cleanData()");
            cleanData();
        }

        long endEventTime = Long.parseLong(sessionInfo.getEndEventTime().substring(0, sessionInfo.getEndEventTime().indexOf(".")));
        long currentEventTime = Long.parseLong(sessionInfo.getCurrentEventTime().substring(0, sessionInfo.getCurrentEventTime().indexOf(".")));

        System.out.println(sessionInfo.getCurrentEventTime());
        Controller.addLog("SessionController Session: " + sessionInfo.getSession());
        Controller.addLog(modConfig.toString());

        switch (sessionInfo.getSessionEnum()) {
            case TESTDAY:
                for (String eintrag : modConfig.getManuelleNachrichten().get(0)) {
                    String[] element = eintrag.split("==>");
                    if (element[1].equals(sessionInfo.getCurrentEventTime().substring(0, sessionInfo.getCurrentEventTime().indexOf("."))) &&
                            !manuellChatGesendet.contains(element[1])) {
                        server.sendchat(element[2]);
                        manuellChatGesendet.add(element[1]);
                    }
                }
                break;
            case PRACTICE:
                for (String eintrag : modConfig.getManuelleNachrichten().get(1)) {
                    String[] element = eintrag.split("==>");
                    if (element[1].equals(sessionInfo.getCurrentEventTime().substring(0, sessionInfo.getCurrentEventTime().indexOf("."))) &&
                            !manuellChatGesendet.contains(element[1])) {
                        server.sendchat(element[2]);
                        manuellChatGesendet.add(element[1]);
                    }
                }
                if (modConfig.isAssignPitByTeam()) {
                    assignPitByTeam(users);
                }
                if (modConfig.isAssignPitByDriver()) {
                    assignPitByDriver(users);
                }
                if (modConfig.isCheckDoppelTeam()) {
                    checkDoppelTeam(users);
                }
                break;
            case QUALIFY:
                for (String eintrag : modConfig.getManuelleNachrichten().get(2)) {
                    String[] element = eintrag.split("==>");
                    if (element[1].equals(sessionInfo.getCurrentEventTime().substring(0, sessionInfo.getCurrentEventTime().indexOf("."))) &&
                            !manuellChatGesendet.contains(element[1])) {
                        server.sendchat(element[2]);
                        manuellChatGesendet.add(element[1]);
                    }
                }

                if (modConfig.isVrQualiMode()) {
                    for (User user : users) {
                        if (user.getCarClass().equals("GTD") && !qualiEnd.contains(user.getDriverName()) &&
                                (Integer.parseInt(user.getLapStartET().substring(0, user.getLapStartET().indexOf("."))) > 900 &&
                                        Integer.parseInt(user.getLapStartET().substring(0, user.getLapStartET().indexOf("."))) < 1020)) {
                            server.sendchat("/w " + user.getDriverName() + " Qualifikation zu ende. Box Box Box!");
                            qualiEnd.add(user.getDriverName());
                        }
                        if (user.getCarClass().equals("LMP3") && !qualiEnd.contains(user.getDriverName()) &&
                                (Integer.parseInt(user.getLapStartET().substring(0, user.getLapStartET().indexOf("."))) > 1920 &&
                                        Integer.parseInt(user.getLapStartET().substring(0, user.getLapStartET().indexOf("."))) < 2040)) {
                            server.sendchat("/w " + user.getDriverName() + " Qualifikation zu ende. Box Box Box!");
                            qualiEnd.add(user.getDriverName());
                        }
                        if (user.getCarClass().equals("LMP2") && !qualiEnd.contains(user.getDriverName()) &&
                                (Integer.parseInt(user.getLapStartET().substring(0, user.getLapStartET().indexOf("."))) > 2940 &&
                                        Integer.parseInt(user.getLapStartET().substring(0, user.getLapStartET().indexOf("."))) < 3000)) {
                            server.sendchat("/w " + user.getDriverName() + " Qualifikation zu ende. Box Box Box!");
                            qualiEnd.add(user.getDriverName());
                        }
                    }
                }

                if (modConfig.isAssignPitByTeam()) {
                    assignPitByTeam(users);
                }
                if (modConfig.isAssignPitByDriver()) {
                    assignPitByDriver(users);
                }
                if (modConfig.isCheckDoppelTeam()) {
                    checkDoppelTeam(users);
                }
                break;
            case WARMUP:
                for (String eintrag : modConfig.getManuelleNachrichten().get(3)) {
                    String[] element = eintrag.split("==>");
                    if (element[1].equals(sessionInfo.getCurrentEventTime().substring(0, sessionInfo.getCurrentEventTime().indexOf("."))) &&
                            !manuellChatGesendet.contains(element[1])) {
                        server.sendchat(element[2]);
                        manuellChatGesendet.add(element[1]);
                    }
                }
                /*
                 * sessionInfo.getEndEventTimt()  ==>  15 Minuten + 30 Sekunden  ==> 930.0
                 * sessionInfo.getCurrentEventTime()
                 */
                //60 Sekunden vor Ende des WarmUps wird die Automatische Startaufstellung durchlaufen
                if (!gridIniErstellt && ((endEventTime - 1) < currentEventTime)) {
                    gridIniErstellt = true;
                    System.out.println("WarmUp");
                    setFromUI(false);
                    if (modConfig.isGridIniErstellen()) {
                        Controller.addError("SessionController.GridINI() wird ausgeführt");
                        gridINI();
                    }
                }
                if (modConfig.isAssignPitByTeam()) {
                    assignPitByTeam(users);
                }
                if (modConfig.isAssignPitByDriver()) {
                    assignPitByDriver(users);
                }
                if (modConfig.isCheckDoppelTeam()) {
                    checkDoppelTeam(users);
                }
                break;
            case RACE:
                for (String eintrag : modConfig.getManuelleNachrichten().get(4)) {
                    String[] element = eintrag.split("==>");
                    if (element[1].equals(sessionInfo.getCurrentEventTime().substring(0, sessionInfo.getCurrentEventTime().indexOf("."))) &&
                            !manuellChatGesendet.contains(element[1])) {
                        server.sendchat(element[2]);
                        manuellChatGesendet.add(element[1]);
                    }
                }
                if (modConfig.isRennfreigabeByChat()) {
                    Controller.addError("SessionController -> handleRace() wird ausgeührt");
                    raceController.handleRace(sessionInfo, users, modConfig);
                }
                if (sessionInfo.getGamePhase().equals("8")) {
                    if (!rennende) {
                        rennende = true;
                        cleanData();
                    }
                }
                break;

//            case PRACTICE1:
//                break;
//            case PRACTICE2:
//                break;
//            case PRACTICE3:
//                break;
//            case PRACTICE4:
//                break;
//            case PRACTICE5:
//                break;
//            case QUALIFY1:
//                break;
//            case QUALIFY2:
//                break;
//            case QUALIFY3:
//                break;
//            case QUALIFY4:
//                break;
//            case QUALIFY5:
//                break;
//            case RACE1:
//                break;
//            case RACE2:
//                break;
//            case RACE3:
//                break;
//            case RACE4:
//                break;
//            case RACE5:
//                break;
        }


    }

    private void assignPitByTeam(User[] users) {
        new Thread(() -> {
            for (User user : users) {
                if (!garageSpotsAssigned.contains(user.getFullTeamName())) {
                    garageSpotsAssigned.add(user.getFullTeamName());
                    server.sendchat("/pitbyteam " + garageSpotsAssigned.size() + " " + user.getFullTeamName());
                    break;
                }
            }
        }).start();
    }

    private void assignPitByDriver(User[] users) {
        new Thread(() -> {
            for (User user : users) {
                if (!garageSpotsAssigned.contains(user.getDriverName())) {
                    garageSpotsAssigned.add(user.getDriverName());
                    server.sendchat("/pitbydriver " + garageSpotsAssigned.size() + " " + user.getDriverName());
                    break;
                }
            }
        }).start();
    }

    private void checkDoppelTeam(User[] users) {
        // /callvote kick username funktioniert nicht als Server, nur als Chatbefehl im Spiel
        new Thread(() -> {
            ArrayList<String> vehicles = new ArrayList<>();
            ArrayList<String> doubleTeams = new ArrayList<>();
            for (User user : users) {
                if (vehicles.contains(user.getFullTeamName())) {
                    if (doppel.containsKey(user.getFullTeamName())) {
                        if (doppel.get(user.getFullTeamName()) > 0) {
                            int i = doppel.get(user.getFullTeamName());
                            doppel.replace(user.getFullTeamName(), (i - 1));
                        } else {
                            doppel.remove(user.getFullTeamName());
                        }
                    } else {
                        doubleTeams.add(user.getFullTeamName());
                        doppel.put(user.getFullTeamName(), 10);
                    }
                } else {
                    vehicles.add(user.getFullTeamName());
                }
            }
            for (User user : users) {
                if (doubleTeams.contains(user.getFullTeamName())) {
                    server.sendchat("/w " + user.getDriverName() + " Nur ein Teamfahrzeug auf dem Server erlaubt");
                    server.sendchat("/w " + user.getDriverName() + " Ein Fahrer vom Team " + user.getFullTeamName());
                    server.sendchat("/w " + user.getDriverName() + " Bitte wieder den Server verlassen");
                    Controller.addError(user.getDriverName() + " hat DoppelTeamCheck Warning erhalten (" + user.getFullTeamName() + ")");
                }
            }
        }).start();
    }

    public void gridINI() {
        Controller.addWarning("SessionController.gridINI()");
        new Thread(() -> {
            // 1. Alle Q1.xml Dateien vom heutigen Tag aus dem Results Verzeichnis sammeln
            DateFormat df = new SimpleDateFormat("yyyy_MM_dd_");
            String timeString = df.format(new Date());

            FileFilter ff = pathname -> pathname.toString().contains("Q1.xml") && pathname.toString().contains(timeString);

            // 2. Result-Ordner auswählen
            File resultDir = new File(rfDir + "\\UserData\\Log\\Results");
            Controller.addWarning("gridINI(): resultDir: " + resultDir.toString());

            // 3. Die größte Datei wird verwendet
            File[] files = resultDir.listFiles(ff);
            File file = new File("D:\\");
            assert files != null;
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
            Controller.addWarning("gridINI(): file: " + file.toString());

            //3. Ist eine QualiXML vorhanden und ausgewählt wird die Grid.ini und die Strafen.ini erstellt
            GridIniTool dc = new GridIniTool();
            if (!file.toString().equals("D:\\")) {
                System.out.println(file);
                dc.runGridIniTool(file, server, modConfig);
                System.out.println("grid.ini und strafen.ini wurden erstellt");
                Controller.addWarning("gridINI(): grid.ini und strafen.ini wurden erstellt");
                //4. Nach dem erstellen wird die grid.ini ausgeführt
                if (!isFromUI()) {
                    server.sendchat("/batch grid.ini");
                    System.out.println("grid.ini wurde ausgeführt");
                    Controller.addWarning("gridINI(): grid.ini wurde ausgeführt");
                    setFromUI(true);
                }
            }
        }).start();
    }

    private void hotlap() {
        new Thread(() -> {
            for (User user : users) {
                for (User userOld : usersOld) {
                    if (user.getDriverName().equals(userOld.getDriverName())) {
                        if (!user.getLapsCompleted().equals(userOld.getLapsCompleted())) {
                            //Rundenzähler hat sich geändert
                            hotlaps.add(new Hotlap(sessionInfo, user));
                            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                            String timeString = df.format(new Date());
                            ObjectMapper om = new ObjectMapper();
                            try {
                                om.writeValue(Paths.get(rfDir + "\\UserData\\Log\\Results\\" +
                                        timeString +
                                        "_" +
                                        sessionInfo.getServerName() +
                                        "_" +
                                        sessionInfo.getSession().charAt(0) +
                                        sessionInfo.getSession().substring(sessionInfo.getSession().length() - 1) +
                                        ".hl").toFile(), hotlaps);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    break;
                }
            }
        }).start();
    }


    public void cleanData() {
        manuellChatGesendet.clear();
        hotlaps.clear();
        escTool.cleanData();
    }

    public RaceController getRaceController() {
        return raceController;
    }

    public void setRaceController(RaceController raceController) {
        this.raceController = raceController;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User[] getUsersOld() {
        return usersOld;
    }

    public void setUsersOld(User[] usersOld) {
        this.usersOld = usersOld;
    }

    public SessionInfo getSessionInfo() {
        return sessionInfo;
    }

    public void setSessionInfo(SessionInfo sessionInfo) {
        this.sessionInfo = sessionInfo;
    }

    public List<Hotlap> getHotlaps() {
        return hotlaps;
    }

    public void setHotlaps(List<Hotlap> hotlaps) {
        this.hotlaps = hotlaps;
    }

    public File getRfDir() {
        return rfDir;
    }

    public void setRfDir(File rfDir) {
        escTool.setRfDir(rfDir);
        this.rfDir = rfDir;
    }

    public boolean isRecordHotlaps() {
        return recordHotlaps;
    }

    public void setRecordHotlaps(boolean recordHotlaps) {
        this.recordHotlaps = recordHotlaps;
    }

    public void setServer(Connection connection) {
        this.server = connection;
    }

    public SessionInfo getSessionInfoOld() {
        return sessionInfoOld;
    }

    public void setSessionInfoOld(SessionInfo sessionInfoOld) {
        this.sessionInfoOld = sessionInfoOld;
    }

    public boolean isGridIniErstellt() {
        return gridIniErstellt;
    }

    public void setGridIniErstellt(boolean gridIniErstellt) {
        this.gridIniErstellt = gridIniErstellt;
    }

    public Connection getServer() {
        return server;
    }

    public boolean isRennende() {
        return rennende;
    }

    public void setRennende(boolean rennende) {
        this.rennende = rennende;
    }

    public boolean isFromUI() {
        return fromUI;
    }

    public void setFromUI(boolean fromUI) {
        this.fromUI = fromUI;
    }
}
