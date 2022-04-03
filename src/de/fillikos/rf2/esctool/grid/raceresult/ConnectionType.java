package de.fillikos.rf2.esctool.grid.raceresult;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "ConnectionType")
public class ConnectionType {

    private int upload, download;
    private String connectType;

    public ConnectionType() {

    }

    @XmlAttribute
    public int getUpload() {
        return upload;
    }

    public void setUpload(int upload) {
        this.upload = upload;
    }

    @XmlAttribute
    public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    @XmlValue
    public String getConnectType() {
        return connectType;
    }

    public void setConnectType(String connectType) {
        this.connectType = connectType;
    }

}
