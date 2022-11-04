

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sp21-bse-015
 */
import java.io.*;
import java.awt.GridLayout;
import javax.swing.*;
import java.io.FileWriter;   // Import the FileWriter class
import java.util.Scanner;

public class input {

    String name, fname, cnic, address;

   
    void comboBox() {
        try {
            File myObj = new File("filename.txt");
            myObj.createNewFile();

            String[] items = {"Male", "Female", "Not specified"};
            JComboBox<String> combo = new JComboBox<>(items);
            combo.setEditable(false);
            JTextField field1 = new JTextField("");
            JTextField field2 = new JTextField("");
            JTextField field3 = new JTextField("");
            JTextField field4 = new JTextField("");
            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(combo);
            panel.add(new JLabel("Name:"));
            panel.add(field1);
            panel.add(new JLabel("Father Name:"));
            panel.add(field2);
            panel.add(new JLabel("CNIC no."));
            panel.add(field3);
            panel.add(new JLabel("Address"));
            panel.add(field4);
            int result = JOptionPane.showConfirmDialog(null, panel, "Info",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (result == JOptionPane.OK_OPTION) {
                name = field1.getText();
                fname = field2.getText();
                cnic = field3.getText();
                address = field4.getText();
                saveToFile();

            } else {
                System.out.println("Cancelled");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void saveToFile() {
        try {
            FileWriter myFile = new FileWriter("filename.txt");
            myFile.append( "Name:" + name + "," + "   Father Name:"  + fname + "," +  "     CNIC:"  + cnic + "," + "Address" + "," + address);
            myFile.close(); 
            System.out.println("Successfully wrote to the file.");

            
        } catch (Exception aee) {
            System.err.println(aee.getMessage());
        }
    }

    public void getInfo() {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                 JOptionPane.showMessageDialog(null, data); 
            }
            myReader.close();
        } catch (Exception a1) {
            System.err.println(a1.getMessage());
        }
        
    }
}
