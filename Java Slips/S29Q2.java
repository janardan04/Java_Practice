// Slip - 29 Q2 [JAVA]
// Write a Java program to create LinkedList of integer objects and perform the following:  
// i. Add element at first position  
// ii. Delete last element  
// iii. Display the size of link list 

import java.util.*;

public class S29Q2 {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(20);
        list.add(30);
        System.out.println("\nOriginal Liked List: " + list);

        list.addFirst(10);
        System.out.println("\nLiked List after adding element at first position: " + list);

        list.removeLast();
        System.out.println("\nLiked List after deleting the last element: " + list);
        System.out.println("\nSize of the Linked List: " + list.size());
    }
}
