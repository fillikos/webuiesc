package de.fillikos.rf2.esctool.data.grid;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Strafen {

    private HashMap<String, Fahrzeug> insgesamt;
    private ArrayList<String> bestrafte;

    public Strafen() {
        super();
    }

    public void getStrafen(HashMap<String, Fahrzeug> insgesamt) {
        this.insgesamt = insgesamt;
        this.bestrafte = new ArrayList<>();

        load();
    }

    private void load() {
        File file = new File("D:\\VRrF2LN\\Server\\Train\\UserData\\Log\\Results\\strafen");

        strafenLoadFile(file);
    }

    private void strafenLoadFile(File file) {
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            String zeile;
            while ((zeile = in.readLine()) != null) {
//                    System.out.println(zeile);
//                    System.out.println(zeile.substring(1, 4));
//                    System.out.println(zeile.substring(zeile.indexOf(" +") + 2 , zeile.indexOf(" St")));
                if (insgesamt.containsKey(Integer.parseInt(zeile.substring(1, 4)))) {
                    if (zeile.contains("==> +")) {
                        insgesamt.get(Integer.parseInt(zeile.substring(1, 4))).setStrafe(Integer.parseInt(zeile.substring(zeile.indexOf(" +") + 2, zeile.indexOf(" St"))));
                    } else {
                        bestrafte.add(zeile);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeStrafenINI(ArrayList<String> fahrer) {
        File file = new File("G:\\SteamLibrary\\steamapps\\common\\rFactor 2\\UserData\\Log\\Results\\strafen");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < bestrafte.size(); i++) {
                String strafe = "";
                String fahrerName = "";
                strafe = bestrafte.get(i).substring(bestrafte.get(i).indexOf(" ==> ") + 5);
                for (String s : fahrer) {
                    if (s.substring(1, 4).equals(bestrafte.get(i).substring(1, 4))) {
                        fahrerName = s.substring(5, s.lastIndexOf("#"));
                    }
                }
                if (strafe.contains("Drive Through")) {
                    strafe = "-1";
                } else {
                    strafe = strafe.substring(0, strafe.indexOf(" Sekunden"));
                }

                if (fahrerName != "") {
                    br.write(String.format("/addpenalty %s %s",
                            strafe,
                            fahrerName));
                    System.out.println("Strafe für " + fahrerName + " " + strafe);
                    br.newLine();
                } else {
                    System.out.println("Strafe für Fahrer der nicht auf dem Server ist." + strafe);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
