import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length breadth and height:");
        int length=sc.nextInt();
        int breadt=sc.nextInt();
        int height=sc.nextInt();
        int volume= length*breadt*height;
        int totalarea=2*(length*breadt+length*height+breadt*height);

        System.out.println("volume :"+volume);
        System.out.println("area:"+totalarea);


    }
}
