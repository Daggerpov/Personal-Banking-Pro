package src;
import java.util.ArrayList;

public class UserAccount {    
    //* login info default values
    private static String firstName = "Daniel";
    private static String username = "Daggerpov"; 

    public static void setFirstName(String inputtedFirstName) {
        firstName = inputtedFirstName;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setUsername(String inputtedUsername) {
        username = inputtedUsername;
    }

    public static String getUsername() {
        return username;
    }

    //* upon registration, these are added

    private static ArrayList<String> addedUsersFirstNames;

    public static void appendAddedUsersFirstNames(String inputtedFirstName) {
        addedUsersFirstNames.add(inputtedFirstName);
    }

    public static ArrayList<String> getAddedUsersFirstNames() {
        return addedUsersFirstNames;
    }

    //* default bank balances
    private static int chequingsBalance = 500;
    private static int savingsBalance = 500;
    private static int investmentsBalance = 500;

    public static void setChequingsBalance(int inputtedChequingsBalance) {
        chequingsBalance = inputtedChequingsBalance;
    }

    public static int getChequingsBalance() {
        return chequingsBalance;
    }

    public static void setSavingsBalance(int inputtedSavingsBalance) {
        savingsBalance = inputtedSavingsBalance;
    }

    public static int getSavingsBalance() {
        return savingsBalance;
    }

    public static void setInvestmentsBalance(int inputtedInvestmentsBalance) {
        investmentsBalance = inputtedInvestmentsBalance;
    }

    public static int getInvestmentsBalance() {
        return investmentsBalance;
    }


    

    
}
