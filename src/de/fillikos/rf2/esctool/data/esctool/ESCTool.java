package de.fillikos.rf2.esctool.data.esctool;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.esctool.view.config.ModConfig;
import de.fillikos.rf2.service.webui.httpss.model.sessioninfo.Session;
import de.fillikos.rf2.service.webui.httpss.model.sessioninfo.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.standings.PitState;
import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ESCTool {

    private final ArrayList<String> strafen;
    private final ArrayList<String> escOnTrack = new ArrayList<>();
    private final ArrayList<String> backOnTrack = new ArrayList<>();
    private final ArrayList<String> endedInBox = new ArrayList<>();
    private SessionInfo sessionInfo = new SessionInfo();
    private User[] usersOld = new User[0];
    private File rfDir = new File("D:\\VRrF2LN\\Server\\Train\\UserData\\Log\\Results");
    private final List<String> endedInBoxList = new ArrayList<>();


    public ESCTool() {
        strafen = new ArrayList<>();
    }

    public void handleESCRule(User[] users, SessionInfo sessionInfo, ModConfig modConfig) {
        this.sessionInfo = sessionInfo;
        for (User user : users) {
            for (User userOld : usersOld) {
                if (userOld.getDriverName().equals(user.getDriverName())) {
                    pitRule(user, userOld, modConfig);
                    break;
                }
            }
        }
        usersOld = users;
    }

    private void pitRule(User user, User userOld, ModConfig modConfig) {
        boolean shouldWrite = false;

        if ( sessionInfo.getGamePhase().equals("8") && user.getInGarageStall().equals("false")) {
            if (userOld.getPitting().equals("false") &&
                user.getPitting().equals("true") &&
                user.getPitStateEnum() != PitState.EXITING) {
                endedInBox.add(user.getDriverName());
                endedInBoxList.add(user.getFullTeamName() + " ist am Rennende in die Box gefahren TC: " + sessionInfo.getCurrentEventTime());
                writeEndedInBox();
            }
            if (userOld.getPitStateEnum() != PitState.EXITING &&
                    user.getPitStateEnum() == PitState.EXITING &&
                    endedInBox.contains(user.getDriverName())) {
                endedInBoxList.add(user.getFullTeamName() + " hat nach Rennende ESC in der Box gedrückt TC: " + sessionInfo.getCurrentEventTime());
                writeEndedInBox();
            }
        }

        if (userOld.getPitStateEnum() != user.getPitStateEnum()) {
            /*
             * 0 == NONE = OnTrack
             * 1 == REQUEST = OnTrack PitStop Requested
             * 2 == InPitLane
             * 3 == Pitting
             * 4 == EXITING = ExitingPitLane == Vehicle in Garage
             * ? == ENTERING
             * ? == STOPPED
             */
            switch (user.getPitStateEnum()) {
                case NONE:
                    switch (userOld.getPitStateEnum()) {
                        case INPITLANE:
                        case PITTING:
                        case ENTERING:
                        case STOPPED:
                            break;
                        case EXITING:
                            if (modConfig.getPitVorgang().isAus_der_box_gefahren()) {
                                strafen.add(new StrafenLog(sessionInfo, user, "Aus der box gefahren").toLog());
                                shouldWrite = true;
                            }
                            break;
                        case REQUEST:
                            if (modConfig.getPitVorgang().isBoxenstop_anforderung_abgebrochen()) {
                                strafen.add(new StrafenLog(sessionInfo, user, "Boxenstopanforderung abgebrochen").toLog());
                                shouldWrite = true;
                            }
                            break;
                    }
                    break;
                case REQUEST:
                    switch (userOld.getPitStateEnum()) {
                        case NONE:
                            if (modConfig.getPitVorgang().isBoxenstop_angefordert()) {
                                strafen.add(new StrafenLog(sessionInfo, user, "Boxenstop angefordert").toLog());
                                shouldWrite = true;
                            }
                            break;
                        case INPITLANE:
                        case PITTING:
                        case STOPPED:
                        case ENTERING:
                            break;
                        case EXITING:
                            //Muss händisch geprüft werden, in der Box ein Abbruch führt zu einem pitState'NONE'
                            //somit ein ESC auch innerhalb der Box (Boxenausfahrt) nicht zu erkennen
                            //System.out.println(u.getDriverName() + " hat in der Box einen Boxenstopp angefordert.");
                            break;
                    }
                    break;
                case INPITLANE:
                    switch (userOld.getPitStateEnum()) {
                        case NONE:
                        case STOPPED:
                        case ENTERING:
                        case EXITING:
                        case PITTING:
                        case REQUEST:
                            break;
                    }
                    break;
                case PITTING:
                    switch (userOld.getPitStateEnum()) {
                        case NONE:
                        case STOPPED:
                        case ENTERING:
                        case EXITING:
                        case INPITLANE:
                        case REQUEST:
                            break;
                    }
                    break;
                case EXITING:
                    String text = "";
                    switch (userOld.getPitStateEnum()) {
                        case NONE:
                        case REQUEST:
                            //Wichtig auch für die Auswertung nach dem Rennen
                            if (modConfig.getPitVorgang().isEsc_auf_strecke()) {
                                strafen.add(new StrafenLog(sessionInfo, user, "ESC auf der strecke").toLog());
                                shouldWrite = true;
                            }
                            text = "ESC auf der Strecke";
                            break;
                        case INPITLANE:
                        case PITTING:
                            text = "ESC in der Box";
                            break;
                        case ENTERING:
                            if (modConfig.getPitVorgang().isEsc_in_der_box()) {
                                strafen.add(new StrafenLog(sessionInfo, user, "ESC in der box").toLog());
                                shouldWrite = true;
                            }
                            text = "ESC in der Box";
                            break;
                        case STOPPED:
                            if (modConfig.getPitVorgang().isBoxenstop_ende()) {
                                strafen.add(new StrafenLog(sessionInfo, user, "boxenstop ende").toLog());
                                shouldWrite = true;
                            }
                            text = "ESC nach dem Boxenstop???";
                            break;
                    }
//                    if (sessionInfo.getGamePhase().equals("8") && !endedInBox.contains(user.getDriverName())) {
//                        endedInBox.add(user.getDriverName());
//                        endedInBoxList.add(user.getDriverName() + " " + text + " TC: " + sessionInfo.getCurrentEventTime());
//                        writeEndedInBox();
//                    }
                case ENTERING:
                    switch (userOld.getPitStateEnum()) {
                        case NONE:
                        case REQUEST:
                            if (modConfig.getPitVorgang().isIn_die_box()) {
                                strafen.add(new StrafenLog(sessionInfo, user, "in die Box").toLog());
                                shouldWrite = true;
                            }
                            break;
                        case INPITLANE:
                        case STOPPED:
                        case ENTERING:
                        case EXITING:
                        case PITTING:
                            break;
                    }
                    break;
                case STOPPED:
                    switch (userOld.getPitStateEnum()) {
                        case NONE:
                        case EXITING:
                        case PITTING:
                        case INPITLANE:
                        case REQUEST:
                            break;
                        case ENTERING:
                            if (modConfig.getPitVorgang().isBoxenstop_beginn()) {
                                strafen.add(new StrafenLog(sessionInfo, user, "Boxenstop beginn").toLog());
                                shouldWrite = true;
                            }
                            break;
                    }
                    break;
            }
        }
        if (shouldWrite) {
            write();
        }
    }

    private void writeEndedInBox() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String timeString = df.format(new Date());
        ObjectMapper om = new ObjectMapper();
        try {
            om.writeValue(Paths.get(rfDir + "\\UserData\\Log\\Results\\" +
                    timeString +
                    "_ESCinBox.txt").toFile(), endedInBoxList);
        } catch (IOException e) {
            Controller.addError(Arrays.toString(e.getStackTrace()));
        }
    }

    private void writeBackOnTrack() {
        if (sessionInfo.getSessionEnum() == Session.QUALIFY) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String timeString = df.format(new Date());
            ObjectMapper om = new ObjectMapper();
            try {
                om.writeValue(Paths.get(rfDir + "\\UserData\\Log\\Results\\" +
                        timeString +
                        "_strafen.txt").toFile(), backOnTrack);
            } catch (IOException e) {
                Controller.addError(Arrays.toString(e.getStackTrace()));
                e.printStackTrace();
            }
        }
    }

    private void write() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String timeString = df.format(new Date());
        ObjectMapper om = new ObjectMapper();
        try {
            om.writeValue(Paths.get(rfDir + "\\UserData\\Log\\Results\\" +
                    timeString +
                    "_" +
                    sessionInfo.getServerName() +
                    "_" +
                    sessionInfo.getSession().charAt(0) +
                    sessionInfo.getSession().charAt(sessionInfo.getSession().length() - 1) +
                    ".log").toFile(), strafen);
        } catch (IOException e) {
            Controller.addError(Arrays.toString(e.getStackTrace()));
            e.printStackTrace();
        }
    }

    public void setRfDir(File rfDir) {
        this.rfDir = rfDir;
    }

    @Override
    public String toString() {
        return "ESCTool{" +
                "strafen=" + strafen +
                ", sessionInfo=" + sessionInfo +
                ", usersOld=" + Arrays.toString(usersOld) +
                ", rfDir=" + rfDir +
                ", escOnTrack=" + escOnTrack +
                ", backOnTrack=" + backOnTrack +
                '}';
    }

    public void cleanData() {
        strafen.clear();
        endedInBox.clear();
        endedInBoxList.clear();
        escOnTrack.clear();
        backOnTrack.clear();
        usersOld = new User[0];
    }
}
