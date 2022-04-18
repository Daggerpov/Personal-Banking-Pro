package src.Accounts.Investment_Account_Methods;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SellSharesScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel titleLabel = new JLabel("Enter the amount to transfer:");
    JLabel title2Label = new JLabel("Select an Investment");
    JLabel sharesLabel = new JLabel("Amount of Shares:");
    JButton confirmButton = new JButton("Confirm");

    public SellSharesScreen() {
        // Calling methods inside constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        //addActionEvent();
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

    //public void addActionEvent() {
    //    showPassword.addActionListener(this);
    //}

    @Override
    public void actionPerformed(ActionEvent e) {
        // actions here
    }
}