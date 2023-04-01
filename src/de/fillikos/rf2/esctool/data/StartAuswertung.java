package de.fillikos.rf2.esctool.data;

import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class StartAuswertung {

    public StartAuswertung() {

    }

    public static void createStartauswertung(User[] users, File rfDir, int startgruppe) {
        HashMap<Integer, Vehicle> vehicles = new HashMap<>();
        convertUsers2Vehicles(users, vehicles);

        List<Integer> sortedLeftSide = new ArrayList<>();
        List<Integer> sortedRightSide = new ArrayList<>();
        for (Vehicle vehicle: vehicles.values()) {
            if (vehicle.isLeftSide()) {
                sortedLeftSide.add(vehicle.getPosition());
            } else {
                sortedRightSide.add(vehicle.getPosition());
            }
        }
        Collections.sort(sortedLeftSide);
        Collections.sort(sortedRightSide);

        List<String> ergebnis = new ArrayList<>();
        ergebnis.add("Abstände der linken Seite");
        for (int i = 0; i < (sortedLeftSide.size() - 1); i++) {
            Vehicle vehicleFront = vehicles.get(sortedLeftSide.get(i));
            Vehicle vehicleBehind = vehicles.get(sortedLeftSide.get(i + 1));
            ergebnis.add(getString(vehicleFront, vehicleBehind));
        }
        ergebnis.add("Abstände der rechten Seite");
        for (int i = 0; i < (sortedRightSide.size() - 1); i++) {
            Vehicle vehicleFront = vehicles.get(sortedRightSide.get(i));
            Vehicle vehicleBehind = vehicles.get(sortedRightSide.get(i + 1));
            ergebnis.add(getString(vehicleFront, vehicleBehind));
        }

        writeFile(ergebnis, rfDir, startgruppe);
    }

    private static void convertUsers2Vehicles(User[] users, HashMap<Integer, Vehicle> vehicles) {
        for (User user: users) {
            Vehicle vehicle = new Vehicle(user);
            vehicles.put(Integer.valueOf(user.getPosition()), vehicle);
        }
    }

    private static String getString(Vehicle vehicleFront, Vehicle vehicleBehind) {
        return vehicleFront.getTeamName() +
                " (" +
                vehicleFront.getPosition() +
                ") " +
                "ist vor " +
                vehicleBehind.getTeamName() +
                " (" +
                vehicleBehind.getPosition() +
                ") " +
                "mit einem Abstand von " +
                (Float.parseFloat(vehicleFront.getLapDistance()) - Float.parseFloat(vehicleBehind.getLapDistance()));
    }

    private static void writeFile(List<String> ergebnis, File rfDir, int startgruppe) {
        File file = new File(rfDir + "\\UserData\\Log\\Results\\Users_Startfreigabe_" + startgruppe + "_Startgruppe.txt");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write(ergebnis.toString());
        } catch (IOException ignored) {

        }
    }
}
