package de.fillikos.rf2.esctool.view;

import de.fillikos.rf2.esctool.controller.Controller;
import de.fillikos.rf2.service.webui.httpss.Connection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView {

    private JFrame frame;
    private boolean startload = false;
    private JLabel text;
    private JTextField txtLeaderGrid2 = new JTextField();

    public MainView() {
        frame = new JFrame();
        frame.setTitle("ESC-Tool");
        frame.setSize(390, 240);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((int) (screenSize.getWidth() / 2 - frame.getWidth() / 2),
                (int) (screenSize.getHeight() / 2 - frame.getHeight() / 2));

        JPanel panSouth = new JPanel(new FlowLayout(FlowLayout.LEADING));
        panSouth.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        String serverAuswahl[] = {"VRrF2LN R", "VRrF2LN T", "VRrF2LN L", "localhost"};
        JComboBox boxServer = new JComboBox(serverAuswahl);

        JButton btnStart = new JButton("start");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (startload) {
                    startload = false;
                    btnStart.setText("Start");
                    Controller.stopUpdateServerData();
                } else {
                    startload = true;
                    btnStart.setText("Stopp");
                    switch (boxServer.getSelectedIndex()) {
                        case 0:
                            Controller.setServer(new Connection("http://89.163.146.67:", "5725"));
                            break;
                        case 1:
                            Controller.setServer(new Connection("http://89.163.146.67:", "5735"));
                            break;
                        case 2:
                            Controller.setServer(new Connection("http://89.163.146.67:", "5715"));
                            break;
                        case 3:
                            Controller.setServer(new Connection("http://localhost:", "5397"));
                            break;
                    }
                    Controller.startUpdateServerData();
                }
            }
        });
        panSouth.add(btnStart);
        panSouth.add(boxServer);

        txtLeaderGrid2.setText("1");
        txtLeaderGrid2.setColumns(3);
        JButton btnSetLeaderGrid2 = new JButton("create grid");
//        btnSetLeaderGrid2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        //1. Alle Q1.xml Dateien vom heutigen Tag aus dem Results Verzeichnis sammeln
//                        DateFormat df = new SimpleDateFormat("yyyy_MM_dd_");
//                        String timeString = df.format(new Date());
//
//                        FileFilter ff = new FileFilter() {
//                            @Override
//                            public boolean accept(File pathname) {
//                                if (pathname.toString().contains("Q1.xml") &&
//                                        pathname.toString().contains(timeString)) {
//                                    return true;
//                                }
//                                return false;
//                            }
//                        };
//
//                        //2. Die größte Datei wird verwendet
//                        File[] files = esctool.getQualixml().listFiles(ff);
//                        File file = new File("D:\\");
//                        if (files.length != 0) {
//                            file = files[0];
//                            if (files.length > 1) {
//                                for (File f : files) {
//                                    if (f.length() > file.length()) {
//                                        file = f;
//                                    }
//                                }
//                            }
//                        }
//                        //3. Ist eine QualiXML vorhanden und ausgewählt wird die Grid.ini und die Strafen.ini erstellt
//                        DataController dc = new DataController();
//                        if (!file.toString().equals("D:\\")) {
//                            txtLeaderGrid2.setText("0");
//                            System.out.println(file.toString());
//                            dc.load24h(file, esctool.getServer(), txtLeaderGrid2);
//                            System.out.println("grid.ini und strafen.ini wurden erstellt");
//                            //4. Nach dem erstellen wird die grid.ini ausgeführt
////                                        server.sendchat("/batch grid.ini");
//                            System.out.println("grid.ini wurde ausgeführt");
//                        }
//                    }
//                }).start();
//            }
//        });

        panSouth.add(btnSetLeaderGrid2);
        panSouth.add(txtLeaderGrid2);

        JPanel panNorth = new JPanel(new FlowLayout(FlowLayout.LEADING));
        panNorth.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        text = new JLabel();
        text.setText("<html><body>hallo<br>" +
                "Bitte den Rennserver auswählen,<br>" +
                "</body></html>");
        panNorth.add(text);

        Container contentPane = frame.getContentPane();
        contentPane.add(panNorth, BorderLayout.NORTH);
        contentPane.add(panSouth, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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

    public JTextField getTxtLeaderGrid2() {
        return txtLeaderGrid2;
    }

    public void setTxtLeaderGrid2(JTextField txtLeaderGrid2) {
        this.txtLeaderGrid2 = txtLeaderGrid2;
    }
}
