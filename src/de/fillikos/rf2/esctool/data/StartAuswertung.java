package de.fillikos.rf2.esctool.data;

import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import java.util.ArrayList;
import java.util.List;

public class StartAuswertung {

    private final User[] users;
    private final List<String> ergebnis = new ArrayList<>();

    public StartAuswertung(User[] users) {
        this.users = users;
    }

    public void getGaps() {
        // Die letzten beiden müssen nicht überprüft werden Todo
        for (int i = 0; i < users.length; i++) {
            if ( (i+2) >= users.length ) {
                break;
            }
            User user = getUserFromPosition( i + 1 );
            assert user != null;
            User userBehind = getUserBehindPosition( user );

            if ( userBehind != null ) {
                ergebnis.add(user.getPosition() + ". " + user.getVehicleName() +
                        " Abstand zu " + userBehind.getPosition() + ". " + userBehind.getVehicleName() +
                        " beträgt: " + (Float.parseFloat(user.getLapDistance()) - Float.parseFloat(userBehind.getLapDistance())) + " Meter (" +
                        user.getLapDistance() + "-" + userBehind.getLapDistance() + ") " +
                        user.getPathLateral() + " " + userBehind.getPathLateral());
            }
        }
    }

    private User getUserBehindPosition(User user) {
        int positionInFront = Integer.parseInt(user.getPosition());
        int positionBehind = 9999;
        int position;

        for (User u: users) {
            position = Integer.parseInt(u.getPosition());
            if ( position > positionInFront &&
                    position < positionBehind &&
                            u.getPathLateral().contains("-") == user.getPathLateral().contains("-")) {
                positionBehind = position;
            }
        }
        System.out.println(positionBehind);
        return getUserFromPosition(positionBehind);
    }

    private User getUserFromPosition(int position) {
        for (User u: users) {
            if ( u.getPosition().equals(String.valueOf(position))) {
                return u;
            }
        }
        return null;
    }

    public List<String> getErgebnis() {
        return ergebnis;
    }
}
