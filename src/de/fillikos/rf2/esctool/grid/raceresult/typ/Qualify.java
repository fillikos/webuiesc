package de.fillikos.rf2.esctool.grid.raceresult.typ;

import de.fillikos.rf2.esctool.grid.raceresult.driver.Driver;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;


@XmlType(propOrder = {"dateTime", "timeString", "laps", "minutes", "stream",
        "mostLapsCompleted", "driver"})
@XmlRootElement(name = "Qualify")
public class Qualify {


    private long dateTime, laps;
    private String timeString;
    private int minutes, mostLapsCompleted;
    private Stream stream;
    private ArrayList<Driver> driver;

    public Qualify() {
//		driver = new ArrayList<Driver>();
//		stream = new Stream();
    }

    @XmlElement(name = "DateTime")
    public long getDateTime() {
        return dateTime;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    @XmlElement(name = "Laps")
    public long getLaps() {
        return laps;
    }

    public void setLaps(long laps) {
        this.laps = laps;
    }

    @XmlElement(name = "TimeString")
    public String getTimeString() {
        return timeString;
    }

    public void setTimeString(String timeString) {
        this.timeString = timeString;
    }

    @XmlElement(name = "Minutes")
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @XmlElement(name = "MostLapsCompleted")
    public int getMostLapsCompleted() {
        return mostLapsCompleted;
    }

    public void setMostLapsCompleted(int mostLapsCompleted) {
        this.mostLapsCompleted = mostLapsCompleted;
    }

    @XmlElement(name = "Stream")
    public Stream getStream() {
        return stream;
    }

    public void setStream(Stream stream) {
        this.stream = stream;
    }

    @XmlElement(name = "Driver")
    public ArrayList<Driver> getDriver() {
        return driver;
    }

    public void setDriver(ArrayList<Driver> driver) {
        this.driver = driver;
    }

}
