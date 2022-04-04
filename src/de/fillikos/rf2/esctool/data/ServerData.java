package de.fillikos.rf2.esctool.data;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.service.webui.httpss.Connection;
import de.fillikos.rf2.service.webui.httpss.model.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.User;

public class ServerData {

    private Connection server;
    private SessionInfo sessionInfo;
    private User[] users;
    private boolean start = false;
    private int aktualisierungsrate = 500;

    public ServerData() {

    }

    public void start() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (start) {
                    server.loadData();
                    users = server.getStandings();
                    sessionInfo = server.getSessionInfo();
                    Controller.setViewData();
                    Controller.runDataHandling();
                    try {
                        Thread.sleep(aktualisierungsrate);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
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
}
