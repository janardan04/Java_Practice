import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the base :");
        Float base = sc.nextFloat();
        System.out.println("enter the height :");
        Float height = sc.nextFloat();
        Float area = 0.5f*(base*height);

        System.out.println(area);
        System.out.println("enter a b c ");
        Float a=sc.nextFloat();
        Float b=sc.nextFloat();
        Float c=sc.nextFloat();
        Float s=0.5f*(a+b+c);
        Double area2=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area2);
    }
}
