package src.Accounts.Account_Methods;

import javax.swing.*;

import src.GeneralScreen;
import src.UserAccount;
import src.Accounts.ChequingAccountScreen;
import src.Accounts.InvestmentsAccountScreen;
import src.Accounts.SavingsAccountScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransferScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton backButton = new JButton("Back");
    JLabel title1Label = new JLabel("Select the amount to transfer:");
    JCheckBox percent10CheckBox = new JCheckBox("10%");
    JCheckBox percent25CheckBox = new JCheckBox("25%");
    JCheckBox percent50CheckBox = new JCheckBox("50%");
    JCheckBox percent100CheckBox = new JCheckBox("100%");
    JCheckBox customCheckBox = new JCheckBox("Custom:");
    JTextField customTextField = new JTextField();
    JLabel amountLabel = new JLabel("Amount:");

    JLabel amountValueLabel = new JLabel();
    JLabel title2Label = new JLabel("Which account would you like to transfer to?");

    JCheckBox savingsCheckBox = new JCheckBox("Savings");
    JCheckBox chequingCheckBox = new JCheckBox("Chequing");
    JCheckBox investmentsCheckBox = new JCheckBox("Investments");

    JButton confirmButton = new JButton("Confirm");

    String accountFrom;

    public TransferScreen(String accountScreenFrom) {
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

        title1Label.setFont(new Font("Serif", Font.PLAIN, 20));
        title1Label.setBounds(190, 40, 600, 30);

        percent10CheckBox.setFont(new Font("Serif", Font.PLAIN, 20));
        percent10CheckBox.setBounds(225, 80, 600, 30);
        percent25CheckBox.setFont(new Font("Serif", Font.PLAIN, 20));
        percent25CheckBox.setBounds(310, 80, 600, 30);
        percent50CheckBox.setFont(new Font("Serif", Font.PLAIN, 20));
        percent50CheckBox.setBounds(225, 120, 600, 30);
        percent100CheckBox.setFont(new Font("Serif", Font.PLAIN, 20));
        percent100CheckBox.setBounds(310, 120, 600, 30);
        customCheckBox.setFont(new Font("Serif", Font.PLAIN, 20));
        customCheckBox.setBounds(225, 160, 600, 30);
        customTextField.setBounds(325, 160, 100, 30);
        customTextField.setVisible(false);

        amountLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        amountLabel.setBounds(225, 240, 600, 30);
        amountValueLabel.setBounds(310, 240, 100, 30);

        title2Label.setFont(new Font("Serif", Font.PLAIN, 20));
        title2Label.setBounds(120, 300, 600, 30);

        savingsCheckBox.setFont(new Font("Serif", Font.PLAIN, 20));
        savingsCheckBox.setBounds(180, 340, 600, 30);

        chequingCheckBox.setFont(new Font("Serif", Font.PLAIN, 20));
        chequingCheckBox.setBounds(300, 340, 600, 30);

        investmentsCheckBox.setFont(new Font("Serif", Font.PLAIN, 20));
        investmentsCheckBox.setBounds(420, 340, 600, 30);

        confirmButton.setFont(new Font("Serif", Font.PLAIN, 20));
        confirmButton.setBounds(225, 425, 150, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(backButton);
        container.add(title1Label);
        container.add(percent10CheckBox);
        container.add(percent25CheckBox);
        container.add(percent50CheckBox);
        container.add(percent100CheckBox);
        container.add(customCheckBox);
        container.add(customTextField);
        container.add(amountLabel);
        container.add(amountValueLabel);
        container.add(title2Label);
        container.add(savingsCheckBox);
        container.add(chequingCheckBox);
        container.add(investmentsCheckBox);
        container.add(confirmButton);
    }

    public void addActionEvent() {
        confirmButton.addActionListener(this);
        customCheckBox.addActionListener(this);
        percent10CheckBox.addActionListener(this);
        percent25CheckBox.addActionListener(this);
        percent50CheckBox.addActionListener(this);
        percent100CheckBox.addActionListener(this);

        backButton.addActionListener(this);
        savingsCheckBox.addActionListener(this);
        chequingCheckBox.addActionListener(this);
        investmentsCheckBox.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // CONFIRM button logic
        if (e.getSource() == confirmButton) {
            if ((accountFrom.equals("Savings") && savingsCheckBox.isSelected() == true)
                    || (accountFrom.equals("Chequing") && chequingCheckBox.isSelected() == true)
                    || (accountFrom.equals("Investments") && investmentsCheckBox.isSelected() == true)) {
                JOptionPane.showMessageDialog(this, "Cannot transfer to the same account as its from.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                if (accountFrom.equals("Chequing")) {
                    UserAccount.setChequingBalance(
                            UserAccount.getChequingBalance() + Integer.parseInt(amountValueLabel.getText()));
                } else if (accountFrom.equals("Savings")) {
                    UserAccount.setSavingsBalance(
                            UserAccount.getSavingsBalance() - Integer.parseInt(amountValueLabel.getText()));
                } else if (accountFrom.equals("Investments")) {
                    UserAccount.setInvestmentsBalance(
                            UserAccount.getInvestmentsBalance() + Integer.parseInt(amountValueLabel.getText()));
                }

                if (savingsCheckBox.isSelected()) {
                    UserAccount.setSavingsBalance(
                            UserAccount.getSavingsBalance() - Integer.parseInt(amountValueLabel.getText()));
                } else if (chequingCheckBox.isSelected()) {
                    UserAccount.setChequingBalance(
                            UserAccount.getChequingBalance() - Integer.parseInt(amountValueLabel.getText()));
                } else if (investmentsCheckBox.isSelected()) {
                    UserAccount.setInvestmentsBalance(
                            UserAccount.getInvestmentsBalance() - Integer.parseInt(amountValueLabel.getText()));
                }

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
        }

        if (e.getSource() == customCheckBox) {
            percent10CheckBox.setSelected(false);
            percent25CheckBox.setSelected(false);
            percent50CheckBox.setSelected(false);
            percent100CheckBox.setSelected(false);
            if (customCheckBox.isSelected() == true) {
                customTextField.setVisible(true);
            } else {
                customTextField.setVisible(false);
            }
        } else if (e.getSource() == percent100CheckBox) {
            if (accountFrom.equals("Savings")) {
                amountValueLabel.setText(Integer.toString(UserAccount.getSavingsBalance()));
            } else if (accountFrom.equals("Chequing")) {
                amountValueLabel.setText(Integer.toString(UserAccount.getChequingBalance()));
            } else if (accountFrom.equals("Investments")) {
                amountValueLabel.setText(Integer.toString(UserAccount.getInvestmentsBalance()));
            }
            percent10CheckBox.setSelected(false);
            percent25CheckBox.setSelected(false);
            percent50CheckBox.setSelected(false);
            customCheckBox.setSelected(false);
        } else if (e.getSource() == percent50CheckBox) {
            if (accountFrom.equals("Savings")) {
                amountValueLabel.setText(Double.toString(UserAccount.getSavingsBalance() * 0.5));
            } else if (accountFrom.equals("Chequing")) {
                amountValueLabel.setText(Double.toString(UserAccount.getChequingBalance() * 0.5));
            } else if (accountFrom.equals("Investments")) {
                amountValueLabel.setText(Double.toString(UserAccount.getInvestmentsBalance() * 0.5));
            }
            percent10CheckBox.setSelected(false);
            percent25CheckBox.setSelected(false);
            customCheckBox.setSelected(false);
            percent100CheckBox.setSelected(false);
        } else if (e.getSource() == percent25CheckBox) {
            if (accountFrom.equals("Savings")) {
                amountValueLabel.setText(Double.toString(UserAccount.getSavingsBalance() * 0.25));
            } else if (accountFrom.equals("Chequing")) {
                amountValueLabel.setText(Double.toString(UserAccount.getChequingBalance() * 0.25));
            } else if (accountFrom.equals("Investments")) {
                amountValueLabel.setText(Double.toString(UserAccount.getInvestmentsBalance() * 0.25));
            }
            percent10CheckBox.setSelected(false);
            customCheckBox.setSelected(false);
            percent50CheckBox.setSelected(false);
            percent100CheckBox.setSelected(false);
        } else if (e.getSource() == percent10CheckBox) {
            if (accountFrom.equals("Savings")) {
                amountValueLabel.setText(Double.toString(UserAccount.getSavingsBalance() * 0.10));
            } else if (accountFrom.equals("Chequing")) {
                amountValueLabel.setText(Double.toString(UserAccount.getChequingBalance() * 0.10));
            } else if (accountFrom.equals("Investments")) {
                amountValueLabel.setText(Double.toString(UserAccount.getInvestmentsBalance() * 0.10));
            }
            customCheckBox.setSelected(false);
            percent25CheckBox.setSelected(false);
            percent50CheckBox.setSelected(false);
            percent100CheckBox.setSelected(false);
        }

        // if (e.getSource() == )

        if (e.getSource() == backButton) {
            if (accountFrom.equals("Chequing")) {
                ChequingAccountScreen frame = new ChequingAccountScreen();
                frame.setTitle("Chequing");

                frame.getContentPane().setBackground(UserAccount.getColourTheme());
                frame.setVisible(true);
                frame.setBounds(10, 10, 600, 600);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                this.dispose();
            } else if (accountFrom.equals("Savings")) {
                SavingsAccountScreen frame = new SavingsAccountScreen();
                frame.setTitle("Savings");

                frame.getContentPane().setBackground(UserAccount.getColourTheme());
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
}
