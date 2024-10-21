public class CtoFTableDisplay {

    public static double cToF(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        System.out.printf("%-10s %-10s\n", "Celsius", "Fahrenheit");
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = cToF(celsius);
            System.out.printf("%-10d %-10.2f\n", celsius, fahrenheit);
        }
    }
}

