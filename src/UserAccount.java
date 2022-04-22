package src;
import java.util.ArrayList;

public class UserAccount {
    private static ArrayList<String> addedUsersFirstNames;
    private static String firstName;
    private static String username;

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
    

    public static void appendAddedUsersFirstNames(String inputtedFirstName) {
        addedUsersFirstNames.add(inputtedFirstName);
    }
    public static ArrayList<String> getAddedUsersFirstNames() {
        return addedUsersFirstNames;
    }
}
