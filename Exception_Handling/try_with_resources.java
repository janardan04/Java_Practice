
import java.io.FileInputStream;
import java.util.Scanner;
public class try_with_resources {
    // static Scanner sc;
    static FileInputStream f;
        static void divide() throws  Exception{
            try(FileInputStream f = new FileInputStream("/Users/LENOVO/Desktop/Java Programming/Exception_Handling/my.txt"); Scanner sc=new Scanner(f)){
            // sc=new Scanner(f);
            int a=sc.nextInt();
            int b= sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/c);
            }

        }
    public static void main(String[] args) throws  Exception{
        try{
        divide();
        }catch(Exception e){
            System.out.println(e);
        }
        // int x=sc.nextInt();
        // System.out.println(x); 
    }
}
