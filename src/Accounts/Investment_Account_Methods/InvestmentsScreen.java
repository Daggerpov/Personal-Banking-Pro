package src.Accounts.Investment_Account_Methods;

import javax.swing.*;

import src.UserAccount;
import src.Accounts.InvestmentsAccountScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvestmentsScreen extends JFrame implements ActionListener {

    String share1 = "Google";
    String share2 = "Apple";
    String share3 = "Microsoft";
    String share4 = "Tesla";
    String share1Value = "$14422";
    String share2Value = "$3463";
    String share3Value = "$36567";
    String share4Value = "$1244";
    String share1Change = "(34.6%)";
    String share2Change = "(12%)";
    String share3Change = "(18.9%)";
    String share4Change = "(23.6%)";
    String share1ValueChange = "$3450";
    String share2ValueChange = "$3525";
    String share3ValueChange = "$2340";
    String share4ValueChange = "$1200";
    int amountChangedShare1 = 12;
    int amountChangedShare2 = 34;
    int amountChangedShare3 = 457;
    int amountChangedShare4 = -131;

    Container container = getContentPane();
    JButton backButton = new JButton("Back");

    JLabel share1Label = new JLabel(share1);
    JLabel share2Label = new JLabel(share2);
    JLabel share3Label = new JLabel(share3);
    JLabel share4Label = new JLabel(share4);

    JLabel share1ValueLabel = new JLabel(share1Value);
    JLabel share2ValueLabel = new JLabel(share2Value);
    JLabel share3ValueLabel = new JLabel(share3Value);
    JLabel share4ValueLabel = new JLabel(share4Value);

    JLabel share1ChangeLabel = new JLabel(share1Change);
    JLabel share2ChangeLabel = new JLabel(share2Change);
    JLabel share3ChangeLabel = new JLabel(share3Change);
    JLabel share4ChangeLabel = new JLabel(share4Change);

    JLabel share1ValueChangeLabel = new JLabel(share1ValueChange);
    JLabel share2ValueChangeLabel = new JLabel(share2ValueChange);
    JLabel share3ValueChangeLabel = new JLabel(share3ValueChange);
    JLabel share4ValueChangeLabel = new JLabel(share4ValueChange);

    JPanel share1Panel = new JPanel();
    JPanel share2Panel = new JPanel();
    JPanel share3Panel = new JPanel();
    JPanel share4Panel = new JPanel();

    JButton buy1Button = new JButton("BUY");
    JButton sell1Button = new JButton("SELL");
    JButton buy2Button = new JButton("BUY");
    JButton sell2Button = new JButton("SELL");
    JButton buy3Button = new JButton("BUY");
    JButton sell3Button = new JButton("SELL");
    JButton buy4Button = new JButton("BUY");
    JButton sell4Button = new JButton("SELL");

    JLabel greenArrowLabel1 = new JLabel("", new ImageIcon("images/Green Triangle.png"), SwingConstants.CENTER);
    JLabel redArrowLabel1 = new JLabel("", new ImageIcon("images/Red Triangle.png"), SwingConstants.CENTER);
    JLabel greenArrowLabel2 = new JLabel("", new ImageIcon("images/Green Triangle.png"), SwingConstants.CENTER);
    JLabel redArrowLabel2 = new JLabel("", new ImageIcon("images/Red Triangle.png"), SwingConstants.CENTER);
    JLabel greenArrowLabel3 = new JLabel("", new ImageIcon("images/Green Triangle.png"), SwingConstants.CENTER);
    JLabel redArrowLabel3 = new JLabel("", new ImageIcon("images/Red Triangle.png"), SwingConstants.CENTER);
    JLabel greenArrowLabel4 = new JLabel("", new ImageIcon("images/Green Triangle.png"), SwingConstants.CENTER);
    JLabel redArrowLabel4 = new JLabel("", new ImageIcon("images/Red Triangle.png"), SwingConstants.CENTER);

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
        backButton.setBounds(10, 10, 60, 40);

        buy1Button.setFont(new Font("Serif", Font.PLAIN, 20));
        sell1Button.setFont(new Font("Serif", Font.PLAIN, 20));
        buy2Button.setFont(new Font("Serif", Font.PLAIN, 20));
        sell2Button.setFont(new Font("Serif", Font.PLAIN, 20));
        buy3Button.setFont(new Font("Serif", Font.PLAIN, 20));
        sell3Button.setFont(new Font("Serif", Font.PLAIN, 20));
        buy4Button.setFont(new Font("Serif", Font.PLAIN, 20));
        sell4Button.setFont(new Font("Serif", Font.PLAIN, 20));
        share1Panel.setFont(new Font("Serif", Font.PLAIN, 20));

        share1Panel.setBounds(50, 100, 510, 40);
        share1Label.setBounds(60, 100, 100, 40);
        share1ValueLabel.setBounds(200, 100, 100, 40);
        buy1Button.setBounds(400, 100, 70, 40);
        sell1Button.setBounds(480, 100, 70, 40);
        if (amountChangedShare1 < 0) {
            redArrowLabel1.setBounds(100, 100, 100, 40);

        } else if (amountChangedShare1 > 0) {
            greenArrowLabel1.setBounds(100, 100, 100, 40);
        }

        share1Panel.add(share1Label);
        share1Panel.add(share1ValueChangeLabel);
        share1Panel.add(share1ChangeLabel);
        share1Panel.add(share1ValueLabel);
        share1Panel.setBackground(UserAccount.getColourTheme());

        share2Panel.setFont(new Font("Serif", Font.PLAIN, 20));
        share2Panel.setBounds(50, 150, 510, 40);
        share2Label.setBounds(60, 150, 100, 40);
        buy2Button.setBounds(400, 150, 70, 40);
        sell2Button.setBounds(480, 150, 70, 40);
        if (amountChangedShare2 < 0) {
            greenArrowLabel2.setVisible(false);
            redArrowLabel2.setBounds(100, 150, 100, 40);

        } else if (amountChangedShare2 > 0) {
            greenArrowLabel2.setBounds(100, 150, 100, 40);
            greenArrowLabel2.setVisible(true);
        }
        share2Panel.add(share2Label);
        share2Panel.add(share2ValueChangeLabel);
        share2Panel.add(share2ChangeLabel);
        share2Panel.add(share2ValueLabel);
        share2Panel.setBackground(UserAccount.getColourTheme());

        share3Panel.setFont(new Font("Serif", Font.PLAIN, 20));
        share3Panel.setBounds(50, 200, 510, 40);
        share3Label.setBounds(60, 200, 100, 40);
        buy3Button.setBounds(400, 200, 70, 40);
        sell3Button.setBounds(480, 200, 70, 40);
        if (amountChangedShare3 < 0) {
            redArrowLabel3.setBounds(100, 200, 100, 40);

        } else if (amountChangedShare3 > 0) {
            greenArrowLabel3.setBounds(100, 200, 100, 40);
        }
        share3Panel.add(share3Label);
        share3Panel.add(share3ValueChangeLabel);
        share3Panel.add(share3ChangeLabel);
        share3Panel.add(share3ValueLabel);
        share3Panel.setBackground(UserAccount.getColourTheme());

        share4Panel.setFont(new Font("Serif", Font.PLAIN, 20));
        share4Panel.setBounds(50, 250, 510, 40);
        share4Label.setBounds(60, 250, 100, 40);
        buy4Button.setBounds(400, 250, 70, 40);
        sell4Button.setBounds(480, 250, 70, 40);
        if (amountChangedShare4 < 0) {
            greenArrowLabel4.setVisible(false);
            redArrowLabel4.setBounds(100, 250, 100, 40);

        } else if (amountChangedShare4 > 0) {
            greenArrowLabel4.setBounds(100, 250, 100, 40);
            greenArrowLabel4.setVisible(true);
        }
        share4Panel.add(share4ValueLabel);
        share4Panel.add(share4ChangeLabel);
        share4Panel.add(share4ValueChangeLabel);
        share4Panel.setBackground(UserAccount.getColourTheme());
    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(backButton);
        container.add(buy1Button);
        container.add(sell1Button);
        container.add(buy2Button);
        container.add(sell2Button);
        container.add(buy3Button);
        container.add(sell3Button);
        container.add(buy4Button);
        container.add(sell4Button);
        container.add(greenArrowLabel1);
        container.add(redArrowLabel1);
        container.add(greenArrowLabel2);
        container.add(redArrowLabel2);
        container.add(greenArrowLabel3);
        container.add(redArrowLabel3);
        container.add(greenArrowLabel4);
        container.add(redArrowLabel4);
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
        buy1Button.addActionListener(this);
        sell1Button.addActionListener(this);
        buy2Button.addActionListener(this);
        sell2Button.addActionListener(this);
        buy3Button.addActionListener(this);
        sell3Button.addActionListener(this);
        buy4Button.addActionListener(this);
        sell4Button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // CONFIRM button logic
        if (e.getSource() == backButton) {
            InvestmentsAccountScreen frame = new InvestmentsAccountScreen();
            frame.setTitle("Investments Account");

            frame.getContentPane().setBackground(UserAccount.getColourTheme());
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
        // BUY buttons logic
        if (e.getSource() == buy1Button) {
            BuySharesScreen frame = new BuySharesScreen();
            frame.setTitle("Buy Shares");

            frame.getContentPane().setBackground(UserAccount.getColourTheme());
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setBackground(Color.CYAN);
            this.dispose();
        } else if (e.getSource() == buy2Button) {
            BuySharesScreen frame = new BuySharesScreen();
            frame.setTitle("Buy Shares");

            frame.getContentPane().setBackground(UserAccount.getColourTheme());
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setBackground(Color.CYAN);
            this.dispose();
        } else if (e.getSource() == buy3Button) {
            BuySharesScreen frame = new BuySharesScreen();
            frame.setTitle("Buy Shares");

            frame.getContentPane().setBackground(UserAccount.getColourTheme());
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setBackground(Color.CYAN);
            this.dispose();
        } else if (e.getSource() == buy4Button) {
            BuySharesScreen frame = new BuySharesScreen();
            frame.setTitle("Buy Shares");

            frame.getContentPane().setBackground(UserAccount.getColourTheme());
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setBackground(Color.CYAN);
            this.dispose();
        }

        // SELL buttons logic
        if (e.getSource() == sell1Button) {
            SellSharesScreen frame = new SellSharesScreen();
            frame.setTitle("Sell Shares");

            frame.getContentPane().setBackground(UserAccount.getColourTheme());
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        } else if (e.getSource() == sell2Button) {
            SellSharesScreen frame = new SellSharesScreen();
            frame.setTitle("Sell Shares");

            frame.getContentPane().setBackground(UserAccount.getColourTheme());
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        } else if (e.getSource() == sell3Button) {
            SellSharesScreen frame = new SellSharesScreen();
            frame.setTitle("Sell Shares");

            frame.getContentPane().setBackground(UserAccount.getColourTheme());
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        } else if (e.getSource() == sell4Button) {
            SellSharesScreen frame = new SellSharesScreen();
            frame.setTitle("Sell Shares");

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
