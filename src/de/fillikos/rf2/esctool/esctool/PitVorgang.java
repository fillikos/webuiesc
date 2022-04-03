package de.fillikos.rf2.esctool.esctool;

public enum PitVorgang {
    AUS_BOX_GEFAHREN(false),
    ESC_AUF_STRECKE(false),
    BOXENSTOP_ANGEFORDERT(false),
    BOXENSTOP_ANFORDERUNG_ABGEBROCHEN(false),
    ESC_IN_DER_BOX(false),
    BOXENSTOP_BEGINN(false),
    BOXENSTOP_BEENDET(false),
    IN_DIE_BOX(false);

    private boolean save;

    PitVorgang(boolean save) {
    }

    public boolean isSave() {
        return save;
    }

    public void setSave(boolean save) {
        this.save = save;
    }
}
