import java.util.Scanner;

class Day2_1
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers :");
        int a = sc.nextInt();
        System.out.println("ENter the second  number  :");
        int b = sc.nextInt();

        if(a%2 ==0){
            System.out.println("The first number is even");

        }
        else if(b%2==0){
            System.out.println("The second number is even");
        }
        else{
            System.out.println("No nmber is even !!!");
        }
        System.out.println(5 /2);


    }
}