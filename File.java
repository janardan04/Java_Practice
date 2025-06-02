import java.util.*;


public class File {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do { 
            System.out.println("==============File Operations==============");
            System.out.println("1.create the file");
            System.out.println("2.write in previous file");
            System.out.println("3.open the file:");
            System.out.println("4.rename the file ");
            System.out.println("5.!!!!!exit!!!!!!");
            System.out.println("Enter your choice");
            ch =sc.nextInt();
            switch(ch){
                case 1:System.out.println("enter the file name: ");
                String fname = sc.next();
                System.out.println("file name is : "+fname);
                break;
            }
        } while (ch==5);       
    }
}
