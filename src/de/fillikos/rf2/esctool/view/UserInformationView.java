package de.fillikos.rf2.esctool.view;

import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class UserInformationView {

    private JFrame frame;
    private final JPanel panUser;
    private final String selectedValue;

    private final Font consolas = new Font("Consolas", Font.PLAIN, 11);

    public UserInformationView(String selectedValue, Point location) {
        this.selectedValue = selectedValue;
        frame = new JFrame(selectedValue);
        frame.setSize(350, 450);
        frame.setLocation(location);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{120,230};
        panUser = new JPanel(gridBagLayout);
        panUser.setBorder(BorderFactory.createTitledBorder(new TitledBorder(""), selectedValue,1, 0, consolas));

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0,0,0,5);
        c.gridy = 0;
        c.gridx = 0;
        c.weightx = 0.5;
        panUser.add(newLabel("driverName:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("vehicleName:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("fullTeamName:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("pitGroup:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("carClass:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("slotID:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("finishStatus:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("vehicleFilename:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("steamID:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("carNumber:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("serverScored:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("pitState:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("pitting:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("penalties:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("pitstops:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("lapDistance:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("lapsCompleted:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("sector:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("bestLapTime:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        c.gridy++;
        c.gridx = 0;
        panUser.add(newLabel("lastLapTime:", JLabel.RIGHT), c);
        c.gridx = 1;
        panUser.add(newLabel("", JLabel.LEFT),c);

        frame.getContentPane().add(panUser);
        frame.setVisible(true);
    }

    private JLabel newLabel(String text, int allignement) {
        JLabel label = new JLabel(text, allignement);
        label.setFont(consolas);
        return label;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public void updateData(User[] users) {
        User user = null;
        for (User u: users) {
            if (u.getDriverName().equals(selectedValue)) {
                user = u;
            }
        }
        if (user != null) {
            int i = 0;
            for (Object o: panUser.getComponents()) {
                JLabel label = (JLabel) o;
                String text = label.getText();

                switch (i) {
                    case 1: text = user.getDriverName(); break;
                    case 3: text = user.getVehicleName(); break;
                    case 5: text = user.getFullTeamName(); break;
                    case 7: text = user.getPitGroup(); break;
                    case 9: text = user.getCarClass(); break;
                    case 11: text = user.getSlotID(); break;
                    case 13: text = user.getFinishStatus(); break;
                    case 15: text = user.getVehicleFilename(); break;
                    case 17: text = user.getSteamID(); break;
                    case 19: text = user.getCarNumber(); break;
                    case 21: text = user.getServerScored(); break;
                    case 23: text = user.getPitState(); break;
                    case 25: text = user.getPitting(); break;
                    case 27: text = user.getPenalties(); break;
                    case 29: text = user.getPitstops(); break;
                    case 31: text = user.getLapDistance(); break;
                    case 33: text = user.getLapsCompleted(); break;
                    case 35: text = user.getSector(); break;
                    case 37: text = user.getBestLapTime(); break;
                    case 39: text = user.getLastLapTime(); break;
                    default: break;
                }
                if (!label.getText().equals(text)) {
                    label.setText(text);
                }

                i++;
            }
        }
    }
}
