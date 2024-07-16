package Swing;

import javax.swing.*;

public class JOptionPan {
    public static void main(String[] args) {
        //.showMessageDialog(null,"This is fake info","Info",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is fake info","Info",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is fake info","Info",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is fake info","Info",JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is fake info","Info",JOptionPane.ERROR_MESSAGE);

        //JOptionPane.showConfirmDialog(null,"Will you code","title",JOptionPane.YES_NO_CANCEL_OPTION);

        String age=JOptionPane.showInputDialog("How old are you");
        System.out.println(age);

    }
}
