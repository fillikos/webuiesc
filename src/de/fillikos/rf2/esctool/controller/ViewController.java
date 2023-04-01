package de.fillikos.rf2.esctool.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import de.fillikos.rf2.esctool.view.*;
import de.fillikos.rf2.esctool.view.config.ModConfig;
import de.fillikos.rf2.esctool.view.config.ServerConfig;
import de.fillikos.rf2.esctool.view.config.ViewConfig;
import de.fillikos.rf2.service.webui.httpss.model.sessioninfo.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import javax.swing.*;
import java.awt.*;
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
    private PenalizeView penalizeView;
    private User[] users;

    public ViewController() {
        mainView = new MainView();
        serverView = new ServerView();
        modView = new ModView();
        penalizeView = new PenalizeView();
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
        this.users = users;
        // SetSessionInfo Data
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("GMT0"));
        int i = 0;
        for (Object o : mainView.getPanSessionInfo().getComponents()) {
            if (o.getClass().equals(JLabel.class)) {
                JLabel label = (JLabel) o;
                String text = label.getText();
                switch (i) {
                    case 1: text = sessionInfo.getServerName(); break;
                    case 3: text = Arrays.toString(sessionInfo.getSectorFlag()); break;
                    case 5: text = sessionInfo.getLapDistance(); break;
                    case 7: text = sessionInfo.getNumberOfVehicles() + "/" + sessionInfo.getMaxPlayers(); break;
                    case 9: text = sessionInfo.getTrackName(); break;
                    case 11: text = sessionInfo.getSession(); break;
                    case 13: text = sessionInfo.getPlayerFileName(); break;
                    case 15: text = sessionInfo.getRaining() + "% " + sessionInfo.getMinPathWetness().substring(0, sessionInfo.getMinPathWetness().indexOf(".")) + "/" + sessionInfo.getMaxPathWetness().substring(0,sessionInfo.getMaxPathWetness().indexOf(".")) + " wetness"; break;
                    case 17: text = sessionInfo.getAmbientTemp().substring(0, sessionInfo.getAmbientTemp().indexOf(".") + 2) + "° ambient " + sessionInfo.getTrackTemp().substring(0,sessionInfo.getTrackTemp().indexOf(".")+2) + "° track"; break;
                    case 19: text = df.format(new Date( (Long.parseLong(sessionInfo.getStartEventTime().substring(0, sessionInfo.getStartEventTime().indexOf("."))) + Long.parseLong(sessionInfo.getCurrentEventTime().substring(0, sessionInfo.getCurrentEventTime().indexOf(".")))) * 1_000 )); break;
                    case 21: text = sessionInfo.getDarkCloud().substring(0, sessionInfo.getDarkCloud().indexOf(".")); break;
                    default: break;
                }
                if (!label.getText().equals(text)) {
                    label.setText(text);
                }
            }
            i++;
        }

        // SetVehicleInfo Data
        String[] vehicles = new String[users.length];
        for (int j = 0; j< users.length; j++) {
            vehicles[j] = users[j].getDriverName() + (users[j].getFinishStatus().equals("FSTAT_DQ") ? " (DQ)" : "");
        }
        String selectedValue = null;
        if (mainView.getVehicleList().getSelectedValue() != null) {
            selectedValue = mainView.getVehicleList().getSelectedValue();
        }
        mainView.getVehicleList().setListData(vehicles);
        if (selectedValue != null) {
            mainView.getVehicleList().setSelectedValue(selectedValue, true);
        }
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

    public PenalizeView getPenalizeView() {
        return penalizeView;
    }

    public void setPenalizeView(PenalizeView penalizeView) {
        this.penalizeView = penalizeView;
    }

    public void showUserInformationView(String selectedValue, Point location) {
        UserInformationView view = new UserInformationView(selectedValue, location);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(view.getFrame().isShowing()) {
                    view.updateData(users);
                    try {
                        Thread.sleep(1_000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }
}
