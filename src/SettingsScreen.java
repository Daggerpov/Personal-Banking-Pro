package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsScreen extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel settingsLabel = new JLabel("Settings");
    JLabel themeLabel = new JLabel("Select a Theme:");
    JCheckBox theme1Box = new JCheckBox("Show Password");
    JCheckBox theme2Box = new JCheckBox("Show Password");
    JCheckBox theme3Box = new JCheckBox("Show Password");
    JLabel messageLabel = new JLabel("Theme will change upon pressing back");
    JButton deleteAccountButton = new JButton("Delete Account");

    SettingsScreen() {
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
        settingsLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        settingsLabel.setBounds(85, 20, 600, 30);

        themeLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        themeLabel.setBounds(10, 80, 500, 30);

        theme1Box.setBounds(10, 140, 500, 30);

        theme2Box.setBounds(10, 200, 100, 30);

        theme3Box.setBounds(175, 263, 150, 30);

        messageLabel.setFont(new Font("Serif", Font.PLAIN, 16));
        messageLabel.setBounds(175, 300, 150, 30);

        deleteAccountButton.setFont(new Font("Serif", Font.PLAIN, 20));
        deleteAccountButton.setBounds(225, 350, 150, 40);

    }

    public void addComponentsToContainer() {
        // Adding each components to the Container
        container.add(titleLabel);
        container.add(passwordLabel);
        container.add(fNameLabel);
        container.add(usernameLabel);
        container.add(fNameTextField);
        container.add(usernameTextField);
        container.add(showPassword);
        container.add(confirmPasswordLabel);
        container.add(passwordField);
        container.add(confirmPasswordTextField);
        container.add(setupAccountButton);
    }

    public void addActionEvent() {
        showPassword.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // actions here
    }
}
