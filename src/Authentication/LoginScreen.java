package src.Authentication;

import javax.swing.*;

import src.GeneralScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import src.UserAccount;

public class LoginScreen extends JFrame implements ActionListener {

	Container container = getContentPane();
	JLabel userLabel = new JLabel("USERNAME:");
	JLabel passwordLabel = new JLabel("PASSWORD:");
	JTextField userTextField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	JButton loginButton = new JButton("LOGIN");
	JButton resetButton = new JButton("RESET");
	JButton registerButton = new JButton("REGISTER");
	JCheckBox showPassword = new JCheckBox("Show Password");

	public LoginScreen() {
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
		loginButton.setBounds(115, 300, 100, 40);

		resetButton.setFont(new Font("Serif", Font.PLAIN, 20));
		resetButton.setBounds(215, 300, 90, 40);

		registerButton.setFont(new Font("Serif", Font.PLAIN, 20));
		registerButton.setBounds(305, 300, 120, 40);

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
		container.add(registerButton);
	}

	public void addActionEvent() {
		loginButton.addActionListener(this);
		resetButton.addActionListener(this);
		showPassword.addActionListener(this);
		registerButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// LOGIN button logic
		if (e.getSource() == loginButton) {
			String userText = userTextField.getText();
			String passText = new String(passwordField.getPassword()); // this fixed a deprecation with getText()
			if (userText.equalsIgnoreCase("Daggerpov") && passText.equalsIgnoreCase("12345")) {
				JOptionPane.showMessageDialog(this, "Login Successful");
				UserAccount.setFirstName("Daniel");

				this.dispose();
				GeneralScreen frame = new GeneralScreen();
				frame.setTitle("General");

				frame.getContentPane().setBackground(UserAccount.getColourTheme());

				frame.setVisible(true);
				frame.setBounds(10, 10, 600, 600);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				this.dispose();
			} else {
				JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Warning",
						JOptionPane.WARNING_MESSAGE);
			}
		}

		// RESET button logic
		if (e.getSource() == resetButton) {
			userTextField.setText("");
			passwordField.setText("");
		}
		// showPassword JCheckBox logic
		if (e.getSource() == showPassword) {
			if (showPassword.isSelected()) {
				passwordField.setEchoChar((char) 0);
			} else {
				passwordField.setEchoChar('*');
			}
		}
		// REGISTER button logic
		if (e.getSource() == registerButton) {
			RegistrationScreen frame = new RegistrationScreen();
			frame.setTitle("Registration");

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
