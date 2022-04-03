package de.fillikos.rf2.esctool.grid;

import java.util.ArrayList;
import java.util.HashMap;

public class StartgruppeName {


    private ArrayList<String> startgruppe;

    public StartgruppeName() {
        startgruppe = new ArrayList<String>();
    }

    public ArrayList<String> getStartgruppe() {
        return this.startgruppe;
    }

    public void sortieren(HashMap<String, Fahrzeug> insgesamt) {
        for (int i = 0; i < startgruppe.size(); i++) {
            for (int j = 0; j < startgruppe.size() - 1; j++) {
                double v1 = insgesamt.get(startgruppe.get(j)).getPosition();
                try {
                    double v2 = insgesamt.get(startgruppe.get(j + 1)).getPosition();
                    if (v1 > v2) {
                        String temp = startgruppe.get(j);
                        startgruppe.set(j, startgruppe.get(j + 1));
                        startgruppe.set(j + 1, temp);
                    }
                } catch (NullPointerException e) {
//                    System.out.println("letzter");
                }
            }
        }

//        for(int i = 0; i<startgruppe.size(); i++) {
//            System.out.println(insgesamt.get(startgruppe.get(i)).getPosition());
//        }
    }

    public void positionenPruefen(HashMap<String, Fahrzeug> insgesamt, ArrayList<String> fahrer) {
        for (int i = 0; i < startgruppe.size(); i++) {
            if (insgesamt.get(startgruppe.get(i)).getPosition() == 5000) {
                for (String s : fahrer) {
                    String[] element = s.split("#");
                    if (element[1].equals(startgruppe.get(i).toString())) {
                        insgesamt.get(startgruppe.get(i)).setPosition(5000 + Integer.parseInt(element[3]));
                        break;
                    }
                }
            }
        }
    }


    public void startgruppenErstellen(ArrayList<String> fahrer, String s, HashMap<String, Fahrzeug> insgesamt) {
//        SP9 GT3       100-199     10-19   21-23
//        CUP 2         200-299     20
//        SP3T          300-399     30-35
//        H2            400-499     40
//        CUP 5         500-599     24
//        SP10 GT4      600-699     25

        for (String f : fahrer) {
            if (f.substring(1, 4).startsWith(s)) {
                String[] element = f.split("#");
//                System.out.println(element[1]);
//                System.out.println(element[2]);
//                System.out.println(element[3]);
                startgruppe.add(element[2]);
                try {
                    insgesamt.get(Integer.parseInt(f.substring(1, 4))).setFahrer(element[2]);
                } catch (NullPointerException e) {
                    insgesamt.put(element[2], new Fahrzeug(Integer.parseInt(element[1]), 0, "Team Neu", false));
                    insgesamt.get(Integer.parseInt(element[1])).setFahrer(element[2] + "---");
                    insgesamt.get(Integer.parseInt(element[1])).setPosition(7000 + Integer.parseInt(element[3]));
                }
            }
        }
    }

    public String toString() {
        return startgruppe.toString();
    }

    public void strafeEinleiten(HashMap<String, Fahrzeug> insgesamt) {
        /**
         * Für jeden Fahrer wird die Strafe ausgelesen
         */
        int strafe = 0;
        do {
            strafe = 0;
            for (int i = (startgruppe.size() - 1); i >= 0; i--) {
//                System.out.println(insgesamt.get(startgruppe.get(i)).getStrafe());
                /**
                 * Wenn eine Strafe vorliegt
                 */
                if (insgesamt.get(startgruppe.get(i)).besitztStrafe()) {
//                    System.out.println(startgruppe.get(i));
                    insgesamt.get(startgruppe.get(i)).setStrafe(insgesamt.get(startgruppe.get(i)).getStrafe() - 1);
//                    System.out.println(strafe);
//                    System.out.println(insgesamt.get(startgruppe.get(i)).getStrafe());
                    if (strafe < insgesamt.get(startgruppe.get(i)).getStrafe()) {
                        strafe = insgesamt.get(startgruppe.get(i)).getStrafe();
                    }
//                    System.out.println("Strafe");
                    /**
                     * werden die Positionen getauscht
                     */
                    double v1 = insgesamt.get(startgruppe.get(i)).getPosition();
                    try {
                        double v2 = insgesamt.get(startgruppe.get(i + 1)).getPosition();
                        String temp = startgruppe.get(i);
                        startgruppe.set(i, startgruppe.get(i + 1));
                        startgruppe.set(i + 1, temp);
                    } catch (IndexOutOfBoundsException e) {
//                        System.out.println("letzter");
                    }
                }
            }
        } while (strafe > 0);

    }

    public void positionenReset(HashMap<String, Fahrzeug> insgesamt) {
        int position = 1;
        for (int i = 0; i < startgruppe.size(); i++) {
            insgesamt.get(startgruppe.get(i)).setPosition(position++);
        }

//        for(int i = 0; i<startgruppe.size(); i++) {
//            System.out.println(insgesamt.get(startgruppe.get(i)).getPosition());
//        }
    }

}
