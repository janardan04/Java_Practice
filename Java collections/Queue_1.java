import java.util.*;
public class Queue_1 {
    public static void main(String[] args) {
        Queue<Integer> n= new LinkedList<>();
        n.offer(14);
        n.offer(30);
        n.add(40);
        n.offer(90);
        System.out.println(n);

        System.out.println(n.poll());
        System.out.println(n);

        System.out.println("which number is next:"+n.peek());

        System.out.println("head of the queue:"+n.element());
    }
}
