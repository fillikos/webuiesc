package de.fillikos.rf2.esctool.view;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.esctool.data.rf2data.MultiplayerJson;
import de.fillikos.rf2.esctool.data.rf2data.PlayerJson;
import de.fillikos.rf2.esctool.view.config.ServerConfig;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ServerView {

    private JFrame frame;
    private ArrayList<ServerConfig> serverConfigList = new ArrayList<>();
    private DefaultTableModel tableModel;
    private JTable tabLiveView;

    public ServerView() {
        frame = new JFrame();
        frame.setTitle("Server Management");
        frame.setSize(500, 240);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Controller.setServerManagement();
                frame.dispose();
            }
        });
        JButton btnSave = new JButton("Speichern");
        btnSave.addActionListener(e -> {
            serverConfigList.clear();
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                tabLiveView.getDefaultEditor(Object.class).stopCellEditing();
                serverConfigList.add(new ServerConfig(
                        (String) tableModel.getValueAt(i, 0),
                        (String) tableModel.getValueAt(i, 1),
                        (String) tableModel.getValueAt(i, 2),
                        (String) tableModel.getValueAt(i, 3)
                ));
            }
            Controller.setServerManagement();
            Controller.saveServerConfig(serverConfigList);
            JOptionPane.showMessageDialog(frame,
                    "Die Server wurden erfolgreich gespeichert.");
        });
        JButton btnNew = new JButton("Leerer Server");
        btnNew.addActionListener(e -> {
            if (tableModel.getRowCount() == 0 ||
                    !tableModel.getValueAt(tableModel.getRowCount() - 1, 0).equals("") &&
                            !tableModel.getValueAt(tableModel.getRowCount() - 1, 1).equals("") &&
                            !tableModel.getValueAt(tableModel.getRowCount() - 1, 2).equals("")
            ) {
                tableModel.addRow(new String[]{"","","",""});
            }
        });
        JButton btnNewUser = new JButton("Neuer User");
        btnNewUser.addActionListener(e -> {
            if (tableModel.getRowCount() == 0 ||
                    !tableModel.getValueAt(tableModel.getRowCount() - 1, 0).equals("") &&
                            !tableModel.getValueAt(tableModel.getRowCount() - 1, 1).equals("") &&
                            !tableModel.getValueAt(tableModel.getRowCount() - 1, 2).equals("")
            ) {

                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
                    @Override
                    public boolean accept(File f) {
                        return f.isDirectory();
                    }

                    @Override
                    public String getDescription() {
                        return null;
                    }
                });
                int rc = chooser.showDialog(frame, "rFactor 2 User Verzeichnis wählen");
                if (rc == JFileChooser.APPROVE_OPTION) {
                    ObjectMapper om = new ObjectMapper();
                    String player = chooser.getSelectedFile().toString().substring(chooser.getSelectedFile().toString().lastIndexOf("\\"));
                    try {
                        PlayerJson pJson = om.readValue(new File(chooser.getSelectedFile().toString() + player + ".json"), PlayerJson.class);
                        MultiplayerJson mpJson = om.readValue(new File(chooser.getSelectedFile() + "\\Multiplayer.json"), MultiplayerJson.class);
                        tableModel.addRow(new String[]{
                                mpJson.getMultiplayer_Server_Options().getDefault_Game_Name(),
                                mpJson.getMultiplayer_General_Options().getBind_IP().equals("0.0.0.0") ? "localhost" : mpJson.getMultiplayer_General_Options().getBind_IP(),
                                String.valueOf(pJson.getMiscellaneous().getWebUI_port()),
                                chooser.getSelectedFile().toString() });
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        JButton btnRemove = new JButton("Entfernen");
        btnRemove.addActionListener(e -> {
            int i = tabLiveView.getRowCount();
            if (i > 0) {
                if (tabLiveView.getSelectedRow() == -1) {
                    tableModel.removeRow(i - 1);
                } else {
                    tableModel.removeRow(tabLiveView.getSelectedRow());
                }
            }
        });

        String[] columns = new String[]{"Server Name", "IP", "Port", "rF2 User Verzeichnis"};

        tableModel = new DefaultTableModel(columns, 0);
        for (ServerConfig server : serverConfigList) {
            tableModel.addRow(serverToRow(server));
        }

        tabLiveView = new JTable(tableModel);
        TableColumn column;
        for (int i = 0; i < columns.length; i++) {
            column = tabLiveView.getColumnModel().getColumn(i);
            int width;
            switch (i) {
                case 0:
                    width = 75;
                    break;
                case 1:
                    width = 50;
                    break;
                case 2:
                    width = 25;
                    break;
                case 3:
                    width = 125;
                    break;
                default:
                    width = 7;
                    break;
            }
            column.setPreferredWidth(width);
        }


        JScrollPane scrPane = new JScrollPane(tabLiveView);

        Container contentPane = frame.getContentPane();
        contentPane.add(scrPane, BorderLayout.CENTER);

        JPanel flowSouth = new JPanel(new FlowLayout());
        flowSouth.add(btnNew);
        flowSouth.add(btnNewUser);
        flowSouth.add(btnRemove);
        flowSouth.add(btnSave);
        contentPane.add(flowSouth, BorderLayout.SOUTH);
    }

    private Object[] serverToRow(ServerConfig server) {
        return new String[]{
                server.getServerName(),
                server.getIp(),
                server.getPort(),
                server.getRf2UserDir().toString()
        };
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public ArrayList<ServerConfig> getServerConfigList() {
        return serverConfigList;
    }

    public void setServerConfigList(ArrayList<ServerConfig> serverConfigList) {
        this.serverConfigList = serverConfigList;
        for (ServerConfig server : serverConfigList) {
            tableModel.addRow(serverToRow(server));
        }
    }
}
