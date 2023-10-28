package lab01;

import javax.swing.*;
public class ChoosingOption {
    public static void main(String[] args) {
//        int option = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket");
//        JOptionPane.showMessageDialog (null,"You've chosen: " + (option == JOptionPane.YES_OPTION?"Yes":"No"));

        int option = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket?",
                "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null);
        JOptionPane.showMessageDialog (null,"You've chosen: " + (option == JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}