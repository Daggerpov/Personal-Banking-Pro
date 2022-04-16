import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterationFrame extends JFrame implements ActionListener {

	Container container = getContentPane();
    JLabel titleLabel = new JLabel("It;s time to pretend you're a real user with money!");
	JLabel fNameLabel = new JLabel("What is your full name?");
	JLabel lNameLabel = new JLabel("What would you like your username to be?");
	JTextField fNameTextField = new JTextField();
	JPasswordField lNameField = new JPasswordField();
    JLabel passwordLabel = new JLabel("Password:");
    JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
	JCheckBox showPassword = new JCheckBox("Show Password");

	RegisterationFrame() {
		// Calling methods inside constructor.
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();

	}

	public void setLayoutManager() {
		container.setLayout(null);
	}

	public void setLocationAndSize() {
		// Setting location and Size of each components using setBounds() method.
		userLabel.setBounds(175, 150, 100, 30);
		userTextField.setBounds(275, 150, 150, 30);
		passwordLabel.setBounds(175, 220, 100, 30);
		passwordField.setBounds(275, 220, 150, 30);
		showPassword.setBounds(275, 250, 150, 30);
		loginButton.setBounds(200, 300, 100, 30);
		resetButton.setBounds(300, 300, 100, 30);

	}

	public void addComponentsToContainer() {
		// Adding each components to the Container
		container.add(userLabel);
		container.add(passwordLabel);
		container.add(userTextField);
		container.add(passwordField);
		container.add(showPassword);
		container.add(loginButton);
		container.add(resetButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
