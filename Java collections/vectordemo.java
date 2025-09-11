import java.util.Vector;
public class vectordemo {
    public static void main(String[] args) {
    Vector v=new Vector();
        v.add(25630);
        v.add(852);
        v.add("Jayesh");
        v.addElement("Shambhu");
         v.add(25630);
        v.add(852);
        v.add("Jayesh");
        v.addElement("Shambhu");
         v.add(25630);
        v.add(852);
        System.out.println(v.capacity());
        v.removeElement("Jayesh");
        System.out.println(v);
        v.removeAllElements();
        System.out.println(v);
    }
}
