package src.Accounts.Account_Methods;
import javax.swing.*;

import src.GeneralScreen;
import src.Accounts.ChequingsAccountScreen;
import src.Accounts.InvestmentsAccountScreen;
import src.Accounts.SavingsAccountScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DepositScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton backButton = new JButton("Back");
    JLabel titleLabel = new JLabel("Enter the amount to deposit into this account:");
    JTextField amountTextField = new JTextField();
    JButton confirmButton = new JButton("Confirm");
    String accountFrom;

    public DepositScreen(String accountScreenFrom) {
        // Calling methods inside constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        accountFrom = accountScreenFrom;
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        // Setting location and Size of each components using setBounds() method.
        backButton.setFont(new Font("Serif", Font.PLAIN, 20));
        backButton.setBounds(10, 10, 60, 40);

        titleLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        titleLabel.setBounds(120, 40, 600, 30);
        amountTextField.setFont(new Font("Serif", Font.PLAIN, 20));
        amountTextField.setBounds(230, 80, 150, 30);

        confirmButton.setFont(new Font("Serif", Font.PLAIN, 20));
        confirmButton.setBounds(225, 425, 150, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(backButton);
        container.add(titleLabel);
        container.add(amountTextField);
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
			// if (accountFrom.equals("Chequings")){
            
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
        if (e.getSource() == backButton) {
            if (accountFrom.equals("Chequings")){
                ChequingsAccountScreen frame = new ChequingsAccountScreen();
                frame.setTitle("Chequings");
                Color color = new Color(41, 171, 135);
                frame.getContentPane().setBackground(color);
                frame.setVisible(true);
                frame.setBounds(10, 10, 600, 600);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                this.dispose();
            } else if (accountFrom.equals("Savings")) {
                SavingsAccountScreen frame = new SavingsAccountScreen();
                frame.setTitle("Savings");
                Color color = new Color(41, 171, 135);
                frame.getContentPane().setBackground(color);
                frame.setVisible(true);
                frame.setBounds(10, 10, 600, 600);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                this.dispose();
            }
            if (accountFrom.equals("Investments")) {
                InvestmentsAccountScreen frame = new InvestmentsAccountScreen();
                frame.setTitle("Investments");
                Color color = new Color(41, 171, 135);
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
}