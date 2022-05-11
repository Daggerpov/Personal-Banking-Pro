package src;

import javax.swing.*;

import src.Authentication.LoginScreen;

public class main {
    public static void main() {
        LoginScreen frame = new LoginScreen();
        frame.setVisible(true);
        frame.setTitle("Login");

        frame.getContentPane().setBackground(UserAccount.getColourTheme());
        frame.setVisible(true);
        frame.setBounds(10, 10, 600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}