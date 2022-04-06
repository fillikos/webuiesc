package de.fillikos.rf2.esctool.data.grid.raceresult;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rFactorXML")
public class RFactorXML {

    private RaceResult raceResult;
    private double version;

    public RFactorXML() {
//		raceResult = new RaceResult();
    }

    @XmlElement(name = "RaceResults")
    public RaceResult getRaceResult() {
        return raceResult;
    }

    public void setRaceResult(RaceResult raceResult) {
        this.raceResult = raceResult;
    }

    @XmlAttribute(name = "version")
    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

}
