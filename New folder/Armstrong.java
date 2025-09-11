import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        while(n>0){
            int number=0;
            int d=n%10;
            n=n/10;
            number=d*d*d;
            sum+=number;
        }
        if(sum==num){
            System.out.println("the number is Armstrong because the sum is : "+sum);
        }
        else{
            System.out.println("The number is not the armstrong number because the sum is :"+sum);
        }
    }
    
}
