import java.util.Scanner;

public class Palindromestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str1=sc.nextLine();
        String str=str1.replaceAll("[^a-z]","");
        int n=str.length();//here we uses the paranthesis for calculating the length of string
        String empty="";
        for(int i=n-1;i>=0;i--){
            empty += str.charAt(i);
        }
        String s="hello";
        System.out.println(s.length());
        System.out.println(empty);
        if(str.equals(empty)){
            System.out.println("string is palindrome");
        }else{
        System.out.println("string is not palindrome");
        }
    }
}
