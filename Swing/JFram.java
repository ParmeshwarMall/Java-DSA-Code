package Swing;

import javax.swing.*;
import java.awt.*;

public class JFram {
    public static void main(String[] args) {
        javax.swing.JFrame frame=new javax.swing.JFrame();  // create a frame
        frame.setVisible(true);  // set frame visible
        frame.setSize(420,420);  // set the x dim ans y dim of frame
        frame.setTitle("JFrame title goes here"); // set title of frame

        ImageIcon image=new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());  // set logo of frame
        frame.getContentPane().setBackground(Color.blue);   // Set background color
        frame.getContentPane().setBackground(new Color(0,0,0));

    }
}
