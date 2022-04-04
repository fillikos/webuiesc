package de.fillikos.rf2.esctool.data.grid;

import java.util.ArrayList;
import java.util.HashMap;

public class Read extends AnmeldeThred {

    public Read() {

    }

    public HashMap readAnmeldug(HashMap<Integer, Fahrzeug> insgesamt) {
        /**
         * Entscheidung, ob Daten aus einer *.txt *.csv *.xml oder dem Forum ausgelesen werden soll
         */
        getAnmeldeThred(insgesamt);
        return insgesamt;
    }

    public HashMap readGridINI(HashMap<Integer, Fahrzeug> insgesamt) {
        new GridINI().getGridINI(insgesamt);
        return insgesamt;
    }

    public HashMap readGridININame() {
        return new GridINI().getGridININame();
    }

    public HashMap readStrafen(HashMap<String, Fahrzeug> insgesamt, ArrayList<String> fahrer) {
        Strafen strafen = new Strafen();
        strafen.getStrafen(insgesamt);
        strafen.writeStrafenINI(fahrer);
        return insgesamt;
    }

    public HashMap readAnmeldugThread(HashMap<Integer, Fahrzeug> insgesamt, String anmeldeThread) {
        getAnmeldeThred(insgesamt, anmeldeThread);
        return insgesamt;
    }
}
