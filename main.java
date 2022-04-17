import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    public static void main(String[] a) {
        LoginScreen frame1 = new LoginScreen();
        frame1.setTitle("Login");
        frame1.setVisible(true);
        frame1.setBounds(10, 10, 600, 600);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RegistrationScreen frame2  = new  RegistrationScreen();
        frame2.setTitle("Registeration");
        frame2.setVisible(true);
        frame2.setBounds(10, 10, 600, 600);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}