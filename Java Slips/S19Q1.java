// Slip - 19 Q1 [JAVA]
// Write a java program to accept ‘N’ Integers from a user store them into LinkedList Collection and display only negative integers.

import java.util.*;

public class S19Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the number of integers: ");
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0; i<n; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            list.add(sc.nextInt());
        }

        System.out.println("\nNegative integers from list:-");
        for(int num : list) {
            if(num < 0) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}
