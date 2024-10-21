import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Part A: Test getNonZeroLenString
        System.out.println("Testing getNonZeroLenString method...");
        String resultString = SafeInput.getNonZeroLenString(in, "Enter a non-zero length string");
        System.out.println("You entered: " + resultString);

        // Part B: Test getInt
        System.out.println("\nTesting getInt method...");
        int resultInt = SafeInput.getInt(in, "Enter an integer");
        System.out.println("You entered integer: " + resultInt);

        // Part C: Test getDouble
        System.out.println("\nTesting getDouble method...");
        double resultDouble = SafeInput.getDouble(in, "Enter a double");
        System.out.println("You entered double: " + resultDouble);

        // Part D: Test getRangedInt
        System.out.println("\nTesting getRangedInt method...");
        int rangedInt = SafeInput.getRangedInt(in, "Enter an integer between 1 and 10", 1, 10);
        System.out.println("You entered integer: " + rangedInt);

        // Part E: Test getRangedDouble
        System.out.println("\nTesting getRangedDouble method...");
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double between 0.5 and 10.0", 0.5, 10.0);
        System.out.println("You entered double: " + rangedDouble);

        // Part F: Test getYNConfirm
        System.out.println("\nTesting getYNConfirm method...");
        boolean ynConfirm = SafeInput.getYNConfirm(in, "Do you want to continue?");
        System.out.println("You selected: " + (ynConfirm ? "Yes" : "No"));

        // Part G: Test getRegExString
        System.out.println("\nTesting getRegExString method...");
        String regexString = SafeInput.getRegExString(in, "Enter a string that matches the pattern (e.g., \\d{3}-\\d{2}-\\d{4} for SSN)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered: " + regexString);

        // Part H: Test prettyHeader
        System.out.println("\nTesting prettyHeader method...");
        SafeInput.prettyHeader("This is a test header!");
    }
}

