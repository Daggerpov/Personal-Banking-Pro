package src.Accounts.Investment_Account_Methods;
import javax.swing.*;

import src.Accounts.InvestmentsAccountScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvestmentsScreen extends JFrame implements ActionListener {

    String share1 = "Google";
    String share2 = "Apple";
    String share3 = "Microsoft";
    String share4 = "Tesla";

    Container container = getContentPane();
    JButton backButton = new JButton("Back");

    JLabel share1Label = new JLabel("share1");
    JLabel share2Label = new JLabel("share2");
    JLabel share3Label = new JLabel("share3");
    JLabel share4Label = new JLabel("share4");

    JPanel share1Panel = new JPanel();
    JPanel share2Panel = new JPanel();
    JPanel share3Panel = new JPanel();
    JPanel share4Panel = new JPanel();

    JButton buyButton = new JButton("BUY");
    JButton sellButton = new JButton("SELL");

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
        Color color=new Color(112, 230, 210);

        // Setting location and Size of each components using setBounds() method.
        backButton.setFont(new Font("Serif", Font.PLAIN, 20));
        backButton.setBounds(10, 10, 60, 40);

        share1Panel.setFont(new Font("Serif", Font.PLAIN, 20));
        share1Panel.setBounds(50, 100, 510, 40);
        share1Panel.add(share1Label); share1Panel.add(buyButton); share1Panel.add(sellButton);
        share1Panel.setBackground(color);

        share2Panel.setFont(new Font("Serif", Font.PLAIN, 20));
        share2Panel.setBounds(50, 150, 510, 40);
        share2Panel.add(share2Label); share2Panel.add(buyButton); share2Panel.add(sellButton);
        share2Panel.setBackground(color);

        share3Panel.setFont(new Font("Serif", Font.PLAIN, 20));
        share3Panel.setBounds(50, 200, 510, 40);
        share3Panel.add(share3Label); share3Panel.add(buyButton); share3Panel.add(sellButton);
        share3Panel.setBackground(color);

        share4Panel.setFont(new Font("Serif", Font.PLAIN, 20));
        share4Panel.setBounds(50, 250, 510, 40);
         share4Panel.add(buyButton); share4Panel.add(sellButton);
        share4Panel.setBackground(color);

        buyButton.setFont(new Font("Serif", Font.PLAIN, 20));
        buyButton.setBounds(400, 100, 70, 40);
        sellButton.setFont(new Font("Serif", Font.PLAIN, 20));
        sellButton.setBounds(480, 100, 70, 40);
    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(backButton);
        container.add(buyButton);
        container.add(sellButton);
        container.add(share1Label);
        container.add(share2Label);
        container.add(share3Label);
        container.add(share4Label);
        container.add(share1Panel);
        container.add(share2Panel);
        container.add(share3Panel);
        container.add(share4Panel);
    }

    public void addActionEvent() {
        backButton.addActionListener(this);
        buyButton.addActionListener(this);
        sellButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // CONFIRM button logic
        if (e.getSource() == backButton) {
            InvestmentsAccountScreen frame = new InvestmentsAccountScreen();
            frame.setTitle("Investments Account");
            Color color=new Color(41, 171, 135);
        	frame.getContentPane().setBackground(color);          
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // BUY buttons logic
        if (e.getSource() == buyButton) {
            BuySharesScreen frame = new BuySharesScreen();
            frame.setTitle("Buy Shares");
            Color color=new Color(41, 171, 135);
        	frame.getContentPane().setBackground(color);         
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setBackground(Color.CYAN);
            this.dispose();
        }
        // SELL buttons logic
        if (e.getSource() == sellButton) {
            SellSharesScreen frame = new SellSharesScreen();
            frame.setTitle("Sell Shares");
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
