import java.util.*;
public class Stack1 {
    public static void main(String[] args) {
       Stack<String> s= new Stack<>();
        s.push("janardhan");
        s.push("kumar");
        s.push("yadav");  
        System.out.println(s);
            System.out.println("The top element of the stack is: "+s.peek());
          s.pop();
          System.out.println("The top element of the stack after pop is: "+s.peek());
          System.out.println("The size of the stack is: "+s.size());
          if(s.isEmpty()){
              System.out.println("The stack is empty");
          }
          else{
              System.out.println("The stack is not empty");
          }
      
        }
}
