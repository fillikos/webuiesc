package de.fillikos.rf2.esctool.view.config;

import com.sun.istack.internal.Nullable;

import java.io.File;
import java.util.Objects;

public class ServerConfig {

    private String serverName;
    private String ip;
    private String port;
    @Nullable
    private File rf2UserDir = null;

    public ServerConfig() {

    }

    public ServerConfig(String serverName, String ip, String port) {
        this.serverName = serverName;
        this.ip = ip;
        this.port = port;
    }

    public ServerConfig(String serverName, String ip, String port, String rf2UserDir) {
        this.serverName = serverName;
        this.ip = ip;
        this.port = port;
        this.rf2UserDir = new File(rf2UserDir);
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

    public File getRf2UserDir() {
        return rf2UserDir;
    }

    public void setRf2UserDir(File rf2UserDir) {
        this.rf2UserDir = rf2UserDir;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServerConfig)) return false;
        ServerConfig that = (ServerConfig) o;
        return Objects.equals(getServerName(), that.getServerName()) && Objects.equals(getIp(), that.getIp()) && Objects.equals(getPort(), that.getPort()) && Objects.equals(rf2UserDir, that.rf2UserDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getServerName(), getIp(), getPort(), rf2UserDir);
    }

    @Override
    public String toString() {
        return "ServerConfig{" +
                "serverName='" + serverName + '\'' +
                ", ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", rf2UserDir=" + rf2UserDir +
                '}';
    }
}
