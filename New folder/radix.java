import java.util.Scanner;

public class radix {
    public static void main(String  []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input =  ");
        String str= sc.nextLine();

        boolean isbinary=str.matches("[01]+");
        boolean isoctal= str.matches("[0-7]*");
        boolean ishexadecimal = str.matches("[0-7A-F]+");
        if(isbinary){
            System.out.println("Binary radix = 2 ");
        }
        else if(isoctal){
            System.out.println("octal Radix = 8");
        }
        else if(ishexadecimal){
            System.out.println("hexa Radix=16");
        }
        else{
            System.out.println("string is invalid");
        }
    }
}
