package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteAccountScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel title1Label = new JLabel("You will be able to use your first and last name to create a new account");
    JLabel title2Label = new JLabel("All data from this account will be erased including your balances");
    JButton backButton = new JButton("Back");
    JButton confirmButton = new JButton("Confirm");

    DeleteAccountScreen() {
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
        title1Label.setFont(new Font("Serif", Font.PLAIN, 20));
        title1Label.setBounds(85, 20, 600, 30);

        title2Label.setFont(new Font("Serif", Font.PLAIN, 20));
        title2Label.setBounds(85, 20, 600, 30);

        backButton.setFont(new Font("Serif", Font.PLAIN, 20));
        backButton.setBounds(225, 350, 150, 40);

        confirmButton.setFont(new Font("Serif", Font.PLAIN, 20));
        confirmButton.setBounds(225, 350, 150, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(title1Label);
        container.add(title2Label);
        container.add(backButton);
        container.add(confirmButton);
    }

    //public void addActionEvent() {
    //   showPassword.addActionListener(this);
    //}

    @Override
    public void actionPerformed(ActionEvent e) {
        // actions here
    }
}
