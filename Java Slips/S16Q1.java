// Slip - 16 Q1 [JAVA]
// Write a java program to create a TreeSet, add some colors (String) and print out the content of TreeSet in ascending order.

import java.util.*;

public class S16Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        TreeSet<String> colors = new TreeSet<>();

        System.out.print("\nEnter the number of colors: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++) {
            System.out.print("Enter color " + (i+1) + ": ");
            colors.add(sc.nextLine());
        }

        System.out.println("\nTreeSet in ascending order is: " + colors);
        sc.close();
    }
}
