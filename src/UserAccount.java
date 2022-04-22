package src;

public class UserAccount {
    private static String firstName;
    public static void setFirstName(String inputtedFirstName) {
        firstName = inputtedFirstName;
    }

    public static String getFirstName() {
        return firstName;
    }
}
