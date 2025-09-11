import java.util.Scanner;

public class RootsofQuadraticEqu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the a b c :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double r1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);

        double r2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);

        System.out.println(r1);
        System.out.println(r2);
    }
}
