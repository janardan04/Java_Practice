class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

class lll {
    static node head = null;
    static node tail = null;
    static int size = 0;

    public void insert(int number) {
        node nw = new node(number);
        if (head == null) {
            head = nw;
            tail = head;
            size++;
            return;
        } else {
            tail.next = nw;
            tail = tail.next;
            size++;
        }
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public node mid() {
        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // helper to reverse from a given node
    private node reverseList(node start) {
        node prev = null;
        node curr = start;
        while (curr != null) {
            node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; // head of reversed part
    }

    public boolean ispalindrome() {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle
        node midNode = mid();

        // Step 2: Reverse second half
        node secondHalfHead = reverseList(midNode);

        // Step 3: Compare halves
        node p1 = head;
        node p2 = secondHalfHead;
        boolean result = true;

        while (p2 != null) {  // only need to check second half
            if (p1.data != p2.data) {
                result = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // Step 4: Restore second half (optional but good practice)
        reverseList(secondHalfHead);

        return result;
    }
}

public class linkd1 {
    public static void main(String[] args) {
        lll l = new lll();

        l.insert(1);
        l.insert(2);
        l.insert(2);
        l.insert(1);

        l.display();
        System.out.println("Palindrome? " + l.ispalindrome());

        l = new lll();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(2);
        l.insert(1);

        l.display();
        System.out.println("Palindrome? " + l.ispalindrome());

        l = new lll();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);

        l.display();
        System.out.println("Palindrome? " + l.ispalindrome());
    }
}
 