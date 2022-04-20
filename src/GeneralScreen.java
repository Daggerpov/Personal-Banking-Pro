package src;

import javax.swing.*;

import src.Accounts.ChequingAccountScreen;
import src.Accounts.InvestmentAccountScreen;
import src.Accounts.SavingsAccountScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

public class GeneralScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel nameLabel = new JLabel("*your name here*"); // ! user's full name appears here 
    JButton undoButton = new JButton("Undo");
    JLabel timeLabel = new JLabel("It is currently the year:"); // ! year appears here 
    JButton forward1YearButton = new JButton("1 Year");
    JButton forward5YearButton = new JButton("5 Years");
    JButton sendMoneyButton = new JButton("E-Transfer");
    JLabel summaryLabel = new JLabel("Accounts Summary:");
    JLabel visitLabel = new JLabel("Visit:");
    JButton visitSavingsButton = new JButton("Savings");
    JLabel savingsBalanceLabel = new JLabel("Balance:"); // ! savings balance appears here
    JButton visitChequingsButton = new JButton("Chequing");
    JLabel chequingsBalanceLabel = new JLabel("Balance:"); // ! chequings balance appears here
    JButton visitInvestmentsButton = new JButton("Investments");
    JLabel investmentsBalanceLabel = new JLabel("Balance:"); // ! investments balance appears here
    JButton settingsButton = new JButton("Settings");

    // Toolkit t=Toolkit.getDefaultToolkit();  
    //     Image i=t.getImage("images/Fast_Forward.jpeg");  
    //     g.drawImage(i, 120, 100, this);

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
        nameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        nameLabel.setBounds(10, 10, 150, 40);
        undoButton.setFont(new Font("Serif", Font.PLAIN, 20));
        undoButton.setBounds(25, 70, 100, 40);
        timeLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        timeLabel.setBounds(50, 120, 200, 40);
        forward1YearButton.setFont(new Font("Serif", Font.PLAIN, 20));
        forward1YearButton.setBounds(150, 70, 100, 40);
        forward5YearButton.setFont(new Font("Serif", Font.PLAIN, 20));
        forward5YearButton.setBounds(275, 70, 100, 40);
        settingsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        settingsButton.setBounds(475, 10, 100, 40);
        sendMoneyButton.setFont(new Font("Serif", Font.PLAIN, 20));
        sendMoneyButton.setBounds(425, 180, 150, 40);

        summaryLabel.setFont(new Font("Serif", Font.PLAIN, 26));
        summaryLabel.setBounds(200, 275, 300, 40);

        visitChequingsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        visitChequingsButton.setBounds(50, 350, 100, 40);
        chequingsBalanceLabel.setFont(new Font("Serif", Font.PLAIN, 17));
        chequingsBalanceLabel.setBounds(30, 400, 300, 40);

        visitInvestmentsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        visitInvestmentsButton.setBounds(240, 350, 120, 40);
        investmentsBalanceLabel.setFont(new Font("Serif", Font.PLAIN, 17));
        investmentsBalanceLabel.setBounds(220, 400, 300, 40);

        visitSavingsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        visitSavingsButton.setBounds(450, 350, 100, 40);
        savingsBalanceLabel.setFont(new Font("Serif", Font.PLAIN, 17));
        savingsBalanceLabel.setBounds(430, 400, 300, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(nameLabel);
        container.add(undoButton);
        container.add(timeLabel);
        container.add(forward1YearButton);
        container.add(forward5YearButton);
        container.add(sendMoneyButton);
        container.add(summaryLabel);
        container.add(settingsButton);
        container.add(visitLabel);
        container.add(visitChequingsButton);
        container.add(chequingsBalanceLabel);
        container.add(visitInvestmentsButton);
        container.add(investmentsBalanceLabel);
        container.add(visitSavingsButton);
        container.add(savingsBalanceLabel);

    }

    public void addActionEvent() {
        visitChequingsButton.addActionListener(this);
        visitInvestmentsButton.addActionListener(this);
        visitSavingsButton.addActionListener(this);
        settingsButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // SETUP ACCOUNT button logic
        if (e.getSource() == visitChequingsButton) {
            ChequingAccountScreen frame = new ChequingAccountScreen();
            frame.setTitle("Chequings Account");
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
