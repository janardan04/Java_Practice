import java.util.*;
public class TypeofWebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Website URL : ");
        String str=sc.nextLine();

        int l=str.length();
        int i=str.indexOf(":");
        String protocol=str.substring(0,i);
        int j=str.lastIndexOf(".");
        String type=str.substring(j+1,l);
        System.out.println("type of website is "+type);
        System.out.println("The Protocol of website is "+protocol);
    }
}
