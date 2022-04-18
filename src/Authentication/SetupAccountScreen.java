package src.Authentication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetupAccountScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel savingsLabel = new JLabel("Creae Savings Account");
    JCheckBox savingsBox = new JCheckBox();
    JLabel checkingsLabel = new JLabel("Create Checking Account");
    JCheckBox checkingsBox = new JCheckBox();
    JLabel investmentLabel = new JLabel("Create Investment Account");
    JCheckBox investmentBox = new JCheckBox();
    JLabel savingsBalanceLabel = new JLabel("Balance:");
    JTextField savingsTextField = new JTextField();
    JLabel checkingsBalanceLabel = new JLabel("Balance:");
    JTextField checkingsTextField = new JTextField();
    JLabel investmentsBalanceLabel = new JLabel("Balance:");
    JTextField investmentsTextField = new JTextField();
    JButton nextButton = new JButton("Next");

    SetupAccountScreen() {
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

        savingsLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        savingsLabel.setBounds(10, 50, 500, 30);
        savingsBox.setBounds(225, 50, 150, 30);
        

        checkingsLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        checkingsLabel.setBounds(10, 140, 500, 30);
        checkingsBox.setBounds(375, 140, 150, 30);

        investmentLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        investmentLabel.setBounds(10, 200, 100, 30);
        investmentBox.setBounds(110, 200, 150, 30);



        nextButton.setFont(new Font("Serif", Font.PLAIN, 20));
        nextButton.setBounds(10, 500, 50, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(investmentLabel);
        container.add(savingsLabel);
        container.add(checkingsLabel);
        container.add(savingsBox);
        container.add(checkingsBox);
        container.add(investmentBox);
        container.add(investmentsBalanceLabel);
        container.add(savingsBalanceLabel);
        container.add(checkingsBalanceLabel);
        container.add(checkingsTextField);
        container.add(savingsTextField);
        container.add(investmentsTextField);
        container.add(nextButton);
    }

    //public void addActionEvent() {
    //    showPassword.addActionListener(this);
    //}

    @Override
    public void actionPerformed(ActionEvent e) {
        // actions here
    }
}