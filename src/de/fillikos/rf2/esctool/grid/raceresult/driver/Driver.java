package de.fillikos.rf2.esctool.grid.raceresult.driver;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;

@XmlType(propOrder = {"name", "connected", "vehFile", "upgradeCode", "vehName", "category",
        "carType", "carClass", "carNumber", "teamName", "isPlayer", "serverScored",
        "gridPos", "position", "classGridPos", "classPosition", "points", "classPoints",
        "lapRankIncludingDiscos", "lap", "bestLapTime", "laps", "pitstops", "finishStatus",
        "dnfReason", "control", "swap"})
public class Driver {

    private String name, vehFile, upgradeCode, vehName, category, carType, carClass, teamName,
            finishStatus, bestLapTime, dnfReason;
    private int connected, carNumber, isPlayer, serverScored, position, classPosition,
            lapRankIncludingDiscos, laps, pitstops, gridPos, classGridPos, points, classPoints;
    private ControlAndAids control;
    private ArrayList<Lap> lap;
    private Swap swap;

    public Driver() {
//		control = new ControlAndAids();
        lap = new ArrayList<Lap>();
//		swap = new Swap();
    }

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "VehFile")
    public String getVehFile() {
        return vehFile;
    }

    public void setVehFile(String vehFile) {
        this.vehFile = vehFile;
    }

    @XmlElement(name = "UpgradeCode")
    public String getUpgradeCode() {
        return upgradeCode;
    }

    public void setUpgradeCode(String upgradeCode) {
        this.upgradeCode = upgradeCode;
    }

    @XmlElement(name = "VehName")
    public String getVehName() {
        return vehName;
    }

    public void setVehName(String vehName) {
        this.vehName = vehName;
    }

    @XmlElement(name = "Category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @XmlElement(name = "CarType")
    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @XmlElement(name = "CarClass")
    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    @XmlElement(name = "TeamName")
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @XmlElement(name = "FinishStatus")
    public String getFinishStatus() {
        return finishStatus;
    }

    public void setFinishStatus(String finishStatus) {
        this.finishStatus = finishStatus;
    }

    @XmlElement(name = "BestLapTime")
    public String getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(String bestLapTime) {
        this.bestLapTime = bestLapTime;
    }

    @XmlElement(name = "Connected")
    public int getConnected() {
        return connected;
    }

    public void setConnected(int connected) {
        this.connected = connected;
    }

    @XmlElement(name = "CarNumber")
    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    @XmlElement(name = "isPlayer")
    public int getIsPlayer() {
        return isPlayer;
    }

    public void setIsPlayer(int isPlayer) {
        this.isPlayer = isPlayer;
    }

    @XmlElement(name = "ServerScored")
    public int getServerScored() {
        return serverScored;
    }

    public void setServerScored(int serverScored) {
        this.serverScored = serverScored;
    }

    @XmlElement(name = "Position")
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @XmlElement(name = "ClassPosition")
    public int getClassPosition() {
        return classPosition;
    }

    public void setClassPosition(int classPosition) {
        this.classPosition = classPosition;
    }

    @XmlElement(name = "LapRankIncludingDiscos")
    public int getLapRankIncludingDiscos() {
        return lapRankIncludingDiscos;
    }

    public void setLapRankIncludingDiscos(int lapRankIncludingDiscos) {
        this.lapRankIncludingDiscos = lapRankIncludingDiscos;
    }

    @XmlElement(name = "Laps")
    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    @XmlElement(name = "Pitstops")
    public int getPitstops() {
        return pitstops;
    }

    public void setPitstops(int pitstops) {
        this.pitstops = pitstops;
    }

    @XmlElement(name = "ControlAndAids")
    public ControlAndAids getControl() {
        return control;
    }

    public void setControl(ControlAndAids control) {
        this.control = control;
    }

    @XmlElement(name = "Lap")
    public ArrayList<Lap> getLap() {
        return lap;
    }

    public void setLap(ArrayList<Lap> lap) {
        this.lap = lap;
    }

    @XmlElement(name = "Swap")
    public Swap getSwap() {
        return swap;
    }

    public void setSwap(Swap swap) {
        this.swap = swap;
    }

    @XmlElement(name = "DNFReason")
    public String getDnfReason() {
        return dnfReason;
    }

    public void setDnfReason(String dnfReason) {
        this.dnfReason = dnfReason;
    }

    @XmlElement(name = "GridPos")
    public int getGridPos() {
        return gridPos;
    }

    public void setGridPos(int gridPos) {
        this.gridPos = gridPos;
    }

    @XmlElement(name = "ClassGridPos")
    public int getClassGridPos() {
        return classGridPos;
    }

    public void setClassGridPos(int classGridPos) {
        this.classGridPos = classGridPos;
    }

    @XmlElement(name = "Points")
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @XmlElement(name = "ClassPoints")
    public int getClassPoints() {
        return classPoints;
    }

    public void setClassPoints(int classPoints) {
        this.classPoints = classPoints;
    }

}
