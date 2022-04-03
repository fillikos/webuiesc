package de.fillikos.rf2.esctool.grid;

import de.fillikos.rf2.esctool.grid.raceresult.RFactorXML;
import de.fillikos.rf2.esctool.grid.raceresult.ResultsFactory;
import de.fillikos.rf2.esctool.grid.raceresult.driver.Driver;
import de.fillikos.rf2.service.webui.httpss.Connection;

import javax.swing.*;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

public class DataController {

    private HashMap<Integer, Fahrzeug> insgesamt;
    private HashMap<String, Fahrzeug> insgesamtFahrer;
    private HashMap<String, Fahrzeug> insgesamtFahrerNeu;
    private Read daten;
    private ArrayList<String> fahrer;
    private ArrayList<String> startgruppeGT3, startgruppeCUP2, startgruppeSP3T, startgruppeCUP5, startgruppeGT4, startgruppeH2;
    private Startgruppe[] startgruppe = new Startgruppe[3];
    private StartgruppeName[] startgruppeName = new StartgruppeName[6];
    private Client client;
    private ArrayList<String> startgruppe24h;

    public DataController() {
        /**
         * Felder Initialisieren
         */
        client = new Client();
        insgesamt = new HashMap<>();
        daten = new Read();
    }

    public void load() {
        /**
         * Informationen Sammeln
         */
        loadAnmeldung();
        loadQuali();
        loadServer();
        loadStrafe(fahrer);

        /**
         * Verarbeitung der Informationen der einzelnen Startgruppen
         */
        runExecution();

        writeGridINI(startgruppe);
    }

    public void runExecution() {
        System.out.println("DataController.runExecution()");
        for (int i = 0; i < 3; i++) {
            startgruppe[i] = new Startgruppe();
            startgruppe[i].startgruppenErstellen(fahrer, String.format("%d", i + 1), insgesamt);
//            System.out.println(startgruppe.toString());
            startgruppe[i].positionenPruefen(insgesamt, fahrer);
            startgruppe[i].sortieren(insgesamt);
//            System.out.println("Startgruppe " + (i+1) + " sortiert!");
            startgruppe[i].positionenReset(insgesamt);
//            System.out.println(startgruppe[i].toString());
//            System.out.println("Startgruppe " + (i+1) + " Positionen neu gesetzt!");
            startgruppe[i].strafeEinleiten(insgesamt);
//            System.out.println("Startgruppe " + (i+1) + " Strafen verarbeitet!");
            System.out.println("Startgruppe " + (i + 1) + " fertig verarbeitet!");
            System.out.println(startgruppe[i].toString());
//            System.out.println(fahrer.toString());
        }
    }

    public void loadServer() {
        System.out.println("DataController.loadServer()");
        client.load();
        fahrer = client.getList();
    }


    public void loadStrafe(ArrayList<String> fahrer) {
        System.out.println("DataController.loadStrafe()");
        System.out.println("Strafen geladen");
        daten.readStrafen(insgesamtFahrerNeu, fahrer);
        System.out.println(fahrer);
    }

    public void loadAnmeldung() {
        daten.readAnmeldug(insgesamt);
    }

    public void loadQuali() {
        System.out.println("DataController.loadQuali()");
        daten.readGridINI(insgesamt);
        System.out.println(insgesamt.toString());
    }

    public void writeGridINI(Startgruppe[] startgruppe) {
        System.out.println("DataController.writeGridINI()");
        File file = new File("G:\\SteamLibrary\\steamapps\\common\\rFactor 2\\UserData\\Log\\Results\\grid");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            int position = 1;
            for (int i = 0; i < startgruppe.length; i++) {
                for (int j = 0; j < startgruppe[i].getStartgruppe().size(); j++) {
                    br.write(String.format("/editgrid %d %s",
                            position++,
                            insgesamt.get(startgruppe[i].getStartgruppe().get(j)).getFahrer()));
                    System.out.println(insgesamt.get(startgruppe[i].getStartgruppe().get(j)).getNummer() + " " +
                            insgesamt.get(startgruppe[i].getStartgruppe().get(j)).getFahrer() + " " +
                            insgesamt.get(startgruppe[i].getStartgruppe().get(j)).getPosition());
                    br.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String insgesamtToString() {
        return this.insgesamt.toString();
    }

    public HashMap<Integer, Fahrzeug> getInsgesamt() {
        return this.insgesamt;
    }

    public void loadAnmeldungThread(String anmeldeThread) {
        daten.readAnmeldugThread(insgesamt, anmeldeThread);
    }

    public void load24h(File qualiXml, Connection server, JTextField txtLeaderGrid2) {
        System.out.println("DataController.load24h()");
        /**
         * Informationen Sammeln
         */
//        loadAnmeldung();
//        loadQualiName();
        txtLeaderGrid2.setText(qualiXml.toPath().toString());
        loadxml(qualiXml.toPath(), txtLeaderGrid2);
//        loadxml(Paths.get("G:\\SteamLibrary\\steamapps\\common\\rFactor 2\\UserData\\Log\\Results\\2021_11_13_11_50_58-01Q1.xml"));
        loadServer24hWeb(server);
        txtLeaderGrid2.setText("2");
        //        try (BufferedReader in = new BufferedReader(new FileReader(new File("C:\\Users\\juerg\\OneDrive\\rF2LN\\VR-rF2LN\\s4\\strafen")))) {
        try (BufferedReader in = new BufferedReader(new FileReader(new File(qualiXml.getParent() + "\\strafen")))) {
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
                                    .append(zeile.substring(zeile.indexOf(" ==> ") + 5, zeile.indexOf(" Sekunden")))
                                    .append(" ").append(insgesamtFahrerNeu.get(fahrzeugNummer).getFahrer())
                                    .append("\n");
                        }
                    }
                    System.out.println(fahrzeugNummer);
                    System.out.println(zeile.indexOf("#"));
                }
                System.out.println(zeile);
//                    System.out.println(zeile.substring(zeile.indexOf(" +") + 2 , zeile.indexOf(" St")));

            }
//            System.out.println(strafenIni.toString());
            //TODO write strafen.ini
            writeStrafenINI24h(qualiXml, strafenIni);
        } catch (IOException e) {
            e.printStackTrace();
        }


        /**
         * Verarbeitung der Informationen der einzelnen Startgruppen
         */
//        runExecutionName(2);

        startgruppeGT3 = new ArrayList<>();
        startgruppeCUP2 = new ArrayList<>();
        startgruppeGT4 = new ArrayList<>();
        startgruppeSP3T = new ArrayList<>();
        startgruppeCUP5 = new ArrayList<>();
        startgruppeH2 = new ArrayList<>();
        startgruppen24h();
        sort24h(startgruppeGT3);
        sort24h(startgruppeCUP2);
        sort24h(startgruppeGT4);
        sort24h(startgruppeSP3T);
        sort24h(startgruppeCUP5);
        sort24h(startgruppeH2);
//        writeGridINI(startgruppeName);
        System.out.println(startgruppeGT3 + "\n" +
                startgruppeCUP2 + "\n" +
                startgruppeGT4 + "\n" +
                startgruppeSP3T + "\n" +
                startgruppeCUP5 + "\n" +
                startgruppeH2);
        int x = 1;
        for (String s : startgruppeGT3) {
            insgesamtFahrerNeu.get(s).setPosition(x++);
        }
        for (String s : startgruppeSP3T) {
            insgesamtFahrerNeu.get(s).setPosition(x++);
        }
        System.out.println(startgruppeGT3 + "\n" +
                startgruppeSP3T);
        txtLeaderGrid2.setText("3");

        int strafe = 0;
        do {
            strafe = 0;
            for (int i = (startgruppeGT3.size() - 1); i >= 0; i--) {
//                System.out.println(insgesamt.get(startgruppe.get(i)).getStrafe());
                /**
                 * Wenn eine Strafe vorliegt
                 */
                if (insgesamtFahrerNeu.get(startgruppeGT3.get(i)).besitztStrafe()) {
//                    System.out.println(startgruppe.get(i));
                    insgesamtFahrerNeu.get(startgruppeGT3.get(i)).setStrafe(insgesamtFahrerNeu.get(startgruppeGT3.get(i)).getStrafe() - 1);
//                    System.out.println(strafe);
//                    System.out.println(insgesamt.get(startgruppe.get(i)).getStrafe());
                    if (strafe < insgesamtFahrerNeu.get(startgruppeGT3.get(i)).getStrafe()) {
                        strafe = insgesamtFahrerNeu.get(startgruppeGT3.get(i)).getStrafe();
                    }
//                    System.out.println("Strafe");
                    /**
                     * werden die Positionen getauscht
                     */
                    double v1 = insgesamtFahrerNeu.get(startgruppeGT3.get(i)).getPosition();
                    try {
                        double v2 = insgesamtFahrerNeu.get(startgruppeGT3.get(i + 1)).getPosition();
                        String temp = startgruppeGT3.get(i);
                        startgruppeGT3.set(i, startgruppeGT3.get(i + 1));
                        startgruppeGT3.set(i + 1, temp);
                    } catch (IndexOutOfBoundsException e) {
//                        System.out.println("letzter");
                    }
                }
            }
        } while (strafe > 0);

        strafe = 0;
        do {
            strafe = 0;
            for (int i = (startgruppeSP3T.size() - 1); i >= 0; i--) {
//                System.out.println(insgesamt.get(startgruppe.get(i)).getStrafe());
                /**
                 * Wenn eine Strafe vorliegt
                 */
                if (insgesamtFahrerNeu.get(startgruppeSP3T.get(i)).besitztStrafe()) {
//                    System.out.println(startgruppe.get(i));
                    insgesamtFahrerNeu.get(startgruppeSP3T.get(i)).setStrafe(insgesamtFahrerNeu.get(startgruppeSP3T.get(i)).getStrafe() - 1);
//                    System.out.println(strafe);
//                    System.out.println(insgesamt.get(startgruppe.get(i)).getStrafe());
                    if (strafe < insgesamtFahrerNeu.get(startgruppeSP3T.get(i)).getStrafe()) {
                        strafe = insgesamtFahrerNeu.get(startgruppeSP3T.get(i)).getStrafe();
                    }
//                    System.out.println("Strafe");
                    /**
                     * werden die Positionen getauscht
                     */
                    double v1 = insgesamtFahrerNeu.get(startgruppeSP3T.get(i)).getPosition();
                    try {
                        double v2 = insgesamtFahrerNeu.get(startgruppeSP3T.get(i + 1)).getPosition();
                        String temp = startgruppeSP3T.get(i);
                        startgruppeSP3T.set(i, startgruppeSP3T.get(i + 1));
                        startgruppeSP3T.set(i + 1, temp);
                    } catch (IndexOutOfBoundsException e) {
//                        System.out.println("letzter");
                    }
                }
            }
        } while (strafe > 0);
        txtLeaderGrid2.setText("4");

        System.out.println(startgruppeGT3 + "\n" +
                startgruppeSP3T);

        startgruppe24h = new ArrayList<String>();
        startgruppe24h.addAll(startgruppeGT3);
        startgruppe24h.addAll(startgruppeCUP2);
        startgruppe24h.addAll(startgruppeGT4);
        startgruppe24h.addAll(startgruppeSP3T);
        startgruppe24h.addAll(startgruppeCUP5);
        startgruppe24h.addAll(startgruppeH2);
        System.out.println(insgesamtFahrerNeu);

        writeGridINI24h(qualiXml);
    }


    private void writeGridINI24h(File qualiXml) {
        System.out.println("DataController.writeGridINI24h()");
        File file = new File(qualiXml.getParent() + "\\grid.ini");
//        File file = new File("G:\\SteamLibrary\\steamapps\\common\\rFactor 2\\UserData\\Log\\Results\\grid");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            int position = 1;
            for (int j = 0; j < startgruppe24h.size(); j++) {
                br.write(String.format("/editgrid %d %s",
                        position++,
                        insgesamtFahrerNeu.get(startgruppe24h.get(j)).getFahrer()));
                System.out.println(insgesamtFahrerNeu.get(startgruppe24h.get(j)).getNummer() + " " +
                        insgesamtFahrerNeu.get(startgruppe24h.get(j)).getFahrer() + " " +
                        insgesamtFahrerNeu.get(startgruppe24h.get(j)).getPosition());
                br.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeStrafenINI24h(File qualiXml, StringBuilder strafenIni) {
        System.out.println("DataController.writeStrafenINI24h()");
        File file = new File(qualiXml.getParent() + "\\strafen.ini");
//        File file = new File("G:\\SteamLibrary\\steamapps\\common\\rFactor 2\\UserData\\Log\\Results\\grid");
        System.out.println("strafenIni: " + strafenIni.toString());
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write(strafenIni.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void startgruppen24h() {
        System.out.println("DataController.startgruppen24h()");
        for (String f : fahrer) {
            String[] element = f.split("##");
            /**
             * element[1] = Fahrzeugnummer
             * element[2] = Fahrername
             * element[3] = Position
             */
            int nummer = Integer.parseInt(element[1]);
            String fahrer = element[2];
            int position = Integer.parseInt(element[3]);

            if (nummer >= 100 && nummer <= 199 ||
                    nummer >= 10 && nummer <= 18 ||
                    nummer >= 21 && nummer <= 23 || nummer == 1) {
                startgruppeGT3.add(String.valueOf(nummer));
            } else if (nummer >= 200 && nummer <= 299 || nummer == 20) {
//                startgruppeCUP2.add(String.valueOf(nummer));
                startgruppeGT3.add(String.valueOf(nummer));
            } else if (nummer >= 300 && nummer <= 399 || nummer >= 30 && nummer <= 39) {
                startgruppeSP3T.add(String.valueOf(nummer));
            } else if (nummer >= 400 && nummer <= 499 || nummer == 40) {
//                startgruppeH2.add(String.valueOf(nummer));
                startgruppeSP3T.add(String.valueOf(nummer));
            } else if (nummer >= 500 && nummer <= 599 || nummer >= 91 && nummer <= 95) {
//                startgruppeCUP5.add(String.valueOf(nummer));
                startgruppeSP3T.add(String.valueOf(nummer));
            } else if (nummer >= 600 && nummer <= 699 || nummer == 25) {
//                startgruppeGT4.add(String.valueOf(nummer));
                startgruppeSP3T.add(String.valueOf(nummer));
            }
        }
    }

    private void sort24h(ArrayList<String> liste) {
        System.out.println("DataController.sort24h()");
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

    private void runExecutionName(int startgruppen) {
        for (int i = 0; i < startgruppen; i++) {
            startgruppeName[i] = new StartgruppeName();
            startgruppeName[i].startgruppenErstellen(fahrer, String.format("%d", i + 1), insgesamtFahrer);
//            System.out.println(startgruppe.toString());
            startgruppeName[i].positionenPruefen(insgesamtFahrer, fahrer);
            startgruppeName[i].sortieren(insgesamtFahrer);
//            System.out.println("Startgruppe " + (i+1) + " sortiert!");
            startgruppeName[i].positionenReset(insgesamtFahrer);
//            System.out.println(startgruppe[i].toString());
//            System.out.println("Startgruppe " + (i+1) + " Positionen neu gesetzt!");
//            startgruppe[i].strafeEinleiten(insgesamt);
//            System.out.println("Startgruppe " + (i+1) + " Strafen verarbeitet!");
            System.out.println("Startgruppe " + (i + 1) + " fertig verarbeitet!");
            System.out.println(startgruppeName[i].toString());
//            System.out.println(fahrer.toString());
        }
    }

    private void loadQualiName() {
        insgesamtFahrer = daten.readGridININame();
        System.out.println(insgesamtFahrer.toString());
    }

    public void loadServer24h() {
        client.load();
        fahrer = client.getList();
        insgesamtFahrerNeu = new HashMap<>();

        for (String f : fahrer) {
            String[] element = f.split("#");
            int position = Integer.parseInt(element[3]) + 6000;
            int nummer = Integer.parseInt(element[1]);
            String name = element[2];

            if (insgesamtFahrer.containsKey(name)) {
                position = insgesamtFahrer.get(name).getPosition();
            }
            insgesamtFahrerNeu.put(name, new Fahrzeug(position, nummer, name));
        }
        System.out.println(insgesamtFahrerNeu);
    }

    private void loadServer24hWeb(Connection server) {
        System.out.println("DataController.loadServer24h()");
        WebUI web = new WebUI(server);
        fahrer = web.getFahrer();


        insgesamtFahrerNeu = new HashMap<>();

        for (String f : fahrer) {
            String[] element = f.split("##");
            int position = Integer.parseInt(element[3]) + 6000;
            int nummer = Integer.parseInt(element[1]);
            String name = element[2];
            String team = element[4];

            if (insgesamtFahrer.containsKey(String.valueOf(nummer))) {
                position = insgesamtFahrer.get(String.valueOf(nummer)).getPosition();
            }
            insgesamtFahrerNeu.put(String.valueOf(nummer), new Fahrzeug(position, nummer, name, team));
        }
        System.out.println(insgesamtFahrerNeu);
    }

    public void loadxml(Path path, JTextField txtLeaderGrid2) {
        System.out.println("DataController.loadXml()");
        insgesamtFahrer = new HashMap<>();
        txtLeaderGrid2.setText("22");
        ResultsFactory rf = new ResultsFactory();
        RFactorXML xml = rf.getResult(path);
        txtLeaderGrid2.setText("33");
        System.out.println("xml...size(): " + xml.getRaceResult().getQualify().getDriver().size());
        for (Driver d : xml.getRaceResult().getQualify().getDriver()) {
            insgesamtFahrer.put(String.valueOf(d.getCarNumber()), new Fahrzeug(d.getLapRankIncludingDiscos(), d.getCarNumber(), d.getName()));
            System.out.println(d.getPosition());
        }
        System.out.println("insgesamtFahrer.size(): " + insgesamtFahrer.size());
        System.out.println(insgesamtFahrer);
    }
}
