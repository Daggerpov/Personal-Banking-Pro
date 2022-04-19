package src.Accounts;

import javax.swing.*;

import src.Accounts.Account_Methods.DepositScreen;
import src.Accounts.Account_Methods.TransferScreen;
import src.Accounts.Account_Methods.WithdrawScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class chequingsAccountScreen extends JFrame implements ActionListener {

    int maxSpendingLimit = 0;
    Container container = getContentPane();
    JLabel maxSpendingLabel = new JLabel("Your max spending limit is: " + maxSpendingLimit);
    JButton backButton = new JButton("Back");
    JLabel balanceLabel = new JLabel("Balance:");
    JButton withdrawButton = new JButton("Withdraw");
    JButton depositButton = new JButton("Deposit");
    JButton transferButton = new JButton("Transfer");

    public chequingsAccountScreen() {
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

        balanceLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        balanceLabel.setBounds(50, 60, 600, 30);

        maxSpendingLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        maxSpendingLabel.setBounds(50, 120, 600, 30);

        withdrawButton.setFont(new Font("Serif", Font.PLAIN, 20));
        withdrawButton.setBounds(225, 300, 150, 40);

        depositButton.setFont(new Font("Serif", Font.PLAIN, 20));
        depositButton.setBounds(225, 350, 150, 40);

        transferButton.setFont(new Font("Serif", Font.PLAIN, 20));
        transferButton.setBounds(225, 400, 150, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(backButton);
        container.add(balanceLabel);
        container.add(maxSpendingLabel);
        container.add(withdrawButton);
        container.add(depositButton);
        container.add(transferButton);
    }

    public void addActionEvent() {
        withdrawButton.addActionListener(this);
        depositButton.addActionListener(this);
        transferButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // WITHDRAW button logic
        if (e.getSource() == withdrawButton) {
            WithdrawScreen frame = new WithdrawScreen();
            frame.setTitle("Withdraw from chequings Account");
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // DEPOSIT button logic
        if (e.getSource() == depositButton) {
            DepositScreen frame = new DepositScreen();
            frame.setTitle("Deposit to chequings Account");
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // TRANSFER button logic
        if (e.getSource() == transferButton) {
            TransferScreen frame = new TransferScreen();
            frame.setTitle("Transfer from chequings Account");
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
    }
}