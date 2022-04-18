package src;

import javax.swing.*;

import src.Accounts.CheckingsAccountScreen;
import src.Accounts.InvestmentAccountScreen;
import src.Accounts.SavingsAccountScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeneralScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton visitSavingsButton = new JButton("Savings");
    JButton visitCheckingsButton = new JButton("Checkings");
    JButton visitInvestmentsButton = new JButton("Investments");
    JButton settingsButton = new JButton("Settings");

    // all of these constructors (as can be seen in most files) need to be
    // set to public so they're accessible by importing them to other files
    public GeneralScreen() {
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
        visitCheckingsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        visitCheckingsButton.setBounds(10, 400, 50, 40);

        visitInvestmentsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        visitInvestmentsButton.setBounds(100, 400, 50, 40);

        visitSavingsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        visitSavingsButton.setBounds(200, 400, 50, 40);

        settingsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        settingsButton.setBounds(200, 400, 50, 40);
    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(visitCheckingsButton);
        container.add(visitInvestmentsButton);
        container.add(visitSavingsButton);
        container.add(settingsButton);

    }

    public void addActionEvent() {
        visitCheckingsButton.addActionListener(this);
        visitInvestmentsButton.addActionListener(this);
        visitSavingsButton.addActionListener(this);
        settingsButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // SETUP ACCOUNT button logic
        if (e.getSource() == visitCheckingsButton) {
            CheckingsAccountScreen frame = new CheckingsAccountScreen();
            frame.setTitle("Checkings Account");
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // SETUP ACCOUNT button logic
        if (e.getSource() == visitInvestmentsButton) {
            InvestmentAccountScreen frame = new InvestmentAccountScreen();
            frame.setTitle("Investment Account");
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // SETUP ACCOUNT button logic
        if (e.getSource() == visitSavingsButton) {
            SavingsAccountScreen frame = new SavingsAccountScreen();
            frame.setTitle("Savings Account");
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // SETUP ACCOUNT button logic
        if (e.getSource() == settingsButton) {
            SettingsScreen frame = new SettingsScreen();
            frame.setTitle("Settings");
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
    }
}
