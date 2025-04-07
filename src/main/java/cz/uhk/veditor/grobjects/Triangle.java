package cz.uhk.veditor.grobjects;

import java.awt.*;

public class Triangle extends AbstractGeometricObject{
    protected int a;

    public Triangle(Point pos, Color color, int a){
        super(pos, color);
        this.a = a;
    }

    @Override
    public boolean contains(int x, int y) {
        return (x >= position.x && x <= position.x+a && y <= position.y && y >= position.y+a);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.drawLine(position.x, position.y, position.x+a, position.y);
        g.drawLine(position.x, position.y, position.x+(a/2), position.y-(int)((Math.sqrt(3)/2)*a));
        g.drawLine(position.x+a, position.y, position.x+(a/2), position.y-(int)((Math.sqrt(3)/2)*a));
    }
}
