package de.fillikos.rf2.esctool.data;

import de.fillikos.rf2.esctool.data.esctool.PitVorgang;

import java.util.ArrayList;
import java.util.Objects;

public class ModData {

    private ArrayList<ArrayList<String>> startgruppeClass = new ArrayList<>();
    private String modName = "";
    private long timeBetweenSG = 150;
    private boolean assignPitByTeam = false;
    private boolean assignPitByDriver = false;
    private boolean byDriverName = false;
    private boolean checkDoppelTeam = false;
    private boolean gridIniErstellen = false;
    private boolean recordHotlaps = false;
    private boolean rennfreigabeByChat = true;
    private PitVorgang pitVorgang = new PitVorgang();

    public ModData() {

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

    public boolean isByDriverName() {
        return byDriverName;
    }

    public void setByDriverName(boolean byDriverName) {
        this.byDriverName = byDriverName;
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

    public PitVorgang getPitVorgang() {
        return pitVorgang;
    }

    public void setPitVorgang(PitVorgang pitVorgang) {
        this.pitVorgang = pitVorgang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ModData)) return false;
        ModData modData = (ModData) o;
        return timeBetweenSG == modData.timeBetweenSG && assignPitByTeam == modData.assignPitByTeam && assignPitByDriver == modData.assignPitByDriver && byDriverName == modData.byDriverName && checkDoppelTeam == modData.checkDoppelTeam && gridIniErstellen == modData.gridIniErstellen && recordHotlaps == modData.recordHotlaps && rennfreigabeByChat == modData.rennfreigabeByChat && Objects.equals(startgruppeClass, modData.startgruppeClass) && Objects.equals(modName, modData.modName) && Objects.equals(pitVorgang, modData.pitVorgang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startgruppeClass, modName, timeBetweenSG, assignPitByTeam, assignPitByDriver, byDriverName, checkDoppelTeam, gridIniErstellen, recordHotlaps, rennfreigabeByChat, pitVorgang);
    }

    @Override
    public String toString() {
        return "ModData{" +
                "startgruppeClass=" + startgruppeClass +
                ", modName='" + modName + '\'' +
                ", timeBetweenSG=" + timeBetweenSG +
                ", assignPitByTeam=" + assignPitByTeam +
                ", assignPitByDriver=" + assignPitByDriver +
                ", byDriverName=" + byDriverName +
                ", checkDoppelTeam=" + checkDoppelTeam +
                ", gridIniErstellen=" + gridIniErstellen +
                ", recordHotlaps=" + recordHotlaps +
                ", rennfreigabeByChat=" + rennfreigabeByChat +
                ", pitVorgang=" + pitVorgang +
                '}';
    }
}
