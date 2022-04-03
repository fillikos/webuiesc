package de.fillikos.rf2.esctool.controller;

public class Controller {

    private static DataController dc = new DataController();
    private static ViewController vc = new ViewController();

    public static void showView() {
        vc.showView();
    }

    public static String setMainViewText() {
        return "";
    }
}
