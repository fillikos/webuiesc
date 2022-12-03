package de.fillikos.rf2.esctool.data.grid;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.fillikos.rf2.service.webui.httpss.model.Connection;
import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import java.io.IOException;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebUI {

    private String server = "http://89.163.146.67:";
    /**
     * 24h R        http://89.163.146.67:51725
     * 24h T        http://89.163.146.67:51715
     * localhost    http://localhost:5397
     * vrrf2ln T    5735
     * vrrf2ln R    5725
     */
    private String port = "5735";
    private User[] users;

    public WebUI(Connection server) {
        this.port = server.getPort();
        this.server = server.getAdresse();
    }

    public void loadServer() {
        System.out.println("WebUI.loadServer()");
        users = new User[0];
        ObjectMapper om = new ObjectMapper();
        try {
            String standings = "/rest/watch/standings";
            users = om.readValue(new URL(server + port + standings), User[].class);
        } catch (MalformedURLException e) {
            System.out.println("Keine Verbindung zum Server");
        } catch (ConnectException e) {
            System.out.println("Kein Server gefunden");
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(users.length);
    }

    public List<String> getFahrer() {
        System.out.println("WebUI.getFahrer()");
        loadServer();
        List<String> fahrer = new ArrayList<>();
        System.out.println(Arrays.toString(users));
        System.out.println("test");

        for (User user : users) {
            fahrer.add(String.format("##%s##%s##%s##%s",
                    user.getVehicleName(),
                    user.getDriverName(),
                    user.getPosition(),
                    user.getCarClass()));
        }
        return fahrer;
    }
}
