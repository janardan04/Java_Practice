import java.util.HashSet;
import java.util.Iterator;
public class hashset_learn {
    public static void main(String[] args) {
        
    
    HashSet s = new HashSet();
    
    s.add(852);
    s.add("Jayesh");
    s.add(85.33);
    s.add(65);
    s.add(96);
    s.add("Jayesh");
    s.add(null);
    s.add(null);
    System.out.println(s);

    Iterator itr=s.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    System.out.println(s.contains(852));
    s.remove("Jayesh");
    System.out.println(s);
    System.out.println(s.size());
    s.clear();
    System.out.println(s);
    

    
}
}
