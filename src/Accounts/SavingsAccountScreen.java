package src.Accounts;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SavingsAccountScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton backButton = new JButton("Back");
    JLabel balanceLabel = new JLabel("Balance:");
    JLabel interestLabel = new JLabel("Interest Earned to Date:");
    JButton withdrawButton = new JButton("Withdraw");
    JButton depositButton = new JButton("Deposit");
    JButton transferButton = new JButton("Transfer");

    public SavingsAccountScreen() {
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
        backButton.setFont(new Font("Serif", Font.PLAIN, 20));
        backButton.setBounds(10, 10, 60, 40);

        balanceLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        balanceLabel.setBounds(50, 60, 600, 30);

        interestLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        interestLabel.setBounds(50, 140, 600, 30);

        withdrawButton.setFont(new Font("Serif", Font.PLAIN, 20));
        withdrawButton.setBounds(225, 300, 150, 40);

        depositButton.setFont(new Font("Serif", Font.PLAIN, 20));
        depositButton.setBounds(225, 350, 150, 40);

        transferButton.setFont(new Font("Serif", Font.PLAIN, 20));
        transferButton.setBounds(225, 400, 150, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(backButton);
        container.add(interestLabel);
        container.add(balanceLabel);
        container.add(withdrawButton);
        container.add(depositButton);
        container.add(transferButton);
    }

    //public void addActionEvent() {
    //    showPassword.addActionListener(this);
    //}

    @Override
    public void actionPerformed(ActionEvent e) {
        // actions here
    }
}
