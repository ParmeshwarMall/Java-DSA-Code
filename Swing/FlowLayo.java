package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.Button;

public class FlowLayo {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(100,100,500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        frame.add(new Button("1"));
        frame.add(new Button("2"));
        frame.add(new Button("3"));
        frame.add(new Button("4"));
        frame.add(new Button("5"));
        frame.add(new Button("6"));
        frame.add(new Button("7"));
        frame.add(new Button("8"));
        frame.add(new Button("9"));
        frame.add(new Button("10"));

        frame.setVisible(true);



    }
}
