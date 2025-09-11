
import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class cll {

    private Node head = null;
    private Node tail = null;

    public void insert(int data) {
        Node nw = new Node(data);

        if (head == null) {
            head = nw;
            tail = nw;
            nw.next = head;
        } else {
            tail.next = nw;
            tail = nw;
            nw.next = head;
        }
    }

    public void rdisplay() {
        Node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }
    int flag = 0;

    public void display(Node temp) {
        if (temp != head || flag == 0) {
            flag = 1;
            System.out.println(temp.data);
            display(temp.next);
        }
        flag = 0;

    }

    public void insert(int pos, int data) {
        Node nw = new Node(data);
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (head == null) {
            if (pos != 1) {
                System.out.println("invalid position list is empty");
                return;
            }
            head = tail = nw;
            tail.next = head;
            System.out.println("element added at position 1");
            return;
        }
        if (pos == 1) {
            nw.next = head;
            head = nw;
            tail.next = head;
            System.out.println("Elemets added at position 1");
            return;
        }
        Node temp = head;
        int i = 1;
        while (i < pos - 1 && temp.next != head) {
            temp = temp.next;
            i++;
        }
        if (i != pos - 1) {
            System.out.println("Invalid position ");
            return;
        }
        nw.next = temp.next;
        temp.next = nw;

        if (temp == tail) {
            tail = nw;
        }
        System.out.println("Element added at position " + pos);

    }

    public Node gethead() {
        return head;
    }
}

public class CircularLL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cll l1 = new cll();

        int ch;
        do {
            System.out.println("1.Insert element"
                    + "\n2.display"+
                    "\n3.Insert at Position"
                    + "\n4.exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter the element :");
                    int n = sc.nextInt();
                    l1.insert(n);
                    break;
                case 2:
                    l1.display(l1.gethead());
                    break;
                case 4:
                    System.out.println("Exiting !!");
                    return;
                case 3:
                    System.out.println("enter the position : ");
                    int pos = sc.nextInt();
                    System.out.println("enter the element : ");
                    int ele = sc.nextInt();
                    l1.insert(pos, ele);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while (true);
    }
}
