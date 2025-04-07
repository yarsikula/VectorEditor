package cz.uhk.veditor.grobjects;

import java.awt.*;

public class Square extends AbstractGeometricObject{
    protected int a;

    public Square(Point position, Color color, int a) {
        super(position, color);
        this.a = a;
    }

    public Square(int a) {
        this.a = a;
    }

    @Override
    public boolean contains(int x, int y) {
        return (x >= position.x && x <= position.x+a) && (y >= position.y && y <= position.y+a);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.drawRect(position.x, position.y, a, a);
    }
}
