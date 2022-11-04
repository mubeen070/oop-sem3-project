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

    public gui() {
        // Calling methods inside constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLocationAndSize() {
        // Setting location and Size of each components using setBounds() method.
        userLabel.setBounds(250, 270, 100, 30);
        userLabel.setForeground(Color.black);
        
        passwordLabel.setBounds(250, 320, 100, 30);
        passwordLabel.setForeground(Color.black);
        
        userTextField.setBounds(320, 270, 150, 30);

        passwordField.setBounds(320, 320, 150, 30);

        showPassword.setBounds(330, 360, 150, 30);
        showPassword.setForeground(Color.black);
        showPassword.setOpaque(false);
        

        loginButton.setBounds(250, 420, 100, 30);
        loginButton.setForeground(Color.white);
        loginButton.setBackground(Color.BLACK);

        resetButton.setBounds(430, 420, 100, 30);
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
                if (userText.equals("admin") && pwdText.equals("admin")) {
                    JOptionPane.showMessageDialog(this, "Login Successful");
                    dispose();
                    new MainPage();

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