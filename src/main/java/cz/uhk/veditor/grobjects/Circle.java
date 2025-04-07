package cz.uhk.veditor.grobjects;

import java.awt.*;

public class Circle extends AbstractGeometricObject{
    protected int r;

    public Circle(Point position, Color color, int r) {
        super(position, color);
        this.r = r;
    }

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public boolean contains(int x, int y) {
        int m = position.x+r;
        int n = position.y+r;

        //general equation of a circle
        int left = (x - m) * (x - m) + (y - n) * (y - n);
        int right = r*r;

        return left <= right;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.drawOval(position.x, position.y, 2*r, 2*r);
    }
}
