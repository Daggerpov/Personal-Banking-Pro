import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {

	Container container = getContentPane();
	JLabel userLabel = new JLabel("USERNAME:");
	JLabel passwordLabel = new JLabel("PASSWORD:");
	JTextField userTextField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	JButton loginButton = new JButton("LOGIN");
	JButton registerButton = new JButton("REGISTER");
	JCheckBox showPassword = new JCheckBox("Show Password");

	LoginFrame() {
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

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
