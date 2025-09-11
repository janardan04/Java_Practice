import java.util.Scanner;
public class Binomial{
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
    public static void bino(int n) {
        int a = fact(n);
        int b, coeff;
        for (int i = 0; i <= n; i++) {
            b = fact(i) * fact(n - i);
            coeff = a / b;
            if (i > 0) {
                System.out.print("+ ");
            }
            if (coeff > 1) {
                System.out.print(coeff + " ");
            }
            if (n - i > 0) {
                System.out.print("x^" + (n - i) + " ");
            }
            if (i > 0) {
                System.out.print("y^" + i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.print("(x+y)^" + n + "=");
        bino(n);
        sc.close();
    }
}
