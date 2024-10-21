import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0;
        boolean moreItems;

        do {
            double price = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            totalCost += price;

            moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");
        } while (moreItems);

        System.out.printf("Your total is: $%.2f\n", totalCost);
    }
}
