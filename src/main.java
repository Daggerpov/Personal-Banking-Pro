package src;

import javax.swing.*;

import src.Accounts.Investment_Account_Methods.InvestmentsScreen;

import java.awt.*;

public class main {
    public static void main(String[] a) {
        // LoginScreen frame = new LoginScreen();
        // frame.setVisible(true);
        // frame.setTitle("Login");
        // frame.getContentPane().setBackground(Color.CYAN);
        // frame.setVisible(true);
        // frame.setBounds(10, 10, 600, 600);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // change these names to the names of the classes such as ____Screen accordingly
        // ! only thing to keep in mind is that if it's underlined in red
        // ! that means you need to hover over it -> quick fix -> import ___Screen
        InvestmentsScreen frame = new InvestmentsScreen();

        // don't need to change this title since this is
        // only for the purposes of you launching individual screens right now
        frame.setTitle("Test");
        Color color=new Color(41, 171, 135);
        frame.getContentPane().setBackground(color);
        frame.setVisible(true);
        frame.setBounds(10, 10, 600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}