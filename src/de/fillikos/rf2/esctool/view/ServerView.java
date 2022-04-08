package de.fillikos.rf2.esctool.view;

import de.fillikos.rf2.esctool.controller.Controller;

import javax.swing.*;
import java.awt.*;

public class ServerView {

    private JFrame frame;


    public ServerView() {
        frame = new JFrame();
        frame.setTitle("Server Management");
        frame.setSize(390, 240);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((int) (screenSize.getWidth() / 2 - frame.getWidth() / 2),
                (int) (screenSize.getHeight() / 2 - frame.getHeight() / 2));

        JButton btnClose = new JButton("Schließen");
        btnClose.addActionListener(e -> {
            Controller.setServerManagement();
            frame.dispose();
        });
        Container contentPane = frame.getContentPane();
        contentPane.add(btnClose, BorderLayout.NORTH);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
}
