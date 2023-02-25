package de.fillikos.rf2.esctool.data;

import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import java.util.Objects;

public class Vehicle {

    private int position;
    private String teamName;
    private String driverName;
    private String pathLateral;
    private String lapDistance;

    public Vehicle() {

    }

    public Vehicle(User user) {
        this.position = Integer.parseInt(user.getPosition());
        this.teamName = user.getVehicleName();
        this.driverName = user.getDriverName();
        this.pathLateral = user.getPathLateral();
        this.lapDistance = user.getLapDistance();
    }

    public boolean isLeftSide() {
        return this.pathLateral.contains("-");
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getPathLateral() {
        return pathLateral;
    }

    public void setPathLateral(String pathLateral) {
        this.pathLateral = pathLateral;
    }

    public String getLapDistance() {
        return lapDistance;
    }

    public void setLapDistance(String lapDistance) {
        this.lapDistance = lapDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return position == vehicle.position && Objects.equals(teamName, vehicle.teamName) && Objects.equals(driverName, vehicle.driverName) && Objects.equals(pathLateral, vehicle.pathLateral) && Objects.equals(lapDistance, vehicle.lapDistance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, teamName, driverName, pathLateral, lapDistance);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "position=" + position +
                ", teamName='" + teamName + '\'' +
                ", driverName='" + driverName + '\'' +
                ", pathLateral='" + pathLateral + '\'' +
                ", lapDistance='" + lapDistance + '\'' +
                '}';
    }
}
