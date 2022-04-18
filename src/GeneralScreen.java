package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeneralScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton visitSavingsButton = new JButton("Savings");
    JButton visitCheckingsButton = new JButton("Checkings");
    JButton visitInvestmentsButton = new JButton("Investments");
    JButton settingsButton = new JButton("Settings");

    GeneralScreen() {
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
        visitCheckingsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        visitCheckingsButton.setBounds(10, 400, 50, 40);

        visitInvestmentsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        visitInvestmentsButton.setBounds(100, 400, 50, 40);

        visitSavingsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        visitSavingsButton.setBounds(200, 400, 50, 40);

        settingsButton.setFont(new Font("Serif", Font.PLAIN, 20));
        settingsButton.setBounds(200, 400, 50, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(visitCheckingsButton);
        container.add(visitInvestmentsButton);
        container.add(visitSavingsButton);
        container.add(settingsButton);
        
    }

    //public void addActionEvent() {
    //    showPassword.addActionListener(this);
    //}

    @Override
    public void actionPerformed(ActionEvent e) {
        // actions here
    }
}
