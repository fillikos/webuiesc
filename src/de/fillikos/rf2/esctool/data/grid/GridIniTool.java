package de.fillikos.rf2.esctool.data.grid;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.esctool.data.grid.raceresult.RFactorXML;
import de.fillikos.rf2.esctool.data.grid.raceresult.ResultsFactory;
import de.fillikos.rf2.esctool.data.grid.raceresult.driver.Driver;
import de.fillikos.rf2.esctool.view.config.ModConfig;
import de.fillikos.rf2.service.webui.httpss.model.Connection;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GridIniTool {

    private HashMap<String, Fahrzeug> insgesamtFahrer;
    private HashMap<String, Fahrzeug> insgesamtFahrerNeu;
    private List<String> fahrer;
    private ModConfig mod = new ModConfig();

    public GridIniTool() {

    }

    public void runGridIniTool(File qualiXml, Connection server, ModConfig mod) {
        Controller.addWarning("GridIniTool.runGridIniTool()");
        this.mod = mod;
        /*
         * Informationen Sammeln
         */
        // 1. Qualiergebniss aus der Quali.xml vom Server laden
        loadQualiXml(qualiXml.toPath());
        Controller.addWarning("runGridIniTool(): quali.xml geladen: " + insgesamtFahrer);
        // 2. Aktuelle User vom Server laden
        loadServerData(server);
        Controller.addWarning("runGridIniTool(): server geladen: " + insgesamtFahrerNeu);
        // 3. Vorbereitete strafen Datei aus dem /log/results Ordner laden
        loadStrafenData(qualiXml);
        Controller.addWarning("runGridIniTool(): strafen geladen");

        /*
         * Verarbeitung der Informationen der einzelnen Startgruppen
         */
        // 1. Startgruppen anlegen
        ArrayList<ArrayList<String>> startgruppen = new ArrayList<>();
        if (mod.getStartgruppeClass().size() == 0) {
            ArrayList<String> all = new ArrayList<>();
            String alleKlassen = "all";
            all.add(alleKlassen);
            mod.getStartgruppeClass().add(all);
        }
        for (int i = 0; i < mod.getStartgruppeClass().size(); i++) {
            startgruppen.add(new ArrayList<>());
        }
        Controller.addWarning("runGridIniTool(): Startgruppen angelegt Anzahl: " + startgruppen.size());
        // 2. Fahrzeuge den Startgruppen zuweisen anhand der CarClass
        for (String f : fahrer) {
            String[] element = f.split("##");
            /*
             * element[1] = vehName
             * element[2] = Fahrername
             * element[3] = Position
             * element[4] = CarClass
             */
            String vehName = element[1];
            String driverName = element[2];
            String carClass = element[4];

            for (int i = 0; i < mod.getStartgruppeClass().size(); i++) {
                if (mod.getStartgruppeClass().get(0).get(0).equals("ALL")) {
                    // Keine Sortierung nach Klassen
                    if (mod.isTeamEvent()) {
                        startgruppen.get(i).add(vehName);
                    } else {
                        startgruppen.get(i).add(driverName);
                    }
                } else {
                    // isStartgruppe überprüft die CarClass
                    if (isStartgruppe(carClass, mod.getStartgruppeClass().get(i))) {
                        if (mod.isTeamEvent()) {
                            startgruppen.get(i).add(vehName);
                        } else {
                            startgruppen.get(i).add(driverName);
                        }
                    }
                }
            }
        }
        // 3. erste Sortierung der Startgruppen
        for (int i = 0; i < mod.getStartgruppeClass().size(); i++) {
            sortStartgruppe(startgruppen.get(i));
            Controller.addWarning("runGridIniTool(): Startgruppen Sortiert: " + startgruppen.get(i).toString());
        }
        // 4. Startgruppe neu Positionieren, damit die Startgruppen hintereinander starten und nicht durchmischt sind
        int pos = 1;
        for (int i = 0; i < mod.getStartgruppeClass().size(); i++) {
            for (String s : startgruppen.get(i)) {
                insgesamtFahrerNeu.get(s).setPosition(pos++);
            }
        }
        // 5. Strafen verteilen
        allotPenalty(mod.getStartgruppeClass(), startgruppen);

        // 6. grid.ini schreiben
        writeGridIni(qualiXml, startgruppen);
    }

    private void allotPenalty(ArrayList<ArrayList<String>> startgruppeClass, ArrayList<ArrayList<String>> startgruppen) {
        for (int j = 0; j < startgruppeClass.size(); j++) {
            int strafe;

            do {
                strafe = 0;
                boolean setStrafe = true;
                for (int i = (startgruppen.get(j).size() - 1); i >= 0; i--) {
                    // Wenn eine Strafe vorliegt
                    if (insgesamtFahrerNeu.get(startgruppen.get(j).get(i)).besitztStrafe()) {
                        insgesamtFahrerNeu.get(startgruppen.get(j).get(i)).setStrafe(insgesamtFahrerNeu.get(startgruppen.get(j).get(i)).getStrafe() - 1);
                        if (strafe < insgesamtFahrerNeu.get(startgruppen.get(j).get(i)).getStrafe()) {
                            strafe = insgesamtFahrerNeu.get(startgruppen.get(j).get(i)).getStrafe();
                        }
                        if (i == startgruppen.get(j).size()-1) {
                            setStrafe = false;
                        }
                        // werden die Positionen getauscht
                        if (setStrafe) {
                            try {
                                String temp = startgruppen.get(j).get(i);
                                startgruppen.get(j).set(i, startgruppen.get(j).get(i + 1));
                                startgruppen.get(j).set(i + 1, temp);
                            } catch (IndexOutOfBoundsException e) {
                                // Wird eine IndexOutOfBounce geworfen, wird auf den letzten Platz der Startgruppe zugegriffen
//                                System.out.println("letzter");
                            }
                        } else {
//                            System.out.println("Das ist der letzte Platz, hier wird nicht versetzt");
                        }
                    } else {
                        setStrafe = true;
                    }
                }
            } while (strafe > 0);
        }
    }

    private void loadStrafenData(File qualiXml) {
        HashMap<String, Fahrzeug> insgesamtVehNummer = new HashMap<>();
        for (Fahrzeug f: insgesamtFahrerNeu.values()) {
            String vehNummer = f.getVehName().substring(f.getVehName().indexOf("#"));
            insgesamtVehNummer.put(vehNummer, f);
        }
        try (BufferedReader in = new BufferedReader(new FileReader(qualiXml.getParent() + "\\strafen"))) {
            String zeile;
            StringBuilder strafenIni = new StringBuilder();
            StringBuilder strafenVergebenIni = new StringBuilder();
            int zeilenZaehler = 1;

            while ((zeile = in.readLine()) != null) {
                Controller.addWarning("strafen : " + zeile);
                if (!convertStrafenDatei(zeile, insgesamtVehNummer, strafenIni, strafenVergebenIni)) {
                    Controller.showWarning("Fehler in der Strafen-Datei Zeile: " + zeilenZaehler + "\n" + zeile);
                }
                zeilenZaehler++;
            }

            writeStrafenIni(qualiXml, strafenIni);
            writeStrafenVergebenIni(qualiXml, strafenVergebenIni);
        } catch (FileNotFoundException e) {
//            Controller.showWarning("Strafen-Datei im Result-Verzeichnis nicht gefunden!");
            Controller.addError("loadStrafenData: keine Strafen-Datei vorhanden");
        } catch (IOException e) {
            Controller.showWarning("Fehler beim Laden/Verarbeiten der Strafen-Datei");
            Controller.addError(Arrays.toString(e.getStackTrace()));
        }
    }

    private boolean convertStrafenDatei(String zeile, HashMap<String, Fahrzeug> insgesamtVehNummer, StringBuilder strafenIni, StringBuilder strafenVergebenIni) {
        if (zeile.contains(" ==> ")) {
            String vehNummer = zeile.substring(zeile.indexOf("#"), zeile.indexOf(","));
            if (insgesamtVehNummer.containsKey(vehNummer)) {

                String driverName;
                if (mod.isTeamEvent()) {
                    driverName = insgesamtFahrerNeu.get(insgesamtVehNummer.get(vehNummer).getVehName()).getFahrer();
                } else {
                    driverName = zeile.substring(zeile.indexOf(", ") + 2, zeile.indexOf(" ==> "));
                }

                // Startplatzstrafe
                if (zeile.contains(" ==> +")) {
                    int strafplaetze = Integer.parseInt(zeile.substring(zeile.indexOf(" ==> +") + 6, zeile.indexOf(" Startpl")));
                    if (mod.isTeamEvent()) {
                        insgesamtFahrerNeu.get(insgesamtVehNummer.get(vehNummer).getVehName()).setStrafe(strafplaetze);
                    } else {
                        insgesamtFahrerNeu.get(driverName).setStrafe(strafplaetze);
                    }

                // Durchfahrtsstrafe
                } else if (zeile.contains(" ==> Durchfahrtsstrafe")) {
                    strafenIni.append("/addpenalty -1 ").append(driverName).append("\n");

                // Stop and Go Strafe
                } else {
                    int sekunden = Integer.parseInt(zeile.substring(zeile.indexOf(" ==> ") + 5, zeile.indexOf(" Sekunden")));
                    while(sekunden > 0) {
                        strafenIni.append("/addpenalty ");
                        if (sekunden > 60) {
                            strafenIni.append("60");
                            sekunden = sekunden - 60;
                        } else {
                            strafenIni.append(sekunden);
                            sekunden = 0;
                        }
                        strafenIni.append(" ").append(driverName).append("\n");
                    }
                }

                strafenVergebenIni.append(zeile.replace(" ==> ", " ==> [B]"))
                        .append("[/B]")
                        .append("[COLOR=rgb(65, 168, 95)][B] ==> abgeleistet[/B][/COLOR]")
                        .append("\n");
            } else {
                strafenVergebenIni.append(zeile.replace(" ==> ", " ==> [B]"))
                        .append("[/B]")
                        .append("[COLOR=rgb(184, 49, 47)][B]==> nicht abgeleistet[/B][/COLOR]")
                        .append("\n");
            }
            return true;
        } else {
            strafenVergebenIni.append(zeile)
                    .append("[COLOR=rgb(184, 49, 47)][B]==> nicht abgeleistet - Fehler[/B][/COLOR]")
                    .append("\n");
            return false;
        }
    }

    private void writeGridIni(File qualiXml, ArrayList<ArrayList<String>> startgruppen) {
        Controller.addWarning("runGridIniTool(): writeGridIni() " + startgruppen.toString());
        File file = new File(qualiXml.getParent() + "\\grid.ini");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            int position = 1;
            for (ArrayList<String> startgruppe : startgruppen) {
                for (String identifier : startgruppe) {
                    br.write(String.format("/editgrid %d %s",
                            position++,
                            insgesamtFahrerNeu.get(identifier).getFahrer()));
                    br.newLine();
                }
            }
        } catch (IOException e) {
            Controller.addError("Fehler beim Schreiben der Grid.ini:\n" + Arrays.toString(e.getStackTrace()));
        }
    }

    private void writeStrafenIni(File qualiXml, StringBuilder strafenIni) {
        Controller.addWarning("runGridIniTool(): writeStracenIni() " + strafenIni.toString());
        File file = new File(qualiXml.getParent() + "\\strafen.ini");
//        File file = new File("G:\\SteamLibrary\\steamapps\\common\\rFactor 2\\UserData\\Log\\Results\\grid");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write(strafenIni.toString());
        } catch (IOException e) {
            Controller.addError("Fehler beim Schreiben der Strafen.ini:\n" + Arrays.toString(e.getStackTrace()));
        }
    }

    private void writeStrafenVergebenIni(File qualiXml, StringBuilder strafenVergebenIni) {
        Controller.addWarning("runGridIniTool(): writeStrafenVergebenIni() " + strafenVergebenIni.toString());
        File file = new File(qualiXml.getParent() + "\\strafenVergeben.txt");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write(strafenVergebenIni.toString());
        } catch (IOException e) {
            Controller.addError("Fehler beim Schreiben der strafenVergeben.txt:\n" + Arrays.toString(e.getStackTrace()));
        }
    }

    private boolean isStartgruppe(String carClass, ArrayList<String> startgruppeClass) {
        for (String aClass : startgruppeClass) {
            if (carClass.equals(aClass)) {
                return true;
            }
        }
        return false;
    }

    private void sortStartgruppe(ArrayList<String> liste) {
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
        Controller.addLog("GridIniTool.loadServerData()");
        WebUI web = new WebUI(server);
        fahrer = web.getFahrer();
        insgesamtFahrerNeu = new HashMap<>();

        for (String f : fahrer) {
            String[] element = f.split("##");
            int position = Integer.parseInt(element[3]) + 6000;
            String vehName = element[1];
            String name = element[2];
            String carClass = element[4];

            if (mod.isTeamEvent()) {
                if (insgesamtFahrer.containsKey(String.valueOf(vehName))) {
                    position = insgesamtFahrer.get(vehName).getPosition();
                }
                insgesamtFahrerNeu.put(vehName, new Fahrzeug(position, vehName, name, carClass));
            } else {
                if (insgesamtFahrer.containsKey(name)) {
                    position = insgesamtFahrer.get(name).getPosition();
                }
                insgesamtFahrerNeu.put(name, new Fahrzeug(position, vehName, name, carClass));
            }
        }
        Controller.addLog("fahrer: " + fahrer.toString());
        Controller.addLog("insgesamtFahrerNeu: " + insgesamtFahrerNeu.toString());
    }

    public void loadQualiXml(Path path) {
        Controller.addLog("GridIniTool.loadQualiXml()");
        insgesamtFahrer = new HashMap<>();
        ResultsFactory rf = new ResultsFactory();
        RFactorXML xml = rf.getResult(path);
        for (Driver d : xml.getRaceResult().getQualify().getDriver()) {
            if (mod.isTeamEvent()) {
                insgesamtFahrer.put(d.getVehName(), new Fahrzeug(d.getLapRankIncludingDiscos(), d.getVehName(), d.getName(), d.getCarClass()));
            } else {
                insgesamtFahrer.put(d.getName(), new Fahrzeug(d.getLapRankIncludingDiscos(), d.getVehName(), d.getName(), d.getCarClass()));
            }
        }
        Controller.addLog("insgesamtFahrer: " + insgesamtFahrer.toString());
    }

}
