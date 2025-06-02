import java.util.Scanner;

interface  Calculator{
    public void add(int a, int b);
    public void sub(int a, int b);
    public void mul(int a, int b);
    public void div(int a, int b);
    public void mod(int a, int b );
}
class Calc implements Calculator{
    
    public void add(int a, int b){
        System.out.println("Answer is");
        System.out.println(a+b);
    }
    public void sub(int a, int b){
        System.out.println("Answer is");
        System.out.println(a-b);
    }
    public void mul(int a, int b){
        System.out.println("Answer is");
        System.out.println(a * b);
    }
    public void div(int a, int b)
    {
        System.out.println("Answer is");
        System.out.println(a / b);

    }
    public void mod(int a, int b)
    {
        if (b == 0) {
            System.out.println("Error: Cannot perform modulo with zero.");
        } else {
            System.out.println("Answer is: " + (a % b));
        }
    }
}

public class Day2_2 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do { 
        
        Calc Operations =new Calc();
        System.out.println("===============Calculator==============");
        
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulo");
        System.out.println("6.Exit");
        System.out.println("Enter  your choice :");
        choice = sc.nextInt();
        System.out.println("Enter the first number :");
        int x = sc.nextInt();
        System.out.println("Enter the second number :");
        int y = sc.nextInt();
       

        switch(choice){
            case 1: Operations.add(x,y);
            break;
            case 2 : Operations.sub(x,y);
            break;
            case 3: Operations.mul(x, y);
            break;
            case 4 : Operations.div(x, y);
            break;
            case 5 :Operations.mod(x,y);
            break;
            case 6 : System.out.println("Bye Buddy !!"); 
        }
    } while (choice != 6);
    }
}
