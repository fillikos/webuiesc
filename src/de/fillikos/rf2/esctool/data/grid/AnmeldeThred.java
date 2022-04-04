package de.fillikos.rf2.esctool.data.grid;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Scanner;

public class AnmeldeThred {

    public AnmeldeThred() {
        super();
    }

    public void getAnmeldeThred(HashMap<Integer, Fahrzeug> insgesamt) {

        URL url = null;
        /**
         * Setzen der URL für den Anmeldethread
         */
        try {
            url = new URL("https://www.rf2ln.de/forum/viewtopic.php?f=8&t=155");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        /**
         * Laden der URL in einen String
         */
        try (InputStream is = url.openStream();
             Scanner scanner = new Scanner(is, StandardCharsets.UTF_8.name())) {
            /**
             * Der gesamt eingelesene Inhalt der Webseite in "webseite"
             */
//            Der Inhalt der Webseite wird aufgeteilt auf '<div' Sektionen
            String webseite = scanner.useDelimiter("\\Z").next();
            /**
             * Die Webseite wird auf die einzelnen DIV aufgeteilt
             */
            String[] posts = webseite.split("<div class=\"content\">");
            /**
             * Inhalt der gesamten Webseite (SourceCode) ausgeben
             */
//            int i = 0;
//            for(String s: posts) {
//                System.out.println("--------------------------------------------------------" + i++);
//                System.out.println(s);
//            }

            /**
             * Ausgabe des ersten ForenBeitrages
             */
            System.out.println(posts[1]);
//            System.out.println(posts[1].substring( posts[1].indexOf("Übersicht (Stand: ") + 18, posts[1].indexOf("Übersicht (Stand: ") + 35));
            String klasse = "";
            klasse = posts[1].substring(posts[1].indexOf("<strong class=\"text-strong\">Klasse SP9 GT3:</strong><br>"),
                    posts[1].indexOf("<strong class=\"text-strong\">Klasse Cup 2:</strong><br>"));
            auslesen(klasse, insgesamt);
            klasse = posts[1].substring(posts[1].indexOf("<strong class=\"text-strong\">Klasse Cup 2:</strong><br>"),
                    posts[1].indexOf("<strong class=\"text-strong\">Klasse SP3T:</strong><br>"));
            auslesen(klasse, insgesamt);
            klasse = posts[1].substring(posts[1].indexOf("<strong class=\"text-strong\">Klasse SP3T:</strong><br>"),
                    posts[1].indexOf("</div>", posts[1].indexOf("<strong class=\"text-strong\">Klasse SP3T:</strong><br>")));
            auslesen(klasse, insgesamt);

        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         *
         */
    }

    public void getAnmeldeThred(HashMap<Integer, Fahrzeug> insgesamt, String anmeldeThread) {

        URL url = null;
        /**
         * Setzen der URL für den Anmeldethread
         */
        try {
            url = new URL(anmeldeThread);
            /**
             * Laden der URL in einen String
             */
            try (InputStream is = url.openStream();
                 Scanner scanner = new Scanner(is, StandardCharsets.UTF_8.name())) {
                /**
                 * Der gesamt eingelesene Inhalt der Webseite in "webseite"
                 */
                //            Der Inhalt der Webseite wird aufgeteilt auf '<div' Sektionen
                String webseite = scanner.useDelimiter("\\Z").next();
                /**
                 * Die Webseite wird auf die einzelnen DIV aufgeteilt
                 */
                String[] posts = webseite.split("<div class=\"content\">");
                /**
                 * Inhalt der gesamten Webseite (SourceCode) ausgeben
                 */
                //            int i = 0;
                //            for(String s: posts) {
                //                System.out.println("--------------------------------------------------------" + i++);
                //                System.out.println(s);
                //            }

                /**
                 * Ausgabe des ersten ForenBeitrages
                 */
                System.out.println(posts[1]);
                //            System.out.println(posts[1].substring( posts[1].indexOf("Übersicht (Stand: ") + 18, posts[1].indexOf("Übersicht (Stand: ") + 35));
                String klasse = "";
                klasse = posts[1].substring(posts[1].indexOf("<strong class=\"text-strong\">Klasse SP9 GT3:</strong><br>"),
                        posts[1].indexOf("<strong class=\"text-strong\">Klasse Cup 2:</strong><br>"));
                auslesen(klasse, insgesamt);
                klasse = posts[1].substring(posts[1].indexOf("<strong class=\"text-strong\">Klasse Cup 2:</strong><br>"),
                        posts[1].indexOf("<strong class=\"text-strong\">Klasse SP3T:</strong><br>"));
                auslesen(klasse, insgesamt);
                klasse = posts[1].substring(posts[1].indexOf("<strong class=\"text-strong\">Klasse SP3T:</strong><br>"),
                        posts[1].indexOf("</div>", posts[1].indexOf("<strong class=\"text-strong\">Klasse SP3T:</strong><br>")));
                auslesen(klasse, insgesamt);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            getAnmeldeThred(insgesamt);
        }


        /**
         *
         */
    }

    private void auslesen(String klasse, HashMap<Integer, Fahrzeug> insgesamt) {
        String[] teams = klasse.split("<br>");
        int i = 0;
        for (String s : teams) {
//                System.out.println(i++ + s);
            if (s.startsWith("\n#")) {
//                    System.out.println("ohne Meldung");
//                    System.out.println("Fahrzeug Nummer: " + s.substring(2,5));
//                    System.out.println("Team Name: " + s.substring(7,s.indexOf(", ", 7)));
                insgesamt.put(Integer.parseInt(s.substring(2, 5)), new Fahrzeug(Integer.parseInt(s.substring(2, 5)), 0, s.substring(7, s.indexOf(", ", 7)), false));
//                    System.out.println(insgesamt.get(Integer.parseInt(s.substring(2,5))).getPosition());

            } else if (s.startsWith("\n<span style=\"color:#008000\">")) {
//                    System.out.println("angemeldet");
//                    System.out.println("Fahrzeug Nummer: " + s.substring(30,33));
//                    System.out.println("Team Name: " + s.substring(35,s.indexOf(", ", 36)));
//                    System.out.println("Anmeldezeitpunkt: " + s.substring(s.indexOf(" - ") + 3));
                insgesamt.put(Integer.parseInt(s.substring(30, 33)), new Fahrzeug(Integer.parseInt(s.substring(30, 33)), Integer.parseInt(s.substring(s.indexOf(" - ") + 3)), s.substring(35, s.indexOf(", ", 36)), true));
//                    System.out.println(insgesamt.get(Integer.parseInt(s.substring(30,33))).getPosition());

            } else if (s.startsWith("\n<span style=\"color:#FF0000\">")) {
//                    System.out.println("abgemeldet");
//                    System.out.println("Fahrzeug Nummer: " + s.substring(30,33));
//                    System.out.println("Team Name: " + s.substring(35,s.indexOf(", ", 36)));
//                    System.out.println("Anmeldezeitpunkt: " + s.substring(s.indexOf(" - ") + 3));
                insgesamt.put(Integer.parseInt(s.substring(30, 33)), new Fahrzeug(Integer.parseInt(s.substring(30, 33)), Integer.parseInt(s.substring(s.indexOf(" - ") + 3)), s.substring(35, s.indexOf(", ", 36)), false));
//                    System.out.println(insgesamt.get(Integer.parseInt(s.substring(30,33))).getPosition());

            }
        }
    }
}
