import javax.swing.*;

import java.awt.Color;
//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MainPage extends JFrame implements ActionListener  {
    JFrame container = new JFrame();
    JButton b1 = new JButton("Train");
    JButton b2 = new JButton("Bus");
    JButton b3 = new JButton("Airplane");

    MainPage() {
        initialize();
    }

    public void initialize() {
        container.setLayout(null);
        container.setVisible(true);
        container.setBounds(1000, 100, 370, 600);
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.getContentPane().setBackground(Color.gray);
        container.setResizable(false);

        b1.setSize(100,30);
        b2.setSize(100,30);
        b3.setSize(100,30);
        b1.setLocation(160,150);        
        b2.setLocation(160,250);
        b3.setLocation(160,350);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        container.add(b1);
        container.add(b2);
        container.add(b3);
    }
      

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            System.out.println("train");
        }else if(e.getSource() == b2){
            System.out.println("bus");
        }else if(e.getSource() == b3){
            System.out.println("air");
        }

    }
}