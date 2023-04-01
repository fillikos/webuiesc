package de.fillikos.rf2.esctool.view.config;

import de.fillikos.rf2.esctool.data.esctool.PitVorgang;

import java.util.ArrayList;
import java.util.Objects;

public class ModConfig {

    private ArrayList<ArrayList<String>> startgruppeClass = new ArrayList<>();
    private String modName = "";
    private long timeBetweenSG = 150;
    private long timeToDoStrafen = 210;
    private int minStartPos = 0;
    private int maxStartPos = 0;
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
    private boolean startAuswertung = false;
    private boolean serverVerlassenMessage = false;
    private boolean strafenLaden = false;
    private boolean serverVerlassen = false;
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

    public int getMinStartPos() {
        return minStartPos;
    }

    public void setMinStartPos(int minStartPos) {
        this.minStartPos = minStartPos;
    }

    public int getMaxStartPos() {
        return maxStartPos;
    }

    public void setMaxStartPos(int maxStartPos) {
        this.maxStartPos = maxStartPos;
    }

    public boolean isStartAuswertung() {
        return startAuswertung;
    }

    public void setStartAuswertung(boolean startAuswertung) {
        this.startAuswertung = startAuswertung;
    }

    public boolean isServerVerlassenMessage() {
        return serverVerlassenMessage;
    }

    public void setServerVerlassenMessage(boolean serverVerlassenMessage) {
        this.serverVerlassenMessage = serverVerlassenMessage;
    }

    public boolean isStrafenLaden() {
        return strafenLaden;
    }

    public void setStrafenLaden(boolean strafenLaden) {
        this.strafenLaden = strafenLaden;
    }

    public boolean isServerVerlassen() {
        return serverVerlassen;
    }

    public void setServerVerlassen(boolean serverVerlassen) {
        this.serverVerlassen = serverVerlassen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModConfig modConfig = (ModConfig) o;
        return timeBetweenSG == modConfig.timeBetweenSG && timeToDoStrafen == modConfig.timeToDoStrafen && minStartPos == modConfig.minStartPos && maxStartPos == modConfig.maxStartPos && assignPitByTeam == modConfig.assignPitByTeam && vrQualiMode == modConfig.vrQualiMode && assignPitByDriver == modConfig.assignPitByDriver && teamEvent == modConfig.teamEvent && checkDoppelTeam == modConfig.checkDoppelTeam && gridIniErstellen == modConfig.gridIniErstellen && recordHotlaps == modConfig.recordHotlaps && rennfreigabeByChat == modConfig.rennfreigabeByChat && freigabeEinfuehrungsrundeChat == modConfig.freigabeEinfuehrungsrundeChat && qualiVR == modConfig.qualiVR && startAuswertung == modConfig.startAuswertung && serverVerlassenMessage == modConfig.serverVerlassenMessage && strafenLaden == modConfig.strafenLaden && serverVerlassen == modConfig.serverVerlassen && Objects.equals(startgruppeClass, modConfig.startgruppeClass) && Objects.equals(modName, modConfig.modName) && Objects.equals(pitVorgang, modConfig.pitVorgang) && Objects.equals(manuelleNachrichten, modConfig.manuelleNachrichten);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startgruppeClass, modName, timeBetweenSG, timeToDoStrafen, minStartPos, maxStartPos, assignPitByTeam, vrQualiMode, assignPitByDriver, teamEvent, checkDoppelTeam, gridIniErstellen, recordHotlaps, rennfreigabeByChat, freigabeEinfuehrungsrundeChat, qualiVR, startAuswertung, serverVerlassenMessage, strafenLaden, serverVerlassen, pitVorgang, manuelleNachrichten);
    }

    @Override
    public String toString() {
        return "ModConfig{" +
                "startgruppeClass=" + startgruppeClass +
                ", modName='" + modName + '\'' +
                ", timeBetweenSG=" + timeBetweenSG +
                ", timeToDoStrafen=" + timeToDoStrafen +
                ", minStartPos=" + minStartPos +
                ", maxStartPos=" + maxStartPos +
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
                ", startAuswertung=" + startAuswertung +
                ", serverVerlassenMessage=" + serverVerlassenMessage +
                ", strafenLaden=" + strafenLaden +
                ", serverVerlassen=" + serverVerlassen +
                ", pitVorgang=" + pitVorgang +
                ", manuelleNachrichten=" + manuelleNachrichten +
                '}';
    }

}
