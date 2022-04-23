package src.Authentication;

import javax.swing.*;

import src.GeneralScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetupAccountScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel savingsLabel = new JLabel("Create Savings Account");
    JCheckBox savingsBox = new JCheckBox();
    JLabel chequingsLabel = new JLabel("Create Chequings Account");
    JCheckBox chequingsBox = new JCheckBox();
    JLabel investmentLabel = new JLabel("Create Investment Account");
    JCheckBox investmentBox = new JCheckBox();

    JLabel savingsBalanceLabel = new JLabel("Balance:");
    JTextField savingsTextField = new JTextField();
    JLabel chequingsBalanceLabel = new JLabel("Balance:");
    JTextField chequingsTextField = new JTextField();
    JLabel investmentsBalanceLabel = new JLabel("Balance:");
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

        chequingsLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        chequingsLabel.setBounds(10, 140, 500, 30);
        chequingsBox.setBounds(250, 140, 150, 30);

        investmentLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        investmentLabel.setBounds(10, 230, 400, 30);
        investmentBox.setBounds(250, 230, 150, 30);

        savingsBalanceLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        savingsBalanceLabel.setBounds(375, 50, 500, 30);
        savingsBalanceLabel.setVisible(false);

        savingsTextField.setFont(new Font("Serif", Font.PLAIN, 20));
        savingsTextField.setBounds(450, 50, 100, 30);
        savingsTextField.setVisible(false);

        chequingsBalanceLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        chequingsBalanceLabel.setBounds(375, 140, 500, 30);
        chequingsBalanceLabel.setVisible(false);

        chequingsTextField.setFont(new Font("Serif", Font.PLAIN, 20));
        chequingsTextField.setBounds(450, 140, 100, 30);
        chequingsTextField.setVisible(false);

        investmentsBalanceLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        investmentsBalanceLabel.setBounds(375, 230, 500, 30);
        investmentsBalanceLabel.setVisible(false);

        investmentsTextField.setFont(new Font("Serif", Font.PLAIN, 20));
        investmentsTextField.setBounds(450, 230, 100, 30);
        investmentsTextField.setVisible(false);

        nextButton.setFont(new Font("Serif", Font.PLAIN, 20));
        nextButton.setBounds(10, 500, 55, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(investmentLabel);
        container.add(savingsLabel);
        container.add(chequingsLabel);
        container.add(savingsBox);
        container.add(chequingsBox);
        container.add(investmentBox);
        container.add(investmentsBalanceLabel);
        container.add(savingsBalanceLabel);
        container.add(chequingsBalanceLabel);
        container.add(chequingsTextField);
        container.add(savingsTextField);
        container.add(investmentsTextField);
        container.add(nextButton);
    }

    public void addActionEvent() {
        nextButton.addActionListener(this);
        savingsBox.addActionListener(this);
        chequingsBox.addActionListener(this);
        investmentBox.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == savingsBox){
            if (savingsBox.isSelected() == true){
                savingsBalanceLabel.setVisible(true);
                savingsTextField.setVisible(true);
            } else {
                savingsBalanceLabel.setVisible(false);
                savingsTextField.setVisible(false);
            }
            
        }
        if (e.getSource() == chequingsBox){
            if (chequingsBox.isSelected() == true){
                chequingsBalanceLabel.setVisible(true);
                chequingsTextField.setVisible(true);
            } else {
                chequingsBalanceLabel.setVisible(false);
                chequingsTextField.setVisible(false);
            }
        }
        if (e.getSource() == investmentBox) {
            if (investmentBox.isSelected() == true) {
                investmentsBalanceLabel.setVisible(true);
                investmentsTextField.setVisible(true);
            } else {
                investmentsBalanceLabel.setVisible(false);
                investmentsTextField.setVisible(false);
            }
        }
        
        // NEXT button logic
        if (e.getSource() == nextButton) {
            if (savingsBalanceLabel.isVisible() == true && savingsTextField.getText().equals("") || chequingsBalanceLabel
                    .isVisible() == true && chequingsTextField.getText().equals("") || investmentsBalanceLabel
                            .isVisible() == true && investmentsTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Empty Balance(s)");
            } else {
                GeneralScreen frame = new GeneralScreen();
                frame.setTitle("General");
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
