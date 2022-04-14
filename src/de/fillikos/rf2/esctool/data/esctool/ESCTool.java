package de.fillikos.rf2.esctool.data.esctool;

import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.util.Objects;

public class ESCTool {

    private ArrayList<StrafenLog> strafen;
    private SessionInfo sessionInfo = new SessionInfo();
    private User[] usersOld = new User[0];
    private File rfDir = new File("D:\\VRrF2LN\\Server\\Train\\UserData\\Log\\Results");
    private ArrayList<String> escOnTrack = new ArrayList<>();
    private ArrayList<String> backOnTrack = new ArrayList<>();


    public ESCTool() {
        strafen = new ArrayList<StrafenLog>();
    }

    public void handleESCRule(User[] users, SessionInfo sessionInfo, PitVorgang pitVorgang) {
        this.sessionInfo = sessionInfo;
        for (User user : users) {
            for (User userOld : usersOld) {
                if (userOld.getDriverName().equals(user.getDriverName())) {
                    pitRule(user, userOld, pitVorgang);
                    break;
                }
            }
        }
        usersOld = users;
    }

    private void pitRule(User user, User userOld, PitVorgang pitVorgang) {
        PitState pitNew, pitOld;
        pitNew = user.getPitStateEnum();
        pitOld = userOld.getPitStateEnum();

        if (pitOld != pitNew) {
            /*
             * 0 == NONE = OnTrack
             * 1 == REQUEST = OnTrack PitStop Requested
             * 2 == InPitLane
             * 3 == Pitting
             * 4 == EXITING = ExitingPitLane == Vehicle in Garage
             * ? == ENTERING
             * ? == STOPPED
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
                            if (pitVorgang.isAus_der_box_gefahren()) {
                                write(new StrafenLog(sessionInfo, user, "Aus der box gefahren"));
                                if (escOnTrack.contains(user.getDriverName())) {
                                    backOnTrack.add(user.getVehicleName() + " ==> +30");
                                    writeBackOnTrack();
                                }
                            }
                            break;
                        case REQUEST:
                            if (pitVorgang.isBoxenstop_anforderung_abgebrochen()) {
                                write(new StrafenLog(sessionInfo, user, "Boxenstopanforderung abgebrochen"));
                            }
                            break;
                    }
                    break;
                case REQUEST:
                    switch (pitOld) {
                        case NONE:
                            if (pitVorgang.isBoxenstop_angefordert()) {
                                write(new StrafenLog(sessionInfo, user, "Boxenstop angefordert"));
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
                            //Wichtig auch für die Auswertung nach dem Rennen
                            if (pitVorgang.isEsc_auf_strecke()) {
                                write(new StrafenLog(sessionInfo, user, "ESC auf der strecke"));
                                escOnTrack.add(user.getDriverName());
                            }
                            break;
                        case INPITLANE:
                        case PITTING:
                            break;
                        case ENTERING:
                            if (pitVorgang.isEsc_in_der_box()) {
                                write(new StrafenLog(sessionInfo, user, "ESC in der box"));
                            }
                            break;
                        case STOPPED:
                            if (pitVorgang.isBoxenstop_ende()) {
                                write(new StrafenLog(sessionInfo, user, "boxenstop ende"));
                            }
                            break;
                    }
                case ENTERING:
                    switch (pitOld) {
                        case NONE:
                        case REQUEST:
                            if (pitVorgang.isIn_die_box()) {
                                write(new StrafenLog(sessionInfo, user, "in die Box"));
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
                    switch (pitOld) {
                        case NONE:
                        case EXITING:
                        case PITTING:
                        case INPITLANE:
                        case REQUEST:
                            break;
                        case ENTERING:
                            if (pitVorgang.isBoxenstop_beginn()) {
                                write(new StrafenLog(sessionInfo, user, "Boxenstop beginn"));
                            }
                            break;
                    }
                    break;
            }
        }
    }

    private void writeBackOnTrack() {
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
                    ".txt").toFile(), backOnTrack);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void write(StrafenLog strafenLog) {
        strafen.add(strafenLog);
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
                    ".te").toFile(), strafen);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<StrafenLog> getStrafen() {
        return strafen;
    }

    public void setStrafen(ArrayList<StrafenLog> strafen) {
        this.strafen = strafen;
    }

    public SessionInfo getSessionInfo() {
        return sessionInfo;
    }

    public void setSessionInfo(SessionInfo sessionInfo) {
        this.sessionInfo = sessionInfo;
    }

    public User[] getUsersOld() {
        return usersOld;
    }

    public void setUsersOld(User[] usersOld) {
        this.usersOld = usersOld;
    }

    public File getRfDir() {
        return rfDir;
    }

    public void setRfDir(File rfDir) {
        this.rfDir = rfDir;
    }

    public ArrayList<String> getEscOnTrack() {
        return escOnTrack;
    }

    public void setEscOnTrack(ArrayList<String> escOnTrack) {
        this.escOnTrack = escOnTrack;
    }

    public ArrayList<String> getBackOnTrack() {
        return backOnTrack;
    }

    public void setBackOnTrack(ArrayList<String> backOnTrack) {
        this.backOnTrack = backOnTrack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ESCTool)) return false;
        ESCTool escTool = (ESCTool) o;
        return Objects.equals(getStrafen(), escTool.getStrafen()) && Objects.equals(getSessionInfo(), escTool.getSessionInfo()) && Arrays.equals(getUsersOld(), escTool.getUsersOld()) && Objects.equals(getRfDir(), escTool.getRfDir()) && Objects.equals(getEscOnTrack(), escTool.getEscOnTrack()) && Objects.equals(getBackOnTrack(), escTool.getBackOnTrack());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStrafen(), getSessionInfo(), getRfDir(), getEscOnTrack(), getBackOnTrack());
        result = 31 * result + Arrays.hashCode(getUsersOld());
        return result;
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
        usersOld = new User[0];
    }
}
