
import java.util.Scanner;

class Test1 {

    public static void main(String[] args) {
        int a = 10, b = 0, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            c = a / b;
            System.out.println(5);

            System.out.println("bye");
        } catch (ArithmeticException e) {
            // System.out.println(e);
            System.out.println("divide by zero is not possible provide the valid value non zero value");
        }
    }
}
