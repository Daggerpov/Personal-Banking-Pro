package src;

import javax.swing.*;

import src.Accounts.InvestmentsAccountScreen;
import src.Accounts.Investment_Account_Methods.BuySharesScreen;
import src.Accounts.Investment_Account_Methods.InvestmentsScreen;
import src.Accounts.Investment_Account_Methods.SellSharesScreen;
import src.Authentication.LoginScreen;
import src.Authentication.RegistrationScreen;

import java.awt.*;

public class main {
    public static void main(String[] a) {
        LoginScreen frame = new LoginScreen();
        frame.setVisible(true);
        frame.setTitle("Login");

        frame.getContentPane().setBackground(UserAccount.getColourTheme());
        frame.setVisible(true);
        frame.setBounds(10, 10, 600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // change these names to the names of the classes such as ____Screen accordingly
        // ! only thing to keep in mind is that if it's underlined in red
        // ! that means you need to hover over it -> quick fix -> import ___Screen
        // SellSharesScreen frame = new SellSharesScreen();

        // // don't need to change this title since this is
        // // only for the purposes of you launching individual screens right now
    }
}