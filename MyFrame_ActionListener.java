package com.bootcamp_test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MyFrame_ActionListener extends JFrame implements ActionListener {

    private JButton button;

    public MyFrame_ActionListener() {
        button = new JButton("Click Me");
        button.addActionListener(this); // Registering ActionListener
        add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // Button clicked, perform action here
            System.out.println("Button clicked!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyFrame_ActionListener());
    }
}

