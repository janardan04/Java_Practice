
import java.util.Scanner;

class stackoverflow extends Exception {

    public String toString() {
        return "stack is full";
    }
}

class stackunderflow extends Exception {

    public String toString() {
        return "stack is empty";
    }
}

class stack {

    private int size;
    private int top = -1;
    private int s[];

    public stack(int sz) {
        size = sz;
        s = new int[sz];
    }

    public void push(int x) throws stackoverflow {
        if (top == size - 1) {
            throw new stackoverflow();
        }
        top++;
        s[top] = x;
    }

    public int pop() throws stackunderflow {
        int x = -1;

        if (top == -1) {
            throw new stackunderflow();
        }
        x = s[top];
        top--;
        return x;
    }

}

public class StackEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack :");
        int si = sc.nextInt();
        stack s1 = new stack(si);
        int ch = 0;
        do {
            System.out.println("1.Push \n2.Pop \n3.Exit");
            System.out.println("Enter your choice :");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the element :");
                    int n = sc.nextInt();
                    try {
                        s1.push(n);

                    } catch (stackoverflow s) {
                        System.out.println("\n");
                        System.out.println("Sorry we can't able to add : " + n);
                        System.out.println(s);
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("The element is : " + s1.pop());

                    } catch (stackunderflow s) {
                        System.out.println("\n");
                        System.out.println(s);
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    System.out.println("!!!! Exiting !!!!");

            }

        } while (ch < 3 && ch >= 1);

    }
}
