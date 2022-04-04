package de.fillikos.rf2.esctool.controller;

import de.fillikos.rf2.esctool.data.ServerData;
import de.fillikos.rf2.esctool.esctool.ESCTool;

public class DataController {

    private ESCTool escTool;
    private ServerData serverData;

    public DataController() {
        serverData = new ServerData();
        escTool = new ESCTool();
    }

    public ESCTool getEscTool() {
        return escTool;
    }

    public void setEscTool(ESCTool escTool) {
        this.escTool = escTool;
    }

    public ServerData getServerData() {
        return serverData;
    }

    public void setServerData(ServerData serverData) {
        this.serverData = serverData;
    }
}
