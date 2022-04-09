package de.fillikos.rf2.esctool.view.config;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class ViewConfig {

    private Point point = new Point();

    public ViewConfig() {

    }

    public void viewPosition(JFrame frame) {
        point.setLocation(frame.getLocation());
    }

    public Point tempPosition(JFrame frame) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();
        int x = 0;
        int y = 0;
        for (GraphicsDevice curGs : gs) {
            DisplayMode dm = curGs.getDisplayMode();
            x = x + dm.getWidth();
            if (dm.getHeight() > y) {
                y = dm.getHeight();
            }
        }
        if ((x < point.x) || (y < point.y)) {
            resetPosition(frame);
        }
        return point;
    }

    private void resetPosition(JFrame frame) {
        // Two ways to get the screensize
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        point.setLocation((int) (screenSize.getWidth() / 2 - frame.getWidth() / 2),
                (int) (screenSize.getHeight() / 2 - frame.getHeight() / 2));
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ViewConfig)) return false;
        ViewConfig that = (ViewConfig) o;
        return Objects.equals(getPoint(), that.getPoint());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoint());
    }

    @Override
    public String toString() {
        return "ViewConfig{" +
                "point=" + point +
                '}';
    }
}
