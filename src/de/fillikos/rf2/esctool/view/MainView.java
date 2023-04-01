package de.fillikos.rf2.esctool.view;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.esctool.view.config.ModConfig;
import de.fillikos.rf2.esctool.view.config.ServerConfig;
import de.fillikos.rf2.service.webui.httpss.model.Connection;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainView {

    private JList<String> vehicleList = new JList<>();
    private final Font consolas = new Font("Consolas", Font.PLAIN, 11);
    private JPanel panVehicle;
    private JFrame frame;
    private boolean startload = false;
    private JLabel text;
    private MainMenu mainMenu;
    private List<ServerConfig> serverConfigList = new ArrayList<ServerConfig>();
    private List<ModConfig> modConfigList = new ArrayList<>();
    private List<String> tempUserList = new ArrayList<>();
    private final JComboBox<String> boxServer;
    private final JComboBox<String> boxMod;
    private final JCheckBox checkAdditionalInfo = new JCheckBox();
    private JButton btnCreateGrid;
    private File rf2Dir = new File("C:");

    private JPanel panSessionInfo = new JPanel();

    public MainView() {
        frame = new JFrame();
        frame.setTitle("rF2 Admin Tool - " + rf2Dir);
        frame.setSize(830, 360);
        frame.setResizable(false);

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

        JPanel panNorth = new JPanel(new FlowLayout(FlowLayout.LEADING));
        panNorth.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        createServerInfo();
        panNorth.add(panSessionInfo);
        createVehicles();
        panNorth.add(panVehicle);

        Container contentPane = frame.getContentPane();
        contentPane.add(mainMenu, BorderLayout.NORTH);
        contentPane.add(panNorth, BorderLayout.CENTER);
        contentPane.add(panSouth, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    private void createVehicles() {
        panVehicle = new JPanel();
        panVehicle.setPreferredSize(new Dimension(400,250));
        panVehicle.setBorder(BorderFactory.createTitledBorder(new TitledBorder(""), "Vehicle Information",1, 0, consolas));

        Font consolas = new Font("Consolas", Font.PLAIN, 11);

        String[] start = {};
        vehicleList = new JList<>(start);
        vehicleList.setMinimumSize(new Dimension(360,170));
        vehicleList.setFont(consolas);
        JScrollPane scrollPane = new JScrollPane(vehicleList);
        scrollPane.setPreferredSize(new Dimension(378,190));
        panVehicle.add(scrollPane);

        // Button für den Aufruf den Penalize Fensters
        JButton btnPenalty = new JButton("penalize");
        btnPenalty.addActionListener(e -> {
            if (!vehicleList.isSelectionEmpty()) {
                Controller.showPenalizeView(vehicleList.getSelectedValue(), MouseInfo.getPointerInfo().getLocation());
            }
        });
        panVehicle.add(btnPenalty);

        // Button für DQ und UNDQ
        JButton btnDQ = new JButton("dq/undq");
        btnDQ.addActionListener(e -> {
            if (!vehicleList.isSelectionEmpty()) {
                if (vehicleList.getSelectedValue().contains(" (DQ)")) {
                    Controller.sendChat("/undq " + vehicleList.getSelectedValue().substring(0, vehicleList.getSelectedValue().indexOf(" (DQ)")));
                } else {
                    Controller.sendChat("/dq " + vehicleList.getSelectedValue());
                }
            }
        });
        panVehicle.add(btnDQ);

        // Button für ZusatzInfos
        JButton btnUserInfo = new JButton("User");
        btnUserInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!vehicleList.isSelectionEmpty()) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            Controller.showUserInformation(vehicleList.getSelectedValue());
                        }
                    }).start();
                }
            }
        });
        panVehicle.add(btnUserInfo);
    }

    private void createServerInfo() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{100,150,140};
        panSessionInfo = new JPanel(gridBagLayout);
        panSessionInfo.setPreferredSize(new Dimension(400,250));

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0,0,0,5);
        c.gridy = 0;
        c.gridx = 0;
        c.weightx = 0.1;
        panSessionInfo.add(newLabel("Game Name:", JLabel.RIGHT), c);
        c.gridx = 1;
        c.gridwidth = 2;
        panSessionInfo.add(newLabel("", JLabel.LEFT), c);
        c.gridy++;
        c.gridx = 0;
        c.gridwidth = 1;
        panSessionInfo.add(newLabel("Flags:", JLabel.RIGHT), c);
        c.gridx = 1;
        c.gridwidth = 2;
        panSessionInfo.add(newLabel("", JLabel.LEFT), c);
        c.gridy++;
        c.gridx = 0;
        c.gridwidth = 1;
        panSessionInfo.add(newLabel("LapDistance:", JLabel.RIGHT), c);
        c.gridx = 1;
        c.gridwidth = 2;
        panSessionInfo.add(newLabel("", JLabel.LEFT), c);
        c.gridy++;
        c.gridx = 0;
        c.gridwidth = 1;
        panSessionInfo.add(newLabel("Clients:", JLabel.RIGHT), c);
        c.gridx = 1;
        c.gridwidth = 2;
        panSessionInfo.add(newLabel("", JLabel.LEFT), c);
        c.gridy++;
        c.gridx = 0;
        c.gridwidth = 1;
        panSessionInfo.add(newLabel("Track:", JLabel.RIGHT), c);
        c.gridx = 1;
        c.gridwidth = 2;
        panSessionInfo.add(newLabel("", JLabel.LEFT), c);
        c.gridy++;
        c.gridx = 0;
        c.gridwidth = 1;
        panSessionInfo.add(newLabel("Session Info:", JLabel.RIGHT), c);
        c.gridx = 1;
        c.gridwidth = 2;
        panSessionInfo.add(newLabel("", JLabel.LEFT), c);
        c.gridy++;
        c.gridx = 0;
        c.gridwidth = 1;
        panSessionInfo.add(newLabel("Profilename:", JLabel.RIGHT), c);
        c.gridx = 1;
        c.gridwidth = 2;
        panSessionInfo.add(newLabel("", JLabel.LEFT), c);
        c.gridy++;
        c.gridx = 0;
        c.gridwidth = 1;
        panSessionInfo.add(newLabel("Rain:", JLabel.RIGHT), c);
        c.gridx = 1;
        c.gridwidth = 2;
        panSessionInfo.add(newLabel("", JLabel.LEFT), c);
        c.gridy++;
        c.gridx = 0;
        c.gridwidth = 1;
        panSessionInfo.add(newLabel("Temperature:", JLabel.RIGHT), c);
        c.gridx = 1;
        c.gridwidth = 2;
        panSessionInfo.add(newLabel("", JLabel.LEFT), c);
        c.gridy++;
        c.gridx = 0;
        c.gridwidth = 1;
        panSessionInfo.add(newLabel("Time:", JLabel.RIGHT), c);
        c.gridx = 1;
        c.gridwidth = 2;
        panSessionInfo.add(newLabel("", JLabel.LEFT), c);
        c.gridy++;
        c.gridx = 0;
        c.gridwidth = 1;
        panSessionInfo.add(newLabel("Clouds:", JLabel.RIGHT), c);
        c.gridx = 1;
        c.gridwidth = 2;
        panSessionInfo.add(newLabel("", JLabel.LEFT), c);
        panSessionInfo.setBorder(BorderFactory.createTitledBorder(new TitledBorder(""), "Session Information",1, 0, consolas));
    }

    private JLabel newLabel(String text, int allignement) {
        JLabel label = new JLabel(text, allignement);
        label.setFont(consolas);
        return label;
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

    public java.util.List<ServerConfig> getServerConfigList() {
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

    public boolean getCheckAdditionalInfo() {
        return checkAdditionalInfo.isSelected();
    }

    public JPanel getPanSessionInfo() {
        return panSessionInfo;
    }

    public void setPanSessionInfo(JPanel panSessionInfo) {
        this.panSessionInfo = panSessionInfo;
    }

    public JPanel getPanVehicle() {
        return panVehicle;
    }

    public JList<String> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(JList<String> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
