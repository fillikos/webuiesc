package de.fillikos.rf2.esctool.controller;

import de.fillikos.rf2.esctool.data.ServerData;
import de.fillikos.rf2.esctool.data.SessionController;

public class DataController {

    private ServerData serverData;
    private SessionController sessionController;

    public DataController() {
        Controller.addLog("DataController()");
        serverData = new ServerData();
        sessionController = new SessionController();
        Controller.addLog("DataController() geladen");
    }

    public ServerData getServerData() {
        return serverData;
    }

    public void setServerData(ServerData serverData) {
        this.serverData = serverData;
    }

    public SessionController getSessionController() {
        return sessionController;
    }

    public void setSessionController(SessionController sessionController) {
        this.sessionController = sessionController;
    }
}
