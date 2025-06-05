
import java.util.Scanner;

public class DigitToNumber {

    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        String str = "";
        while (n > 0) {
            result = n % 10;
            n = n / 10;
            str = str + result;
        }
        System.out.println(str);
        for (int i = str.length() - 1; i >= 0; i--) {
            char rem = str.charAt(i);
            switch (rem) {
                case '0':
                    System.out.print("zero  ");
                    break;
                case '1':
                    System.out.print("one   ");
                    break;
                case '2':
                    System.out.print("Two   ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four  ");
                    break;
                case '5':
                    System.out.print("Five  ");
                    break;
                case '6':
                    System.out.print("six   ");
                    break;
                case '7':
                    System.out.print("seven ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("nine  ");
                    break;
                default:
                    System.out.print("Invalid digit");
                    break;
            }
        }

    }
}
