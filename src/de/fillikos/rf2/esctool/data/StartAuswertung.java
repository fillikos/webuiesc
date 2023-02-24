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

        for (int i = 0; i< users.length; i++) {
            if (users[i].getPathLateral().contains("-")) {
                leftSide.put(i, users[i]);
            } else {
                rightSide.put(i, users[i]);
            }
        }

        List<Integer> sortedLeftSide = new ArrayList<>(leftSide.keySet());
        List<Integer> sortedRightSide = new ArrayList<>(rightSide.keySet());
        Collections.sort(sortedLeftSide);
        Collections.sort(sortedRightSide);

        for (int i = 0; i<sortedLeftSide.size(); i++) {
            ergebnis.add(getString(sortedLeftSide, i));
        }

        for (int i = 0; i<sortedRightSide.size(); i++) {
            ergebnis.add(getString(sortedRightSide, i));
        }
    }

    private String getString(List<Integer> sortedList, int i) {
        User vehicleFront = users[sortedList.get(i)];
        if ((i + 1) >= sortedList.size()) {
            return "";
        }
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
