package de.fillikos.rf2.esctool.view;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.esctool.data.esctool.PitVorgang;
import de.fillikos.rf2.esctool.view.config.ModConfig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class ModView {

    private JFrame frame;
    private ArrayList<ModConfig> modConfigList;
    private JComboBox boxMods;

    private JTextField txtModName;
    private JTextField txtTimeBtSg;
    private JLabel lblSekZwSg;
    private JCheckBox cbGridIniErstellen;
    private JCheckBox cbRecordHotlaps;
    private JCheckBox cbRennfreigabe;
    private JCheckBox cbPitByTeam;
    private JCheckBox cbPitByDriver;
    private JCheckBox cbByDriverName;
    private JCheckBox cbDoppelTeam;
    private JLabel lblPitVorgang;
    private JCheckBox cbPit1;
    private JCheckBox cbPit2;
    private JCheckBox cbPit3;
    private JCheckBox cbPit4;
    private JCheckBox cbPit5;
    private JCheckBox cbPit6;
    private JCheckBox cbPit7;
    private JCheckBox cbPit8;

    public ModView() {
        frame = new JFrame();
        frame.setTitle("Mod Management");
        frame.setSize(560, 440);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Controller.setModManagement();
                frame.dispose();
            }
        });

        JButton btnRemove = new JButton("Entfernen");
        btnRemove.addActionListener(e -> {
            System.out.println(boxMods.getSelectedItem());
            for (ModConfig mod : modConfigList) {
                if (mod.getModName().equals(boxMods.getSelectedItem())) {
                    modConfigList.remove(mod);
                }
            }
            refreshModConfigList();
        });

        boxMods = new JComboBox();
        boxMods.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (ModConfig mod : modConfigList) {
                    if (mod.getModName().equals(boxMods.getSelectedItem())) {
                        showCurrentMod(mod);
                    }
                }
            }
        });

        JButton btnSave = new JButton("Speichern");
        btnSave.addActionListener(e -> {
            saveModToList();
            Controller.saveModConfig(modConfigList);
        });

        JButton btnNew = new JButton("Neu ...");
        btnNew.addActionListener(e -> {
            boolean vorhanden = false;
            for (int i = 0; i < boxMods.getItemCount(); i++) {
                if (boxMods.getItemAt(i).equals("Unbenannt")) {
                    vorhanden = true;
                }
            }
            if (!vorhanden) {
                boxMods.addItem("Unbenannt");
                boxMods.setSelectedItem("Unbenannt");
                ModConfig mod = new ModConfig();
                mod.setModName("Unbenannt");
                modConfigList.add(mod);
                showCurrentMod(mod);
            }
        });

        JPanel panCenter = new JPanel(new BorderLayout());
        GridBagConstraints g = new GridBagConstraints();
        panCenter.setLayout(new GridBagLayout());


        txtModName = new JTextField();
        txtModName.setColumns(15);
        txtTimeBtSg = new JTextField();
        txtTimeBtSg.setColumns(4);
        lblSekZwSg = new JLabel("sek zwischen SG");


        cbGridIniErstellen = new JCheckBox("grid.ini erstellen");
        cbRecordHotlaps = new JCheckBox("hotlaps aufzeichnen");
        cbRennfreigabe = new JCheckBox("Rennfreigabe durch Chat");
        cbPitByTeam = new JCheckBox("Boxenplätze durch PitByTeam zuweisen");
        cbPitByDriver = new JCheckBox("Boxenplätze durch PitByDriver zuweisen");
        cbByDriverName = new JCheckBox("Startgruppen anhand Fahrer anstelle Teams");
        cbDoppelTeam = new JCheckBox("Überprüfen auf doppelte Teamfahrzeuge");
        lblPitVorgang = new JLabel("Aufzeichnung von folgenden Vorgängen:");
        cbPit1 = new JCheckBox("Aus der Box fahren");
        cbPit2 = new JCheckBox("ESC auf der Strecke");
        cbPit3 = new JCheckBox("Boxenstopp angeforder");
        cbPit4 = new JCheckBox("Boxenstoppanfrage abgebrochen");
        cbPit5 = new JCheckBox("ESC in der Box");
        cbPit6 = new JCheckBox("Boxenstopp beginn");
        cbPit7 = new JCheckBox("Boxenstopp beendet");
        cbPit8 = new JCheckBox("In die Box gefahren");


        g.fill = GridBagConstraints.NONE;
        g.anchor = GridBagConstraints.WEST;
        g.ipady = 0;
        g.gridx = 0;
        g.gridy = 0;
        g.gridwidth = 3;
        panCenter.add(txtModName, g);
        g.gridx = 0;
        g.gridy = 1;
        panCenter.add(cbGridIniErstellen, g);
        g.gridx = 4;
        panCenter.add(lblPitVorgang, g);
        g.gridx = 0;
        g.gridy = 2;
        panCenter.add(cbRecordHotlaps, g);
        g.gridx = 4;
        panCenter.add(cbPit1, g);
        g.gridx = 0;
        g.gridy = 3;
        panCenter.add(cbRennfreigabe, g);
        g.gridx = 4;
        panCenter.add(cbPit2, g);
        g.gridy = 4;
        g.gridx = 4;
        panCenter.add(cbPit3, g);
        g.gridx = 0;
        g.gridwidth = 1;
        panCenter.add(txtTimeBtSg, g);
        g.gridx = 1;
        g.gridwidth = 2;
        panCenter.add(lblSekZwSg, g);
        g.gridx = 0;
        g.gridy = 5;
        g.gridwidth = 3;
        panCenter.add(cbPitByTeam, g);
        g.gridx = 4;
        panCenter.add(cbPit4, g);
        g.gridx = 0;
        g.gridy = 6;
        panCenter.add(cbPitByDriver, g);
        g.gridx = 4;
        panCenter.add(cbPit5, g);
        g.gridx = 0;
        g.gridy = 7;
        panCenter.add(cbByDriverName, g);
        g.gridx = 4;
        panCenter.add(cbPit6, g);
        g.gridx = 0;
        g.gridy = 8;
        panCenter.add(cbDoppelTeam, g);
        g.gridx = 4;
        panCenter.add(cbPit7, g);
        g.gridx = 4;
        g.gridy = 9;
        panCenter.add(cbPit8, g);


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
        for (ModConfig old : modConfigList) {
            if (old.getModName().equals(txtModName.getText())) {
                modConfigList.remove(old);
            }
        }
        ModConfig mod = new ModConfig();
        mod.setModName(txtModName.getText());
        mod.setTimeBetweenSG(Long.parseLong(txtTimeBtSg.getText()));
        mod.setGridIniErstellen(cbGridIniErstellen.isSelected());
        mod.setRecordHotlaps(cbRecordHotlaps.isSelected());
        mod.setRennfreigabeByChat(cbRennfreigabe.isSelected());
        mod.setAssignPitByTeam(cbPitByTeam.isSelected());
        mod.setAssignPitByDriver(cbPitByDriver.isSelected());
        mod.setByDriverName(cbByDriverName.isSelected());
        mod.setCheckDoppelTeam(cbDoppelTeam.isSelected());
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
        modConfigList.add(mod);
    }

    private void showCurrentMod(ModConfig mod) {
        txtModName.setText(mod.getModName());
        txtTimeBtSg.setText(String.valueOf(mod.getTimeBetweenSG()));
        cbGridIniErstellen.setSelected(mod.isGridIniErstellen());
        cbRecordHotlaps.setSelected(mod.isRecordHotlaps());
        cbRennfreigabe.setSelected(mod.isRennfreigabeByChat());
        cbPitByTeam.setSelected(mod.isAssignPitByTeam());
        cbPitByDriver.setSelected(mod.isAssignPitByDriver());
        cbByDriverName.setSelected(mod.isByDriverName());
        cbDoppelTeam.setSelected(mod.isCheckDoppelTeam());
        cbPit1.setSelected(mod.getPitVorgang().isAus_der_box_gefahren());
        cbPit2.setSelected(mod.getPitVorgang().isEsc_auf_strecke());
        cbPit3.setSelected(mod.getPitVorgang().isBoxenstop_angefordert());
        cbPit4.setSelected(mod.getPitVorgang().isBoxenstop_anforderung_abgebrochen());
        cbPit5.setSelected(mod.getPitVorgang().isEsc_in_der_box());
        cbPit6.setSelected(mod.getPitVorgang().isBoxenstop_beginn());
        cbPit7.setSelected(mod.getPitVorgang().isBoxenstop_ende());
        cbPit8.setSelected(mod.getPitVorgang().isIn_die_box());
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
