import java.util.Stack;
public class Stack1 {
    public static void main(String[] args) {
       Stack s=new Stack<>();
       s.push("jayesh");
       s.push(520);
       s.push(85);
       s.push(100.220);
        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.search(520));
        System.out.println(s.search(999));
        System.out.println(s.empty());
        System.out.println(s.isEmpty());
        }
}
