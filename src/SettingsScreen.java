package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton backButton = new JButton("Back");
    JLabel themeLabel = new JLabel("Select a Theme:");
    JCheckBox theme1Box = new JCheckBox("Theme 1");
    JCheckBox theme2Box = new JCheckBox("Theme 2");
    JCheckBox theme3Box = new JCheckBox("Theme 3");
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

        backButton.setFont(new Font("Serif", Font.PLAIN, 20));
        backButton.setBounds(10, 10, 60, 40);

        themeLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        themeLabel.setBounds(10, 130, 500, 30);

        theme1Box.setBounds(150, 180, 100, 60);

        theme2Box.setBounds(320, 180, 100, 60);

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
        container.add(theme1Box);
        container.add(theme2Box);
        container.add(theme3Box);
        container.add(messageLabel);
        container.add(deleteAccountButton);
    }

    public void addActionEvent() {
        backButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // BACK button logic
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
        // DELETE ACCOUNT button logic
        if (e.getSource() == deleteAccountButton) {
            DeleteAccountScreen frame = new DeleteAccountScreen();
            frame.setTitle("Delete Account");
            frame.setVisible(true);
            frame.setBounds(10, 10, 600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            this.dispose();
        }
    }
}
