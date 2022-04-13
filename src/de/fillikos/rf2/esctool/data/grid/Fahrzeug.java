package de.fillikos.rf2.esctool.data.grid;

public class Fahrzeug {

    private int position, anmeldeztpkt, strafe, zaehler;
    private String vehName, klasse, team, fahrer;
    private boolean anmeldung;

    public Fahrzeug() {

    }

    public Fahrzeug(int position, String fahrer) {
        this.position = position;
        this.fahrer = fahrer;
    }

    public Fahrzeug(int position, String vehName, String fahrer, String klasse) {
        this.position = position;
        this.fahrer = fahrer;
        this.vehName = vehName;
        this.klasse = klasse;
    }

    public Fahrzeug(String vehName, int anmeldeztpkt, String team, boolean anmeldung) {
        this.vehName = vehName;
        this.anmeldeztpkt = anmeldeztpkt;
        this.team = team;
        this.anmeldung = anmeldung;
        zaehler = 0;

        if (anmeldung) {
            setPositionAnmeldung(anmeldeztpkt);
        } else {
            setPositionAbmeldung(anmeldeztpkt);
        }
    }

    private void setPositionAbmeldung(int anmeldeztpkt) {
        if (anmeldeztpkt > 0) {
            this.position = (4000 + anmeldeztpkt);
        } else {
            this.position = (5000 + anmeldeztpkt);
        }
    }

    private void setPositionAnmeldung(int anmeldeztpkt) {
        this.position = (3000 + anmeldeztpkt);
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setStrafe(int strafe) {
        this.strafe = strafe;
    }

    public boolean besitztStrafe() {
        if (this.strafe > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getStrafe() {
        return this.strafe;
    }

    public String getVehName() {
        return this.vehName;
    }

    public String getFahrer() {
        return this.fahrer;
    }

    public void setFahrer(String fahrer) {
        this.fahrer = fahrer;
    }

    public String toString() {
        return String.format("#%s, %s | %d | %s\n",
                this.vehName,
                this.team,
                this.position,
                this.fahrer);
    }

    public String getTeam() {
        return this.team;
    }

    public boolean isAnmeldung() {
        return anmeldung;
    }
}
