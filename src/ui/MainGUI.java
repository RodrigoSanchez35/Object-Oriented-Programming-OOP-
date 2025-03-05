package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Graphical User Interface for vehicle management.
 */
public class MainGUI extends JFrame {

    public MainGUI() {
        setTitle("Vehicle Management System");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create UI components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JButton addButton = new JButton("Add Vehicle");
        JButton listButton = new JButton("List Vehicles");
        JButton exitButton = new JButton("Exit");

        panel.add(addButton);
        panel.add(listButton);
        panel.add(exitButton);

        add(panel);

        exitButton.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainGUI();
    }
}
