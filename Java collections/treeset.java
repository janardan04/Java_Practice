import java.util.*;
public class treeset {
    public static void main(String[] args) {
        Set<Integer> n= new TreeSet<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("entr how many elements you want to add in treeset :");
        int e=sc.nextInt();
        for(int i=0;i<e;i++)
        {
            int j= i+1;
            System.out.println("Enter the "+ j +" element :");
            int num=sc.nextInt();
            n.add(num);
        }
        System.out.println("You enter the elemetns  are :");
        for(int ele : n)
        {
            System.out.println(ele);
        }

    }
}
