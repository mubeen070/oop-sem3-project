import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gui extends JFrame implements ActionListener {
    // initialize button, panel, label, and text field
    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");

    gui() {
        // Calling methods inside constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLocationAndSize() {
        // Setting location and Size of each components using setBounds() method.
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(130, 150, 150, 30);
        passwordField.setBounds(130, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        showPassword.setBackground(Color.GRAY);
        loginButton.setBounds(50, 300, 100, 30);
        loginButton.setForeground(Color.white);
        loginButton.setBackground(Color.BLACK);
        resetButton.setBounds(200, 300, 100, 30);
        resetButton.setForeground(Color.white);
        resetButton.setBackground(Color.black);
    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Coding Part of LOGIN button
        try {
            if (e.getSource() == loginButton) {
                String userText = userTextField.getText();
                String pwdText = String.valueOf(passwordField.getPassword());
                if (userText.equalsIgnoreCase("") && pwdText.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(this, "Login Successful");
                     new MainPage();
                    //containerr.initialize();
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid Username or Password");
                }

            }
        } catch (Exception f) {
            System.out.println(f.getMessage());
        }
        // Coding Part of RESET button
        if (e.getSource() == resetButton)

        {
            userTextField.setText("");
            passwordField.setText("");
        }
        // Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }
    }
}