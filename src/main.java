package src;

import javax.swing.*;
import src.Authentication.LoginScreen;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    public static void main(String[] a) {
        LoginScreen frame = new LoginScreen();
        frame.setVisible(true);
        frame.setTitle("Login");
        frame.setVisible(true);
        frame.setBounds(10, 10, 600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}