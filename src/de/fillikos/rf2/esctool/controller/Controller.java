package de.fillikos.rf2.esctool.controller;

import de.fillikos.rf2.esctool.view.config.ModConfig;
import de.fillikos.rf2.esctool.view.config.ServerConfig;
import de.fillikos.rf2.service.webui.httpss.model.Connection;

import java.io.File;
import java.util.ArrayList;

public class Controller {

    private static final DataController dc = new DataController();
    private static final ViewController vc = new ViewController();
    private static final String version = "1.0.2-3";

    public static void showView() {
        vc.showView();
    }

    public static void setServer(Connection connection) {
        dc.getServerData().setServer(connection);
        dc.getSessionController().setServer(connection);
        dc.getSessionController().getRaceController().setServer(connection);
    }

    public static void startUpdateServerData(ModConfig mod) {
        dc.getServerData().setStart(true);
        dc.getServerData().start(mod);
    }

    public static void stopUpdateServerData() {
        dc.getSessionController().cleanData();
        dc.getServerData().setStart(false);
    }

    public static void setViewData() {
        vc.setViewData(dc.getServerData().getSessionInfo());
    }

    public static void runDataHandling(ModConfig modConfig) {
        dc.getSessionController().setNewData(dc.getServerData().getUsers(), dc.getServerData().getSessionInfo(), modConfig);
        dc.getSessionController().getRaceController().setSessionInfo(dc.getServerData().getSessionInfo());
    }

    public static void setAktualisierungsrate(int rate) {
        dc.getServerData().setAktualisierungsrate(rate);
    }

    public static void loadGridINI() {
        dc.getSessionController().gridINI();
    }

    public static void setDir(File selectedFile) {
        dc.getSessionController().setRfDir(selectedFile);
        vc.getViewConfig().setRf2Dir(selectedFile);
        vc.getMainView().getMainMenu().setViewConfig(vc.getViewConfig());
        vc.saveViewConfig();
    }

    public static void setDirOnStartUp(File rf2Dir) {
        dc.getSessionController().setRfDir(rf2Dir);
    }

    public static void showServerView() {
        vc.getServerView().getFrame().setVisible(true);
        vc.getServerView().getFrame().setLocation(vc.getMainView().getFrame().getLocation());
    }

    public static void showModView() {
        vc.getModView().getFrame().setVisible(true);
        vc.getModView().getFrame().setLocation(vc.getMainView().getFrame().getLocation());
    }

    public static void shutdown() {
        vc.getViewConfig().viewPosition(vc.getMainView().getFrame());
        vc.saveTemp();
        dc.getServerData().setStart(false);
        vc.getMainView().getFrame().dispose();
    }

    public static void setServerManagement() {
        //Beim Schließen des ServerManagements werden die Daten aktualisiert
        vc.getMainView().setServerConfigList(vc.getServerView().getServerConfigList());
    }

    public static void setModManagement() {
        //Beim Schließen des ServerManagements werden die Daten aktualisiert
        vc.getMainView().setModConfigList(vc.getModView().getModConfigList());
    }

    public static void saveServerConfig(ArrayList<ServerConfig> serverConfigList) {
        vc.setServerDataList(serverConfigList);
        vc.saveServerConfig();
    }

    public static void saveModConfig(ArrayList<ModConfig> modConfigList) {
        vc.setModConfigList(modConfigList);
        vc.saveModConfig();
    }

    public static String getVersion() {
        return version;
    }

    public static void sendChat(String tEst) {
        dc.getServerData().getServer().sendchat(tEst);
    }
}
