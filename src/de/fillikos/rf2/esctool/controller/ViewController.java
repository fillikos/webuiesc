package de.fillikos.rf2.esctool.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import de.fillikos.rf2.esctool.view.MainView;
import de.fillikos.rf2.esctool.view.ModView;
import de.fillikos.rf2.esctool.view.ServerView;
import de.fillikos.rf2.esctool.view.config.ModConfig;
import de.fillikos.rf2.esctool.view.config.ServerConfig;
import de.fillikos.rf2.esctool.view.config.ViewConfig;
import de.fillikos.rf2.service.webui.httpss.model.sessioninfo.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

public class ViewController {

    private MainView mainView;
    private ServerView serverView;
    private ModView modView;
    private ArrayList<ModConfig> modConfigList = new ArrayList<>();
    private ArrayList<ServerConfig> serverDataList = new ArrayList<>();
    private ViewConfig viewConfig = new ViewConfig();
    private File tmpDir = new File(System.getProperty("user.home") + "\\.rf2ServerManager");

    public ViewController() {
        mainView = new MainView();
        serverView = new ServerView();
        modView = new ModView();
        loadTempData();
        setTempData();
    }

    private void setTempData() {
        serverView.setServerConfigList(serverDataList);
        modView.setModConfigList(modConfigList);
        mainView.setServerConfigList(serverDataList);
        mainView.setModConfigList(modConfigList);
        mainView.getMainMenu().setViewConfig(viewConfig);
        mainView.setRf2Dir(viewConfig.getRf2Dir());
        Controller.setDirOnStartUp(viewConfig.getRf2Dir());
    }

    private void loadTempData() {
        // Ordner nicht vorhanden -> erstellen
        if (!tmpDir.exists() || tmpDir.exists() && !tmpDir.isDirectory()) {
            if (tmpDir.mkdirs()) {
                System.out.println(tmpDir + " Ordner erstellt");
            } else {
                // Wenn Datei mit gleichem Namen, kann kein Ordner erstellt werden => TODO Fehlermeldung
                System.out.println("Fehler");
            }
        }
        loadModConfig();
        loadServerConfig();
        loadViewConfig();
    }

    private void loadViewConfig() {
        ObjectMapper om = new ObjectMapper();
        try {
            viewConfig = om.readValue(new File(tmpDir + "\\ViewConfig.json"), ViewConfig.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadServerConfig() {
        ObjectMapper om = new ObjectMapper();
        try {
            CollectionType typeReference = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, ServerConfig.class);
            serverDataList = om.readValue(new File(tmpDir + "\\ServerConfig.json"), typeReference);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadModConfig() {
        ObjectMapper om = new ObjectMapper();
        try {
            CollectionType typeReference = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, ModConfig.class);
            modConfigList = om.readValue(new File(tmpDir + "\\ModConfig.json"), typeReference);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showView() {
        mainView.showView();
        mainView.getFrame().setLocation(viewConfig.tempPosition(mainView.getFrame()));
    }

    public void setViewData(SessionInfo sessionInfo, User[] users) {
        StringBuilder sessionData = new StringBuilder();
        StringBuilder playerData = new StringBuilder();
        if (mainView.getCheckAdditionalInfo()) {
            ArrayList<String> userList = new ArrayList<>();
            for (User u: users) {
                userList.add(u.getDriverName());
            }
            mainView.setUserList(userList);

            sessionData.append("SessionInfo{<br>trackName='").append(sessionInfo.getTrackName()).append('\'')
                    .append(", session='").append(sessionInfo.getSession()).append('\'')
                    .append("<br>")
                    .append(", currentEventTime='").append(sessionInfo.getCurrentEventTime()).append('\'')
                    .append(", endEventTime='").append(sessionInfo.getEndEventTime()).append('\'')
                    .append("<br>")
                    .append(", maximumLaps='").append(sessionInfo.getMaximumLaps()).append('\'')
                    .append(", lapDistance='").append(sessionInfo.getLapDistance()).append('\'')
                    .append("<br>")
                    .append(", numberOfVehicles='").append(sessionInfo.getNumberOfVehicles()).append('\'')
                    .append(", gamePhase='").append(sessionInfo.getGamePhase()).append('\'')
                    .append("<br>")
                    .append(", yellowFlagState='").append(sessionInfo.getYellowFlagState()).append('\'')
                    .append(", startLightFrame='").append(sessionInfo.getStartLightFrame()).append('\'')
                    .append("<br>")
                    .append(", numRedLights='").append(sessionInfo.getNumRedLights()).append('\'')
                    .append(", inRealtime='").append(sessionInfo.getInRealtime()).append('\'')
                    .append("<br>")
                    .append(", playerName='").append(sessionInfo.getPlayerName()).append('\'')
                    .append(", playerFileName='").append(sessionInfo.getPlayerFileName()).append('\'')
                    .append("<br>")
                    .append(", darkCloud='").append(sessionInfo.getDarkCloud()).append('\'')
                    .append(", raining='").append(sessionInfo.getRaining()).append('\'')
                    .append("<br>")
                    .append(", ambientTemp='").append(sessionInfo.getAmbientTemp()).append('\'')
                    .append(", trackTemp='").append(sessionInfo.getTrackTemp()).append('\'')
                    .append("<br>")
                    .append(", minPathWetness='").append(sessionInfo.getMinPathWetness()).append('\'')
                    .append(", averagePathWetness='").append(sessionInfo.getAveragePathWetness()).append('\'')
                    .append("<br>")
                    .append(", maxPathWetness='").append(sessionInfo.getMaxPathWetness()).append('\'')
                    .append(", gameMode='").append(sessionInfo.getGameMode()).append('\'')
                    .append("<br>")
                    .append(", passwordProtected='").append(sessionInfo.getPasswordProtected()).append('\'')
                    .append(", serverPort='").append(sessionInfo.getServerPort()).append('\'')
                    .append("<br>")
                    .append(", maxPlayers='").append(sessionInfo.getMaxPlayers()).append('\'')
                    .append(", serverName='").append(sessionInfo.getServerName()).append('\'')
                    .append("<br>")
                    .append(", startEventTime='").append(sessionInfo.getStartEventTime()).append('\'')
                    .append(", timeCompletion='").append(sessionInfo.getTimeCompletion()).append('\'')
                    .append("<br>")
                    .append(", sectorFlag=").append(Arrays.toString(sessionInfo.getSectorFlag()))
                    .append(", windSpeed=").append(sessionInfo.getWindSpeed())
                    .append("<br>")
                    .append(", raceCompletion=").append(sessionInfo.getRaceCompletion())
                    .append(", sessionEnum=").append(sessionInfo.getSessionEnum()).append('}');

            String user = mainView.getSelectedUser();
            for (User u: users) {
                if (u.getDriverName().equals(user)) {
                    playerData
                            .append("<br>")
                            .append("{slotID='").append(u.getSlotID()).append('\'')
                            .append(", driverName='").append(u.getDriverName()).append('\'')
                            .append(", vehicleName='").append(u.getVehicleName()).append('\'')
                            .append("<br>")
                            .append(", lapsCompleted='").append(u.getLapsCompleted()).append('\'')
                            .append(", sector='").append(u.getSector()).append('\'')
                            .append("<br>")
                            .append(", finishStatus='").append(u.getFinishStatus()).append('\'')
                            .append(", lapDistance='").append(u.getLapDistance()).append('\'')
                            .append("<br>")
                            .append(", pathLateral='").append(u.getPathLateral()).append('\'')
                            .append(", trackEdge='").append(u.getTrackEdge()).append('\'')
                            .append("<br>")
                            .append(", bestSectorTime1='").append(u.getBestSectorTime1()).append('\'')
                            .append(", bestSectorTime2='").append(u.getBestSectorTime2()).append('\'')
                            .append("<br>")
                            .append(", bestLapTime='").append(u.getBestLapTime()).append('\'')
                            .append(", lastSectorTime1='").append(u.getLastSectorTime1()).append('\'')
                            .append("<br>")
                            .append(", lastSectorTime2='").append(u.getLastSectorTime2()).append('\'')
                            .append(", lastLapTime='").append(u.getLastLapTime()).append('\'')
                            .append("<br>")
                            .append(", currentSectorTime1='").append(u.getCurrentSectorTime1()).append('\'')
                            .append(", currentSectorTime2='").append(u.getCurrentSectorTime2()).append('\'')
                            .append("<br>")
                            .append(", pitstops='").append(u.getPitstops()).append('\'')
                            .append(", penalties='").append(u.getPenalties()).append('\'')
                            .append("<br>")
                            .append(", player='").append(u.getPlayer()).append('\'')
                            .append(", inControl='").append(u.getInControl()).append('\'')
                            .append("<br>")
                            .append(", pitting='").append(u.getPitting()).append('\'')
                            .append(", position='").append(u.getPosition()).append('\'')
                            .append("<br>")
                            .append(", carClass='").append(u.getCarClass()).append('\'')
                            .append(", timeBehindNext='").append(u.getTimeBehindNext()).append('\'')
                            .append("<br>")
                            .append(", lapsBehindNext='").append(u.getLapsBehindNext()).append('\'')
                            .append(", timeBehindLeader='").append(u.getTimeBehindLeader()).append('\'')
                            .append("<br>")
                            .append(", lapsBehindLeader='").append(u.getLapsBehindLeader()).append('\'')
                            .append(", lapStartET='").append(u.getLapStartET()).append('\'')
                            .append("<br>")
                            .append(", headlights='").append(u.getHeadlights()).append('\'')
                            .append(", pitState='").append(u.getPitState()).append('\'')
                            .append("<br>")
                            .append(", serverScored='").append(u.getServerScored()).append('\'')
                            .append(", gamePhase='").append(u.getGamePhase()).append('\'')
                            .append("<br>")
                            .append(", qualification='").append(u.getQualification()).append('\'')
                            .append(", timeIntoLap='").append(u.getTimeIntoLap()).append('\'')
                            .append("<br>")
                            .append(", estimatedLapTime='").append(u.getEstimatedLapTime()).append('\'')
                            .append(", pitGroup='").append(u.getPitGroup()).append('\'')
                            .append("<br>")
                            .append(", flag='").append(u.getFlag()).append('\'')
                            .append(", underYellow='").append(u.getUnderYellow()).append('\'')
                            .append("<br>")
                            .append(", countLapFlag='").append(u.getCountLapFlag()).append('\'')
                            .append(", inGarageStall='").append(u.getInGarageStall()).append('\'')
                            .append("<br>")
                            .append(", upgradePack='").append(u.getUpgradePack()).append('\'')
                            .append(", pitLapDistance='").append(u.getPitLapDistance()).append('\'')
                            .append("<br>")
                            .append(", bestLapSectorTime1='").append(u.getBestLapSectorTime1()).append('\'')
                            .append(", bestLapSectorTime2='").append(u.getBestLapSectorTime2()).append('\'')
                            .append("<br>")
                            .append(", steamID='").append(u.getSteamID()).append('\'')
                            .append(", vehicleFilename='").append(u.getVehicleFilename()).append('\'')
                            .append("<br>")
                            .append(", carId='").append(u.getCarId()).append('\'')
                            .append(", carNumber='").append(u.getCarNumber()).append('\'')
                            .append("<br>")
                            .append(", fullTeamName='").append(u.getFullTeamName()).append('\'')
                            .append(", hasFocus='").append(u.getHasFocus()).append('\'')
                            .append("<br>")
                            .append(", fuelFraction='").append(u.getFuelFraction()).append('\'')
                            .append(", focus='").append(u.getFocus()).append('\'')
                            .append("<br>")
                            .append(", drsActive='").append(u.getDrsActive()).append('\'')
                            .append(", carPosition=").append(u.getCarPosition())
                            .append("<br>")
                            .append(", carVelocity=").append(u.getCarVelocity())
                            .append(", carAcceleration=").append(u.getCarAcceleration())
                            .append("<br>")
                            .append(", attackMode=").append(u.getAttackMode())
                            .append(", slotIDChanged=").append(u.isSlotIDChanged())
                            .append("<br>")
                            .append(", drsActiveChanged=").append(u.isDrsActiveChanged())
                            .append(", driverNameChanged=").append(u.isDriverNameChanged())
                            .append("<br>")
                            .append(", vehicleNameChanged=").append(u.isVehicleNameChanged())
                            .append(", lapsCompletedChanged=").append(u.isLapsCompletedChanged())
                            .append("<br>")
                            .append(", pitStateEnum=").append(u.getPitStateEnum()).append('}');
                }
            }
        }

        StringBuilder textinsert = new StringBuilder();
        long time = 0;
        long dayTime = 0;
        if (sessionInfo.getTimeCompletion().length() > 0) {
            dayTime =
                    (Long.parseLong(sessionInfo.getStartEventTime().substring(0, sessionInfo.getStartEventTime().indexOf("."))) +
                            Long.parseLong(sessionInfo.getTimeCompletion().substring(0, sessionInfo.getTimeCompletion().indexOf(".")))) * 1_000;
        } else {
            dayTime = Long.parseLong(sessionInfo.getStartEventTime().substring(0, sessionInfo.getStartEventTime().indexOf("."))) * 1_000;
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        textinsert.delete(0, textinsert.length());

        switch (sessionInfo.getSessionEnum()) {
            case TESTDAY:
                time = Long.parseLong(sessionInfo.getCurrentEventTime().substring(0, sessionInfo.getCurrentEventTime().indexOf("."))) * 1_000;
                break;
            case RACE:
            case WARMUP:
            case QUALIFY:
            case PRACTICE:
                time = Long.parseLong(sessionInfo.getEndEventTime().substring(0, sessionInfo.getEndEventTime().indexOf("."))) -
                        Long.parseLong(sessionInfo.getCurrentEventTime().substring(0, sessionInfo.getCurrentEventTime().indexOf("."))) * 1_000;
                break;
        }
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("GMT0"));


        textinsert.append("<html><body><div style=\"font-family:consolas;\">");
        textinsert.append(sessionInfo.getServerName())
                .append("<br>")
                .append("daytime: ").append(df.format(new Date(dayTime)))
                .append("<br>")
                .append("elapsed: ").append(df.format(new Date(time)))
                .append("<br>")
                .append(sessionInfo.getSession())
                .append("<br>")
                .append(sessionInfo.getNumberOfVehicles()).append(" / ").append(sessionInfo.getMaxPlayers())
                .append("<br>")
                .append("<br>")
                .append(sessionData)
                .append("<br>")
                .append("<br>")
                .append(playerData);
        textinsert.append("</div></body></html>");

        mainView.getText().setText(textinsert.toString());
        mainView.getText().repaint();
        mainView.getText().validate();
    }

    public MainView getMainView() {
        return mainView;
    }

    public void setMainView(MainView mainView) {
        this.mainView = mainView;
    }

    public ServerView getServerView() {
        return serverView;
    }

    public void setServerView(ServerView serverView) {
        this.serverView = serverView;
    }

    public ArrayList<ModConfig> getModConfigList() {
        return modConfigList;
    }

    public void setModConfigList(ArrayList<ModConfig> modConfigList) {
        this.modConfigList = modConfigList;
    }

    public ArrayList<ServerConfig> getServerDataList() {
        return serverDataList;
    }

    public void setServerDataList(ArrayList<ServerConfig> serverDataList) {
        this.serverDataList = serverDataList;
    }

    public ViewConfig getViewConfig() {
        return viewConfig;
    }

    public void setViewConfig(ViewConfig viewConfig) {
        this.viewConfig = viewConfig;
    }

    public void saveTemp() {
        // 1. Temp Ordner suchen
        File tmpDir = new File(System.getProperty("user.home") + "\\.rf2ServerManager");
        // Ordner nicht vorhanden -> erstellen
        if (!tmpDir.exists() || tmpDir.exists() && !tmpDir.isDirectory()) {
            if (tmpDir.mkdirs()) {
                System.out.println(tmpDir + " Ordner erstellt");
            } else {
                // Wenn Datei mit gleichem Namen, kann kein Ordner erstellt werden => TODO Fehlermeldung
                System.out.println("Fehler");
            }
        }
        // 2. TempDateien laden
        ObjectMapper om = new ObjectMapper();
        try {
            om.writeValue(new File(tmpDir + "\\ViewConfig.json"), viewConfig);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveServerConfig() {
        // 1. Temp Ordner suchen
        File tmpDir = new File(System.getProperty("user.home") + "\\.rf2ServerManager");
        // Ordner nicht vorhanden -> erstellen
        if (!tmpDir.exists() || tmpDir.exists() && !tmpDir.isDirectory()) {
            if (tmpDir.mkdirs()) {
                System.out.println(tmpDir + " Ordner erstellt");
            } else {
                // Wenn Datei mit gleichem Namen, kann kein Ordner erstellt werden => TODO Fehlermeldung
                System.out.println("Fehler");
            }
        }
        // 2. TempDateien laden
        ObjectMapper om = new ObjectMapper();
        try {
            om.writeValue(new File(tmpDir + "\\ServerConfig.json"), serverDataList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveModConfig() {
        // 1. Temp Ordner suchen
        File tmpDir = new File(System.getProperty("user.home") + "\\.rf2ServerManager");
        // Ordner nicht vorhanden -> erstellen
        if (!tmpDir.exists() || tmpDir.exists() && !tmpDir.isDirectory()) {
            if (tmpDir.mkdirs()) {
                System.out.println(tmpDir + " Ordner erstellt");
            } else {
                // Wenn Datei mit gleichem Namen, kann kein Ordner erstellt werden => TODO Fehlermeldung
//                System.out.println("Fehler");
            }
        }
        // 2. TempDateien laden
        ObjectMapper om = new ObjectMapper();
        try {
            om.writeValue(new File(tmpDir + "\\ModConfig.json"), modConfigList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ModView getModView() {
        return modView;
    }

    public void setModView(ModView modView) {
        this.modView = modView;
    }

    public File getTmpDir() {
        return tmpDir;
    }

    public void setTmpDir(File tmpDir) {
        this.tmpDir = tmpDir;
    }

    public void saveViewConfig() {
        // 1. Temp Ordner suchen
        File tmpDir = new File(System.getProperty("user.home") + "\\.rf2ServerManager");
        // Ordner nicht vorhanden -> erstellen
        if (!tmpDir.exists() || tmpDir.exists() && !tmpDir.isDirectory()) {
            if (tmpDir.mkdirs()) {
//                System.out.println(tmpDir + " Ordner erstellt");
            } else {
                // Wenn Datei mit gleichem Namen, kann kein Ordner erstellt werden => TODO Fehlermeldung
            }
        }
        // 2. TempDateien laden
        ObjectMapper om = new ObjectMapper();
        try {
            om.writeValue(new File(tmpDir + "\\ViewConfig.json"), viewConfig);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
