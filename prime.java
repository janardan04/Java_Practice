
import java.util.ArrayList;
import java.util.Scanner;

class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the starting and ending number :");
        int s = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = s; i <= e; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
                else if(i==1 || i==0){
                    count++;
                }
            }
            if (count == 0) {
                list.add(i);
            }
        }
        System.out.println("The prime Numbers are : ");
        for (int number : list) {
            System.out.println(number);
        }
    }
     
}
