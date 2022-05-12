package src.Accounts.Investment_Account_Methods;

import javax.swing.*;

import src.GeneralScreen;
import src.UserAccount;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SellSharesScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton backButton = new JButton("Back");
    JLabel titleLabel = new JLabel("Enter the number of shares to sell:");
    JTextArea sharesSoldTextArea = new JTextArea();
    JLabel sharesLabel = new JLabel("$___ per share");
    JLabel paymentAmountLabel = new JLabel("$____");
    JButton confirmButton = new JButton("Confirm");

    public SellSharesScreen() {
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
        backButton.setFont(new Font("Serif", Font.PLAIN, 20));
        backButton.setBounds(10, 10, 60, 40);

        titleLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        titleLabel.setBounds(85, 100, 600, 30);
        sharesSoldTextArea.setFont(new Font("Serif", Font.PLAIN, 20));
        sharesSoldTextArea.setBounds(375, 100, 150, 30);

        sharesLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        sharesLabel.setBounds(450, 50, 600, 30);

        paymentAmountLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        paymentAmountLabel.setBounds(225, 275, 600, 30);

        confirmButton.setFont(new Font("Serif", Font.PLAIN, 20));
        confirmButton.setBounds(225, 350, 150, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(backButton);
        container.add(titleLabel);
        container.add(sharesSoldTextArea);
        container.add(sharesLabel);
        container.add(paymentAmountLabel);
        container.add(confirmButton);
    }

    public void addActionEvent() {
        confirmButton.addActionListener(this);
        backButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // CONFIRM button logic
        if (e.getSource() == confirmButton) {
            GeneralScreen frame = new GeneralScreen();
            frame.setTitle("General");

            frame.getContentPane().setBackground(UserAccount.getColourTheme());
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }

        // BACK button logic
        if (e.getSource() == backButton) {
            InvestmentsScreen frame = new InvestmentsScreen();
            frame.setTitle("Manage Investments");
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