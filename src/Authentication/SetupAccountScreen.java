package src.Authentication;

import javax.swing.*;

import src.GeneralScreen;
import src.UserAccount;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetupAccountScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel savingsLabel = new JLabel("Create Savings Account");
    JCheckBox savingsBox = new JCheckBox();
    JLabel chequingLabel = new JLabel("Create Chequing Account");
    JCheckBox chequingBox = new JCheckBox();
    JLabel investmentsLabel = new JLabel("Create Investments Account");
    JCheckBox investmentsBox = new JCheckBox();

    JLabel savingsBalanceLabel = new JLabel("Balance ($):");
    JTextField savingsTextField = new JTextField();
    JLabel chequingBalanceLabel = new JLabel("Balance ($):");
    JTextField chequingTextField = new JTextField();
    JLabel investmentsBalanceLabel = new JLabel("Balance ($):");
    JTextField investmentsTextField = new JTextField();
    JButton nextButton = new JButton("Next");

    public SetupAccountScreen() {
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

        savingsLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        savingsLabel.setBounds(10, 50, 500, 30);
        savingsBox.setBounds(250, 50, 150, 30);

        chequingLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        chequingLabel.setBounds(10, 140, 500, 30);
        chequingBox.setBounds(250, 140, 150, 30);

        investmentsLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        investmentsLabel.setBounds(10, 230, 400, 30);
        investmentsBox.setBounds(250, 230, 150, 30);

        savingsBalanceLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        savingsBalanceLabel.setBounds(375, 50, 500, 30);
        savingsBalanceLabel.setVisible(false);

        savingsTextField.setFont(new Font("Serif", Font.PLAIN, 20));
        savingsTextField.setBounds(475, 50, 100, 30);
        savingsTextField.setVisible(false);

        chequingBalanceLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        chequingBalanceLabel.setBounds(375, 140, 500, 30);
        chequingBalanceLabel.setVisible(false);

        chequingTextField.setFont(new Font("Serif", Font.PLAIN, 20));
        chequingTextField.setBounds(475, 140, 100, 30);
        chequingTextField.setVisible(false);

        investmentsBalanceLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        investmentsBalanceLabel.setBounds(375, 230, 500, 30);
        investmentsBalanceLabel.setVisible(false);

        investmentsTextField.setFont(new Font("Serif", Font.PLAIN, 20));
        investmentsTextField.setBounds(475, 230, 100, 30);
        investmentsTextField.setVisible(false);

        nextButton.setFont(new Font("Serif", Font.PLAIN, 20));
        nextButton.setBounds(10, 500, 55, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(investmentsLabel);
        container.add(savingsLabel);
        container.add(chequingLabel);
        container.add(savingsBox);
        container.add(chequingBox);
        container.add(investmentsBox);
        container.add(investmentsBalanceLabel);
        container.add(savingsBalanceLabel);
        container.add(chequingBalanceLabel);
        container.add(chequingTextField);
        container.add(savingsTextField);
        container.add(investmentsTextField);
        container.add(nextButton);
    }

    public void addActionEvent() {
        nextButton.addActionListener(this);
        savingsBox.addActionListener(this);
        chequingBox.addActionListener(this);
        investmentsBox.addActionListener(this);
        savingsTextField.addActionListener(this);
        chequingTextField.addActionListener(this);
        investmentsTextField.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == savingsBox) {
            if (savingsBox.isSelected() == true) {
                savingsBalanceLabel.setVisible(true);
                savingsTextField.setVisible(true);
            } else {
                savingsBalanceLabel.setVisible(false);
                savingsTextField.setVisible(false);
            }

        }
        if (e.getSource() == chequingBox) {
            if (chequingBox.isSelected() == true) {
                chequingBalanceLabel.setVisible(true);
                chequingTextField.setVisible(true);
            } else {
                chequingBalanceLabel.setVisible(false);
                chequingTextField.setVisible(false);
            }
        }
        if (e.getSource() == investmentsBox) {
            if (investmentsBox.isSelected() == true) {
                investmentsBalanceLabel.setVisible(true);
                investmentsTextField.setVisible(true);
            } else {
                investmentsBalanceLabel.setVisible(false);
                investmentsTextField.setVisible(false);
            }
        }

        // NEXT button logic
        if (e.getSource() == nextButton) {
            String chequingBalance = chequingTextField.getText();
            String savingsBalance = savingsTextField.getText();
            String investmentsBalance = investmentsTextField.getText();

            if (savingsBalanceLabel.isVisible() == true && savingsTextField.getText().equals("")
                    || chequingBalanceLabel
                            .isVisible() == true && chequingTextField.getText().equals("")
                    || investmentsBalanceLabel
                            .isVisible() == true && investmentsTextField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Empty Balance(s)", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (chequingBalance.matches("^\\d+\\.\\d+")) {
                JOptionPane.showMessageDialog(this, "Cannot input decimal values", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                

                if (!chequingBalance.isEmpty()) {
                    UserAccount.setChequingBalance((Integer.parseInt(chequingBalance)));
                }
                if (!savingsBalance.isEmpty()) {
                    UserAccount.setSavingsBalance((Integer.parseInt(savingsBalance)));
                }
                if (!investmentsBalance.isEmpty()) {
                    UserAccount.setInvestmentsBalance((Integer.parseInt(investmentsBalance)));
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
    }
}
