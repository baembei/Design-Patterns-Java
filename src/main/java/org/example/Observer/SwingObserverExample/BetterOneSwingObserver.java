package org.example.Observer.SwingObserverExample;

import javax.swing.*;
import java.awt.*;

public class BetterOneSwingObserver {
    JFrame frame;
    public static void main(String[] args) {
        BetterOneSwingObserver example = new BetterOneSwingObserver();
        example.go();
    }
    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(event ->
                System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event ->
                System.out.println("Come on, do it!"));

        frame.getContentPane().add(BorderLayout.CENTER, button);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    //No ActionListener classes anymore!
    //Bolee kompaktnyj kod
}
