package de.fillikos.rf2.esctool.view.config;

import java.util.Objects;

public class ServerConfig {

    private String serverName;
    private String ip;
    private String port;

    public ServerConfig() {

    }

    public ServerConfig(String serverName, String ip, String port) {
        this.serverName = serverName;
        this.ip = ip;
        this.port = port;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServerConfig)) return false;
        ServerConfig that = (ServerConfig) o;
        return Objects.equals(getServerName(), that.getServerName()) && Objects.equals(getIp(), that.getIp()) && Objects.equals(getPort(), that.getPort());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getServerName(), getIp(), getPort());
    }

    @Override
    public String toString() {
        return "ServerConfig{" +
                "serverName='" + serverName + '\'' +
                ", ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}
