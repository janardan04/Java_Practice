import java.util.*;

public class Priority_Queue {
    public static void main(String[] args) {
        
    System.out.println("MinHeap That means it displays the min element first");
    Queue<Integer> n= new PriorityQueue<>();
    n.offer(40);
    n.add(12);
    n.add(24);
    n.add(36);
    System.out.println(n);
    n.poll();
    System.out.println(n);
    System.out.println(n.peek());
    System.out.println("Max Heap that means it displays the large element at the first");
    
    Queue<Integer> n1=new PriorityQueue<>(Comparator.reverseOrder());
    n1.add(20);
    n1.add(34);
    n1.add(21);
    
    System.out.println(n1);
      
    }
}
