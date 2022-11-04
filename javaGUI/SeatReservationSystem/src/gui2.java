
//import required classes and packages  
import javax.swing.*;
//import java.awt.*;  

//create NewPage class to create a new page on which user will navigate  
class gui2 extends JFrame {
    JFrame frame2;

    // constructor
    gui2() {
        page2();
        mainForm();
    }

    void page2() {
        frame2= new JFrame();
        frame2.setTitle("Login");
        frame2.setVisible(true);
        frame2.setBounds(1000, 100, 370, 600);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);
    }

    void mainForm() {
        MainPage mp = new MainPage();
        mp.setVisible(true);
    }
}