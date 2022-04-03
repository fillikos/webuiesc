package de.fillikos.rf2.esctool.grid.webui;

public class AttackMode {

    public String totalCount,
            remainingCount,
            timeRemaining;

    public AttackMode() {
        totalCount = "";
        remainingCount = "";
        timeRemaining = "";
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getRemainingCount() {
        return remainingCount;
    }

    public void setRemainingCount(String remainingCount) {
        this.remainingCount = remainingCount;
    }

    public String getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(String timeRemaining) {
        this.timeRemaining = timeRemaining;
    }
}
