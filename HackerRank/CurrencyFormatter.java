import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Amount: ");
        double payment = scanner.nextDouble();
        scanner.close();

        // US
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);

        // India (no deprecated constructor)
        Locale india = Locale.of("en", "IN");
        String indiaFormatted = NumberFormat.getCurrencyInstance(india).format(payment);

        // China
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

        // France
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + indiaFormatted);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
