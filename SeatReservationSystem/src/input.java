
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sp21-bse-015
 */

//import java.awt.Color;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.*;

// import java.io.FileWriter; // Import the FileWriter class
// import java.util.Scanner;

public class input extends JFrame {

    static boolean[] seats = new boolean[20];
    Scanner sc = new Scanner(System.in);
    String[] optionsToChoose = { "Male", "Female", "Not specified" };
    JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
    JPanel panel;
    JLabel label1;
    JFrame frame1;
    ImageIcon image;
    private int count_2;
    // ImageIcon icon;
    private static String name;
    private static String fname;
    private static String cnic;
    private static String address;
    private static String gender;
    private static String from;
    private static String to;
    

    JLabel[] labels = new JLabel[7];

    void comboBox() {
        try {

            JTextField field1 = new JTextField("");
            JTextField field2 = new JTextField("");
            JTextField field3 = new JTextField("");
            JTextField field4 = new JTextField("");
            JTextField field5 = new JTextField("");
            JTextField field6 = new JTextField("");

            panel = new JPanel(new GridLayout(0, 1));

            panel.add(new JLabel("Name:"));
            panel.add(field1);
            panel.add(new JLabel("Father Name:"));
            panel.add(field2);
            panel.add(new JLabel("CNIC no."));
            panel.add(field3);
            panel.add(new JLabel("Address"));
            panel.add(field4);
            panel.add(new JLabel("From"));
            panel.add(field5);
            panel.add(new JLabel("To"));
            panel.add(field6);
            panel.add(jComboBox);

            int result = JOptionPane.showConfirmDialog(null, panel, "Info",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (result == JOptionPane.OK_OPTION) {
                name = field1.getText();
                fname = field2.getText();
                cnic = field3.getText();
                address = field4.getText();
                from = field5.getText();
                to = field6.getText();
                gender = jComboBox.getItemAt(jComboBox.getSelectedIndex());
            } else {

                JOptionPane.showMessageDialog(null, "Cancelled");
                dispose();

            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void first_class() {
        if (checkSeats()) {
            count_2 = 0;
            for (int i = 0; i < 10; i++) // in index 0-9 first class and 10-19 econmy class
            {
                if (seats[i] == true)
                    count_2++;

            }
            if (count_2 == 10) {
                JOptionPane.showMessageDialog(null, "First class is full");

                int accept_choice = Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Enter 2 to book in economy class."));
                if (accept_choice == 2) {
                    econmy_class();
                }
            } else {

                int seat_no = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter seat no."));
                if (seat_no >= 1 && seat_no <= 10) {
                    if (seats[seat_no - 1] == true) {
                        JOptionPane.showMessageDialog(null, "The seat is already Booked");

                    } else {
                        seats[seat_no - 1] = true;
                    }
                } else
                    JOptionPane.showMessageDialog(null, "Enter correct seat no.");

            }
        }
    }

    public void econmy_class() {
        if (checkSeats()) {
            count_2 = 0;
            for (int i = 10; i < seats.length; i++) // in index 0-9 econmy class and 10-19 first class
            {
                if (seats[i] == true)
                    count_2++;
            }
            if (count_2 == 10) {
                JOptionPane.showMessageDialog(null, "Econmy class is full");

                int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 to book in first class."));
                if (choice == 1) {
                    first_class();
                }
            } else {

                int seat_no = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter seat no."));
                if (seat_no >= 11 && seat_no <= 20) {
                    if (seats[seat_no - 1] == true) {
                        JOptionPane.showMessageDialog(null, "The seat is already Booked");

                    } else {
                        seats[seat_no - 1] = true;

                    }
                } else
                    JOptionPane.showMessageDialog(null, "Enter correct seat no.");

            }
        }

    }

    public boolean checkSeats() {
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == true)
                count++;
        }
        if (count == 20) {
            JOptionPane.showMessageDialog(null, "Next flight leaves in 3 hours");
            return false;
        } else
            return true;
    }

    public void display_info() {

        
        ImageIcon img = new ImageIcon("image/seatsBG.jpg");
        
        image = new ImageIcon("images/seat.png");
        JFrame ff = new JFrame("Seats");
        JLabel seatsBG = new JLabel();
        seatsBG.setBounds(0,0,300,700);
        seatsBG.setIcon(img);
        seatsBG.setOpaque(false);
        ff.setBounds(500, 50, 200, 550);
        ff.getContentPane().setBackground(Color.CYAN);
        
        ff.setVisible(true);
        ff.setResizable(false);

        for (int i = 0; i < 20; i++) {

            label1 = new JLabel();

            label1.setBounds(10, i* 25, 60, 40);
            
            label1.setForeground(Color.BLACK);
            label1.setLayout(null);
            label1.setIcon(image);
            ff.add(label1);
            if (seats[i] == true) {

                label1.setText((i+1)+"B");

            } else if (seats[i] == false) {
                label1.setText((i+1)+"A");

            }
            ff.add(seatsBG);
        }

    }

    public void printTicket() {
        
        frame1 = new JFrame("Ticket");
        frame1.setLayout(null);
        frame1.setBounds(500,100,300,300);
        
        frame1.setResizable(false);
        
        for (int i = 0; i < 7; i++) {
            labels[i] = new JLabel();
            labels[i].setForeground(Color.black);
            labels[i].setBounds(20,(i+1)*30,250,50);

            // JOptionPane.showMessageDialog(null,
            // "Name:\t" + name + "\n" + "Father's name:\t" + fname + "\n" + "CNIC no.:\t" +
            // cnic
            // + "\n" + "Address:\t" + address + "\n" + "Gender:\t" + gender + "\n" +
            // "From:\t" + from + "\n"
            // + "To:\t" + to + "\n");
            // }
        }
    
        labels[0].setText("Name:\t        "+name);
        labels[1].setText("Father's name: "+fname);
        labels[2].setText("CNIC:\t        "+cnic);
        labels[3].setText("Address:\t     "+address);
        labels[4].setText("Gender:\t      "+gender);
        labels[5].setText("From:\t        "+from);
        labels[6].setText("To: \t         "+to);
        for(int j=0; j<7 ; j++){
            frame1.add(labels[j]);
        }
        frame1.getContentPane().setBackground(Color.CYAN);
        frame1.setVisible(true);

    }
    
}