package src.Accounts.Account_Methods;
import javax.swing.*;

import src.GeneralScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DepositScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton backButton = new JButton("Back");
    JLabel titleLabel = new JLabel("Enter the amount to deposit into this account:");
    JTextField amountTextField = new JTextField();
    JButton confirmButton = new JButton("Confirm");

    public DepositScreen() {
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