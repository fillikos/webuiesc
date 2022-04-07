package de.fillikos.rf2.esctool.view;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.service.webui.httpss.model.Connection;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainView {

    private JFrame frame;
    private boolean startload = false;
    private JLabel text;
    private JTextField txtLeaderGrid2 = new JTextField();
    private MainMenu mainMenu;

    public MainView() {
        frame = new JFrame();
        frame.setTitle("ESC-Tool");
        frame.setSize(390, 240);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((int) (screenSize.getWidth() / 2 - frame.getWidth() / 2),
                (int) (screenSize.getHeight() / 2 - frame.getHeight() / 2));

        JPanel panSouth = new JPanel(new FlowLayout(FlowLayout.LEADING));
        panSouth.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        mainMenu = new MainMenu();


        String serverAuswahl[] = {"VRrF2LN R", "VRrF2LN T", "VRrF2LN L", "localhost"};
        JComboBox boxServer = new JComboBox(serverAuswahl);

        JButton btnStart = new JButton("start");
        btnStart.addActionListener(e -> {
            if (startload) {
                startload = false;
                btnStart.setText("Start");
                Controller.stopUpdateServerData();
            } else {
                startload = true;
                btnStart.setText("Stopp");
                switch (boxServer.getSelectedIndex()) {
                    case 0:
                        Controller.setServer(new Connection("http://89.163.146.67:", "5725"));
                        break;
                    case 1:
                        Controller.setServer(new Connection("http://89.163.146.67:", "5735"));
                        break;
                    case 2:
                        Controller.setServer(new Connection("http://89.163.146.67:", "5715"));
                        break;
                    case 3:
                        Controller.setServer(new Connection("http://localhost:", "5397"));
                        break;
                }
                Controller.startUpdateServerData();
            }
        });
        panSouth.add(btnStart);
        panSouth.add(boxServer);

        txtLeaderGrid2.setText("0");
        txtLeaderGrid2.setColumns(2);
        JButton btnSetLeaderGrid2 = new JButton("set SG");
        btnSetLeaderGrid2.addActionListener(e -> {
            ArrayList<String> startgruppeEins = new ArrayList<>();
            startgruppeEins.add("SP9 GT3");
            startgruppeEins.add("Cup2");
            ArrayList<String> startgruppeZwei = new ArrayList<>();
            startgruppeZwei.add("H2");
            startgruppeZwei.add("H4");
            startgruppeZwei.add("SP10 GT4");
            startgruppeZwei.add("SP3T");
            ArrayList<ArrayList<String>> startgruppen = new ArrayList<>();
            startgruppen.add(startgruppeEins);
            startgruppen.add(startgruppeZwei);
            Controller.setStartgruppen(startgruppen);
            Controller.loadGridINI();
        });

        panSouth.add(btnSetLeaderGrid2);
        panSouth.add(txtLeaderGrid2);

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

    public JTextField getTxtLeaderGrid2() {
        return txtLeaderGrid2;
    }

    public void setTxtLeaderGrid2(JTextField txtLeaderGrid2) {
        this.txtLeaderGrid2 = txtLeaderGrid2;
    }
}