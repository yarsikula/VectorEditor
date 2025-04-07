package cz.uhk.veditor.grobjects;

import java.awt.*;

public abstract class AbstractGeometricObject {
    protected Point position;
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void setPosition(int x, int y) {
        position = new Point(x, y);
    }

    public Point getPosition() {
        return position;
    }

    public Color getColor() {
        return color;
    }

    public AbstractGeometricObject(Point position, Color color) {
        this.position = position;
        this.color = color;
    }

    public AbstractGeometricObject() {
        setPosition(0,0);
        setColor(Color.BLACK);
    }

    public abstract boolean contains(int x, int y);

    public abstract void draw(Graphics2D g);
}
