import java.util.Scanner;

public class Lec20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for income
        System.out.println("Enter your income:");
         int income = sc.nextInt();

        double tax = 0;

        // Calculate tax based on slabs
        if (income > 250000 && income <= 500000) {
            tax = (income - 250000) * 0.05;
        } else if (income > 500000 && income <= 1000000) {
            tax = (250000 * 0.05) + ((income - 500000) * 0.20);
        } else if (income > 1000000) {
            tax = (250000 * 0.05) + (500000 * 0.20) + ((income - 1000000) * 0.30);
        }

        // Display the tax amount
        if (tax > 0) {
            System.out.println("You have to pay Rs: " + tax);
        } else {
            System.out.println("You don't have to pay any tax.");
        }

        sc.close();
    }
}
