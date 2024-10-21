import java.util.Scanner;

public class SafeInput {

    // Part A: getNonZeroLenString (Already Complete)
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    // Part B: getInt
    public static int getInt(Scanner pipe, String prompt) {
        int retValue = 0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                pipe.next(); // Discard invalid input
            }
            pipe.nextLine(); // Clear the buffer
        } while (!validInput);

        return retValue;
    }

    // Part C: getDouble
    public static double getDouble(Scanner pipe, String prompt) {
        double retValue = 0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
                pipe.next(); // Discard invalid input
            }
            pipe.nextLine(); // Clear the buffer
        } while (!validInput);

        return retValue;
    }

    // Part D: getRangedInt
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retValue = 0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                if (retValue >= low && retValue <= high) {
                    validInput = true;
                } else {
                    System.out.println("Input out of range. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next(); // Discard invalid input
            }
            pipe.nextLine(); // Clear the buffer
        } while (!validInput);

        return retValue;
    }

    // Part E: getRangedDouble
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retValue = 0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                if (retValue >= low && retValue <= high) {
                    validInput = true;
                } else {
                    System.out.println("Input out of range. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a double.");
                pipe.next(); // Discard invalid input
            }
            pipe.nextLine(); // Clear the buffer
        } while (!validInput);

        return retValue;
    }

    // Part F: getYNConfirm
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;
        boolean retValue = false;
        boolean validInput = false;

        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                retValue = true;
                validInput = true;
            } else if (response.equalsIgnoreCase("N")) {
                retValue = false;
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        } while (!validInput);

        return retValue;
    }

    // Part G: getRegExString
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retValue;
        boolean validInput = false;

        do {
            System.out.print("\n" + prompt + ": ");
            retValue = pipe.nextLine();
            if (retValue.matches(regEx)) {
                validInput = true;
            } else {
                System.out.println("Invalid input. String does not match the pattern.");
            }
        } while (!validInput);

        return retValue;
    }

    // Part H: PrettyHeader
    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int messageWidth = msg.length();
        int padding = (totalWidth - messageWidth - 6) / 2; // 6 for the "*** ***"

        // Print top row of asterisks
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the centered message
        System.out.print("***");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.println("***");

        // Print bottom row of asterisks
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

