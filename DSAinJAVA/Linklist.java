// package DSAinJAVA;

import java.util.Scanner;

class Node {

    public int data;
    public Node next;
}

 class Linkl {

    private  Node head = null;

    public  void insert(int value) {
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

    public  void insertsorting(int value) {
        Node newnode = new Node();
        newnode.data = value;
        newnode.next = null;

        Node temp;
        temp = head;
        Node ptr = null;//tailing pointer for following

        if (head == null || head.data >= value) {
            newnode.next = head;
            head = newnode;
            return;
        }

        while (temp != null && temp.data < value) {
            ptr = temp;
            temp = temp.next;
        }
        ptr.next = newnode;
        newnode.next = temp;

    }

    public  void insert(int value, int position) {
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

    public  int count() {
        int cnt = 0;
        Node temp;
        temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        return cnt;

    }

    public  int SumofLists() {
        int sum = 0;
        Node temp;
        temp = head;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        return sum;

    }



    public  int Max() {
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

    public  void display() {
        if (head == null) {
            System.out.println("LinkedList is empty !!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

    }

    public  int Search(int Key) {
        if (head == null) {
            return -1;
        }
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            if (temp.data == Key) {
                return cnt;
            } else {
                temp = temp.next;
            }
        }
        return -1;
    }

    public  void delete(int value) {
        Node temp = head;
        Node tail = head;
        if (head == null) {
            System.out.println("No data is available for deleting !!");
            return;
        }
        if (head.data == value) {
            temp = head.next;
            head = temp;
            System.out.println("Deleted data is :" + head.data);
            return;
        }
        while (temp != null && temp.data != value) {
            tail = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("The Number " + value + " is not found");
            return;
        }
        tail.next = temp.next;
        System.out.println("deleted data is : " + temp.data);

    }

    public  boolean isSorted() {
        if (head == null) {
            return false;
        }
        Node temp = head;
        Node tail = temp.next;
        while (tail != null) {
            if (temp.data > tail.data) {
                return false;
            }
            temp = tail;
            tail = tail.next;
        }
        return true;
    }

    public  void displayPhysical() {
        Node temp = head;
        while (temp != null) {
            System.out.print("|data: " + temp.data + "|next: ");
            if (temp.next != null) {
                System.out.print("0x" + Integer.toHexString(System.identityHashCode(temp.next)));
            } else {
                System.out.print("null");
            }
            System.out.print("| -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public  void deleteduplicate(){
        Node temp=head;
        Node tail= temp.next;
        while(tail!=null){
            if(temp.data != tail.data){
                temp=tail;
                tail=tail.next;
            }
            else{
                temp.next=tail.next;
                tail=temp.next;
            }
        }
    }
    public  void reverse(){
        Node temp=head;
        Node q=null;
        Node r=null;
        while(temp!=null){
            r=q;
            q=temp;
            temp=temp.next;
            q.next=r;

        }
        head =q;
    }
    
    public  void reverse_auxillary(){
        int l=count();
        Node temp=head;
        int []arr=new int[l];
        int i=0;
        while(temp!=null){
            arr[i]=temp.data;
            temp=temp.next;
            i++;
        }
        temp=head;
        i= l-1;
        while(temp!=null){
            temp.data=arr[i];
            temp=temp.next;
            i--;
        }
    }
    public void rotate(){
        int k=2;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(k>0){
            Node t=head;
            head=head.next;
            temp.next=t;
            temp=temp.next;
            k--;
        }
    }
}
public class Linklist{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Linkl l1=new Linkl();
        int choice, value;
        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println(
                    "1.Insert Element\n2.Display Elements\n"
                    + "3.Total LinkedLists\n4.rsum\n5.sum\n"
                    + "6.Max Element\n"
                    + "7.Search Element\n"
                    + "8.Insert At Position\n"
                    + "9.Insert elements in sorting order\n"
                    + "10.delete element\n"
                    + "11.check whether the list is sorted or not\n"
                    + "12.remove duplicate" +
                    "\n13.reverse LL"+
                    "\n14.rotate linklist"+
                    "\n15.exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter the element");
                    int element = sc.nextInt();
                    l1.insert(element);
                    break;
                case 2:
                    System.out.println("Elements Are :");
                    // display();
                    l1.display();
                    System.out.println();
                    break;

                case 3:
                    int count = l1.count();
                    System.out.println("total lists are :" + count);
                    break;
                case 4:
                    System.out.println("recursive sum :" );
                    break;
                case 5:
                    System.out.println("Normal sum :" + l1.SumofLists());
                    break;
                case 6:
                    System.out.println("Max Element in linklist is :" + l1.Max());
                    break;
                case 7:
                    System.out.println("Enter element");
                    int key = sc.nextInt();
                    int search = l1.Search(key);

                    if (search != -1) {
                        System.out.println("Element fount at position : " + search);
                    } else {
                        System.out.println("Element is not fount !!");
                    }
                    break;
                case 8:
                    System.out.println("Enter the element");
                    int elementp = sc.nextInt();
                    System.out.println("Enter the position");
                    int pos = sc.nextInt();
                    l1.insert(elementp, pos);
                    break;
                case 9:
                    System.out.println("Enter the element");
                    int element1 = sc.nextInt();
                    l1.insertsorting(element1);
                    break;
                case 10:
                    System.out.println("Enter the element");
                    int deletetdata = sc.nextInt();
                    l1.delete(deletetdata);
                    break;
                case 11:
                    if (l1.isSorted()) {
                        System.out.println("The LinkedList is Sorted !!");
                    } else {
                        System.out.println("The LinkedList is not Sorted");
                    }
                    break;
                    case 12:l1.deleteduplicate();
                    break;
                    case 13:l1.reverse();
                    break;
                case 14:l1.rotate();
                break;
                case 15:
                    System.out.println("Exiting......");
                    return;

                default:
                    System.out.println("You enter the wrong choice !!");

            }

        } while (true);

    }
}
