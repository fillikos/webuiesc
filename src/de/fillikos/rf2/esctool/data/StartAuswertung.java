package de.fillikos.rf2.esctool.data;

import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import java.util.*;

public class StartAuswertung {

    private final User[] users;
    private final List<String> ergebnis = new ArrayList<>();

    public StartAuswertung(User[] users) {
        this.users = users;
    }

    public void getGaps() {
        HashMap<Integer, User> leftSide = new HashMap<>();
        HashMap<Integer, User> rightSide = new HashMap<>();

        for (User u: users) {
            if (u.getPathLateral().contains("-")) {
                leftSide.put(Integer.parseInt(u.getPosition()), u);
            } else {
                rightSide.put(Integer.parseInt(u.getPosition()), u);
            }
        }

        List<Integer> sortedLeftSide = new ArrayList<>(leftSide.keySet());
        List<Integer> sortedRightSide = new ArrayList<>(rightSide.keySet());

        for (int i = 0; i<sortedLeftSide.size() -1; i++) {
            ergebnis.add(getString(sortedLeftSide, i));
        }

        for (int i = 0; i<sortedRightSide.size() -1; i++) {
            ergebnis.add(getString(sortedRightSide, i));
        }
    }

    private String getString(List<Integer> sortedList, int i) {
        User vehicleFront = users[sortedList.get(i)];
        User vehicleBehind = users[sortedList.get(i+1)];

        return vehicleFront.getDriverName() +
                " (" +
                vehicleFront.getPosition() +
                ")" +
                " ist vor " +
                vehicleBehind.getDriverName() +
                " (" +
                vehicleBehind.getPosition() +
                ")" +
                " mit einem Abstand von " +
                (Float.parseFloat(vehicleFront.getLapDistance()) - Float.parseFloat(vehicleBehind.getLapDistance()));
    }

    public List<String> getErgebnis() {
        return ergebnis;
    }
}
