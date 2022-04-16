import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame implements ActionListener {

	Container container = getContentPane();
	JLabel userLabel = new JLabel("USERNAME:");
	JLabel passwordLabel = new JLabel("PASSWORD:");
	JTextField userTextField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	JButton loginButton = new JButton("LOGIN");
	JButton resetButton = new JButton("REGISTER");
	JCheckBox showPassword = new JCheckBox("Show Password");

	LoginScreen() {
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

	public void addActionEvent() {
		loginButton.addActionListener(this);
		resetButton.addActionListener(this);
		showPassword.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Coding Part of LOGIN button
		if (e.getSource() == loginButton) {
			String userText;
			String pwdText;
			userText = userTextField.getText();
			String passText = new String(passwordField.getPassword()); // this fixed a deprecation with getText()
			if (userText.equalsIgnoreCase("Daggerpov") && passText.equalsIgnoreCase("12345")) {
				JOptionPane.showMessageDialog(this, "Login Successful");
			} else {
				JOptionPane.showMessageDialog(this, "Invalid Username or Password");
			}

		}
		// Coding Part of RESET button
		if (e.getSource() == resetButton) {
			userTextField.setText("");
			passwordField.setText("");
		}
		// Coding Part of showPassword JCheckBox
		if (e.getSource() == showPassword) {
			if (showPassword.isSelected()) {
				passwordField.setEchoChar((char) 0);
			} else {
				passwordField.setEchoChar('*');
			}

		}
	}
}
