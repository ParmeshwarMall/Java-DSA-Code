package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setLayout(null);

        JButton button=new JButton();
        button.setBounds(100,100,100,50);
        button.addActionListener(e -> System.out.println("Click"));
        button.setText("I am button");
        frame.add(button);
    }
}
