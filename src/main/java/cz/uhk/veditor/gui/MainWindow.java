package cz.uhk.veditor.gui;

import cz.uhk.veditor.grobjects.AbstractGeometricObject;
import cz.uhk.veditor.grobjects.Circle;
import cz.uhk.veditor.grobjects.Square;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainWindow extends JFrame {
    private List<AbstractGeometricObject> objects = new ArrayList<>();

    public MainWindow() {
        super("Vector editor");             //title of the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);         //so the X button actually closes it

        initTestData();
        add(new GraphPanel(objects), BorderLayout.CENTER);


        setSize(800, 600);
        setLocationRelativeTo(null);      //sets the window position to the middle of the screen
    }

    private void initTestData() {        //testing data basically
        objects.add(new Circle(new Point(100, 100), Color.BLUE, 50));
        objects.add(new Circle(new Point(200, 100), Color.GREEN, 40));
        objects.add(new Square(new Point(100, 200), Color.RED, 60));
        objects.add(new Square(new Point(300, 100), Color.YELLOW, 15));
    }
}
