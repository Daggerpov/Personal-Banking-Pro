package src.Accounts;
import javax.swing.*;

import src.Accounts.Account_Methods.DepositScreen;
import src.Accounts.Account_Methods.WithdrawScreen;
import src.Accounts.Investment_Account_Methods.InvestmentsScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvestmentAccountScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel balanceLabel = new JLabel("Balance");
    JButton withdrawButton = new JButton("Withdraw");
    JButton depositButton = new JButton("Deposit");
    JButton manageInvestmentsButton = new JButton("Manage Investments");

    public InvestmentAccountScreen() {
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
        balanceLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        balanceLabel.setBounds(85, 20, 600, 30);

        withdrawButton.setFont(new Font("Serif", Font.PLAIN, 20));
        withdrawButton.setBounds(225, 350, 150, 40);

        depositButton.setFont(new Font("Serif", Font.PLAIN, 20));
        depositButton.setBounds(225, 350, 150, 40);

        manageInvestmentsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        manageInvestmentsButton.setBounds(225, 350, 150, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(balanceLabel);
        container.add(withdrawButton);
        container.add(depositButton);
        container.add(manageInvestmentsButton);
    }

    public void addActionEvent() {
        withdrawButton.addActionListener(this);
        depositButton.addActionListener(this);
        manageInvestmentsButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // WITHDRAW button logic
        if (e.getSource() == withdrawButton) {
            WithdrawScreen frame = new WithdrawScreen();
            frame.setTitle("Withdraw from Investment Account");
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
            frame.setTitle("Deposit to Investment Account");
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // TRANSFER button logic
        if (e.getSource() == manageInvestmentsButton) {
            InvestmentsScreen frame = new InvestmentsScreen();
            frame.setTitle("Manage Investments");
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
    }
}