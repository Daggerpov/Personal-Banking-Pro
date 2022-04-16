import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] a) {
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Login");
        frame.setVisible(true);
        frame.setBounds(10, 10, 600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }

}