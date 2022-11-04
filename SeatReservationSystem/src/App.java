
import javax.swing.*;

public class App {
    public static void main(String[] a) {

        try {
            ImageIcon imgThisImg = new ImageIcon("images/MBwT.gif");

            gui frame = new gui();
            JLabel newLabel = new JLabel();
            newLabel.setIcon(imgThisImg);
            newLabel.setBounds(0, 0, 800, 600);
            frame.setTitle("Login");
            frame.setLayout(null);
            frame.add(newLabel);
            frame.setBounds(500, 100, 800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);

            frame.setVisible(true);
        } catch (Exception e) {
            // handle exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
