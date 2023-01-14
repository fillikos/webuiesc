package de.fillikos.rf2.esctool.view;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.esctool.view.config.ModConfig;
import de.fillikos.rf2.esctool.view.config.ServerConfig;
import de.fillikos.rf2.service.webui.httpss.model.Connection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;

public class MainView {

    private JFrame frame;
    private boolean startload = false;
    private JLabel text;
    private MainMenu mainMenu;
    private ArrayList<ServerConfig> serverConfigList = new ArrayList<>();
    private ArrayList<ModConfig> modConfigList = new ArrayList<>();
    private ArrayList<String> tempUserList = new ArrayList<>();
    private final JComboBox<String> boxServer;
    private final JComboBox<String> boxMod;
    private final JComboBox<String> boxUser;
    private final JCheckBox checkAdditionalInfo = new JCheckBox();
    private JButton btnCreateGrid;
    private File rf2Dir = new File("C:");

    public MainView() {
        frame = new JFrame();
        frame.setTitle("rF2 Admin Tool - " + rf2Dir);
        frame.setSize(800, 240);

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
        boxServer = new JComboBox<>();
        boxMod = new JComboBox<>();
        boxUser = new JComboBox<>();

        JButton btnStart = new JButton("start");
        btnStart.addActionListener(e -> {
            if (startload) {
                btnCreateGrid.setEnabled(false);
                startload = false;
                btnStart.setText("Start");
                Controller.stopUpdateServerData();
            } else {
                btnCreateGrid.setEnabled(true);
                startload = true;
                btnStart.setText("Stopp");
                for (ServerConfig server : serverConfigList) {
                    if (server.getServerName().equals(boxServer.getSelectedItem())) {
                        File file = new File(server.getRf2UserDir());
                        Controller.setDir(file.getParentFile().getParentFile());
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

        btnCreateGrid = new JButton("erstelle grid.ini");
        btnCreateGrid.setEnabled(false);
        btnCreateGrid.addActionListener(e -> {
            Controller.loadGridINI();
        });

        panSouth.add(btnCreateGrid);
        panSouth.add(boxUser);
        checkAdditionalInfo.setText("Zusatzinfos");
        checkAdditionalInfo.setSelected(false);
        panSouth.add(checkAdditionalInfo);

        JPanel panNorth = new JPanel(new FlowLayout(FlowLayout.LEADING));
        panNorth.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        text = new JLabel();
        text.setText("<html><body><div style=\"font-family:consolas;\">Hallo<br>" +
                "1. UserData Ordner des Servers auswählen (Server verwalten),<br>" +
                "2. Mod anlegen und auswählen (Mod konfigurieren),<br>" +
                "3. wenn noch nicht in auswahl enthalten, Tool neu starten,<br>" +
                "4. Start drücken und alles läuft automatisch<br><t>&nbsp&nbsp&nbsp&nbsp(Serverdaten werden gezeigt),<br>" +
                "5. grid.ini <u>kann</u> manuell erstellt werden, muss aber nicht<br></div>" +
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

    public void setUserList(ArrayList<String> userList) {
        if (!tempUserList.equals(userList)) {
            String temp = "";
            if (boxUser.getSelectedItem() != null) {
                temp = boxUser.getSelectedItem().toString();
            }
            boxUser.removeAllItems();
            for (String user: userList) {
                boxUser.addItem(user);
            }
            if (!temp.equals("")) {
                boxUser.setSelectedItem(temp);
            } else {
                boxUser.setSelectedIndex(0);
            }
            tempUserList = userList;
        }
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    public void setRf2Dir(File rf2Dir) {
        this.rf2Dir = rf2Dir;
        frame.setTitle("rF2 Admin Tool");
//        frame.setTitle("rF2 Admin Tool - " + rf2Dir);
        frame.repaint();
    }

    public String getSelectedUser() {
        if (boxUser.getSelectedItem() != null) {
            System.out.println(boxUser.getSelectedItem().toString());
            return boxUser.getSelectedItem().toString();
        }
        return "";
    }

    public boolean getCheckAdditionalInfo() {
        return checkAdditionalInfo.isSelected();
    }
}
