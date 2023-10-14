package de.fillikos.rf2.esctool.view;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.esctool.data.esctool.PitVorgang;
import de.fillikos.rf2.esctool.view.config.ModConfig;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class ModView {

    private JFrame frame;
    private ArrayList<ModConfig> modConfigList;
    private JComboBox boxMods;
    private final DefaultTableModel dtm;
    private final JTable tabSG;
    private final DefaultTableModel dtmTD;
    private final JTable tabChatTD;
    private final DefaultTableModel dtmPractise;
    private final JTable tabChatPractise;
    private final DefaultTableModel dtmWarmUp;
    private final JTable tabChatWarmUp;
    private final DefaultTableModel dtmQuali;
    private final JTable tabChatQuali;
    private final DefaultTableModel dtmRace;
    private final JTable tabChatRace;

    private JTextField txtModName;
    private final JTextField txtTimeBtSg;
    private final JTextField txtTimeToDoStrafe;
    private final JTextField txtMinStartPos;
    private final JTextField txtMaxStartPos;
    private final JCheckBox cbGridIniErstellen;
    private final JCheckBox cbRecordHotlaps;
    private final JCheckBox cbRennfreigabe;
    private final JCheckBox cbEinfuehrungsrunde;
    private final JCheckBox cbPitByTeam;
    private final JCheckBox cbPitByDriver;
    private final JCheckBox cbByDriverName;
    private final JCheckBox cbDoppelTeam;
    private final JCheckBox cbPit1;
    private final JCheckBox cbPit2;
    private final JCheckBox cbPit3;
    private final JCheckBox cbPit4;
    private final JCheckBox cbPit5;
    private final JCheckBox cbPit6;
    private final JCheckBox cbPit7;
    private final JCheckBox cbPit8;
    private final JCheckBox cbPit9;
    private final JCheckBox cbPit10;
    private final JCheckBox cbStrafenLaden;
    private final JTabbedPane tpNachrichten;
    private final JPanel panCenter;

    public ModView() {
        frame = new JFrame();
        frame.setTitle("Mod Management");
        frame.setSize(640, 540);
//        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                for (ModConfig mod : modConfigList) {
                    if (mod.getModName().equals("Unbenannt")) {
                        modConfigList.remove(mod);
                        refreshModConfigList();
                        saveModToList();
                        Controller.saveModConfig(modConfigList);
                        break;
                    }
                }
                Controller.setModManagement();
                frame.dispose();
            }
        });

        JButton btnRemove = new JButton("Entfernen");
        btnRemove.addActionListener(e -> {
            modConfigList.removeIf(mod -> mod.getModName().equals(boxMods.getSelectedItem()));
            refreshModConfigList();
        });

        JButton btnAddSg = new JButton("+SG");
        btnAddSg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = dtm.getRowCount();
                dtm.addRow(new String[]{String.valueOf(i + 1), ""});
            }
        });

        JButton btnRemSg = new JButton("-SG");
        btnRemSg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = dtm.getRowCount();
                if (i > 0) {
                    dtm.removeRow(i - 1);
                }
            }
        });
        JButton btnAddCN = new JButton("+Chat");
        btnAddCN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (tpNachrichten.getSelectedIndex()) {
                    case 0:
                        dtmTD.addRow(new String[]{"", ""});
                        break;
                    case 1:
                        dtmPractise.addRow(new String[]{"", ""});
                        break;
                    case 2:
                        dtmQuali.addRow(new String[]{"", ""});
                        break;
                    case 3:
                        dtmWarmUp.addRow(new String[]{"", ""});
                        break;
                    case 4:
                        dtmRace.addRow(new String[]{"", ""});
                        break;
                }
            }
        });

        JButton btnRemCN = new JButton("-Chat");
        btnRemCN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i;
                switch (tpNachrichten.getSelectedIndex()) {
                    case 0:
                        i = dtmTD.getRowCount();
                        if (i > 0) {
                            if (tabChatTD.getSelectedRow() == -1) {
                                dtmTD.removeRow(i - 1);
                            } else {
                                dtmTD.removeRow(tabChatTD.getSelectedRow());
                            }
                        }
                        break;
                    case 1:
                        i = dtmPractise.getRowCount();
                        if (i > 0) {
                            if (tabChatPractise.getSelectedRow() == -1) {
                                dtmPractise.removeRow(i - 1);
                            } else {
                                dtmPractise.removeRow(tabChatPractise.getSelectedRow());
                            }
                        }
                        break;
                    case 2:
                        i = dtmQuali.getRowCount();
                        if (i > 0) {
                            if (tabChatQuali.getSelectedRow() == -1) {
                                dtmQuali.removeRow(i - 1);
                            } else {
                                dtmQuali.removeRow(tabChatQuali.getSelectedRow());
                            }
                        }
                        break;
                    case 3:
                        i = dtmWarmUp.getRowCount();
                        if (i > 0) {
                            if (tabChatWarmUp.getSelectedRow() == -1) {
                                dtmWarmUp.removeRow(i - 1);
                            } else {
                                dtmWarmUp.removeRow(tabChatWarmUp.getSelectedRow());
                            }
                        }
                        break;
                    case 4:
                        i = dtmRace.getRowCount();
                        if (i > 0) {
                            if (tabChatRace.getSelectedRow() == -1) {
                                dtmRace.removeRow(i - 1);
                            } else {
                                dtmRace.removeRow(tabChatRace.getSelectedRow());
                            }
                        }
                        break;
                }
            }
        });

        boxMods = new JComboBox();
        boxMods.addActionListener(e -> {
            for (ModConfig mod : modConfigList) {
                if (mod.getModName().equals(boxMods.getSelectedItem())) {
                    showCurrentMod(mod);
                }
            }
        });

        JButton btnSave = new JButton("Speichern");
        btnSave.addActionListener(e -> {
            String tempMod = txtModName.getText();
            for (ModConfig mod: modConfigList) {
                if (mod.getModName().equals("Unbenannt") && !txtModName.getText().equals("Unbenannt")) {
                    modConfigList.remove(mod);
                    break;
                }
            }
            saveModToList();
            Controller.saveModConfig(modConfigList);
            JOptionPane.showMessageDialog(frame,
                    "Die Mods wurden erfolgreich gespeichert.");
            setModConfigList(modConfigList);
            boxMods.setSelectedItem(tempMod);
        });

        JButton btnNew = new JButton("Neu ...");
        btnNew.addActionListener(e -> {
            boolean vorhanden = false;
            for (int i = 0; i < boxMods.getItemCount(); i++) {
                if (boxMods.getItemAt(i).equals("Unbenannt")) {
                    vorhanden = true;
                    break;
                }
            }
            if (!vorhanden) {
                ModConfig mod = new ModConfig();
                mod.setModName("Unbenannt");
                modConfigList.add(mod);
                refreshModConfigList();
                showCurrentMod(mod);
                boxMods.setSelectedItem("Unbenannt");
            }
        });

        panCenter = new JPanel(new BorderLayout());
        GridBagConstraints g = new GridBagConstraints();
        panCenter.setLayout(new GridBagLayout());

        String[] columns = new String[]{"SG", "Klassen (trennen mit KOMMA)"};
        dtm = new DefaultTableModel(columns, 0);
        tabSG = new JTable(dtm);
        JScrollPane scrModTab = new JScrollPane(tabSG);
        scrModTab.setPreferredSize(new Dimension(240, 100));

        TableColumn column;
        for (int i = 0; i < columns.length; i++) {
            column = tabSG.getColumnModel().getColumn(i);
            int width;
            switch (i) {
                case 0:
                    width = 20;
                    break;
                case 1:
                    width = 170;
                    break;
                default:
                    width = 7;
                    break;
            }
            column.setPreferredWidth(width);
        }

        String[] columnsChat = new String[]{"Nach sek", "Chatnachricht"};
        dtmTD = new DefaultTableModel(columnsChat, 0);
        tabChatTD = new JTable(dtmTD);
        JScrollPane scrModTabChatTD = new JScrollPane(tabChatTD);
        scrModTabChatTD.setPreferredSize(new Dimension(240, 72));

        TableColumn columnChatTD;
        for (int i = 0; i < columnsChat.length; i++) {
            columnChatTD = tabChatTD.getColumnModel().getColumn(i);
            int width;
            switch (i) {
                case 0:
                    width = 20;
                    break;
                case 1:
                    width = 170;
                    break;
                default:
                    width = 7;
                    break;
            }
            columnChatTD.setPreferredWidth(width);
        }

        dtmPractise = new DefaultTableModel(columnsChat, 0);
        tabChatPractise = new JTable(dtmPractise);
        JScrollPane scrModTabChatPractise = new JScrollPane(tabChatPractise);
        scrModTabChatPractise.setPreferredSize(new Dimension(240, 72));

        TableColumn columnChatPractise;
        for (int i = 0; i < columnsChat.length; i++) {
            columnChatPractise = tabChatPractise.getColumnModel().getColumn(i);
            int width;
            switch (i) {
                case 0:
                    width = 20;
                    break;
                case 1:
                    width = 170;
                    break;
                default:
                    width = 7;
                    break;
            }
            columnChatPractise.setPreferredWidth(width);
        }

        dtmQuali = new DefaultTableModel(columnsChat, 0);
        tabChatQuali = new JTable(dtmQuali);
        JScrollPane scrModTabChatQuali = new JScrollPane(tabChatQuali);
        scrModTabChatQuali.setPreferredSize(new Dimension(240, 72));

        TableColumn columnChatQuali;
        for (int i = 0; i < columnsChat.length; i++) {
            columnChatQuali = tabChatQuali.getColumnModel().getColumn(i);
            int width;
            switch (i) {
                case 0:
                    width = 20;
                    break;
                case 1:
                    width = 170;
                    break;
                default:
                    width = 7;
                    break;
            }
            columnChatQuali.setPreferredWidth(width);
        }

        dtmWarmUp = new DefaultTableModel(columnsChat, 0);
        tabChatWarmUp = new JTable(dtmWarmUp);
        JScrollPane scrModTabChatWarmUp = new JScrollPane(tabChatWarmUp);
        scrModTabChatWarmUp.setPreferredSize(new Dimension(240, 72));

        TableColumn columnChatWarmUp;
        for (int i = 0; i < columnsChat.length; i++) {
            columnChatWarmUp = tabChatWarmUp.getColumnModel().getColumn(i);
            int width;
            switch (i) {
                case 0:
                    width = 20;
                    break;
                case 1:
                    width = 170;
                    break;
                default:
                    width = 7;
                    break;
            }
            columnChatWarmUp.setPreferredWidth(width);
        }

        dtmRace = new DefaultTableModel(columnsChat, 0);
        tabChatRace = new JTable(dtmRace);
        JScrollPane scrModTabChatRace = new JScrollPane(tabChatRace);
        scrModTabChatRace.setPreferredSize(new Dimension(240, 72));

        TableColumn columnChatRace;
        for (int i = 0; i < columnsChat.length; i++) {
            columnChatRace = tabChatRace.getColumnModel().getColumn(i);
            int width;
            switch (i) {
                case 0:
                    width = 20;
                    break;
                case 1:
                    width = 170;
                    break;
                default:
                    width = 7;
                    break;
            }
            columnChatRace.setPreferredWidth(width);
        }


        tpNachrichten = new JTabbedPane
                (JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);

        // Hier werden die JPanels als Registerkarten hinzugefügt
        tpNachrichten.addTab("TD", scrModTabChatTD);
        tpNachrichten.addTab("Practise", scrModTabChatPractise);
        tpNachrichten.addTab("Quali", scrModTabChatQuali);
        tpNachrichten.addTab("WarmUp", scrModTabChatWarmUp);
        tpNachrichten.addTab("Race", scrModTabChatRace);


        txtModName = new JTextField();
        txtModName.setColumns(15);
        txtTimeBtSg = new JTextField();
        txtTimeBtSg.setColumns(4);
        JLabel lblSekZwSg = new JLabel("sek zwischen Startgruppen");
        txtTimeToDoStrafe = new JTextField();
        txtTimeToDoStrafe.setColumns(4);
        JLabel lblTimeStrafe = new JLabel("sek wann strafen.ini laden");
        txtMinStartPos = new JTextField();
        txtMinStartPos.setColumns(4);
        txtMaxStartPos = new JTextField();
        txtMaxStartPos.setColumns(4);
        JLabel lblMinStartPos = new JLabel("- vor + nach SZL");


        cbDoppelTeam = new JCheckBox("Prüfe auf doppelte Teamfahrzeuge");
        cbPitByTeam = new JCheckBox("Boxenplätze durch PitByTeam zuweisen");
        cbPitByDriver = new JCheckBox("Boxenplätze durch PitByDriver zuweisen");
        cbGridIniErstellen = new JCheckBox("grid.ini erstellen");
        cbRecordHotlaps = new JCheckBox("Hotlaps aufzeichnen");
        cbByDriverName = new JCheckBox("Teamevents");
        // Zeit zwischen Startgruppen
        cbRennfreigabe = new JCheckBox("Rennfreigabe durch Chat");
        cbEinfuehrungsrunde = new JCheckBox("Freigabe der Einführungsrunde Chat");

        cbPitByDriver.addActionListener(e -> {
            if (cbPitByDriver.isSelected()) {
                cbPitByTeam.setSelected(false);
            }
        });
        cbPitByTeam.addActionListener(e -> {
            if (cbPitByTeam.isSelected()) {
                cbPitByDriver.setSelected(false);
            }
        });

        JLabel lblPitVorgang = new JLabel("Aufzeichnung von folgenden Vorgängen:");
        cbPit1 = new JCheckBox("Aus der Box fahren");
        cbPit2 = new JCheckBox("ESC auf der Strecke");
        cbPit3 = new JCheckBox("Boxenstopp angefordert");
        cbPit4 = new JCheckBox("Boxenstoppanfrage abgebrochen");
        cbPit5 = new JCheckBox("ESC in der Box");
        cbPit6 = new JCheckBox("Boxenstopp beginnt");
        cbPit7 = new JCheckBox("Boxenstopp beendet");
        cbPit8 = new JCheckBox("In die Box gefahren");
        cbPit9 = new JCheckBox("Server Verlassen überwachen");
        cbPit10 = new JCheckBox("Server Verlassen Nachricht");
        cbStrafenLaden = new JCheckBox("strafen.ini laden nach X sek");


        g.fill = GridBagConstraints.NONE;
        g.anchor = GridBagConstraints.WEST;
        g.ipady = 0;
        g.gridx = 0;
        g.gridy = 0;
        g.gridwidth = 3;
        panCenter.add(txtModName, g);

        g.gridx = 0;
        g.gridy = 1;
        panCenter.add(cbDoppelTeam, g);
        g.gridx = 4;
        panCenter.add(lblPitVorgang, g);

        g.gridx = 0;
        g.gridy = 2;
        panCenter.add(cbPitByTeam, g);
        g.gridx = 4;
        panCenter.add(cbPit1, g);

        g.gridx = 0;
        g.gridy = 3;
        panCenter.add(cbPitByDriver, g);
        g.gridx = 4;
        panCenter.add(cbPit2, g);

        g.gridx = 0;
        g.gridy = 4;
        panCenter.add(cbGridIniErstellen, g);
        g.gridx = 4;
        panCenter.add(cbPit3, g);

        g.gridx = 0;
        g.gridy = 5;
        panCenter.add(cbRecordHotlaps, g);
        g.gridx = 4;
        panCenter.add(cbPit4, g);

        g.gridx = 0;
        g.gridy = 6;
        panCenter.add(cbByDriverName, g);
        g.gridx = 3;
        panCenter.add(cbPit5, g);

        g.gridy = 7;
        g.gridx = 0;
        g.gridwidth = 1;
        panCenter.add(txtTimeBtSg, g);
        g.gridx = 1;
        g.gridwidth = 2;
        panCenter.add(lblSekZwSg, g);
        g.gridwidth = 3;
        g.gridx = 4;
        panCenter.add(cbPit6, g);

        g.gridy = 8;
        g.gridx = 0;
        panCenter.add(txtMinStartPos, g);
        g.gridx = 1;
        g.gridwidth = 0;
        panCenter.add(txtMaxStartPos, g);
        g.gridx = 2;
        g.gridwidth = 0;
        panCenter.add(lblMinStartPos, g);
        g.gridx = 4;
        panCenter.add(cbPit7, g);

        g.gridy = 9;
        g.gridx = 0;
        panCenter.add(cbRennfreigabe, g);
        g.gridx = 4;
        panCenter.add(cbPit8, g);

        g.gridy = 10;
        g.gridx = 0;
        panCenter.add(cbEinfuehrungsrunde, g);
        g.gridx = 4;
        panCenter.add(cbPit9, g);

        g.gridy = 11;
        g.gridx = 0;
        panCenter.add(txtTimeToDoStrafe, g);

        g.gridx = 1;
        g.gridwidth = 2;
        panCenter.add(cbStrafenLaden, g);
        g.gridx = 4;
        panCenter.add(cbPit10, g);

//        g.gridy = 12;
//        g.gridx = 0;
//        panCenter.add(, g);

        g.gridy = 13;
        g.gridx = 0;
        g.gridwidth = 3;
        g.gridheight = 2;
        panCenter.add(scrModTab, g);
        g.gridx = 4;
        panCenter.add(tpNachrichten, g);
        g.gridwidth = 1;
        g.gridheight = 1;

        g.gridy = 16;
        g.gridx = 0;
        panCenter.add(btnAddSg, g);
        g.gridx = 1;
        panCenter.add(btnRemSg, g);
        g.gridx = 4;
        panCenter.add(btnAddCN, g);
        g.gridx = 5;
        panCenter.add(btnRemCN, g);

        JPanel flowSouth = new JPanel(new FlowLayout());
        flowSouth.add(btnNew);
        flowSouth.add(btnRemove);
        flowSouth.add(btnSave);

        Container contentPane = frame.getContentPane();
        contentPane.add(boxMods, BorderLayout.NORTH);
        contentPane.add(panCenter, BorderLayout.CENTER);
        contentPane.add(flowSouth, BorderLayout.SOUTH);
    }

    private void refreshModConfigList() {
        boxMods.removeAllItems();
        for (ModConfig mod : modConfigList) {
            boxMods.addItem(mod.getModName());
        }
    }

    private void saveModToList() {
        tabSG.getDefaultEditor(Object.class).stopCellEditing();
        tabChatTD.getDefaultEditor(Object.class).stopCellEditing();
        tabChatPractise.getDefaultEditor(Object.class).stopCellEditing();
        tabChatQuali.getDefaultEditor(Object.class).stopCellEditing();
        tabChatWarmUp.getDefaultEditor(Object.class).stopCellEditing();
        tabChatRace.getDefaultEditor(Object.class).stopCellEditing();
        modConfigList.removeIf(old -> old.getModName().equals(txtModName.getText()));
        ModConfig mod = new ModConfig();
        mod.setModName(txtModName.getText());
        mod.setTimeBetweenSG(Long.parseLong(txtTimeBtSg.getText()));
        mod.setMinStartPos(Integer.parseInt(txtMinStartPos.getText()));
        mod.setMaxStartPos(Integer.parseInt(txtMaxStartPos.getText()));
        mod.setGridIniErstellen(cbGridIniErstellen.isSelected());
        mod.setRecordHotlaps(cbRecordHotlaps.isSelected());
        mod.setRennfreigabeByChat(cbRennfreigabe.isSelected());
        mod.setFreigabeEinfuehrungsrundeChat(cbEinfuehrungsrunde.isSelected());
        mod.setAssignPitByTeam(cbPitByTeam.isSelected());
        mod.setAssignPitByDriver(cbPitByDriver.isSelected());
        mod.setTeamEvent(cbByDriverName.isSelected());
        mod.setCheckDoppelTeam(cbDoppelTeam.isSelected());
        mod.setTimeToDoStrafen(Long.parseLong(txtTimeToDoStrafe.getText()));
        mod.setStrafenLaden(cbStrafenLaden.isSelected());
        mod.setServerVerlassen(cbPit9.isSelected());
        mod.setServerVerlassenMessage(cbPit10.isSelected());
        PitVorgang pitVorgang = new PitVorgang();
        pitVorgang.setAus_der_box_gefahren(cbPit1.isSelected());
        pitVorgang.setEsc_auf_strecke(cbPit2.isSelected());
        pitVorgang.setBoxenstop_angefordert(cbPit3.isSelected());
        pitVorgang.setBoxenstop_anforderung_abgebrochen(cbPit4.isSelected());
        pitVorgang.setEsc_in_der_box(cbPit5.isSelected());
        pitVorgang.setBoxenstop_beginn(cbPit6.isSelected());
        pitVorgang.setBoxenstop_ende(cbPit7.isSelected());
        pitVorgang.setIn_die_box(cbPit8.isSelected());
        mod.setPitVorgang(pitVorgang);

        ArrayList<ArrayList<String>> startgruppenList = new ArrayList<>();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            String klassen = dtm.getValueAt(i, 1).toString();
            String[] klasse = klassen.split(",");
            ArrayList<String> klassenListe = new ArrayList<>(Arrays.asList(klasse));
            startgruppenList.add(klassenListe);
        }
        if (dtm.getRowCount() == 0) {
            ArrayList<String> klassenListe = new ArrayList<>();
            klassenListe.add("ALL");
            startgruppenList.add(klassenListe);
        }
        mod.setStartgruppeClass(startgruppenList);

        ArrayList<ArrayList<String>> nachrichtenGesamt = new ArrayList<>();
        ArrayList<String> nachrichtenTD = new ArrayList<>();
        for (int i = 0; i < dtmTD.getRowCount(); i++) {
            nachrichtenTD.add("TD==>" + dtmTD.getValueAt(i, 0) + "==>" + dtmTD.getValueAt(i, 1));
        }
        ArrayList<String> nachrichtenPractise = new ArrayList<>();
        for (int i = 0; i < dtmPractise.getRowCount(); i++) {
            nachrichtenPractise.add("Practise==>" + dtmPractise.getValueAt(i, 0) + "==>" + dtmPractise.getValueAt(i, 1));
        }
        ArrayList<String> nachrichtenQuali = new ArrayList<>();
        for (int i = 0; i < dtmQuali.getRowCount(); i++) {
            nachrichtenQuali.add("Quali==>" + dtmQuali.getValueAt(i, 0) + "==>" + dtmQuali.getValueAt(i, 1));
        }
        ArrayList<String> nachrichtenWarmUp = new ArrayList<>();
        for (int i = 0; i < dtmWarmUp.getRowCount(); i++) {
            nachrichtenWarmUp.add("WarmUp==>" + dtmWarmUp.getValueAt(i, 0) + "==>" + dtmWarmUp.getValueAt(i, 1));
        }
        ArrayList<String> nachrichtenRace = new ArrayList<>();
        for (int i = 0; i < dtmRace.getRowCount(); i++) {
            nachrichtenRace.add("Race==>" + dtmRace.getValueAt(i, 0) + "==>" + dtmRace.getValueAt(i, 1));
        }
        nachrichtenGesamt.add(nachrichtenTD);
        nachrichtenGesamt.add(nachrichtenPractise);
        nachrichtenGesamt.add(nachrichtenQuali);
        nachrichtenGesamt.add(nachrichtenWarmUp);
        nachrichtenGesamt.add(nachrichtenRace);
        mod.setManuelleNachrichten(nachrichtenGesamt);
        modConfigList.add(mod);
    }

    private void showCurrentMod(ModConfig mod) {
        txtModName.setText(mod.getModName());
        txtTimeBtSg.setText(String.valueOf(mod.getTimeBetweenSG()));
        txtTimeToDoStrafe.setText(String.valueOf(mod.getTimeToDoStrafen()));
        txtMinStartPos.setText(String.valueOf(mod.getMinStartPos()));
        txtMaxStartPos.setText(String.valueOf(mod.getMaxStartPos()));
        cbGridIniErstellen.setSelected(mod.isGridIniErstellen());
        cbRecordHotlaps.setSelected(mod.isRecordHotlaps());
        cbRennfreigabe.setSelected(mod.isRennfreigabeByChat());
        cbEinfuehrungsrunde.setSelected(mod.isFreigabeEinfuehrungsrundeChat());
        cbPitByTeam.setSelected(mod.isAssignPitByTeam());
        cbPitByDriver.setSelected(mod.isAssignPitByDriver());
        cbByDriverName.setSelected(mod.isTeamEvent());
        cbDoppelTeam.setSelected(mod.isCheckDoppelTeam());
        cbStrafenLaden.setSelected(mod.isStrafenLaden());
        cbPit9.setSelected(mod.isServerVerlassen());
        cbPit10.setSelected(mod.isServerVerlassenMessage());
        cbPit1.setSelected(mod.getPitVorgang().isAus_der_box_gefahren());
        cbPit2.setSelected(mod.getPitVorgang().isEsc_auf_strecke());
        cbPit3.setSelected(mod.getPitVorgang().isBoxenstop_angefordert());
        cbPit4.setSelected(mod.getPitVorgang().isBoxenstop_anforderung_abgebrochen());
        cbPit5.setSelected(mod.getPitVorgang().isEsc_in_der_box());
        cbPit6.setSelected(mod.getPitVorgang().isBoxenstop_beginn());
        cbPit7.setSelected(mod.getPitVorgang().isBoxenstop_ende());
        cbPit8.setSelected(mod.getPitVorgang().isIn_die_box());
        if (tabSG.getRowCount() > 0) {
            for (int i = tabSG.getRowCount(); i > 0; i--) {
                dtm.removeRow(i - 1);
            }
        }
        int i = 1;
        for (ArrayList<String> klassen : mod.getStartgruppeClass()) {
            StringBuilder klassenString = new StringBuilder();
            for (String klasse : klassen) {
                klassenString.append(klasse);
                klassenString.append(",");
            }
            klassenString.deleteCharAt(klassenString.length() - 1);
            dtm.addRow(new String[]{String.valueOf(i++), klassenString.toString()});
        }

        if (tabChatTD.getRowCount() > 0) {
            for (i = tabChatTD.getRowCount(); i > 0; i--) {
                dtmTD.removeRow(i - 1);
            }
        }
        if (tabChatPractise.getRowCount() > 0) {
            for (i = tabChatPractise.getRowCount(); i > 0; i--) {
                dtmPractise.removeRow(i - 1);
            }
        }
        if (tabChatQuali.getRowCount() > 0) {
            for (i = tabChatQuali.getRowCount(); i > 0; i--) {
                dtmQuali.removeRow(i - 1);
            }
        }
        if (tabChatWarmUp.getRowCount() > 0) {
            for (i = tabChatWarmUp.getRowCount(); i > 0; i--) {
                dtmWarmUp.removeRow(i - 1);
            }
        }
        if (tabChatRace.getRowCount() > 0) {
            for (i = tabChatRace.getRowCount(); i > 0; i--) {
                dtmRace.removeRow(i - 1);
            }
        }
        for (ArrayList<String> eintraege : mod.getManuelleNachrichten()) {
            for (String eintrag : eintraege) {
                String[] elemente = eintrag.split("==>");
                if (elemente[0].equals("TD")) {
                    dtmTD.addRow(new String[]{elemente[1], elemente[2]});
                }
                if (elemente[0].equals("Practise")) {
                    dtmPractise.addRow(new String[]{elemente[1], elemente[2]});
                }
                if (elemente[0].equals("Quali")) {
                    dtmQuali.addRow(new String[]{elemente[1], elemente[2]});
                }
                if (elemente[0].equals("WarmUp")) {
                    dtmWarmUp.addRow(new String[]{elemente[1], elemente[2]});
                }
                if (elemente[0].equals("Race")) {
                    dtmRace.addRow(new String[]{elemente[1], elemente[2]});
                }
            }
        }
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public ArrayList<ModConfig> getModConfigList() {
        return modConfigList;
    }

    public void setModConfigList(ArrayList<ModConfig> modConfigList) {
        boxMods.removeAllItems();
        this.modConfigList = modConfigList;
        for (ModConfig mod : modConfigList) {
            boxMods.addItem(mod.getModName());
        }
    }

    public JComboBox getBoxMods() {
        return boxMods;
    }

    public void setBoxMods(JComboBox boxMods) {
        this.boxMods = boxMods;
    }
}
