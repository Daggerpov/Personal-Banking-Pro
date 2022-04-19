package src;

import javax.swing.*;
import src.Authentication.LoginScreen;
import src.Authentication.SetupAccountScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    public static void main(String[] a) {
        // LoginScreen frame = new LoginScreen();
        // frame.setVisible(true);
        // frame.setTitle("Login");
        // frame.setVisible(true);
        // frame.setBounds(10, 10, 600, 600);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //change these names to the names of the classes such as ____Screen accordingly
        //! only thing to keep in mind is that if it's underlined in red
        //! that means you need to hover over it -> quick fix -> import ___Screen
        SetupAccountScreen frame = new SetupAccountScreen();
        frame.setTitle("Setup Account");
        frame.setVisible(true);
        frame.setBounds(10, 10, 600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}