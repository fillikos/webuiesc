package de.fillikos.rf2.esctool.data.grid.raceresult.driver;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlValue;

public class ControlAndAids {

    private int startLap, endLap;
    private String meldung;

    public ControlAndAids() {

    }

    @XmlAttribute
    public int getStartLap() {
        return startLap;
    }

    public void setStartLap(int startLap) {
        this.startLap = startLap;
    }

    @XmlAttribute
    public int getEndLap() {
        return endLap;
    }

    public void setEndLap(int endLap) {
        this.endLap = endLap;
    }

    @XmlValue
    public String getMeldung() {
        return meldung;
    }

    public void setMeldung(String meldung) {
        this.meldung = meldung;
    }

}
