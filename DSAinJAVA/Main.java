import java.util.Scanner;

class Node {
    int data;
    Node next;
}

class LinkedList {
    private Node head = null;

    // Insert at end
    public void insert(int value) {
        Node newnode = new Node();
        newnode.data = value;
        newnode.next = null;

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newnode;
        }
    }

    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Count nodes
    public int count() {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    // Delete node by position (1-based index)
    public void delete(int pos) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (pos == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Position out of range.");
                return;
            }
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Position out of range.");
            return;
        }

        temp.next = temp.next.next;
    }

    // Search for a key
    public int search(int key) {
        int pos = 1;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return pos;
            temp = temp.next;
            pos++;
        }
        return -1;
    }

    // Reverse in-place
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    // Reverse using auxiliary array
    public void reverseAuxiliary() {
        int len = count();
        if (len == 0) return;

        int[] arr = new int[len];
        Node temp = head;
        int i = 0;

        while (temp != null) {
            arr[i++] = temp.data;
            temp = temp.next;
        }

        temp = head;
        i = len - 1;

        while (temp != null) {
            temp.data = arr[i--];
            temp = temp.next;
        }
    }

    // Sort list (bubble sort)
    public void sort() {
        if (head == null || head.next == null) return;

        for (Node i = head; i.next != null; i = i.next) {
            for (Node j = head; j.next != null; j = j.next) {
                if (j.data > j.next.data) {
                    int temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
            }
        }
    }

    // Clear list
    public void clear() {
        head = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        while (true) {
            System.out.println("\n=== Linked List Menu ===");
            System.out.println("Choose List: 1 or 2 (0 to Exit)");
            int listChoice = sc.nextInt();
            if (listChoice == 0) break;

            LinkedList current = (listChoice == 1) ? list1 : list2;

            System.out.println("1. Insert");
            System.out.println("2. Delete at position");
            System.out.println("3. Count");
            System.out.println("4. Search");
            System.out.println("5. Reverse (in-place)");
            System.out.println("6. Reverse (auxiliary array)");
            System.out.println("7. Sort");
            System.out.println("8. Display");
            System.out.println("9. Clear List");
            System.out.println("10. Back to List Choice");

            int choice = sc.nextInt();
            int val, pos;

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    val = sc.nextInt();
                    current.insert(val);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    pos = sc.nextInt();
                    current.delete(pos);
                    break;
                case 3:
                    System.out.println("Count: " + current.count());
                    break;
                case 4:
                    System.out.print("Enter value to search: ");
                    val = sc.nextInt();
                    int res = current.search(val);
                    if (res == -1) System.out.println("Not found");
                    else System.out.println("Found at position: " + res);
                    break;
                case 5:
                    current.reverse();
                    System.out.println("List reversed in-place.");
                    break;
                case 6:
                    current.reverseAuxiliary();
                    System.out.println("List reversed using auxiliary array.");
                    break;
                case 7:
                    current.sort();
                    System.out.println("List sorted.");
                    break;
                case 8:
                    System.out.println("List contents:");
                    current.display();
                    break;
                case 9:
                    current.clear();
                    System.out.println("List cleared.");
                    break;
                case 10:
                    continue;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
        System.out.println("Exited program.");
    }
}
