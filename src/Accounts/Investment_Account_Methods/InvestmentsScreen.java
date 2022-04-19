package src.Accounts.Investment_Account_Methods;
import javax.swing.*;

import src.GeneralScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvestmentsScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton backButton = new JButton("BACK");
    JButton buy1Button = new JButton("BUY");
    JButton sell1Button = new JButton("SELL");
    JButton buy2Button = new JButton("BUY");
    JButton sell2Button = new JButton("SELL");
    JButton buy3Button = new JButton("BUY");
    JButton sell3Button = new JButton("SELL");
    JButton buy4Button = new JButton("BUY");
    JButton sell4Button = new JButton("SELL");

    public InvestmentsScreen() {
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
        backButton.setBounds(225, 350, 150, 40);

        buy1Button.setFont(new Font("Serif", Font.PLAIN, 20));
        buy1Button.setBounds(225, 350, 150, 40);
        sell1Button.setFont(new Font("Serif", Font.PLAIN, 20));
        sell1Button.setBounds(225, 350, 150, 40);

        buy2Button.setFont(new Font("Serif", Font.PLAIN, 20));
        buy2Button.setBounds(225, 350, 150, 40);
        sell2Button.setFont(new Font("Serif", Font.PLAIN, 20));
        sell2Button.setBounds(225, 350, 150, 40);

        buy3Button.setFont(new Font("Serif", Font.PLAIN, 20));
        buy3Button.setBounds(225, 350, 150, 40);
        sell3Button.setFont(new Font("Serif", Font.PLAIN, 20));
        sell3Button.setBounds(225, 350, 150, 40);

        buy4Button.setFont(new Font("Serif", Font.PLAIN, 20));
        buy4Button.setBounds(225, 350, 150, 40);
        sell4Button.setFont(new Font("Serif", Font.PLAIN, 20));
        sell4Button.setBounds(225, 350, 150, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(backButton);
        container.add(buy1Button);
        container.add(buy2Button);
        container.add(buy3Button);
        container.add(buy4Button);
        container.add(sell1Button);
        container.add(sell2Button);
        container.add(sell3Button);
        container.add(sell4Button);
    }

    public void addActionEvent() {
        backButton.addActionListener(this);
        buy1Button.addActionListener(this);
        buy2Button.addActionListener(this);
        buy3Button.addActionListener(this);
        buy4Button.addActionListener(this);
        sell1Button.addActionListener(this);
        sell2Button.addActionListener(this);
        sell3Button.addActionListener(this);
        sell4Button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // CONFIRM button logic
        if (e.getSource() == backButton) {
            GeneralScreen frame = new GeneralScreen();
            frame.setTitle("General");
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // BUY buttons logic
        if (e.getSource() == buy1Button && e.getSource() == buy2Button && e.getSource() == buy3Button && e
                .getSource() == buy4Button) {
            BuySharesScreen frame = new BuySharesScreen();
            frame.setTitle("Buy Shares");
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // SELL buttons logic
        if (e.getSource() == sell1Button && e.getSource() == sell2Button && e.getSource() == sell3Button && e
                .getSource() == sell4Button) {
            SellSharesScreen frame = new SellSharesScreen();
            frame.setTitle("Sell Shares");
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
    }
}
