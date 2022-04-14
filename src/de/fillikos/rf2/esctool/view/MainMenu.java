package de.fillikos.rf2.esctool.view;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.esctool.view.config.ViewConfig;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileFilter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainMenu extends JMenuBar {

    private ViewConfig viewConfig;
    private StringBuilder logs = new StringBuilder();

    public MainMenu() {
        super();
        logs.append("<html><body>");
        JMenu menuDatei = new JMenu("Datei");
        JMenuItem itemOpen = new JMenuItem("Öffnen");
        JMenuItem itemClose = new JMenuItem("Schließen");

        itemOpen.addActionListener(e -> {
            FileFilter ff = File::isDirectory;
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setSelectedFile(viewConfig.getRf2Dir());
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
            int rc = chooser.showDialog(this, "rFactor 2 Hauptverzeichnis auswählen");
            if (rc == JFileChooser.APPROVE_OPTION) {
                Controller.setDir(chooser.getSelectedFile());
            }
        });
        itemClose.addActionListener(e -> Controller.shutdown());

        menuDatei.add(itemOpen);
        menuDatei.add(itemClose);
        this.add(menuDatei);

        JMenu menuServer = new JMenu("Server");
        JMenuItem itemModKonfigurieren = new JMenuItem("Mod konfigurieren");
        itemModKonfigurieren.addActionListener(e -> {
            Controller.showModView();
        });
        JMenuItem itemServerAuswahl = new JMenuItem("Server verwalten");
        itemServerAuswahl.addActionListener(e -> {
            Controller.showServerView();
        });

        menuServer.add(itemModKonfigurieren);
        menuServer.add(itemServerAuswahl);
        this.add(menuServer);

        JMenu menuInfo = new JMenu("Info");
        JMenuItem itemLog = new JMenuItem("Logs");
        itemLog.addActionListener(e -> {
            JLabel lblLog = new JLabel(logs.toString() + "</body></html>");
            JScrollPane spLogs = new JScrollPane(lblLog);
            spLogs.setPreferredSize(new Dimension(800, 200));
            JOptionPane.showMessageDialog(this, spLogs, "Log´s", JOptionPane.PLAIN_MESSAGE);
        });
        JMenuItem itemInfo = new JMenuItem("Version");
        itemInfo.addActionListener(e -> JOptionPane.showMessageDialog(menuInfo, "rF2 Admin Tool\n" + Controller.getVersion() + "\nby fillikos\n"));
        menuInfo.add(itemLog);
        menuInfo.add(itemInfo);
        this.add(menuInfo);
    }

    public ViewConfig getViewConfig() {
        return viewConfig;
    }

    public void setViewConfig(ViewConfig viewConfig) {
        this.viewConfig = viewConfig;
    }

    public StringBuilder getLogs() {
        return logs;
    }

    public void setLogs(StringBuilder logs) {
        this.logs = logs;
    }

    public void addLog(String log) {
        DateFormat df = new SimpleDateFormat("yy.MM.dd-HH:mm:ss.SSS");
        logs.append("<p style=\"font-family:'Courier New'\"><font color='#818181'>");
        logs.append(df.format(new Date()));
        logs.append("&nbsp&nbsp&nbsp|&nbsp&nbsp&nbsp ");
        logs.append(log);
        logs.append("</font></p>");
    }

    public void addWarning(String log) {
        DateFormat df = new SimpleDateFormat("yy.MM.dd-HH:mm:ss.SSS");
        logs.append("<p style=\"font-family:'Courier New'\"><font color='#000000'>");
        logs.append(df.format(new Date()));
        logs.append("&nbsp&nbsp&nbsp|&nbsp&nbsp&nbsp ");
        logs.append(log);
        logs.append("</font></p>");
    }

    public void addError(String log) {
        DateFormat df = new SimpleDateFormat("yy.MM.dd-HH:mm:ss.SSS");
        logs.append("<p style=\"color:#ED1515;\">");
        logs.append(df.format(new Date()));
        logs.append("&nbsp&nbsp&nbsp|&nbsp&nbsp&nbsp ");
        logs.append(log);
        logs.append("</p>");
    }
}
