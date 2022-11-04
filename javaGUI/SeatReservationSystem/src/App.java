
import java.awt.Color;

import javax.swing.*;
//import java.awt.*;

public class App {
    public static void main(String[] a) {
        try {

            gui frame = new gui();
            frame.setLayout(null);

            frame.setBounds(1000, 100, 370, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.getContentPane().setBackground(Color.GRAY);
            frame.setVisible(true);
        } catch (Exception e) {
            // handle exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

