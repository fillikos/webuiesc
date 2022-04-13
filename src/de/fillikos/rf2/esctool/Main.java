package de.fillikos.rf2.esctool;

import de.fillikos.rf2.esctool.controller.Controller;

public class Main {

    public static void main(String[] args) {
        Controller.addLog("Start der Anwendung");
        Controller.showView();
        Controller.addLog("Main ausgeführt");
    }
}
