package cz.uhk.veditor.gui;

import cz.uhk.veditor.grobjects.*;
import cz.uhk.veditor.grobjects.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class MainWindow extends JFrame {
    private List<AbstractGeometricObject> objects = new ArrayList<>();
    private JToolBar toolBar;
    private JToggleButton btSquare, btCircle, btRectangle, btTriangle;

    public MainWindow() {
        super("Vector editor");             //title of the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);         //so the X button actually closes it

        createToolBar();

        initTestData();
        GraphPanel panel = new GraphPanel(objects);
        add(panel, BorderLayout.CENTER);
        panel.addMouseListener(new MouseAdapter() {         //adding objects when mouse clicked inside the field
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    if (btCircle.isSelected()) {
                        objects.add(new Circle(new Point(e.getX(), e.getY()), Color.RED, 50));
                    } else if (btSquare.isSelected()) {
                        objects.add(new Square(new Point(e.getX(), e.getY()), Color.GREEN, 50));
                    } else if (btRectangle.isSelected()) {
                        objects.add(new Rectangle(new Point(e.getX(), e.getY()), Color.BLACK, 100, 50));
                    } else if (btTriangle.isSelected()) {
                        objects.add(new Triangle(new Point(e.getX(), e.getY()), Color.PINK, 100));
                    }
                    SwingUtilities.updateComponentTreeUI(panel);
                }
            }
        });

        setSize(800, 600);
        setLocationRelativeTo(null);      //sets the window position to the middle of the screen
    }

    private void createToolBar() {
        toolBar = new JToolBar(JToolBar.HORIZONTAL);
        add(toolBar, BorderLayout.NORTH);    //putting it at the top of the window

        btSquare = new JToggleButton(new ImageIcon("resources/square.png"));
        btCircle = new JToggleButton(new ImageIcon("resources/Circle.png"));
        btRectangle = new JToggleButton(new ImageIcon("resources/Rectangle.png"));
        btTriangle = new JToggleButton(new ImageIcon("resources/Triangle.png"));
        toolBar.add(btSquare);
        toolBar.add(btCircle);
        toolBar.add(btRectangle);
        toolBar.add(btTriangle);

        //so the only one can be selected at one time
        ButtonGroup gr = new ButtonGroup();
        gr.add(btSquare);
        gr.add(btCircle);
        gr.add(btRectangle);
        gr.add(btTriangle);
    }

    private void initTestData() {        //testing data basically
        objects.add(new Circle(new Point(100, 100), Color.BLUE, 50));
        objects.add(new Circle(new Point(200, 100), Color.GREEN, 40));
        objects.add(new Square(new Point(100, 200), Color.RED, 60));
        objects.add(new Square(new Point(300, 100), Color.YELLOW, 15));
        objects.add(new Rectangle(new Point(300, 500), Color.BLUE, 100, 50));
        objects.add(new Rectangle(new Point(450, 200), Color.BLACK, 50, 600));
        objects.add(new Triangle(new Point(250, 250), Color.CYAN, 100));
    }
}
