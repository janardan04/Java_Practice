
import java.util.Scanner;

public class Lec12_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println((7*49)/7 + (35/7));
        int v,s,u,a;
        double ex;
        v=3;
        s=2;
        a=2;
        u=3;
        ex = (Math.pow(v,2.0) - Math.pow(u,2.0) ) / (2.0*a*s);
        System.out.println(ex);
    }
    
}