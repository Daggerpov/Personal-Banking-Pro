package src.Accounts;
import javax.swing.*;

import src.GeneralScreen;
import src.Accounts.Account_Methods.DepositScreen;
import src.Accounts.Account_Methods.WithdrawScreen;
import src.Accounts.Investment_Account_Methods.InvestmentsScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvestmentAccountScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton backButton = new JButton("Back");
    JLabel balanceLabel = new JLabel("Balance:");
    JButton manageInvestmentsButton = new JButton("Manage Investments");
    JButton withdrawButton = new JButton("Withdraw");
    JButton depositButton = new JButton("Deposit");

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
        backButton.setFont(new Font("Serif", Font.PLAIN, 20));
        backButton.setBounds(10, 10, 60, 40);

        balanceLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        balanceLabel.setBounds(50, 60, 600, 30);

        manageInvestmentsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        manageInvestmentsButton.setBounds(200, 120, 200, 40);

        withdrawButton.setFont(new Font("Serif", Font.PLAIN, 20));
        withdrawButton.setBounds(225, 300, 150, 40);

        depositButton.setFont(new Font("Serif", Font.PLAIN, 20));
        depositButton.setBounds(225, 350, 150, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(backButton);
        container.add(balanceLabel);
        container.add(manageInvestmentsButton);
        container.add(withdrawButton);
        container.add(depositButton);
    }

    public void addActionEvent() {
        withdrawButton.addActionListener(this);
        depositButton.addActionListener(this);
        manageInvestmentsButton.addActionListener(this);
        backButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // WITHDRAW button logic
        if (e.getSource() == withdrawButton) {
            WithdrawScreen frame = new WithdrawScreen();
            frame.setTitle("Withdraw from Investment Account");
            Color color=new Color(41, 171, 135);
        	frame.getContentPane().setBackground(color);         
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
            Color color=new Color(41, 171, 135);
        	frame.getContentPane().setBackground(color);          
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
            Color color=new Color(41, 171, 135);
        	frame.getContentPane().setBackground(color);           
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // BACK button logic
        if (e.getSource() == backButton) {
            GeneralScreen frame = new GeneralScreen();
            frame.setTitle("General");
            Color color=new Color(41, 171, 135);
        	frame.getContentPane().setBackground(color);          
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
    }
}