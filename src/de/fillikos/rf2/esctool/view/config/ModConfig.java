package de.fillikos.rf2.esctool.view.config;

import de.fillikos.rf2.esctool.data.esctool.PitVorgang;

import java.util.ArrayList;
import java.util.Objects;

public class ModConfig {

    private ArrayList<ArrayList<String>> startgruppeClass = new ArrayList<>();
    private String modName = "";
    private long timeBetweenSG = 150;
    private long timeToDoStrafen = 210;
    private boolean assignPitByTeam = false;
    private boolean vrQualiMode = false;
    private boolean assignPitByDriver = false;
    private boolean teamEvent = false;
    private boolean checkDoppelTeam = false;
    private boolean gridIniErstellen = false;
    private boolean recordHotlaps = false;
    private boolean rennfreigabeByChat = false;
    private boolean freigabeEinfuehrungsrundeChat = false;
    private boolean qualiVR = false;
    private PitVorgang pitVorgang = new PitVorgang();
    private ArrayList<ArrayList<String>> manuelleNachrichten = new ArrayList<>();

    public ModConfig() {
        super();
    }

    public ArrayList<ArrayList<String>> getStartgruppeClass() {
        return startgruppeClass;
    }

    public void setStartgruppeClass(ArrayList<ArrayList<String>> startgruppeClass) {
        this.startgruppeClass = startgruppeClass;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public long getTimeBetweenSG() {
        return timeBetweenSG;
    }

    public void setTimeBetweenSG(long timeBetweenSG) {
        this.timeBetweenSG = timeBetweenSG;
    }

    public boolean isAssignPitByTeam() {
        return assignPitByTeam;
    }

    public void setAssignPitByTeam(boolean assignPitByTeam) {
        this.assignPitByTeam = assignPitByTeam;
    }

    public boolean isAssignPitByDriver() {
        return assignPitByDriver;
    }

    public void setAssignPitByDriver(boolean assignPitByDriver) {
        this.assignPitByDriver = assignPitByDriver;
    }

    public boolean isTeamEvent() {
        return teamEvent;
    }

    public void setTeamEvent(boolean teamEvent) {
        this.teamEvent = teamEvent;
    }

    public boolean isCheckDoppelTeam() {
        return checkDoppelTeam;
    }

    public void setCheckDoppelTeam(boolean checkDoppelTeam) {
        this.checkDoppelTeam = checkDoppelTeam;
    }

    public boolean isGridIniErstellen() {
        return gridIniErstellen;
    }

    public void setGridIniErstellen(boolean gridIniErstellen) {
        this.gridIniErstellen = gridIniErstellen;
    }

    public boolean isRecordHotlaps() {
        return recordHotlaps;
    }

    public void setRecordHotlaps(boolean recordHotlaps) {
        this.recordHotlaps = recordHotlaps;
    }

    public boolean isRennfreigabeByChat() {
        return rennfreigabeByChat;
    }

    public void setRennfreigabeByChat(boolean rennfreigabeByChat) {
        this.rennfreigabeByChat = rennfreigabeByChat;
    }

    public boolean isFreigabeEinfuehrungsrundeChat() {
        return freigabeEinfuehrungsrundeChat;
    }

    public void setFreigabeEinfuehrungsrundeChat(boolean freigabeEinfuehrungsrundeChat) {
        this.freigabeEinfuehrungsrundeChat = freigabeEinfuehrungsrundeChat;
    }

    public PitVorgang getPitVorgang() {
        return pitVorgang;
    }

    public void setPitVorgang(PitVorgang pitVorgang) {
        this.pitVorgang = pitVorgang;
    }

    public boolean isQualiVR() {
        return qualiVR;
    }

    public void setQualiVR(boolean qualiVR) {
        this.qualiVR = qualiVR;
    }

    public long getTimeToDoStrafen() {
        return timeToDoStrafen;
    }

    public void setTimeToDoStrafen(long timeToDoStrafen) {
        this.timeToDoStrafen = timeToDoStrafen;
    }

    public ArrayList<ArrayList<String>> getManuelleNachrichten() {
        return manuelleNachrichten;
    }

    public void setManuelleNachrichten(ArrayList<ArrayList<String>> qualiNachrichten) {
        this.manuelleNachrichten = qualiNachrichten;
    }

    public boolean isVrQualiMode() {
        return vrQualiMode;
    }

    public void setVrQualiMode(boolean vrQualiMode) {
        this.vrQualiMode = vrQualiMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ModConfig)) return false;
        ModConfig modConfig = (ModConfig) o;
        return getTimeBetweenSG() == modConfig.getTimeBetweenSG() && getTimeToDoStrafen() == modConfig.getTimeToDoStrafen() && isAssignPitByTeam() == modConfig.isAssignPitByTeam() && isVrQualiMode() == modConfig.isVrQualiMode() && isAssignPitByDriver() == modConfig.isAssignPitByDriver() && isTeamEvent() == modConfig.isTeamEvent() && isCheckDoppelTeam() == modConfig.isCheckDoppelTeam() && isGridIniErstellen() == modConfig.isGridIniErstellen() && isRecordHotlaps() == modConfig.isRecordHotlaps() && isRennfreigabeByChat() == modConfig.isRennfreigabeByChat() && isFreigabeEinfuehrungsrundeChat() == modConfig.isFreigabeEinfuehrungsrundeChat() && isQualiVR() == modConfig.isQualiVR() && Objects.equals(getStartgruppeClass(), modConfig.getStartgruppeClass()) && Objects.equals(getModName(), modConfig.getModName()) && Objects.equals(getPitVorgang(), modConfig.getPitVorgang()) && Objects.equals(getManuelleNachrichten(), modConfig.getManuelleNachrichten());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStartgruppeClass(), getModName(), getTimeBetweenSG(), getTimeToDoStrafen(), isAssignPitByTeam(), isVrQualiMode(), isAssignPitByDriver(), isTeamEvent(), isCheckDoppelTeam(), isGridIniErstellen(), isRecordHotlaps(), isRennfreigabeByChat(), isFreigabeEinfuehrungsrundeChat(), isQualiVR(), getPitVorgang(), getManuelleNachrichten());
    }

    @Override
    public String toString() {
        return "ModConfig{" +
                "startgruppeClass=" + startgruppeClass +
                ", modName='" + modName + '\'' +
                ", timeBetweenSG=" + timeBetweenSG +
                ", timeToDoStrafen=" + timeToDoStrafen +
                ", assignPitByTeam=" + assignPitByTeam +
                ", vrQualiMode=" + vrQualiMode +
                ", assignPitByDriver=" + assignPitByDriver +
                ", teamEvent=" + teamEvent +
                ", checkDoppelTeam=" + checkDoppelTeam +
                ", gridIniErstellen=" + gridIniErstellen +
                ", recordHotlaps=" + recordHotlaps +
                ", rennfreigabeByChat=" + rennfreigabeByChat +
                ", freigabeEinfuehrungsrundeChat=" + freigabeEinfuehrungsrundeChat +
                ", qualiVR=" + qualiVR +
                ", pitVorgang=" + pitVorgang +
                ", manuelleNachrichten=" + manuelleNachrichten +
                '}';
    }

}
