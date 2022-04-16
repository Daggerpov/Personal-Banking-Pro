import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationScreen extends JFrame implements ActionListener {

	Container container = getContentPane();
    JLabel titleLabel = new JLabel("It's time to pretend you're a real user with money!");
	JLabel fNameLabel = new JLabel("What is your full name?");
	JLabel lNameLabel = new JLabel("What would you like your username to be?");
	JTextField fNameTextField = new JTextField();
	JPasswordField lNameField = new JPasswordField();
    JLabel passwordLabel = new JLabel("Password:");
    JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
	JCheckBox showPassword = new JCheckBox("Show Password");

	RegistrationScreen() {
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
		userLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		userLabel.setBounds(100, 150, 150, 30);
		userTextField.setBounds(275, 150, 150, 30);

		passwordLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		passwordLabel.setBounds(100, 220, 150, 30);
		passwordField.setBounds(275, 220, 150, 30);
		
		showPassword.setFont(new Font("Serif", Font.PLAIN, 16));
		showPassword.setBounds(275, 250, 150, 30);

		loginButton.setFont(new Font("Serif", Font.PLAIN, 20));
		loginButton.setBounds(150, 300, 100, 40);

		registerButton.setFont(new Font("Serif", Font.PLAIN, 20));
		registerButton.setBounds(250, 300, 130, 40);

	}

	public void addComponentsToContainer() {
		// Adding each components to the Container
		container.add(userLabel);
		container.add(passwordLabel);
		container.add(userTextField);
		container.add(passwordField);
		container.add(showPassword);
		container.add(loginButton);
		container.add(registerButton);
	}

	public void addActionEvent() {
		showPassword.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//actions here
	}
}
