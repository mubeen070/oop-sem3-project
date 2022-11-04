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
    JButton but1, but2, but3, but4;
    ImageIcon image;
    JLabel airlineBG;

    public Airline() {
        initialize();
        addButtons();
        addAction();
    }

    void initialize() {
        image = new ImageIcon("images/airline.gif");
        airlineBG = new JLabel();
        airlineBG.setIcon(image);
        airlineBG.setBounds(0, 0, 800, 600);
        frame = new JFrame();
        frame.setBounds(500, 100, 800, 600);

        frame.setLayout(null);
        frame.setResizable(false);

        frame.setVisible(true);

    }

    void addButtons() {
        but1 = new JButton("Enter Info");
        but1.setBounds(335, 200, 130, 40);
        but1.setForeground(Color.white);
        but1.setBackground(Color.black);

        but1.setOpaque(true);
        frame.add(but1);
        but2 = new JButton("Book seat");
        but2.setBounds(335, 250, 130, 40);
        but2.setForeground(Color.white);
        but2.setBackground(Color.black);

        frame.add(but2);
        but3 = new JButton("Check seats");
        but3.setBounds(335, 300, 130, 40);
        but3.setForeground(Color.white);
        but3.setBackground(Color.black);

        frame.add(but3);
        but4 = new JButton("Print ticket");
        but4.setBounds(335, 350, 130, 40);
        but4.setForeground(Color.white);
        but4.setBackground(Color.black);

        
        frame.add(but4);
        frame.add(airlineBG);
    }

    void addAction() {
        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        but4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        input obj = new input();
        if (ae.getSource() == but1) {

            obj.comboBox();
            // int seatsReq = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter
            // number of required seats.(1-50)"));

        } else if (ae.getSource() == but2) {

            // System.out.println("Press 1 for seat in first class and 2 for econmy class
            // )");
            JOptionPane.showMessageDialog(null,
                    "Seat number 1-10 (First Class) while seat number 11-20 (Economy Class)");
            int choice = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Press 1 for first class and 2 for economy class.)"));
            switch (choice) {
                case 1:
                    obj.first_class();
                    break;
                case 2:
                    obj.econmy_class();
                    break;

            }

        } else if (ae.getSource() == but3) {
            obj.display_info();
        } else if (ae.getSource() == but4) {
            obj.printTicket();
        }

    }

}
