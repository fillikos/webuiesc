package de.fillikos.rf2.esctool.data.grid;

import de.fillikos.rf2.esctool.data.grid.raceresult.RFactorXML;
import de.fillikos.rf2.esctool.data.grid.raceresult.ResultsFactory;
import de.fillikos.rf2.esctool.data.grid.raceresult.driver.Driver;
import de.fillikos.rf2.service.webui.httpss.model.Connection;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

public class GridIniTool {

    private HashMap<String, Fahrzeug> insgesamtFahrer;
    private HashMap<String, Fahrzeug> insgesamtFahrerNeu;
    private ArrayList<String> fahrer;

    public GridIniTool() {

    }

    public void runGridIniTool(File qualiXml, Connection server, ArrayList<ArrayList<String>> startgruppeClass) {
        System.out.println("DataController.runGridIniTool()");

        /*
         * Informationen Sammeln
         */
        // 1. Qualiergebniss aus der Quali.xml vom Server laden
        loadQualiXml(qualiXml.toPath());
        // 2. Aktuelle User vom Server laden
        loadServerData(server);
        // 3. Vorbereitete strafen Datei aus dem /log/results Ordner laden
        loadStrafenData(qualiXml);

        /*
         * Verarbeitung der Informationen der einzelnen Startgruppen
         */
        // 1. Startgruppen anlegen
        ArrayList<ArrayList<String>> startgruppen = new ArrayList<>();
        System.out.println(startgruppeClass.size() + " " + startgruppeClass);
        for (int i = 0; i < startgruppeClass.size(); i++) {
            startgruppen.add(new ArrayList<>());
        }
        // 2. Fahrzeuge den Startgruppen zuweisen anhand der CarClass
        for (String f : fahrer) {
            String[] element = f.split("##");
            /*
             * element[1] = Fahrzeugnummer
             * element[2] = Fahrername
             * element[3] = Position
             * element[4] = CarClass
             */
            int nummer = Integer.parseInt(element[1]);
            String carClass = element[4];

            for (int i = 0; i < startgruppeClass.size(); i++) {
                // isStartgruppe überprüft die CarClass
                if (isStartgruppe(carClass, startgruppeClass.get(i))) {
                    startgruppen.get(i).add(String.valueOf(nummer));
                    break;
                }
            }
        }
        // 3. erste Sortierung der Startgruppen
        for (int i = 0; i < startgruppeClass.size(); i++) {
            sortStartgruppe(startgruppen.get(i));
        }
        // 4. Startgruppe neu Positionieren, damit die Startgruppen hintereinander starten und nicht durchmischt sind
        int pos = 1;
        for (int i = 0; i < startgruppeClass.size(); i++) {
            for (String s : startgruppen.get(i)) {
                insgesamtFahrerNeu.get(s).setPosition(pos++);
            }
        }
        // 5. Strafen verteilen
        allotPenalty(startgruppeClass, startgruppen);

        // 6. grid.ini schreiben
        writeGridIni(qualiXml, startgruppen);
    }

    private void allotPenalty(ArrayList<ArrayList<String>> startgruppeClass, ArrayList<ArrayList<String>> startgruppen) {
        for (int j = 0; j < startgruppeClass.size(); j++) {
            int strafe;

            do {
                strafe = 0;
                for (int i = (startgruppen.get(j).size() - 1); i >= 0; i--) {
                    /*
                     * Wenn eine Strafe vorliegt
                     */
                    if (insgesamtFahrerNeu.get(startgruppen.get(j).get(i)).besitztStrafe()) {
                        insgesamtFahrerNeu.get(startgruppen.get(j).get(i)).setStrafe(insgesamtFahrerNeu.get(startgruppen.get(j).get(i)).getStrafe() - 1);
                        if (strafe < insgesamtFahrerNeu.get(startgruppen.get(j).get(i)).getStrafe()) {
                            strafe = insgesamtFahrerNeu.get(startgruppen.get(j).get(i)).getStrafe();
                        }
                        /*
                         * werden die Positionen getauscht
                         */
                        try {
                            String temp = startgruppen.get(j).get(i);
                            startgruppen.get(j).set(i, startgruppen.get(j).get(i + 1));
                            startgruppen.get(j).set(i + 1, temp);
                        } catch (IndexOutOfBoundsException e) {
//                        System.out.println("letzter");
                        }
                    }
                }
            } while (strafe > 0);
        }
    }

    private void loadStrafenData(File qualiXml) {
        try (BufferedReader in = new BufferedReader(new FileReader(qualiXml.getParent() + "\\strafen"))) {
            String zeile;
            StringBuilder strafenIni = new StringBuilder();

            while ((zeile = in.readLine()) != null) {
                if (zeile.contains("#")) {
                    String fahrzeugNummer = zeile.substring(zeile.indexOf("#") + 1, zeile.indexOf("#") + 4);
                    if (insgesamtFahrerNeu.containsKey(fahrzeugNummer)) {
                        if (zeile.contains("==> +")) {
                            insgesamtFahrerNeu.get(fahrzeugNummer).setStrafe(Integer.parseInt(zeile.substring(zeile.indexOf(" +") + 2, zeile.indexOf(" St"))));
                        } else if (zeile.contains("==> D")) {
                            strafenIni.append("/addpenalty -1 ")
                                    .append(insgesamtFahrerNeu.get(fahrzeugNummer).getFahrer())
                                    .append("\n");
                        } else {
                            strafenIni.append("/addpenalty ")
                                    .append(zeile, zeile.indexOf(" ==> ") + 5, zeile.indexOf(" Sekunden"))
                                    .append(" ").append(insgesamtFahrerNeu.get(fahrzeugNummer).getFahrer())
                                    .append("\n");
                        }
                    }
                    System.out.println(fahrzeugNummer);
                    System.out.println(zeile.indexOf("#"));
                }
                System.out.println(zeile);
            }
            writeStrafenIni(qualiXml, strafenIni);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeGridIni(File qualiXml, ArrayList<ArrayList<String>> startgruppen) {
        System.out.println("DataController.writeGridIni()");
        File file = new File(qualiXml.getParent() + "\\grid.ini");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            int position = 1;
            for (ArrayList<String> startgruppe : startgruppen) {
                for (String vehicleNumber : startgruppe) {
                    br.write(String.format("/editgrid %d %s",
                            position++,
                            insgesamtFahrerNeu.get(vehicleNumber).getFahrer()));
                    System.out.println(insgesamtFahrerNeu.get(vehicleNumber).getNummer() + " " +
                            insgesamtFahrerNeu.get(vehicleNumber).getFahrer() + " " +
                            insgesamtFahrerNeu.get(vehicleNumber).getPosition());
                    br.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeStrafenIni(File qualiXml, StringBuilder strafenIni) {
        System.out.println("DataController.writeStrafenIni()");
        File file = new File(qualiXml.getParent() + "\\strafen.ini");
//        File file = new File("G:\\SteamLibrary\\steamapps\\common\\rFactor 2\\UserData\\Log\\Results\\grid");
        System.out.println("strafenIni: " + strafenIni.toString());
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write(strafenIni.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isStartgruppe(String carClass, ArrayList<String> startgruppeClass) {
        System.out.println("DataController.isStartgruppe()");
        for (String aClass : startgruppeClass) {
            if (carClass.equals(aClass)) {
                return true;
            }
        }
        return false;
    }

    private void sortStartgruppe(ArrayList<String> liste) {
        System.out.println("DataController.sortStartgruppe()");
        for (int i = 0; i < liste.size(); i++) {
            for (int j = 0; j < liste.size() - 1; j++) {
                double v1 = insgesamtFahrerNeu.get(liste.get(j)).getPosition();
                try {
                    double v2 = insgesamtFahrerNeu.get(liste.get(j + 1)).getPosition();
                    if (v1 > v2) {
                        String temp = liste.get(j);
                        liste.set(j, liste.get(j + 1));
                        liste.set(j + 1, temp);
                    }
                } catch (NullPointerException e) {
//                    System.out.println("letzter");
                }
            }
        }
    }

    private void loadServerData(Connection server) {
        System.out.println("DataController.loadServerData()");
        WebUI web = new WebUI(server);
        fahrer = web.getFahrer();

        insgesamtFahrerNeu = new HashMap<>();

        for (String f : fahrer) {
            String[] element = f.split("##");
            int position = Integer.parseInt(element[3]) + 6000;
            int nummer = Integer.parseInt(element[1]);
            String name = element[2];
            String carClass = element[4];

            if (insgesamtFahrer.containsKey(String.valueOf(nummer))) {
                position = insgesamtFahrer.get(String.valueOf(nummer)).getPosition();
            }
            insgesamtFahrerNeu.put(String.valueOf(nummer), new Fahrzeug(position, nummer, name, carClass));
        }
        System.out.println(insgesamtFahrerNeu);
    }

    public void loadQualiXml(Path path) {
        System.out.println("DataController.loadQualiXml()");
        insgesamtFahrer = new HashMap<>();
        ResultsFactory rf = new ResultsFactory();
        RFactorXML xml = rf.getResult(path);
        System.out.println("xml...size(): " + xml.getRaceResult().getQualify().getDriver().size());
        for (Driver d : xml.getRaceResult().getQualify().getDriver()) {
            insgesamtFahrer.put(String.valueOf(d.getCarNumber()), new Fahrzeug(d.getLapRankIncludingDiscos(), d.getCarNumber(), d.getName(), d.getCarClass()));
        }
        System.out.println("insgesamtFahrer.size(): " + insgesamtFahrer.size());
        System.out.println(insgesamtFahrer);
    }

}
