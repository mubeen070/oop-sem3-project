import javax.swing.*;

import java.awt.Color;
//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame implements ActionListener {
    JFrame frame = new JFrame("MainPage");
    JButton b1 = new JButton("Airplane");
    JButton b2 = new JButton("About");
    JButton b3 = new JButton("EXIT");
    JLabel jLabel;
    



    MainPage() {
        initialize();
    }

    public void initialize() {
        ImageIcon imgThisImg = new ImageIcon("images/747o.gif");
        jLabel = new JLabel();
        jLabel.setIcon(imgThisImg);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(500,100,800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.MAGENTA);
        frame.setResizable(false);

        jLabel.setBounds(0, 0, 800, 600);
        
        b1.setBounds(350, 230, 100, 40);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b2.setBounds(350, 280, 100, 40);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b3.setBounds(350, 330, 100, 40);
        b3.setForeground(Color.white);
        b3.setBackground(Color.black);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(jLabel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            dispose();
            new Airline();
        } else if (e.getSource() == b2) {
            new about();
        } else if (e.getSource() == b3) {
            System.exit(0);
        }

    }
}
