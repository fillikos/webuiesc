package de.fillikos.rf2.esctool.data.grid;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class GridINI {

    private HashMap<Integer, Fahrzeug> insgesamt;
    private HashMap<String, Fahrzeug> insgesamtFahrer;

    public GridINI() {
        super();
    }

    public void getGridINI(HashMap<Integer, Fahrzeug> insgesamt) {
        this.insgesamt = insgesamt;
        load();
    }

    private void load() {
        File file = new File("C:\\Users\\juerg\\OneDrive\\rF2LN\\Saison3\\8.WL\\BatchTemplateQ1.ini");

        gridLoadFile(file);

    }

    private void gridLoadFile(File file) {
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            String zeile;
            int position = 0;
            while ((zeile = in.readLine()) != null) {
                if (zeile.startsWith("//")) {

                } else if (zeile.startsWith("/")) {
//                    System.out.println(zeile);
//                    System.out.println(zeile.substring(10, zeile.indexOf(" ", 10)));
//                    System.out.println(zeile.substring(zeile.indexOf(" ", 10) + 1 ));
//                    System.out.println(zeile.substring(zeile.indexOf(" ", 10) + 1 ));
//                    System.out.println(zeile.substring(10, zeile.indexOf(" ", 10)));
                    insgesamt.get(Integer.parseInt(zeile.substring(zeile.indexOf(" ", 10) + 1))).setPosition(Integer.parseInt(zeile.substring(10, zeile.indexOf(" ", 10))) + 2000);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void gridLoadFileName(File file) {
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            String zeile;
            int position = 0;
            while ((zeile = in.readLine()) != null) {
                if (zeile.startsWith("//")) {

                } else if (zeile.startsWith("/")) {
                    System.out.println(zeile);
                    System.out.println(zeile.substring(10, zeile.indexOf(" ", 10)));
                    System.out.println(zeile.substring(zeile.indexOf(" ", 10) + 1));

                    insgesamtFahrer.put(zeile.substring(zeile.indexOf(" ", 10) + 1), new Fahrzeug(
                            Integer.parseInt(zeile.substring(10, zeile.indexOf(" ", 10))) + 2000,
                            zeile.substring(zeile.indexOf(" ", 10))));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap getGridININame() {
        this.insgesamtFahrer = new HashMap<>();
        loadName();
        return insgesamtFahrer;
    }

    private void loadName() {
        File file = new File("C:\\Users\\juerg\\OneDrive\\rF2LN\\24h\\BatchTemplateQ1.ini");

        gridLoadFileName(file);
    }
}
