package src.Authentication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import src.UserAccount;

public class RegistrationScreen extends JFrame implements ActionListener {

	Container container = getContentPane();
	JLabel titleLabel = new JLabel("It's time to pretend you're a real user with money!");
	JLabel fNameLabel = new JLabel("What is your full name?");
	JLabel usernameLabel = new JLabel("What would you like your username to be?");
	JTextField fNameTextField = new JTextField();
	JTextField usernameTextField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	JLabel passwordLabel = new JLabel("Password:");
	JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
	JPasswordField confirmPasswordField = new JPasswordField();
	JCheckBox showPassword = new JCheckBox("Show Password");
	JButton setupAccountButton = new JButton("Setup Account");

	JLabel errorIcon1Label = new JLabel("", new ImageIcon("images/Error Icon.png"), SwingConstants.CENTER);
	JLabel errorIcon2Label = new JLabel("", new ImageIcon("images/Error Icon.png"), SwingConstants.CENTER);
	JLabel errorIcon3Label = new JLabel("", new ImageIcon("images/Error Icon.png"), SwingConstants.CENTER);
	JLabel errorIcon4Label = new JLabel("", new ImageIcon("images/Error Icon.png"), SwingConstants.CENTER);

	public RegistrationScreen() {
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
		titleLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		titleLabel.setBounds(85, 20, 600, 30);

		fNameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		fNameLabel.setBounds(10, 80, 500, 30);
		fNameTextField.setBounds(225, 80, 150, 30);
		errorIcon1Label.setBounds(350, 70, 100, 40);
		errorIcon1Label.setVisible(false);

		usernameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		usernameLabel.setBounds(10, 140, 500, 30);
		usernameTextField.setBounds(375, 140, 150, 30);
		errorIcon2Label.setBounds(500, 130, 100, 40);
		errorIcon2Label.setVisible(false);

		passwordLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		passwordLabel.setBounds(10, 200, 100, 30);
		passwordField.setBounds(110, 200, 150, 30);
		errorIcon3Label.setBounds(240, 190, 100, 40);
		errorIcon3Label.setVisible(false);

		confirmPasswordLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		confirmPasswordLabel.setBounds(10, 260, 200, 40);
		confirmPasswordField.setBounds(175, 263, 150, 30);
		errorIcon4Label.setBounds(300, 260, 100, 40);
		errorIcon4Label.setVisible(false);

		showPassword.setFont(new Font("Serif", Font.PLAIN, 16));
		showPassword.setBounds(175, 300, 150, 30);

		setupAccountButton.setFont(new Font("Serif", Font.PLAIN, 20));
		setupAccountButton.setBounds(225, 350, 150, 40);

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
		container.add(confirmPasswordField);
		container.add(setupAccountButton);
		container.add(errorIcon1Label);
		container.add(errorIcon2Label);
		container.add(errorIcon3Label);
		container.add(errorIcon4Label);
	}

	public void addActionEvent() {
		showPassword.addActionListener(this);
		setupAccountButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// showPassword JCheckBox logic
		if (e.getSource() == showPassword) {
			if (showPassword.isSelected()) {
				passwordField.setEchoChar((char) 0);
				confirmPasswordField.setEchoChar((char) 0);
			} else {
				passwordField.setEchoChar('*');
				confirmPasswordField.setEchoChar('*');
			}
		}

		String passText = new String(passwordField.getPassword());
		String confirmPassText = new String(confirmPasswordField.getPassword());

		// SETUP ACCOUNT button logic
		if (e.getSource() == setupAccountButton) {
			// couldn't use .isEmpty() since it's not a primitive string, so I have to
			// compare it to an empty string
			if (fNameTextField.getText().equals("") || usernameTextField.getText().equals("")
					|| passwordField.getPassword().length == 0 || confirmPasswordField
							.getPassword().length == 0) {
				JOptionPane.showMessageDialog(this, "Empty Field(s)", "Error", JOptionPane.ERROR_MESSAGE);

			} else if (!passText.equals(confirmPassText)) {
				JOptionPane.showMessageDialog(this, "Passwords don't match", "Warning", JOptionPane.WARNING_MESSAGE);
				errorIcon3Label.setVisible(true);
				errorIcon4Label.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(this, "Registration Successful");
				this.dispose();

				UserAccount.setFirstName(fNameTextField.getText().split(" ")[0]);
				UserAccount.setUsername(usernameTextField.getText());

				SetupAccountScreen frame = new SetupAccountScreen();
				frame.setTitle("Setup Account");

				frame.getContentPane().setBackground(UserAccount.getColourTheme());
				frame.setVisible(true);
				frame.setBounds(10, 10, 600, 600);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				this.dispose();
			}
			
			if (fNameTextField.getText().equals("")) {
				errorIcon1Label.setVisible(true);
			} else {
				errorIcon1Label.setVisible(false);
			}

			if (usernameTextField.getText().equals("")) {
				errorIcon2Label.setVisible(true);
			} else {
				errorIcon2Label.setVisible(false);
			}

			if (passwordField.getPassword().length == 0) {
				errorIcon3Label.setVisible(true);
			} else {
				errorIcon3Label.setVisible(false);
			}

			if (confirmPasswordField.getPassword().length == 0) {
				errorIcon4Label.setVisible(true);
			} else {
				errorIcon4Label.setVisible(false);
			}
		}
	}
}
