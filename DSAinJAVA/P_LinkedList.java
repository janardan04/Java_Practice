import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}

interface operations {
    abstract void insert(int data);
    abstract void reverse();
    abstract void display();
    abstract void atfirst(int data);
    abstract void atlast(int data);
    abstract boolean search(int key);
}

class LLP implements operations {
    private static Node head = null;
    private static Node tail = null;
    public static int count = 0;

    public void insert(int data) {
        Node nw = new Node(data);
        if (head == null) {
            head = nw;
            tail = head;
            count++;
            return;
        }
        tail.next = nw;
        tail = tail.next;
        count++;
    }
    

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;  
        }
        System.out.println();
    }

    public void atfirst(int data) {
        Node nw = new Node(data);
        if (head == null) {
            head = tail = nw;   
            count++;
            return;
        }
        nw.next = head;
        head = nw;
        count++;
    }

    public void atlast(int data) {
        Node nw = new Node(data);
        if (head == null) {
            head = tail = nw;   
            count++;
            return;
        }
        tail.next = nw;        
        tail = nw;
        count++;
    }

    public void insertatpos(int pos, int data) {
        Node nw = new Node(data);
        if (pos == 1) {
            atfirst(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }
        nw.next = temp.next;
        temp.next = nw;
        if (nw.next == null) tail = nw;  
        count++;
    }

    @Override
    public boolean search(int key) {
        Node temp = head;              
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }
    
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void displaycount() {
        System.out.println("Total Nodes are: " + count);
    }

    public void deleteFirst() {
        if(head==null){
            System.out.println("List is empty!!");
            return;
        }
        int val=head.data;
        if(head.next==null){
            head=tail=null;
            System.out.println("deleted value is "+val);
            count=0;
            return;
        }
        head=head.next;
        System.out.println("deleted value is "+val);
        count--;
    }

    public void deleteLast() {
        Node temp=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            int val=head.data;
            head=tail=null;
            System.out.println("deleted vallue is : "+val);
            return;
        }
        while(temp.next!=tail){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        tail=temp;
        count--;
        System.out.println("deleted value is "+val);
    }
}

public class P_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLP list = new LLP();
        int choice;

        do {
            System.out.println("\n--- Linked List Menu ---");
            System.out.println("1. Insert at end");
            System.out.println("2. Insert at beginning");
            System.out.println("3. Delete first");
            System.out.println("4. Delete last");
            System.out.println("5. Search element");
            System.out.println("6. Count nodes");
            System.out.println("7. Reverse list");
            System.out.println("8. Display list");
            System.out.println("0. Exit");
            System.out.println("10. Insert at index"); 
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    int dataEnd = sc.nextInt();
                    list.atlast(dataEnd);   

                case 2:
                    System.out.print("Enter data: ");
                    int dataBeg = sc.nextInt();
                    list.atfirst(dataBeg);
                    break;

                case 3:
                    list.deleteFirst();
                    break;

                case 4:
                    list.deleteLast();
                    break;

                case 5:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    if (list.search(key))
                        System.out.println(key + " found in the list.");
                    else
                        System.out.println(key + " not found.");
                    break;

                case 6:
                    list.displaycount();
                    break;

                case 7:
                    list.reverse();
                    System.out.println("List reversed.");
                    break;

                case 8:
                    list.display();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                case 10:
                    System.out.print("Enter the index: ");
                    int index = sc.nextInt();
                    System.out.print("Enter the data: ");
                    int d = sc.nextInt();
                    list.insertatpos(index, d);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
