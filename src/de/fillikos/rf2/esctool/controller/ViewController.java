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

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

    public void setViewData(SessionInfo sessionInfo) {
        StringBuilder textinsert = new StringBuilder();
        long time = 0;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        textinsert.delete(0, textinsert.length());

        switch (sessionInfo.getSessionEnum()) {
            case TESTDAY:
                time = Long.parseLong(sessionInfo.getCurrentEventTime().substring(0, sessionInfo.getCurrentEventTime().indexOf("."))) * 1000;
                break;
            case RACE:
            case WARMUP:
            case QUALIFY:
            case PRACTICE:
                time = Long.parseLong(sessionInfo.getEndEventTime().substring(0, sessionInfo.getEndEventTime().indexOf("."))) -
                        Long.parseLong(sessionInfo.getCurrentEventTime().substring(0, sessionInfo.getCurrentEventTime().indexOf("."))) * 1000;
                break;
        }

        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("GMT0"));

        textinsert.append("<html><body>");
        textinsert.append(sessionInfo.getServerName() + "<br>" +
                df.format(new Date(time)) + "<br>" +
                sessionInfo.getSession() + "<br>" +
                sessionInfo.getNumberOfVehicles() + " / " +
                sessionInfo.getMaxPlayers() + "<br>"
        );
        textinsert.append("</body></html>");

        mainView.getText().setText(textinsert.toString());
        mainView.getText().repaint();
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
                System.out.println("Fehler");
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
}
