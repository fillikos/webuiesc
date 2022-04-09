package de.fillikos.rf2.esctool.view;

import de.fillikos.rf2.esctool.controller.Controller;

import javax.swing.*;
import java.io.File;
import java.io.FileFilter;

public class MainMenu extends JMenuBar {

    public MainMenu() {
        super();
        JMenu menuDatei = new JMenu("Datei");
        JMenuItem itemOpen = new JMenuItem("Öffnen");
        JMenuItem itemClose = new JMenuItem("Schließen");

        itemOpen.addActionListener(e -> {
            FileFilter ff = File::isDirectory;
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
            int rc = chooser.showDialog(null, "rFactor 2 Hauptverzeichnis auswählen");
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
    }
}
