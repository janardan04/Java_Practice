import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
         TreeMap map=new TreeMap<>();
         map.put(1,"jayesh");
         map.put(103,"amit");
         map.put(123,"Om");
         map.put(101,"Jagdish");

         System.out.println(map);

         System.out.println(map.ceilingEntry(123));

        //  map.clear();;
        //  System.out.println(map);

        System.out.println(map.containsKey(231));

        System.out.println(map.containsValue("jayesh"));

        System.out.println(map.higherEntry(104));

        System.out.println(map.keySet());
    }
}
