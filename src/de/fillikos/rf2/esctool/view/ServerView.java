package de.fillikos.rf2.esctool.view;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.esctool.view.config.ServerConfig;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class ServerView {

    private JFrame frame;
    private ArrayList<ServerConfig> serverConfigList = new ArrayList<>();
    private DefaultTableModel tableModel;

    public ServerView() {
        frame = new JFrame();
        frame.setTitle("Server Management");
        frame.setSize(390, 240);
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
                serverConfigList.add(new ServerConfig(
                        (String) tableModel.getValueAt(i, 0),
                        (String) tableModel.getValueAt(i, 1),
                        (String) tableModel.getValueAt(i, 2)
                ));
            }
            Controller.setServerManagement();
            Controller.saveServerConfig(serverConfigList);
        });
        JButton btnNew = new JButton("Neu ...");
        btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tableModel.getRowCount() > 0) {
                    if (!tableModel.getValueAt(tableModel.getRowCount() - 1, 0).equals("") &&
                            !tableModel.getValueAt(tableModel.getRowCount() - 1, 1).equals("") &&
                            !tableModel.getValueAt(tableModel.getRowCount() - 1, 2).equals("")) {
                        tableModel.addRow(new String[]{"", "", ""});
                    }
                } else {
                    tableModel.addRow(new String[]{"", "", ""});
                }
            }
        });

        String[] columns = new String[]{"Server Name", "IP", "Port"};

        tableModel = new DefaultTableModel(columns, 0);
        for (ServerConfig server : serverConfigList) {
            tableModel.addRow(serverToRow(server));
        }

        JTable tabLiveView = new JTable(tableModel);
        TableColumn column = null;
        for (int i = 0; i < columns.length; i++) {
            column = tabLiveView.getColumnModel().getColumn(i);
            int width = 0;
            switch (i) {
                case 0:
                    width = 100;
                    break;
                case 1:
                    width = 50;
                    break;
                case 2:
                    width = 50;
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
        flowSouth.add(btnSave);
        contentPane.add(flowSouth, BorderLayout.SOUTH);
    }

    private Object[] serverToRow(ServerConfig server) {
        return new String[]{
                server.getServerName(),
                server.getIp(),
                server.getPort()
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
