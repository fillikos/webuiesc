package de.fillikos.rf2.esctool.controller;

import de.fillikos.rf2.esctool.view.MainView;

public class ViewController {

    private MainView mainView;

    public ViewController() {
        mainView = new MainView();
    }

    public void showView() {
        mainView.showView();
    }
}
