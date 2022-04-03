package de.fillikos.rf2.esctool.esctool;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.fillikos.rf2.service.webui.httpss.model.PitState;
import de.fillikos.rf2.service.webui.httpss.model.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.User;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ESCTool {

    private ArrayList<String> fahrer;
    private ArrayList<StrafenLog> strafen;
    private SessionInfo sessionInfo;
    private User[] usersOld;
    private boolean start = false;
    private File qualixml = new File("D:\\VRrF2LN\\Server\\Train\\UserData\\Log\\Results");


    public ESCTool() {
        strafen = new ArrayList<StrafenLog>();
        fahrer = new ArrayList<>();
    }

    private void handleESCRule(User[] users, SessionInfo sessionInfo, String timeCode) {
        this.sessionInfo = sessionInfo;
        for (User u : users) {
            for (User uo : usersOld) {
                if (uo.getDriverName().equals(u.getDriverName())) {
                    pitRule(u, uo);
                    break;
                }
            }
        }
    }

    private void pitRule(User user, User userOld) {
        PitState pitNew, pitOld;
        pitNew = user.getPitStateEnum();
        pitOld = userOld.getPitStateEnum();

        if (pitOld != pitNew) {
            boolean write = false;
            String klartext = "";
            /*
             * 0 == NONE = OnTrack
             * 1 == REQUEST = OnTrack PitStop Requested
             * 2 = InPitLane
             * 3 = Pitting
             * 4 == EXITING = ExitingPitLane == Vehicle in Garage
             * ENTERING
             * STOPPED
             */
            switch (pitNew) {
                case NONE:
                    switch (pitOld) {
                        case INPITLANE:
                        case PITTING:
                        case ENTERING:
                        case STOPPED:
                            break;
                        case EXITING:
                            if (fahrer.contains(user.getDriverName())) {
//                                klartext = user.getDriverName() + " ist aus der Box gefahren.";
//                                strafen.add();
                                write(new StrafenLog(sessionInfo, user, PitVorgang.AUS_BOX_GEFAHREN));
                                break;
                            }
                            //                            System.out.println(u.getDriverName() + " ist aus der Box gefahren.");
                            break;
                        case REQUEST:
                            //                            System.out.println(u.getDriverName() + " hat Boxenstoppanforderung abgebrochen.");
                            break;
                    }
                    break;
                case REQUEST:
                    switch (pitOld) {
                        case NONE:
                            //                            System.out.println(u.getDriverName() + " hat Boxenstopp angefordert.");
                            break;
                        case INPITLANE:
                        case PITTING:
                        case STOPPED:
                        case ENTERING:
                            break;
                        case EXITING:
                            //Muss händisch geprüft werden, in der Box ein Abbruch führt zu einem pitState'NONE'
                            //somit ein ESC auch innerhalb der Box (Boxenausfahrt) nicht zu erkennen
                            //                            System.out.println(u.getDriverName() + " hat in der Box einen Boxenstopp angefordert.");
                            break;
                    }
                    break;
                case INPITLANE:
                    switch (pitOld) {
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
                    switch (pitOld) {
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
                    switch (pitOld) {
                        case NONE:
                        case REQUEST:
                            //System.out.println(u.getDriverName() + " hat auf der Strecke ESC gedrückt.");
                            //Wichtig auch für die Auswertung nach dem Rennen
                            //klartext = user.getDriverName() + " hat ESC gedrückt.";
                            strafen.add(new StrafenLog(sessionInfo, user, PitVorgang.ESC_AUF_STRECKE));
                            write(new StrafenLog(sessionInfo, user, PitVorgang.AUS_BOX_GEFAHREN));
                            break;
                        case INPITLANE:
                        case PITTING:
                            break;
                        case ENTERING:
                            //                            System.out.println(u.getDriverName() + " hat in der Box ESC gedrückt.");
                            break;
                        case STOPPED:
                            //                            System.out.println(u.getDriverName() + " Boxenstop beendet.");
                            break;
                    }
                case ENTERING:
                    switch (pitOld) {
                        case NONE:
                            //                            System.out.println(u.getDriverName() + " ist in die Box gefahren.");
                            break;
                        case REQUEST:
                            //                            System.out.println(u.getDriverName() + " ist in die Box gefahren.");
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
                    switch (pitOld) {
                        case NONE:
                        case EXITING:
                        case PITTING:
                        case INPITLANE:
                        case REQUEST:
                            break;
                        case ENTERING:
                            //                            System.out.println(u.getDriverName() + " Boxenstop beginnt.");
                            break;
                    }
                    break;
            }
            //            System.out.println("Änderung im pitState bei: " + u.getDriverName() + " pitStateOld: " + pitOld + " zu pitState: " + pitNew);
        }
    }

    private void write(StrafenLog strafenLog) {
        if (strafenLog.getVorgang().isSave()) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String timeString = df.format(new Date());
            ObjectMapper om = new ObjectMapper();
            try {
                om.writeValue(Paths.get(qualixml + "\\" + timeString + "_" + sessionInfo.getServerName() + "_" + sessionInfo.getSessionEnum().toString() + ".te").toFile(),
                        strafen);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public boolean isStart() {
        return start;
    }
}
