package Swing;

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class JPane {
    public static void main(String[] args) {

        ImageIcon icon=new ImageIcon("logo.png");
        JLabel label=new JLabel();
        label.setIcon(icon);
        label.setText("Jai Hind");

        JPanel Orapanel=new JPanel();
        Orapanel.setBackground(Color.orange);
        Orapanel.setBounds(0,0,750,250);

        JPanel whipanel=new JPanel();
        whipanel.setBackground(Color.white);
        whipanel.setBounds(0,250,750,250);

        JPanel greenpanel=new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,500,750,250);

        JFrame frame=new JFrame();
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(Orapanel);
        frame.add(whipanel);
        whipanel.add(label);
        frame.add(greenpanel);
    }
}
