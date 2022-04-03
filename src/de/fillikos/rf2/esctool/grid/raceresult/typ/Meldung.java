package de.fillikos.rf2.esctool.grid.raceresult.typ;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlValue;

public class Meldung {

    private double et;
    private String meldung;

    public Meldung() {

    }

    @XmlAttribute
    public double getEt() {
        return et;
    }

    public void setEt(double et) {
        this.et = et;
    }

    @XmlValue
    public String getMeldung() {
        return meldung;
    }

    public void setMeldung(String meldung) {
        this.meldung = meldung;
    }

}
