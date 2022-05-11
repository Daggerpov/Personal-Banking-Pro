package src;
import javax.swing.*;

import src.Authentication.LoginScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteAccountScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel title1Label = new JLabel("You will be able to use your first and last name to create a new account");
    JLabel title2Label = new JLabel("All data from this account will be erased including your balances");
    JLabel title3Label = new JLabel("This action can not be undone");

    JButton backButton = new JButton("Back");
    JButton confirmButton = new JButton("Confirm");

    public DeleteAccountScreen() {
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
        title1Label.setFont(new Font("Serif", Font.PLAIN, 17));
        title1Label.setBounds(60, 50, 600, 30);
        title2Label.setFont(new Font("Serif", Font.PLAIN, 17));
        title2Label.setBounds(80, 90, 600, 30);
        title3Label.setFont(new Font("Serif", Font.PLAIN, 17));
        title3Label.setBounds(200, 130, 600, 30);

        backButton.setFont(new Font("Serif", Font.PLAIN, 20));
        backButton.setBounds(200, 350, 100, 40);

        confirmButton.setFont(new Font("Serif", Font.PLAIN, 20));
        confirmButton.setBounds(300, 350, 100, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(title1Label);
        container.add(title2Label);
        container.add(title3Label);
        container.add(backButton);
        container.add(confirmButton);
    }

    public void addActionEvent() {
      backButton.addActionListener(this);
      confirmButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // BACK button logic
        if (e.getSource() == backButton) {
            SettingsScreen frame = new SettingsScreen();
            frame.setTitle("Settings");
            frame.getContentPane().setBackground(UserAccount.getColourTheme());            
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // CONFIRM button logic
        if (e.getSource() == confirmButton) {
            LoginScreen frame = new LoginScreen();
            frame.setTitle("Login");
            frame.getContentPane().setBackground(UserAccount.getColourTheme());          
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
    }
}
