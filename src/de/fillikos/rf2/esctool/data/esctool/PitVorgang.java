package de.fillikos.rf2.esctool.data.esctool;

public class PitVorgang {

    private boolean aus_der_box_gefahren = true;
    private boolean esc_auf_strecke = true;
    private boolean boxenstop_angefordert = true;
    private boolean boxenstop_anforderung_abgebrochen = true;
    private boolean esc_in_der_box = true;
    private boolean boxenstop_beginn = true;
    private boolean boxenstop_ende = true;
    private boolean in_die_box = true;

    public PitVorgang() {
    }

    public boolean isAus_der_box_gefahren() {
        return aus_der_box_gefahren;
    }

    public void setAus_der_box_gefahren(boolean aus_der_box_gefahren) {
        this.aus_der_box_gefahren = aus_der_box_gefahren;
    }

    public boolean isEsc_auf_strecke() {
        return esc_auf_strecke;
    }

    public void setEsc_auf_strecke(boolean esc_auf_strecke) {
        this.esc_auf_strecke = esc_auf_strecke;
    }

    public boolean isBoxenstop_angefordert() {
        return boxenstop_angefordert;
    }

    public void setBoxenstop_angefordert(boolean boxenstop_angefordert) {
        this.boxenstop_angefordert = boxenstop_angefordert;
    }

    public boolean isBoxenstop_anforderung_abgebrochen() {
        return boxenstop_anforderung_abgebrochen;
    }

    public void setBoxenstop_anforderung_abgebrochen(boolean boxenstop_anforderung_abgebrochen) {
        this.boxenstop_anforderung_abgebrochen = boxenstop_anforderung_abgebrochen;
    }

    public boolean isEsc_in_der_box() {
        return esc_in_der_box;
    }

    public void setEsc_in_der_box(boolean esc_in_der_box) {
        this.esc_in_der_box = esc_in_der_box;
    }

    public boolean isBoxenstop_beginn() {
        return boxenstop_beginn;
    }

    public void setBoxenstop_beginn(boolean boxenstop_beginn) {
        this.boxenstop_beginn = boxenstop_beginn;
    }

    public boolean isBoxenstop_ende() {
        return boxenstop_ende;
    }

    public void setBoxenstop_ende(boolean boxenstop_ende) {
        this.boxenstop_ende = boxenstop_ende;
    }

    public boolean isIn_die_box() {
        return in_die_box;
    }

    public void setIn_die_box(boolean in_die_box) {
        this.in_die_box = in_die_box;
    }

    @Override
    public String toString() {
        return "PitVorgang{" +
                "aus_der_box_gefahren=" + aus_der_box_gefahren +
                ", esc_auf_strecke=" + esc_auf_strecke +
                ", boxenstop_angefordert=" + boxenstop_angefordert +
                ", boxenstop_anforderung_abgebrochen=" + boxenstop_anforderung_abgebrochen +
                ", esc_in_der_box=" + esc_in_der_box +
                ", boxenstop_beginn=" + boxenstop_beginn +
                ", boxenstop_ende=" + boxenstop_ende +
                ", in_die_box=" + in_die_box +
                '}';
    }
}
