package de.fillikos.rf2.esctool.esctool;

import de.fillikos.rf2.service.webui.httpss.model.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.User;

public class StrafenLog {

    private String klartext;
    private String teamName;
    private String driverName;
    private String currentEventTime;
    private PitVorgang vorgang;

    public StrafenLog(SessionInfo sessionInfo, User user, PitVorgang vorgang) {
        this.teamName = user.getFullTeamName();
        this.driverName = user.getDriverName();
        this.currentEventTime = sessionInfo.getCurrentEventTime();
        this.vorgang = vorgang;
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

    public PitVorgang getVorgang() {
        return vorgang;
    }

    public void setVorgang(PitVorgang vorgang) {
        this.vorgang = vorgang;
    }
}
