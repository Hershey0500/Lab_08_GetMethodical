import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter the year of your birth", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter the month of your birth", 1, 12);
        int day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 31);
        int hour = SafeInput.getRangedInt(in, "Enter the hour of your birth", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter the minute of your birth", 0, 59);

        System.out.printf("You were born on %d/%d/%d at %02d:%02d\n", month, day, year, hour, minute);
    }
}

