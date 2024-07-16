package Swing.TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;
    MyFrame()
    {
        this.setLayout(new FlowLayout());

        button=new JButton("Submit");
        button.addActionListener(this);

        textField=new JTextField();
        textField.setPreferredSize(new Dimension(250,50));
        textField.setFont(new Font("Consolas",Font.PLAIN,30));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);

        this.setVisible(true);
        this.add(textField);
        this.add(button);
        this.pack();

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            System.out.println("Hello "+textField.getText());
            textField.setEditable(false);
            button.setEnabled(false);
        }
    }
}
