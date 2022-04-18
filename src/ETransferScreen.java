package src;
import javax.security.auth.callback.NameCallback;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ETransferScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton backButton = new JButton("Back");
    JLabel chooseContactLabel = new JLabel("Choose Contact");
    JLabel selectAccountLabel = new JLabel("Select Account");
    JCheckBox box1 = new JCheckBox("Checkings");
    JCheckBox box2 = new JCheckBox("Savings");
    JLabel amountJLabel = new JLabel("Enter Amount:");
    JTextField amounTextField = new JTextField();
    JButton clearButton = new JButton("Clear");
    JButton confirmButton = new JButton("Confirm");

    public ETransferScreen() {
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
        backButton.setBounds(225, 350, 150, 40);

        chooseContactLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        selectAccountLabel.setBounds(85, 20, 600, 30);

        box1.setBounds(110, 200, 150, 30);
        box2.setBounds(110, 200, 150, 30);

        amountJLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        amountJLabel.setBounds(10, 80, 500, 30);
        amounTextField.setBounds(225, 80, 150, 30);

        clearButton.setFont(new Font("Serif", Font.PLAIN, 20));
        clearButton.setBounds(225, 350, 150, 40);

        confirmButton.setFont(new Font("Serif", Font.PLAIN, 20));
        confirmButton.setBounds(225, 350, 150, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(backButton);
        container.add(chooseContactLabel);
        container.add(selectAccountLabel);
        container.add(box1);
        container.add(box2);
        container.add(amountJLabel);
        container.add(amounTextField);
        container.add(clearButton);
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
