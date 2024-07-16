package Swing;

import javax.swing.*;
import java.awt.*;

public class LayeredPan {
    public static void main(String[] args) {

        JLabel label1=new JLabel();
        label1.setBounds(50,50,200,200);
        label1.setOpaque(true);
        label1.setBackground(Color.RED);

        JLabel label2=new JLabel();
        label2.setBounds(100,100,200,200);
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);

        JLabel label3=new JLabel();
        label3.setBounds(150,150,200,200);
        label3.setOpaque(true);
        label3.setBackground(Color.green);

        JLayeredPane layeredPane=new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(label1);
        layeredPane.add(label2);
        layeredPane.add(label3);


        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.add(layeredPane);
    }
}
