import java.util.Scanner;

public class BinomialExpansion {

    // Function to calculate factorial of a number
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    // Function to calculate and print the binomial expansion
    static void bino(int n) {
        int a = fact(n);
        int b;
        int coeff;

        for (int i = 0; i <= n; i++) {
            b = fact(i) * fact(n - i);
            coeff = a / b;

            // Add "+" sign for terms after the first one
            if (i > 0) {
                System.out.print("+ ");
            }

            // Print coefficient if greater than 1
            if (coeff > 1) {
                System.out.print(coeff + " ");
            }

            // Print x^(n-i) if the power is greater than 0
            if (n - i > 0) {
                System.out.print("x^" + (n - i) + " ");
            }

            // Print y^i if the power is greater than 0
            if (i > 0) {
                System.out.print("y^" + i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("(x + y)^" + n + " = ");
        bino(n);

        scanner.close();
    }
}
