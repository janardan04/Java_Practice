import java.util.Scanner;
public class cmbination {
    // Function to calculate factorial
    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to calculate nCr
    public static long calculateCombination(int n, int r) {
        if (r > n || r < 0) {
            return 0; // Invalid input
        }
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for n and r
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter value of r: ");
        int r = scanner.nextInt();

        // Calculate and display nCr
        long nCr = calculateCombination(n, r);
        System.out.println("nCr (" + n + "C" + r + ") = " + nCr);

        scanner.close();
    }
}

