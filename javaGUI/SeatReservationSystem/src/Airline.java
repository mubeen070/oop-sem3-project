/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp21-bse-015
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Airline extends JFrame implements ActionListener {

    JFrame frame;
    JButton but1, but2, but3;
    JLabel label;
    ImageIcon image;

    Airline() {
        initialize();
//        image = new ImageIcon("airplane.png");
//        label = new JLabel(image);
//        add(label);
//        pack(); // to tell the layout managers to set up the GUI
//        setLocationRelativeTo(null); // center things
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 370, 600);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        addButtons();
        label();
    }

    void label() {
        image = new ImageIcon("airplane.jpg");
        label = new JLabel(image);
        label.setBounds(30, 50, 30, 30);
        frame.add(label);
        label.setVisible(true);
        //label.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void addButtons() {
        but1 = new JButton("Book");
        but1.setBounds(125, 150, 100, 40);
        but1.setForeground(Color.white);
        but1.setBackground(Color.black);
        frame.add(but1);
        but2 = new JButton("Flights");
        but2.setBounds(125, 200, 100, 40);
        but2.setForeground(Color.white);
        but2.setBackground(Color.black);
        frame.add(but2);
        but3 = new JButton("Info");
        but3.setBounds(125, 250, 100, 40);
        but3.setForeground(Color.white);
        but3.setBackground(Color.black);
        frame.add(but3);

        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        input obj =new input();
        if (ae.getSource() == but1) {
        obj.comboBox();
        }else if(ae.getSource() == but3){
        obj.getInfo();
        }
    }

}
