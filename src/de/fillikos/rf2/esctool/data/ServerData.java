package de.fillikos.rf2.esctool.data;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.esctool.view.config.ModConfig;
import de.fillikos.rf2.service.webui.httpss.model.Connection;
import de.fillikos.rf2.service.webui.httpss.model.sessioninfo.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import java.util.Arrays;
import java.util.Objects;

public class ServerData {

    private Connection server;
    private SessionInfo sessionInfo;
    private User[] users;
    private boolean start = false;
    private int aktualisierungsrate = 500;

    public ServerData() {
        Controller.addLog("ServerData()");
        Controller.addLog("ServerData() geladen");
    }

    public void start(ModConfig modConfig) {
        Controller.addLog("ServerData.start()");
        Controller.addLog(modConfig.toString());
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (start) {
                    Controller.addLog("ServerData.start.run()");
                    server.loadData();
                    users = server.getStandings();
                    sessionInfo = server.getSessionInfo();
                    Controller.setViewData();
                    Controller.runDataHandling(modConfig);
                    try {
                        Thread.sleep(aktualisierungsrate);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        Controller.addLog("ServerData.start() beendet");
    }

    public Connection getServer() {
        return server;
    }

    public void setServer(Connection server) {
        this.server = server;
    }

    public SessionInfo getSessionInfo() {
        return sessionInfo;
    }

    public void setSessionInfo(SessionInfo sessionInfo) {
        this.sessionInfo = sessionInfo;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public int getAktualisierungsrate() {
        return aktualisierungsrate;
    }

    public void setAktualisierungsrate(int aktualisierungsrate) {
        this.aktualisierungsrate = aktualisierungsrate;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServerData)) return false;
        ServerData that = (ServerData) o;
        return isStart() == that.isStart() && getAktualisierungsrate() == that.getAktualisierungsrate() && Objects.equals(getServer(), that.getServer()) && Objects.equals(getSessionInfo(), that.getSessionInfo()) && Arrays.equals(getUsers(), that.getUsers());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getServer(), getSessionInfo(), isStart(), getAktualisierungsrate());
        result = 31 * result + Arrays.hashCode(getUsers());
        return result;
    }

    @Override
    public String toString() {
        return "ServerData{" +
                "server=" + server +
                ", sessionInfo=" + sessionInfo +
                ", users=" + Arrays.toString(users) +
                ", start=" + start +
                ", aktualisierungsrate=" + aktualisierungsrate +
                '}';
    }
}
