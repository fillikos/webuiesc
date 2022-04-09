package de.fillikos.rf2.esctool.view;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.esctool.view.config.ModConfig;
import de.fillikos.rf2.esctool.view.config.ServerConfig;
import de.fillikos.rf2.service.webui.httpss.model.Connection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class MainView {

    private JFrame frame;
    private boolean startload = false;
    private JLabel text;
    private MainMenu mainMenu;
    private final ArrayList<String> startgruppe = new ArrayList<>();
    private final ArrayList<ArrayList<String>> startgruppen = new ArrayList<>();
    private ArrayList<ServerConfig> serverConfigList = new ArrayList<>();
    private ArrayList<ModConfig> modConfigList = new ArrayList<>();
    private JComboBox boxServer;
    private JComboBox boxMod;

    public MainView() {
        frame = new JFrame();
        frame.setTitle("ESC-Tool");
        frame.setSize(390, 240);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Controller.shutdown();
                super.windowClosing(e);
            }
        });

        JPanel panSouth = new JPanel(new FlowLayout(FlowLayout.LEADING));
        panSouth.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        mainMenu = new MainMenu();
        boxServer = new JComboBox();
        boxMod = new JComboBox();

        String[] modAuswahl = {"VRrF2LN", "VES", "VRLSM"};


        JButton btnStart = new JButton("start");
        btnStart.addActionListener(e -> {
            if (startload) {
                startload = false;
                btnStart.setText("Start");
                Controller.stopUpdateServerData();
            } else {
                startload = true;
                btnStart.setText("Stopp");
                // TODO
                for (ServerConfig server : serverConfigList) {
                    if (server.getServerName().equals(boxServer.getSelectedItem())) {
                        Controller.setServer(new Connection("http://" + server.getIp() + ":", server.getPort()));
                        for (ModConfig mod : modConfigList) {
                            if (mod.getModName().equals(boxMod.getSelectedItem())) {
                                Controller.startUpdateServerData(mod);
                            }
                        }
                    }
                }
            }
        });

        panSouth.add(btnStart);
        panSouth.add(boxServer);
        panSouth.add(boxMod);

        JButton btnSetLeaderGrid2 = new JButton("load Grid");
        btnSetLeaderGrid2.addActionListener(e -> {
            Controller.loadGridINI();
        });

        panSouth.add(btnSetLeaderGrid2);

        JPanel panNorth = new JPanel(new FlowLayout(FlowLayout.LEADING));
        panNorth.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        text = new JLabel();
        text.setText("<html><body>hallo<br>" +
                "Bitte den Rennserver auswählen,<br>" +
                "</body></html>");
        panNorth.add(text);

        Container contentPane = frame.getContentPane();
        contentPane.add(mainMenu, BorderLayout.NORTH);
        contentPane.add(panNorth, BorderLayout.CENTER);
        contentPane.add(panSouth, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void showView() {
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public boolean isStartload() {
        return startload;
    }

    public void setStartload(boolean startload) {
        this.startload = startload;
    }

    public JLabel getText() {
        return text;
    }

    public void setText(JLabel text) {
        this.text = text;
    }

    public ArrayList<ServerConfig> getServerConfigList() {
        return serverConfigList;
    }

    public void setServerConfigList(ArrayList<ServerConfig> serverConfigList) {
        this.serverConfigList = serverConfigList;
        boxServer.removeAllItems();
        for (ServerConfig server : serverConfigList) {
            boxServer.addItem(server.getServerName());
        }
    }

    public void setModConfigList(ArrayList<ModConfig> modConfigList) {
        this.modConfigList = modConfigList;
        boxMod.removeAllItems();
        for (ModConfig mod : modConfigList) {
            boxMod.addItem(mod.getModName());
        }
    }
}
