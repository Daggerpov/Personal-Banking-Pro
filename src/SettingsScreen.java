package src;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton backButton = new JButton("Back");
    JLabel themeLabel = new JLabel("Select a Theme:");
    JCheckBox theme1Box = new JCheckBox("Theme 1");
    JLabel theme1Label = new JLabel("", new ImageIcon("images/Theme1Color.png"), SwingConstants.CENTER);
    JCheckBox theme2Box = new JCheckBox("Theme 2");
    JLabel theme2Label = new JLabel("", new ImageIcon("images/Theme2Color.png"), SwingConstants.CENTER);
    JCheckBox theme3Box = new JCheckBox("Theme 3");
    JLabel theme3Label = new JLabel("", new ImageIcon("images/Theme3Color.png"), SwingConstants.CENTER);

    JLabel messageLabel = new JLabel("Theme will change upon pressing back");
    JButton deleteAccountButton = new JButton("Delete Account");

    public SettingsScreen() {
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

        //TODO make not ugly and then implement again if we want to
        //Border blackline = BorderFactory.createLineBorder(Color.black); 

        backButton.setFont(new Font("Serif", Font.PLAIN, 20));
        backButton.setBounds(10, 10, 60, 40);

        themeLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        themeLabel.setBounds(10, 130, 500, 30);

        theme1Label.setBounds(130, 135, 150, 60);
        //theme1Label.setBorder(blackline);
        theme1Box.setBounds(155, 180, 100, 60);

        theme2Label.setBounds(290, 135, 150, 60);
        //theme2Label.setBorder(blackline);
        theme2Box.setBounds(320, 180, 100, 60);

        theme3Label.setBounds(460, 135, 150, 60);
        //theme3Label.setBorder(blackline);
        theme3Box.setBounds(490, 180, 100, 60);

        messageLabel.setFont(new Font("Serif", Font.PLAIN, 16));
        messageLabel.setBounds(175, 300, 400, 30);

        deleteAccountButton.setFont(new Font("Serif", Font.PLAIN, 20));
        deleteAccountButton.setBounds(225, 400, 150, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(backButton);
        container.add(themeLabel);
        container.add(theme1Label);
        container.add(theme1Box);
        container.add(theme2Label);
        container.add(theme2Box);
        container.add(theme3Label);
        container.add(theme3Box);
        container.add(messageLabel);
        container.add(deleteAccountButton);
    }

    public void addActionEvent() {
        backButton.addActionListener(this);
        deleteAccountButton.addActionListener(this);
        theme1Box.addActionListener(this);
        theme2Box.addActionListener(this);
        theme3Box.addActionListener(this);
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
        // DELETE ACCOUNT button logic
        if (e.getSource() == deleteAccountButton) {
            DeleteAccountScreen frame = new DeleteAccountScreen();
            frame.setTitle("Delete Account");

            frame.getContentPane().setBackground(UserAccount.getColourTheme());
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }

        if (e.getSource() == theme1Box) {
            UserAccount.setColourTheme("red");
            theme2Box.setSelected(false);
            theme3Box.setSelected(false);
        } else if (e.getSource() == theme2Box) {
            UserAccount.setColourTheme("purple");
            theme1Box.setSelected(false);
            theme3Box.setSelected(false);
        } else if (e.getSource() == theme3Box) {
            UserAccount.setColourTheme("turquoise");
            theme2Box.setSelected(false);
            theme1Box.setSelected(false);
        }

    }
}
