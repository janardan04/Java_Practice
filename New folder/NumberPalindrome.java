import java.util.*;
public class NumberPalindrome {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        n=sc.nextInt();
        if(ispalindrom(n)){
            System.out.println("the number is palindrome !!");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
    public static boolean ispalindrom(int n){
        int d=0;
        int reverse=0;
       
        while(n>0){
           d = n%10;
           reverse=reverse*10+d;
           n=n/10;
        }
        if(reverse==n){
            return true;
        }
        else{
            return false;
        }
    }
}
