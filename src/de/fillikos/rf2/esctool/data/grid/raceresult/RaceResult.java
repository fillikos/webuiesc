package de.fillikos.rf2.esctool.data.grid.raceresult;

import de.fillikos.rf2.esctool.data.grid.raceresult.typ.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"setting", "serverName", "clientFuelVisible", "playerFile", "dateTime", "timeString",
        "mod", "season", "trackVenue", "trackCourse", "trackEvent", "trackData", "trackLength",
        "gameVersion", "dedicated", "connectionType", "raceLaps", "raceTime", "mechFailRate",
        "damageMult", "fuelMult", "tireMult", "vehiclesAllowed", "parcFerme", "fixedSetups",
        "freeSettings", "fixedUpgrades", "testDay", "race", "warmup", "practice1", "practice2",
        "practice3", "practice4", "qualify"})
@XmlRootElement(name = "RaceResults")
public class RaceResult {

    private String setting, serverName, playerFile, timeString, mod, season, trackVenue,
            trackCourse, trackEvent, trackData, vehiclesAllowed;
    private int clientFuelVisible, dedicated, raceLaps, raceTime, mechFailRate, damageMult, fuelMult,
            tireMult, parcFerme, fixedSetups, freeSettings, fixedUpgrades;
    private double gameVersion, trackLength;
    private long dateTime;
    private ConnectionType connectionType;
    private TestDay testDay;
    private Race race;
    private Warmup warmup;
    private Practice1 practice1;
    private Practice2 practice2;
    private Practice3 practice3;
    private Practice4 practice4;
    private Qualify qualify;

    public RaceResult() {

    }

    @XmlElement(name = "Setting", defaultValue = "")
    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    @XmlElement(name = "ServerName", defaultValue = "")
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @XmlElement(name = "PlayerFile", defaultValue = "")
    public String getPlayerFile() {
        return playerFile;
    }

    public void setPlayerFile(String playerFile) {
        this.playerFile = playerFile;
    }

    @XmlElement(name = "TimeString", defaultValue = "")
    public String getTimeString() {
        return timeString;
    }

    public void setTimeString(String timeString) {
        this.timeString = timeString;
    }

    @XmlElement(name = "Mod", defaultValue = "")
    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    @XmlElement(name = "Season", defaultValue = "")
    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @XmlElement(name = "TrackVenue", defaultValue = "")
    public String getTrackVenue() {
        return trackVenue;
    }

    public void setTrackVenue(String trackVenue) {
        this.trackVenue = trackVenue;
    }

    @XmlElement(name = "TrackCourse", defaultValue = "")
    public String getTrackCourse() {
        return trackCourse;
    }

    public void setTrackCourse(String trackCourse) {
        this.trackCourse = trackCourse;
    }

    @XmlElement(name = "TrackEvent", defaultValue = "")
    public String getTrackEvent() {
        return trackEvent;
    }

    public void setTrackEvent(String trackEvent) {
        this.trackEvent = trackEvent;
    }

    @XmlElement(name = "TrackData", defaultValue = "")
    public String getTrackData() {
        return trackData;
    }

    public void setTrackData(String trackData) {
        this.trackData = trackData;
    }

    @XmlElement(name = "ConnectionType", defaultValue = "")
    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    @XmlElement(name = "VehiclesAllowed", defaultValue = "")
    public String getVehiclesAllowed() {
        return vehiclesAllowed;
    }

    public void setVehiclesAllowed(String vehiclesAllowed) {
        this.vehiclesAllowed = vehiclesAllowed;
    }

    @XmlElement(name = "ClientFuelVisible", defaultValue = "")
    public int getClientFuelVisible() {
        return clientFuelVisible;
    }

    public void setClientFuelVisible(int clientFuelVisible) {
        this.clientFuelVisible = clientFuelVisible;
    }

    @XmlElement(name = "Dedicated", defaultValue = "")
    public int getDedicated() {
        return dedicated;
    }

    public void setDedicated(int dedicated) {
        this.dedicated = dedicated;
    }

    @XmlElement(name = "RaceLaps", defaultValue = "")
    public int getRaceLaps() {
        return raceLaps;
    }

    public void setRaceLaps(int raceLaps) {
        this.raceLaps = raceLaps;
    }

    @XmlElement(name = "RaceTime", defaultValue = "")
    public int getRaceTime() {
        return raceTime;
    }

    public void setRaceTime(int raceTime) {
        this.raceTime = raceTime;
    }

    @XmlElement(name = "MechFailRate", defaultValue = "")
    public int getMechFailRate() {
        return mechFailRate;
    }

    public void setMechFailRate(int mechFailRate) {
        this.mechFailRate = mechFailRate;
    }

    @XmlElement(name = "DamageMult", defaultValue = "")
    public int getDamageMult() {
        return damageMult;
    }

    public void setDamageMult(int damageMult) {
        this.damageMult = damageMult;
    }

    @XmlElement(name = "FuelMult", defaultValue = "")
    public int getFuelMult() {
        return fuelMult;
    }

    public void setFuelMult(int fuelMult) {
        this.fuelMult = fuelMult;
    }

    @XmlElement(name = "TireMult", defaultValue = "")
    public int getTireMult() {
        return tireMult;
    }

    public void setTireMult(int tireMult) {
        this.tireMult = tireMult;
    }

    @XmlElement(name = "ParcFerme", defaultValue = "")
    public int getParcFerme() {
        return parcFerme;
    }

    public void setParcFerme(int parcFerme) {
        this.parcFerme = parcFerme;
    }

    @XmlElement(name = "FixedSetups", defaultValue = "")
    public int getFixedSetups() {
        return fixedSetups;
    }

    public void setFixedSetups(int fixedSetups) {
        this.fixedSetups = fixedSetups;
    }

    @XmlElement(name = "FreeSettings", defaultValue = "")
    public int getFreeSettings() {
        return freeSettings;
    }

    public void setFreeSettings(int freeSettings) {
        this.freeSettings = freeSettings;
    }

    @XmlElement(name = "FixedUpgrades", defaultValue = "")
    public int getFixedUpgrades() {
        return fixedUpgrades;
    }

    public void setFixedUpgrades(int fixedUpgrades) {
        this.fixedUpgrades = fixedUpgrades;
    }

    @XmlElement(name = "DateTime", defaultValue = "")
    public long getDateTime() {
        return dateTime;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    @XmlElement(name = "GameVerison", defaultValue = "")
    public double getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(double gameVersion) {
        this.gameVersion = gameVersion;
    }

    @XmlElement(name = "TrackLength", defaultValue = "")
    public double getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(double trackLength) {
        this.trackLength = trackLength;
    }

    @XmlElement(name = "Race", defaultValue = "")
    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    @XmlElement(name = "TestDay", defaultValue = "")
    public TestDay getTestDay() {
        return testDay;
    }

    public void setTestDay(TestDay testDay) {
        this.testDay = testDay;
    }

    @XmlElement(name = "Warmup", defaultValue = "")
    public Warmup getWarmup() {
        return warmup;
    }

    public void setWarmup(Warmup warmup) {
        this.warmup = warmup;
    }

    @XmlElement(name = "Practice1", defaultValue = "")
    public Practice1 getPractice1() {
        return practice1;
    }

    public void setPractice1(Practice1 practice1) {
        this.practice1 = practice1;
    }

    @XmlElement(name = "Practice2", defaultValue = "")
    public Practice2 getPractice2() {
        return practice2;
    }

    public void setPractice2(Practice2 practice2) {
        this.practice2 = practice2;
    }

    @XmlElement(name = "Practice3", defaultValue = "")
    public Practice3 getPractice3() {
        return practice3;
    }

    public void setPractice3(Practice3 practice3) {
        this.practice3 = practice3;
    }

    @XmlElement(name = "Practice4", defaultValue = "")
    public Practice4 getPractice4() {
        return practice4;
    }

    public void setPractice4(Practice4 practice4) {
        this.practice4 = practice4;
    }

    @XmlElement(name = "Qualify", defaultValue = "")
    public Qualify getQualify() {
        return qualify;
    }

    public void setQualify(Qualify qualify) {
        this.qualify = qualify;
    }

}
