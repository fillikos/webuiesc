package de.fillikos.rf2.esctool.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.fillikos.rf2.esctool.view.config.ModConfig;
import de.fillikos.rf2.esctool.view.config.ServerConfig;
import de.fillikos.rf2.service.webui.httpss.model.Connection;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    private static final ArrayList<String> logs = new ArrayList<>();
    private static final ArrayList<String> errors = new ArrayList<>();
    private static final ArrayList<String> warnings = new ArrayList<>();
    private static final DataController dc = new DataController();
    private static final ViewController vc = new ViewController();
    private static final String version = "1.0.5-10";

    public static void showView() {
        addLog("Controller.showView()");
        vc.showView();
        addLog("Controller.showView() geladen");
    }

    public static void setServer(Connection connection) {
        addLog("Controller.setServer()");
        dc.getServerData().setServer(connection);
        dc.getSessionController().setServer(connection);
        dc.getSessionController().getRaceController().setServer(connection);
        addLog("Controller.setServer() geladen");
    }

    public static void startUpdateServerData(ModConfig mod) {
        addLog("Controller.startUpdateServerData()");
        dc.getServerData().setStart(true);
        dc.getServerData().start(mod);
        addLog("Controller.startUpdateServerData() geladen");
    }

    public static void stopUpdateServerData() {
        addLog("Controller.stopUpdateServerData()");
        dc.getSessionController().cleanData();
        dc.getServerData().setStart(false);
        addLog("Controller.stopUpdateServerData() geladen");
    }

    public static void setViewData() {
        addLog("Controller.setViewData()");
        vc.setViewData(dc.getServerData().getSessionInfo());
        addLog("Controller.setViewData() geladen");
    }

    public static void runDataHandling(ModConfig modConfig) {
        addLog("Controller.runDataHandling()");
        dc.getSessionController().setNewData(dc.getServerData().getUsers(), dc.getServerData().getSessionInfo(), modConfig);
        dc.getSessionController().getRaceController().setSessionInfo(dc.getServerData().getSessionInfo());
        addLog("Controller.runDataHandling() geladen");
    }

    public static void setAktualisierungsrate(int rate) {
        addLog("Controller.setAktualisierungsrate()");
        dc.getServerData().setAktualisierungsrate(rate);
        addLog("Controller.setAktualisierungsrate() geladen");
    }

    public static void loadGridINI() {
        addLog("Controller.loadGridINI()");
        dc.getSessionController().gridINI();
        addLog("Controller.loadGridINI() geladen");
    }

    public static void setDir(File selectedFile) {
        addLog("Controller.setDir()");
        dc.getSessionController().setRfDir(selectedFile);
        vc.getViewConfig().setRf2Dir(selectedFile);
        vc.getMainView().getMainMenu().setViewConfig(vc.getViewConfig());
        vc.saveViewConfig();
        addLog("Controller.setDir() geladen");
    }

    public static void setDirOnStartUp(File rf2Dir) {
        addLog("Controller.setDirOnStartUp()");
        dc.getSessionController().setRfDir(rf2Dir);
        addLog("Controller.setDirOnStartUp() geladen");
    }

    public static void showServerView() {
        addLog("Controller.showServerView()");
        vc.getServerView().getFrame().setVisible(true);
        vc.getServerView().getFrame().setLocation(vc.getMainView().getFrame().getLocation());
        addLog("Controller.showServerView() geladen");
    }

    public static void showModView() {
        addLog("Controller.showModView()");
        vc.getModView().getFrame().setVisible(true);
        vc.getModView().getFrame().setLocation(vc.getMainView().getFrame().getLocation());
        addLog("Controller.showModView() geladen");
    }

    public static void shutdown() {
        addLog("Controller.shutdown()");
        vc.getViewConfig().viewPosition(vc.getMainView().getFrame());
        vc.saveTemp();
        dc.getServerData().setStart(false);
        vc.getMainView().getFrame().dispose();
        addLog("Controller.shutdown() geladen");
        ObjectMapper om = new ObjectMapper();
        try {
            om.writeValue(new File(vc.getTmpDir() + "\\log.html"), vc.getMainView().getMainMenu().getLogs().toString() + "</body></html>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setServerManagement() {
        addLog("Controller.setServerManagement()");
        //Beim Schließen des ServerManagements werden die Daten aktualisiert
        vc.getMainView().setServerConfigList(vc.getServerView().getServerConfigList());
        addLog("Controller.setServerManagement() geladen");
    }

    public static void setModManagement() {
        addLog("Controller.setModManagement()");
        //Beim Schließen des ServerManagements werden die Daten aktualisiert
        vc.getMainView().setModConfigList(vc.getModView().getModConfigList());
        addLog("Controller.setModManagement() geladen");
    }

    public static void saveServerConfig(ArrayList<ServerConfig> serverConfigList) {
        addLog("Controller.saveServerConfig()");
        vc.setServerDataList(serverConfigList);
        vc.saveServerConfig();
        addLog("Controller.saveServerConfig() geladen");
    }

    public static void saveModConfig(ArrayList<ModConfig> modConfigList) {
        addLog("Controller.saveModConfig()");
        vc.setModConfigList(modConfigList);
        vc.saveModConfig();
        addLog("Controller.saveModConfig() geladen");
    }

    public static String getVersion() {
        addLog("Controller.getVersion()");
        return version;
    }

    public static void sendChat(String tEst) {
        addLog("Controller.sendChat()");
        dc.getServerData().getServer().sendchat(tEst);
        addLog("Controller.sendChat() geladen");
    }

    public static void addLog(String string) {
        try {
            for (String log : logs) {
                vc.getMainView().getMainMenu().addLog(log);
            }
            vc.getMainView().getMainMenu().addLog(string);
            logs.clear();
        } catch (NullPointerException e) {
            logs.add(string);
        }
    }

    public static void addWarning(String string) {
        try {
            for (String log : warnings) {
                vc.getMainView().getMainMenu().addWarning(log);
            }
            vc.getMainView().getMainMenu().addWarning(string);
            warnings.clear();
        } catch (NullPointerException e) {
            warnings.add(string);
        }
    }

    public static void addError(String string) {
        try {
            for (String log : errors) {
                vc.getMainView().getMainMenu().addError(log);
            }
            vc.getMainView().getMainMenu().addError(string);
            errors.clear();
        } catch (NullPointerException e) {
            errors.add(string);
        }
    }
}
