package Swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabe {
    public static void main(String[] args){

        ImageIcon image=new ImageIcon("logo.jpg");
        Border border=BorderFactory.createLineBorder(Color.green);

        JLabel label=new JLabel();
        label.setText("Hello I am from India");
        label.setIcon(image);
        label.setForeground(Color.red);  // set color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20));  // set font of text
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // set border
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,200,200);

        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(420,420);
        frame.add(label);
        frame.setLayout(null);
        //frame.pack();
    }
}
