package de.fillikos.rf2.esctool.data.sonstiges;

import de.fillikos.rf2.service.webui.httpss.Connection;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerAufzeichnung {

    private Connection server;
    private SimpleDateFormat sdf;

    public ServerAufzeichnung() {
//        server = new Connection("http://localhost:", "5397");
        server = new Connection("http://89.163.146.67:", "51715");

        sdf = new SimpleDateFormat("yyMMddHHmmss");
    }

    public void start() {
        while (true) {
            server.loadStandings();
//            server.writeFile("d:\\rF2LN\\aufzeichnung" + sdf.format(new Date()) + ".log", server.getStanding);

            File file = new File("d:\\rF2LN\\history" + sdf.format(new Date()) + ".log");
            try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
                br.write(server.loadHistoryString());
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
