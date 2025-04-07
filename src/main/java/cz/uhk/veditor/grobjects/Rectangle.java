package cz.uhk.veditor.grobjects;

import java.awt.*;

public class Rectangle extends AbstractGeometricObject{
    protected int a, b;    //a = length, b = height

    public Rectangle(Point pos, Color color, int a, int b){
        super(pos, color);
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean contains(int x, int y) {
        return (x >= position.x && x <= position.x+a) && (y >= position.y && y <= position.y+b);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.drawRect(position.x, position.y, a, b);
    }
}
