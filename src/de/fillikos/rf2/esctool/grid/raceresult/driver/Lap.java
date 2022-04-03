package de.fillikos.rf2.esctool.grid.raceresult.driver;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlValue;

public class Lap {

    private int num, p;
    private double fuel, twfl, twfr, twrl, twrr;
    private String fcompound, rcompound, et, lapTime;

    public Lap() {

    }

    @XmlAttribute
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @XmlAttribute
    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    @XmlAttribute
    public String getEt() {
        return et;
    }

    public void setEt(String et) {
        this.et = et;
    }

    @XmlAttribute
    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @XmlAttribute
    public double getTwfl() {
        return twfl;
    }

    public void setTwfl(double twfl) {
        this.twfl = twfl;
    }

    @XmlAttribute
    public double getTwfr() {
        return twfr;
    }

    public void setTwfr(double twfr) {
        this.twfr = twfr;
    }

    @XmlAttribute
    public double getTwrl() {
        return twrl;
    }

    public void setTwrl(double twrl) {
        this.twrl = twrl;
    }

    @XmlAttribute
    public double getTwrr() {
        return twrr;
    }

    public void setTwrr(double twrr) {
        this.twrr = twrr;
    }

    @XmlValue
    public String getLapTime() {
        return lapTime;
    }

    public void setLapTime(String lapTime) {
        this.lapTime = lapTime;
    }

    @XmlAttribute
    public String getFcompound() {
        return fcompound;
    }

    public void setFcompound(String fcompound) {
        this.fcompound = fcompound;
    }

    @XmlAttribute
    public String getRcompound() {
        return rcompound;
    }

    public void setRcompound(String rcompound) {
        this.rcompound = rcompound;
    }


}
