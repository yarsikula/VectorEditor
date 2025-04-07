package cz.uhk.veditor.gui;

import cz.uhk.veditor.grobjects.AbstractGeometricObject;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GraphPanel extends JPanel {
    List<AbstractGeometricObject> objectsList;

    public GraphPanel(List<AbstractGeometricObject> objectsList) {
        this.objectsList = objectsList;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;        //retyping
        g2.setStroke(new BasicStroke(2f));   //wider lines
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  //smoother circles
        for (AbstractGeometricObject obj : objectsList) {
            obj.draw(g2);
        }
    }
}
