package de.fillikos.rf2.esctool.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.fillikos.rf2.esctool.data.esctool.ESCTool;
import de.fillikos.rf2.esctool.data.esctool.PitVorgang;
import de.fillikos.rf2.esctool.data.grid.DataController;
import de.fillikos.rf2.esctool.data.hotlap.Hotlap;
import de.fillikos.rf2.service.webui.httpss.Connection;
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
import java.util.List;

public class SessionController {

    private RaceController raceController;
    private User[] users, usersOld;
    private SessionInfo sessionInfo, sessionInfoOld;
    private PitVorgang pitVorgang;
    private ESCTool escTool;
    private List<Hotlap> hotlaps;
    private File qualixml = new File("D:\\VRrF2LN\\Server\\Train\\UserData\\Log\\Results");
    private boolean recordHotlaps = true;
    private boolean gridIniErstellt = false;
    private Connection server;
    private boolean rennende = false;
    private ArrayList<ArrayList> startgruppeClass;

    public SessionController() {
        raceController = new RaceController();
        hotlaps = new ArrayList<>();
        escTool = new ESCTool();
    }

    public ESCTool getEscTool() {
        return escTool;
    }

    public void setEscTool(ESCTool escTool) {
        this.escTool = escTool;
    }

    public void setNewData(User[] users, SessionInfo sessionInfo, PitVorgang pitVorgang) {
        sessionInfoOld = this.sessionInfo;
        if (this.users != null) {
            this.usersOld = this.users;
        } else {
            this.usersOld = new User[0];
        }
        this.users = users;
        this.sessionInfo = sessionInfo;
        this.pitVorgang = pitVorgang;

        // 1. ESCTool einfach mal immer starten, Regulierung vom Logging über PitVorgang
        new Thread(new Runnable() {
            @Override
            public void run() {
                escTool.handleESCRule(users, sessionInfo, pitVorgang);
            }
        }).start();

        // 2. Runden Aufzeichnung
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (recordHotlaps) {
                    hotlap();
                }
            }
        }).start();

        // 3. Sessionwechsel
        if (sessionInfo.getSession().equals(sessionInfoOld.getSession())) {
            cleanData();
        }

        long endEventTime = Long.parseLong(sessionInfo.getEndEventTime().substring(0, sessionInfo.getEndEventTime().indexOf(".")));
        long currentEventTime = Long.parseLong(sessionInfo.getCurrentEventTime().substring(0, sessionInfo.getCurrentEventTime().indexOf(".")));

        switch (sessionInfo.getSessionEnum()) {
            case TESTDAY:
                break;
            case PRACTICE:
                break;
            case QUALIFY:
                break;
            case WARMUP:
                /**
                 * sessionInfo.getEndEventTimt()  ==>  15 Minuten + 30 Sekunden  ==> 930.0
                 * sessionInfo.getCurrentEventTime()
                 */
                //60 Sekunden vor Ende des WarmUps wird die Automatische Startaufstellung durchlaufen
                if (!gridIniErstellt && ((endEventTime - 30) < currentEventTime)) {
                    gridIniErstellt = true;
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            gridINI();
                        }
                    }).start();
                }
                break;
            case RACE:
                raceController.handleRace(sessionInfo, users);
                if (sessionInfo.getGamePhase().equals("8")) {
                    if (!rennende) {
                        rennende = true;
                        cleanData();
                    }
                }
                break;

            case PRACTICE1:
                break;
            case PRACTICE2:
                break;
            case PRACTICE3:
                break;
            case PRACTICE4:
                break;
            case PRACTICE5:
                break;
            case QUALIFY1:
                break;
            case QUALIFY2:
                break;
            case QUALIFY3:
                break;
            case QUALIFY4:
                break;
            case QUALIFY5:
                break;
            case RACE1:
                break;
            case RACE2:
                break;
            case RACE3:
                break;
            case RACE4:
                break;
            case RACE5:
                break;
        }
    }

    private void gridINI() {
        raceController.setStartgruppeClass(startgruppeClass);
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

    private void hotlap() {
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
                            om.writeValue(Paths.get(qualixml + "\\" +
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
    }


    public void cleanData() {
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

    public PitVorgang getPitVorgang() {
        return pitVorgang;
    }

    public void setPitVorgang(PitVorgang pitVorgang) {
        this.pitVorgang = pitVorgang;
    }

    public List<Hotlap> getHotlaps() {
        return hotlaps;
    }

    public void setHotlaps(List<Hotlap> hotlaps) {
        this.hotlaps = hotlaps;
    }

    public File getQualixml() {
        return qualixml;
    }

    public void setQualixml(File qualixml) {
        this.qualixml = qualixml;
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

    public ArrayList<ArrayList> getStartgruppeClass() {
        return startgruppeClass;
    }

    public void setStartgruppeClass(ArrayList<ArrayList> startgruppeClass) {
        this.startgruppeClass = startgruppeClass;
        raceController.setStartgruppeClass(startgruppeClass);
    }
}
