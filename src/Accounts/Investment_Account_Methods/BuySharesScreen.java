package src.Accounts.Investment_Account_Methods;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuySharesScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel titleLabel = new JLabel("It's time to pretend you're a real user with money!");
    JLabel fNameLabel = new JLabel("What is your full name?");
    JLabel usernameLabel = new JLabel("What would you like your username to be?");
    JTextField fNameTextField = new JTextField();
    JTextField usernameTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel passwordLabel = new JLabel("Password:");
    JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
    JTextField confirmPasswordTextField = new JTextField();
    JCheckBox showPassword = new JCheckBox("Show Password");
    JButton setupAccountButton = new JButton("Setup Account");

    public BuySharesScreen() {
        // Calling methods inside constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        // Setting location and Size of each components using setBounds() method.
        titleLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        titleLabel.setBounds(85, 20, 600, 30);

        fNameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        fNameLabel.setBounds(10, 80, 500, 30);
        fNameTextField.setBounds(225, 80, 150, 30);

        usernameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        usernameLabel.setBounds(10, 140, 500, 30);
        usernameTextField.setBounds(375, 140, 150, 30);

        passwordLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        passwordLabel.setBounds(10, 200, 100, 30);
        passwordField.setBounds(110, 200, 150, 30);

        confirmPasswordLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        confirmPasswordLabel.setBounds(10, 260, 200, 40);
        confirmPasswordTextField.setBounds(175, 263, 150, 30);

        showPassword.setFont(new Font("Serif", Font.PLAIN, 16));
        showPassword.setBounds(175, 300, 150, 30);

        setupAccountButton.setFont(new Font("Serif", Font.PLAIN, 20));
        setupAccountButton.setBounds(225, 350, 150, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(titleLabel);
        container.add(passwordLabel);
        container.add(fNameLabel);
        container.add(usernameLabel);
        container.add(fNameTextField);
        container.add(usernameTextField);
        container.add(showPassword);
        container.add(confirmPasswordLabel);
        container.add(passwordField);
        container.add(confirmPasswordTextField);
        container.add(setupAccountButton);
    }

    public void addActionEvent() {
        showPassword.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // actions here
    }
}
