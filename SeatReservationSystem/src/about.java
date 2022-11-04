import javax.swing.*;
import java.awt.*;

public class about extends JFrame {
    JFrame frame;
    JPanel panel1;
    JLabel label1, label2, label3, label4, label5;

    public about() {
        initialize();
    }

    void initialize() {
        frame = new JFrame("About");
        frame.setLayout(null);
        frame.setBounds(1000, 300, 370, 250);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.black);
        // frame.add(panel1);
        frame.setVisible(true);

        label1 = new JLabel("PAKISTAN INTERNATIONAL AIRLINES");
        label1.setForeground(Color.white);
        label1.setBounds(10, 20, 250, 30);

        label2 = new JLabel("Email: info@piac.aero");
        label2.setForeground(Color.white);
        label2.setBounds(10, 50, 250, 30);

        label3 = new JLabel("Mobile: +92 330 0786786");
        label3.setForeground(Color.white);
        label3.setBounds(10, 80, 300, 30);

        label4 = new JLabel("Postal address: Awards Plus Program Room #293");
        label4.setForeground(Color.white);
        label4.setBounds(10, 110, 300, 30);

        label5 = new JLabel("PIA Head Office Karachi-75200 Pakistan");
        label5.setForeground(Color.white);
        label5.setBounds(10, 140, 300, 30);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
    }

}
