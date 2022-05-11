package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ETransferScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton backButton = new JButton("Back");
    JLabel chooseContactLabel = new JLabel("Choose Contact");
    // TODO Need to create a dropdown menu
    JLabel selectAccountLabel = new JLabel("Select Account");
    JCheckBox box1 = new JCheckBox("Chequing");
    JCheckBox box2 = new JCheckBox("Savings");
    JLabel amountJLabel = new JLabel("Enter Amount:");
    JTextField amountTextField = new JTextField();
    JButton clearButton = new JButton("Clear");
    JButton confirmButton = new JButton("Confirm");

    public ETransferScreen() {
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

        chooseContactLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        chooseContactLabel.setBounds(30, 80, 600, 30);
        selectAccountLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        selectAccountLabel.setBounds(30, 200, 600, 30);

        box1.setBounds(110, 240, 150, 30);
        box2.setBounds(350, 240, 150, 30);

        amountJLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        amountJLabel.setBounds(160, 300, 500, 30);
        amountTextField.setBounds(285, 300, 150, 30);

        clearButton.setFont(new Font("Serif", Font.PLAIN, 20));
        clearButton.setBounds(200, 450, 100, 40);
        confirmButton.setFont(new Font("Serif", Font.PLAIN, 20));
        confirmButton.setBounds(300, 450, 100, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(backButton);
        container.add(chooseContactLabel);
        container.add(selectAccountLabel);
        container.add(box1);
        container.add(box2);
        container.add(amountJLabel);
        container.add(amountTextField);
        container.add(clearButton);
        container.add(confirmButton);
    }

    public void addActionEvent() {
        backButton.addActionListener(this);
        confirmButton.addActionListener(this);
        clearButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // BACK button logic
        if (e.getSource() == backButton) {
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
        // CLEAR button logic
        if (e.getSource() == clearButton) {
            amountTextField.setText("");
        }
        // CONFIRM button logic
        if (e.getSource() == confirmButton) {
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
