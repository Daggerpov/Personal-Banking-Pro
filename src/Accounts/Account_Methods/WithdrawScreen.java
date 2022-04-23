package src.Accounts.Account_Methods;
import javax.swing.*;

import src.GeneralScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WithdrawScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel title1Label = new JLabel("Select the amount to transfer:");
    JCheckBox percent10CheckBox = new JCheckBox("10%");
    JCheckBox percent25CheckBox = new JCheckBox("25%");
    JCheckBox percent50CheckBox = new JCheckBox("50%");
    JCheckBox percent100CheckBox = new JCheckBox("100%");
    JCheckBox customCheckBox = new JCheckBox("Custom:");
    JTextField customTextField = new JTextField();
    JLabel amountLabel = new JLabel("Amount:");
    JTextField amountTextField = new JTextField();
    JButton confirmButton = new JButton("Confirm");


    public WithdrawScreen() {
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
        amountLabel.setBounds(225, 200, 600, 30);
        amountTextField.setBounds(310, 200, 100, 30);

        confirmButton.setFont(new Font("Serif", Font.PLAIN, 20));
        confirmButton.setBounds(225, 425, 150, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(title1Label);
        container.add(percent10CheckBox);
        container.add(percent25CheckBox);
        container.add(percent50CheckBox);
        container.add(percent100CheckBox);
        container.add(customCheckBox);
        container.add(customTextField);
        container.add(amountLabel);
        container.add(amountTextField);
        container.add(confirmButton);
    }

    public void addActionEvent() {
       confirmButton.addActionListener(this);

       customCheckBox.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // CONFIRM button logic
        if (e.getSource() == confirmButton) {
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
        if (e.getSource() == customCheckBox) {
            if (customCheckBox.isSelected() == true) {
                customTextField.setVisible(true);
            } else {
                customTextField.setVisible(false);
            }
        }
    }
}