import java.util.*;

public class deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> n= new ArrayDeque<>();
        n.offer(40);
        n.offerFirst(22);
        n.offerLast(32);
        System.out.println(n);

        System.out.println(n.peek());
        System.out.println(n.peekFirst());
        System.out.println(n.peekLast());

        System.out.println("first element removed is:"+n.poll());
        System.out.println(n);
        System.out.println("now the last element is remove was:"+n.pollLast());
        System.out.println(n);
    }
}