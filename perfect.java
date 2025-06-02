import java.util.Scanner;

class perfect
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter the number :");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("number is perfect number");
        }
        else{
            System.out.println("number is not perfect");
        }
    }
}