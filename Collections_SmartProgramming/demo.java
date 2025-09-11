import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class demo {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        Set<Integer> s = new HashSet<>();

        // Add elements to ArrayList
        l.add(256);
        l.add(123);
        l.add(2, 258); // Add 258 at index 2
        l.add(123);    // Duplicate

        // Add elements to HashSet (to remove duplicates if needed)
        s.addAll(l);

        // Print elements using Iterator
        System.out.println("Iterator (forward):");
        Iterator<Integer> itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("------------------------------------------------------");

        // Use ListIterator from end
        ListIterator<Integer> ltr = l.listIterator(l.size());

        System.out.println("ListIterator (backward):");
        while (ltr.hasPrevious()) {
            System.out.println("Value: " + ltr.previous() +
                ", nextIndex: " + ltr.nextIndex() +
                ", previousIndex: " + ltr.previousIndex());
        }

        // Add an element at the current position (start)
        System.out.println("Adding 225897 using add()");
        ltr.add(225897);

        // Move forward to point to the element we want to update
        Integer val1 = ltr.next();  // Move to first element
        System.out.println("Next: " + val1);
        Integer val2 = ltr.next();  // Move to second element
        System.out.println("Next: " + val2);

        // Update current element using set()
        System.out.println("Updating second element using set() to 12354");
        ltr.set(12354);

        // Print list using ListIterator from start again
        System.out.println("------------------------------------------------------");
        System.out.println("Updated list (using ListIterator forward):");
        ltr = l.listIterator();
        while (ltr.hasNext()) {
            System.out.println("Value: " + ltr.next() +
                ", nextIndex: " + ltr.nextIndex() +
                ", previousIndex: " + ltr.previousIndex());
        }

        // Remove an element using remove()
        System.out.println("Removing last element returned by next()");
        ltr.previous();  // Move to last element
        ltr.remove();    // Remove it

        System.out.println("------------------------------------------------------");
        System.out.println("Final List:");
        for (int i : l) {
            System.out.println(i);
        }


System.out.println("Vector operations :");

       Vector v=new Vector<>();

       v.add(90);
       v.add(321);
       v.add(98);
       v.add(32);

       System.out.println(v);

       Enumeration en=v.elements();
       while(en.hasMoreElements()){
System.out.println(en.nextElement());
       }

    }
}
