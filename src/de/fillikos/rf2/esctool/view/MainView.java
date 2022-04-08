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
    private MainMenu mainMenu;
    private final ArrayList<String> startgruppe = new ArrayList<>();
    private final ArrayList<ArrayList<String>> startgruppen = new ArrayList<>();

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


        String[] serverAuswahl = {"VRrF2LN R", "VRrF2LN T", "VRrF2LN L", "VES", "localhost"};
        JComboBox boxServer = new JComboBox(serverAuswahl);

        String[] modAuswahl = {"VRrF2LN", "VES", "VRLSM"};
        JComboBox boxMod = new JComboBox(modAuswahl);

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
                        Controller.setServer(new Connection("http://89.163.146.67:", "5397"));
                        break;
                    case 4:
                        Controller.setServer(new Connection("http://localhost:", "5397"));
                        break;
                }
                Controller.startUpdateServerData();
                new Thread(() -> {
                    int i = boxMod.getSelectedIndex();
                    try {
                        Thread.sleep(3_000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    switch (i) {
                        case 0:
                            startgruppen.clear();
                            startgruppe.add("SP9 GT3");
                            startgruppe.add("Cup2");
                            startgruppen.add(startgruppe);
                            startgruppe.clear();
                            startgruppe.add("H2");
                            startgruppe.add("H4");
                            startgruppe.add("SP10 GT4");
                            startgruppe.add("SP3T");
                            startgruppen.add(startgruppe);
                            startgruppe.clear();
                            Controller.setStartgruppen(startgruppen);
                            break;
                        case 1:
                            startgruppen.clear();
                            startgruppe.add("LMP2");
                            startgruppen.add(startgruppe);
                            startgruppe.clear();
                            startgruppe.add("LMP3");
                            startgruppen.add(startgruppe);
                            startgruppe.clear();
                            startgruppe.add("GTD");
                            startgruppen.add(startgruppe);
                            startgruppe.clear();
                            Controller.setStartgruppen(startgruppen);
                            break;
                        case 2:
                            break;
                    }
                }).start();
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
}
