package src.Accounts.Investment_Account_Methods;
import javax.swing.*;

import src.GeneralScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuySharesScreen extends JFrame implements ActionListener {

    String share1 = "";
    String share2 = "";
    String share3 = "";
    String share4 = "";

    Container container = getContentPane();
    JButton backButton = new JButton("Back");
    JLabel titleLabel = new JLabel("Select an Investment");
    JLabel sharesLabel = new JLabel("Amount of Shares");
    JCheckBox share1CheckBox = new JCheckBox(share1);
    JCheckBox share2CheckBox = new JCheckBox(share2);
    JCheckBox share3CheckBox = new JCheckBox(share3);
    JCheckBox share4CheckBox = new JCheckBox(share4);
    JCheckBox customCheckBox = new JCheckBox("Custom:");
    JButton confirmButton = new JButton("Confirm");

    public BuySharesScreen() {
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
        titleLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        titleLabel.setBounds(85, 20, 600, 30);

        confirmButton.setFont(new Font("Serif", Font.PLAIN, 20));
        confirmButton.setBounds(225, 350, 150, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(titleLabel);
        container.add(confirmButton);
    }

    public void addActionEvent() {
       confirmButton.addActionListener(this);
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
    }
}