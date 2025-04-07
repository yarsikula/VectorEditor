package cz.uhk.veditor;

import cz.uhk.veditor.gui.MainWindow;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainWindow().setVisible(true));      //just starts everything
    }
}
