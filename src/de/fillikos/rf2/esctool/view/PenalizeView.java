package de.fillikos.rf2.esctool.view;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PenalizeView {
    private JFrame frame;
    private String driverName;

    public PenalizeView() {
        frame = new JFrame("Penalize");
        frame.setTitle("Penalize");
        frame.setSize(100, 160);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GridBagLayout gridBagLayout = new GridBagLayout();
        JPanel panPenalize = new JPanel(gridBagLayout);
        panPenalize.setBorder(BorderFactory.createTitledBorder(new TitledBorder(""), "Penalize Vehicle",1, 0, new Font("Consolas", Font.PLAIN, 11)));

        JButton btnRemove = new JButton("remove All");
        btnRemove.addActionListener(e -> Controller.sendChat("/subpenalty 3 " + driverName));

        JButton btnAddDT = new JButton("add DT");
        btnAddDT.addActionListener(e -> Controller.sendChat("/addpenalty -1 " + driverName));

        JTextField txtTimePenalty = new JTextField();
        JButton btnAddSnG = new JButton("add SnG");
        btnAddSnG.addActionListener(e -> {
            int sekunden = Integer.parseInt(txtTimePenalty.getText());
            if (!txtTimePenalty.getText().equals("")) {
                while (sekunden > 60) {
                    Controller.sendChat("/addpenalty 60 " + driverName);
                    sekunden = sekunden - 60;
                }
                Controller.sendChat("/addpenalty " + sekunden + " " + driverName);
            }
        });

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = 0;
        c.gridx = 0;
        c.weightx = 0.5;
        panPenalize.add(txtTimePenalty, c);
        c.gridy++;
        panPenalize.add(btnAddSnG, c);
        c.gridy++;
        panPenalize.add(btnAddDT, c);
        c.gridy++;
        panPenalize.add(btnRemove, c);

        Container contentPane = frame.getContentPane();
        contentPane.add(panPenalize);
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
        frame.setTitle("Penalize " + driverName);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
}
