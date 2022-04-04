package de.fillikos.rf2.esctool.data.esctool;

import de.fillikos.rf2.service.webui.httpss.model.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.User;

public class StrafenLog {

    private String klartext;
    private String teamName;
    private String driverName;
    private String currentEventTime;

    public StrafenLog(SessionInfo sessionInfo, User user, String klartext) {
        this.teamName = user.getFullTeamName();
        this.driverName = user.getDriverName();
        this.currentEventTime = sessionInfo.getCurrentEventTime();
        this.klartext = klartext;
    }

    public String getKlartext() {
        return klartext;
    }

    public void setKlartext(String klartext) {
        this.klartext = klartext;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getCurrentEventTime() {
        return currentEventTime;
    }

    public void setCurrentEventTime(String currentEventTime) {
        this.currentEventTime = currentEventTime;
    }

    @Override
    public String toString() {
        return "StrafenLog{" +
                "klartext='" + klartext + '\'' +
                ", teamName='" + teamName + '\'' +
                ", driverName='" + driverName + '\'' +
                ", currentEventTime='" + currentEventTime + '\'' +
                '}';
    }
}
