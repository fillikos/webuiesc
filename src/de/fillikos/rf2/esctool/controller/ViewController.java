package de.fillikos.rf2.esctool.controller;

import de.fillikos.rf2.esctool.data.ModData;
import de.fillikos.rf2.esctool.view.MainView;
import de.fillikos.rf2.esctool.view.ServerView;
import de.fillikos.rf2.service.webui.httpss.model.sessioninfo.SessionInfo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ViewController {

    private MainView mainView;
    private ServerView serverView;
    private ModData modData;

    public ViewController() {
        mainView = new MainView();
        serverView = new ServerView();
        modData = new ModData();
    }

    public void showView() {
        mainView.showView();
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

        if (!(sessionInfo == null)) {
            time = Long.parseLong(sessionInfo.getCurrentEventTime().substring(0, sessionInfo.getCurrentEventTime().indexOf("."))) * 1000;
        } else {
            time = 0;
        }
        DateFormat df = new SimpleDateFormat("hh:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("GMT+0"));

        textinsert.append("<html><body>");
        textinsert.append(sessionInfo.getServerName() + "<br>" +
                df.format(new Date(time)) + "<br>" +
                sessionInfo.getSession() + "<br>" +
                sessionInfo.getNumberOfVehicles() + " / " +
                sessionInfo.getMaxPlayers() + "<br>"
        );
        textinsert.append("</body></html>");

//            txtLeaderGrid2.setText(esctool.getGridPositionGridLeader());
        mainView.getText().setText(textinsert.toString());
//            text.setText(Controller.setMainViewText());
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

    public ModData getModData() {
        return modData;
    }

    public void setModData(ModData modData) {
        this.modData = modData;
    }
}
