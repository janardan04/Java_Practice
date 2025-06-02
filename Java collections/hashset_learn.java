import java.util.*;
public class hashset_learn {
    public static void main(String[] args) {
        
    
    Set<Integer> set = new HashSet <>();

    set.add(152632655);
    set.add(32);
    set.add(12);
    System.out.println(set);
    System.out.println(set.size());
    System.out.println(set.contains(12));
    set.remove(12);
    System.out.println(set.isEmpty());
    set.clear();
    System.out.println(set);
    

    
}
}
