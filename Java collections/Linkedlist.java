
import java.util.Scanner;

class Node {

    public int data;
    public Node next;
}

public class Linkedlist {

    static Node head = null;

    public static void insert(int value) {
        Node newnode = new Node();
        newnode.data = value;
        newnode.next = null;

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = newnode;
        }
    }

    public static void insert(int value, int position) {
        Node newnode = new Node();
        newnode.data = value;
        newnode.next = null;
        Node temp;
        temp = head;
        if (position == 1) {
            head = newnode;
            newnode.next = temp;
            return;
        }
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid Position !!");
            return;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    public static int count() {
        int cnt = 0;
        Node temp;
        temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        return cnt;

    }

    public static int SumofLists() {
        int sum = 0;
        Node temp;
        temp = head;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        return sum;

    }

    public static int rsum(Node temp) {
        if (temp == null) {
            return 0;
        } else {
            return rsum(temp.next) + temp.data;
        }
    }

    public static int Max() {
        int max = 0;
        Node temp;
        temp = head;
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }

        return max;
    }

    public static void display() {
        if (head == null) {
            System.out.println("LinkedList is empty !!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

    }

    public static int Search(int Key) {
        Node temp;
        temp = head;
        if (head == null) {
            return -1;
        }
        if (head.data == Key) {
            return 1;
        }
        int cnt = 2;
        Node q = head;
        while (temp != null) {
            if (temp.data == Key) {
                q.next = temp.next;
                temp.next = head;
                head = temp;

                return cnt;

            }
            q = temp;
            cnt++;
            temp = temp.next;
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;
        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("1.Insert Element\n2.Display Elements\n3.Total LinkedLists\n4.rsum\n5.sum\n6.Max Element\n7.Search Element\n8.Insert At Position\n9.exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter the element");
                    int element = sc.nextInt();
                    insert(element);
                    break;
                case 2:
                    System.out.println("Elements Are :");
                    display();
                    break;

                case 3:
                    int count = count();
                    System.out.println("total lists are :" + count);
                    break;
                case 4:
                    System.out.println("recursive sum :" + rsum(head));
                    break;
                case 5:
                    System.out.println("Normal sum :" + SumofLists());
                    break;
                case 6:
                    System.out.println("Max Element in linklist is :" + Max());
                    break;
                case 7:
                    System.out.println("Enter element");
                    int key = sc.nextInt();
                    int search = Search(key);

                    if (search != -1) {
                        System.out.println("Element fount at position : "+search);
                    } else {
                        System.out.println("Element is not fount !!");
                    }
                    break;
                case 8:
                    System.out.println("Enter the element");
                    int elementp = sc.nextInt();
                    System.out.println("Enter the position");
                    int pos = sc.nextInt();
                    insert(elementp, pos);
                    break;
                case 9:
                    System.out.println("Exiting......");
                    return;

                default:
                    System.out.println("You enter the wrong choice !!");

            }

        } while (true);

    }
}
