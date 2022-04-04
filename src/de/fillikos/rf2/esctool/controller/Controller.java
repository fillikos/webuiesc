package de.fillikos.rf2.esctool.controller;

import de.fillikos.rf2.esctool.esctool.PitVorgang;
import de.fillikos.rf2.service.webui.httpss.Connection;

public class Controller {

    private static DataController dc = new DataController();
    private static ViewController vc = new ViewController();

    public static void showView() {
        vc.showView();
    }

    public static String setMainViewText() {
        return "";
    }

    public static void setServer(Connection connection) {
        dc.getServerData().setServer(connection);
    }

    public static void startUpdateServerData() {
        dc.getServerData().setStart(true);
        dc.getServerData().start();
    }

    public static void stopUpdateServerData() {
        dc.getServerData().setStart(false);
    }

    public static void setViewData() {
        vc.setViewData(dc.getServerData().getSessionInfo());
    }

    public static void runDataHandling() {
        dc.getEscTool().handleESCRule(dc.getServerData().getUsers(), dc.getServerData().getSessionInfo(), new PitVorgang());
    }
}
