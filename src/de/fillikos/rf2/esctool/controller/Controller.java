package de.fillikos.rf2.esctool.controller;

import de.fillikos.rf2.esctool.data.esctool.PitVorgang;
import de.fillikos.rf2.service.webui.httpss.Connection;

public class Controller {

    private static DataController dc = new DataController();
    private static ViewController vc = new ViewController();

    public static void showView() {
        vc.showView();
    }

    public static void setServer(Connection connection) {
        dc.getServerData().setServer(connection);
        dc.getSessionController().setServer(connection);
        dc.getSessionController().getRaceController().setServer(connection);
    }

    public static void startUpdateServerData() {
        dc.getServerData().setStart(true);
        dc.getServerData().start();
    }

    public static void stopUpdateServerData() {
        dc.getSessionController().cleanData();
        dc.getServerData().setStart(false);
    }

    public static void setViewData() {
        vc.setViewData(dc.getServerData().getSessionInfo());
    }

    public static void runDataHandling() {
        dc.getSessionController().setNewData(dc.getServerData().getUsers(), dc.getServerData().getSessionInfo(), new PitVorgang());
    }

    public static void setAktualisierungsrate(int rate) {
        dc.getServerData().setAktualisierungsrate(rate);
    }
}
