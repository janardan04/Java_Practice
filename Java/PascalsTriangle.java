import java.util.Scanner;
public class PascalsTriangle {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
         }
        return fact;
    }
    public static int binomialCoefficient(int n, int r) {
    return factorial(n) / (factorial(r) * factorial(n - r));
    }
    public static void printPascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = sc.nextInt();
        System.out.println("Pascal's Triangle:");
        printPascalsTriangle(n);
        sc.close();
    }
}

