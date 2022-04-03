package de.fillikos.rf2.esctool.hotlap;

import de.fillikos.rf2.service.webui.httpss.model.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.User;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hotlap {

    private String time;
    private String driverName;
    private String vehicleName;
    private String carClass;
    private BigDecimal sector1;
    private BigDecimal sector2;
    private BigDecimal sector3;
    private BigDecimal lapTime;
    private String serverName;
    private String currentEventTime;
    private String sessionEnum;


    public Hotlap(SessionInfo sessionInfo, User user) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        this.time = df.format(new Date());
        this.driverName = user.getDriverName();
        this.vehicleName = user.getVehicleName();
        this.carClass = user.getCarClass();
        BigDecimal sector1 = new BigDecimal(user.getLastSectorTime1());
        BigDecimal sector2 = new BigDecimal(user.getLastSectorTime2());
        BigDecimal sector3 = new BigDecimal(user.getLastLapTime());
        this.sector1 = sector1;
        if (!sector2.equals(new BigDecimal("-1.0"))) {
            this.sector2 = sector2.subtract(sector1);
        } else {
            this.sector2 = sector2;
        }
        if (!sector3.equals(new BigDecimal("-1.0"))) {
            this.sector3 = sector3.subtract(sector2);
        } else {
            this.sector3 = sector3;
        }
        this.lapTime = sector3;
        this.serverName = sessionInfo.getServerName();
        this.currentEventTime = sessionInfo.getCurrentEventTime();
        this.sessionEnum = sessionInfo.getSessionEnum().toString();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public BigDecimal getSector1() {
        return sector1;
    }

    public void setSector1(BigDecimal sector1) {
        this.sector1 = sector1;
    }

    public BigDecimal getSector2() {
        return sector2;
    }

    public void setSector2(BigDecimal sector2) {
        this.sector2 = sector2;
    }

    public BigDecimal getSector3() {
        return sector3;
    }

    public void setSector3(BigDecimal sector3) {
        this.sector3 = sector3;
    }

    public BigDecimal getLapTime() {
        return lapTime;
    }

    public void setLapTime(BigDecimal lapTime) {
        this.lapTime = lapTime;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getCurrentEventTime() {
        return currentEventTime;
    }

    public void setCurrentEventTime(String currentEventTime) {
        this.currentEventTime = currentEventTime;
    }

    public String getSessionEnum() {
        return sessionEnum;
    }

    public void setSessionEnum(String sessionEnum) {
        this.sessionEnum = sessionEnum;
    }

    @Override
    public String toString() {
        return "Hotlap{" +
                "time='" + time + '\'' +
                ", driverName='" + driverName + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", carClass='" + carClass + '\'' +
                ", sector1=" + sector1 +
                ", sector2=" + sector2 +
                ", sector3=" + sector3 +
                ", lapTime=" + lapTime +
                ", serverName='" + serverName + '\'' +
                ", currentEventTime='" + currentEventTime + '\'' +
                ", sessionEnum='" + sessionEnum + '\'' +
                '}';
    }
}
