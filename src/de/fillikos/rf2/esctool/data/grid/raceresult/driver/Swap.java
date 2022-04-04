package de.fillikos.rf2.esctool.data.grid.raceresult.driver;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlValue;

public class Swap {

    private String startLap, endLap, value;

    public Swap() {

    }

    @XmlAttribute(required = false)
    public String getStartLap() {
        return startLap;
    }

    public void setStartLap(String startLap) {
        this.startLap = startLap;
    }

    @XmlAttribute(required = false)
    public String getEndLap() {
        return endLap;
    }

    public void setEndLap(String endLap) {
        this.endLap = endLap;
    }

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
