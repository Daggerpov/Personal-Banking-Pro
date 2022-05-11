package src;

import javax.swing.*;

import src.Accounts.ChequingAccountScreen;
import src.Accounts.InvestmentsAccountScreen;
import src.Accounts.SavingsAccountScreen;
import src.Authentication.LoginScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeneralScreen extends JFrame implements ActionListener {

    Container container = getContentPane();

    // this adds text right after the image
    JLabel undoLabel = new JLabel(" Undo", new ImageIcon("images/undo.png"), SwingConstants.CENTER);
    JLabel fastForward1Label = new JLabel(" 1 year", new ImageIcon("images/forward.png"), SwingConstants.CENTER);
    JLabel fastForward5Label = new JLabel(" 5 years", new ImageIcon("images/Triple_Arrow_Forward.png"),
            SwingConstants.CENTER);

    JLabel nameLabel = new JLabel("Welcome, " + UserAccount.getFirstName()); // user's full name appears here
    JButton undoButton = new JButton();
    JLabel timeLabel = new JLabel("It is currently the year: "); // year appears here
    JButton forward1YearButton = new JButton();
    JButton forward5YearButton = new JButton();
    JButton eTransferButton = new JButton("E-Transfer");
    JLabel summaryLabel = new JLabel("User Account (" + UserAccount.getUsername() + ") Summary:");
    JLabel visitLabel = new JLabel("Visit:");

    JButton visitChequingButton = new JButton("Chequing");
    JLabel chequingBalanceLabel = new JLabel("Balance ($): " + UserAccount.getChequingBalance()); // Chequing balance
                                                                                                  // appears here

    JButton visitSavingsButton = new JButton("Savings");
    JLabel savingsBalanceLabel = new JLabel("Balance ($): " + UserAccount.getSavingsBalance()); // savings balance
                                                                                                // appears here

    JButton visitInvestmentsButton = new JButton("Investments");
    JLabel investmentsBalanceLabel = new JLabel("Balance ($): " + UserAccount.getInvestmentsBalance()); // investments
                                                                                                        // balance
                                                                                                        // appears here

    JButton settingsButton = new JButton("Settings");
    JButton signOutButton = new JButton("Sign Out");

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
        fastForward1Label.setBounds(160, 75, 100, 40);
        fastForward5Label.setBounds(285, 75, 110, 40);
        undoLabel.setBounds(25, 75, 100, 40);

        forward1YearButton.setBounds(150, 70, 115, 50);
        forward5YearButton.setBounds(275, 70, 125, 50);
        undoButton.setBounds(25, 70, 115, 50);

        nameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        nameLabel.setBounds(10, 10, 150, 40);

        timeLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        timeLabel.setBounds(50, 120, 200, 40);

        settingsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        settingsButton.setBounds(450, 30, 100, 40);
        eTransferButton.setFont(new Font("Serif", Font.PLAIN, 20));
        eTransferButton.setBounds(425, 180, 150, 40);

        summaryLabel.setFont(new Font("Serif", Font.PLAIN, 26));
        summaryLabel.setBounds(100, 275, 500, 40);

        visitChequingButton.setFont(new Font("Serif", Font.PLAIN, 20));
        visitChequingButton.setBounds(50, 350, 100, 40);
        chequingBalanceLabel.setFont(new Font("Serif", Font.PLAIN, 17));
        chequingBalanceLabel.setBounds(30, 400, 300, 40);

        visitSavingsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        visitSavingsButton.setBounds(240, 350, 120, 40);
        savingsBalanceLabel.setFont(new Font("Serif", Font.PLAIN, 17));
        savingsBalanceLabel.setBounds(220, 400, 300, 40);

        visitInvestmentsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        visitInvestmentsButton.setBounds(450, 350, 120, 40);
        investmentsBalanceLabel.setFont(new Font("Serif", Font.PLAIN, 17));
        investmentsBalanceLabel.setBounds(430, 400, 300, 40);

        signOutButton.setFont(new Font("Serif", Font.PLAIN, 20));
        signOutButton.setBounds(250, 500, 100, 40);
    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(fastForward1Label);
        container.add(fastForward5Label);
        container.add(undoLabel);

        container.add(nameLabel);
        container.add(undoButton);
        container.add(timeLabel);
        container.add(forward1YearButton);
        container.add(forward5YearButton);
        container.add(eTransferButton);
        container.add(summaryLabel);
        container.add(settingsButton);
        container.add(visitLabel);
        container.add(visitChequingButton);
        container.add(chequingBalanceLabel);
        container.add(visitInvestmentsButton);
        container.add(investmentsBalanceLabel);
        container.add(visitSavingsButton);
        container.add(savingsBalanceLabel);
        container.add(signOutButton);

    }

    public void addActionEvent() {
        visitChequingButton.addActionListener(this);
        visitInvestmentsButton.addActionListener(this);
        visitSavingsButton.addActionListener(this);
        settingsButton.addActionListener(this);
        eTransferButton.addActionListener(this);
        signOutButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // VISIT CHEQUING button logic
        if (e.getSource() == visitChequingButton) {
            ChequingAccountScreen frame = new ChequingAccountScreen();
            frame.setTitle("Chequing Account");

            frame.getContentPane().setBackground(UserAccount.getColourTheme());
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // VISIT INVESTMENTS button logic
        if (e.getSource() == visitInvestmentsButton) {
            InvestmentsAccountScreen frame = new InvestmentsAccountScreen();
            frame.setTitle("Investments Account");

            frame.getContentPane().setBackground(UserAccount.getColourTheme());
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // VISIT SAVINGS button logic
        if (e.getSource() == visitSavingsButton) {
            SavingsAccountScreen frame = new SavingsAccountScreen();
            frame.setTitle("Savings Account");

            frame.getContentPane().setBackground(UserAccount.getColourTheme());
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // SETTINGS button logic
        if (e.getSource() == settingsButton) {
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
        // E-TRANSFER button logic
        if (e.getSource() == eTransferButton) {
            ETransferScreen frame = new ETransferScreen();
            frame.setTitle("Send Money");

            frame.getContentPane().setBackground(UserAccount.getColourTheme());
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // SIGN OUT button logic
        if (e.getSource() == signOutButton) {
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
