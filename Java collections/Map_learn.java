
import java.util.HashMap;
import java.util.Map;
;
public class Map_learn {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("one", 1);
        numbers.put("two",2);
        numbers.put("three",3);
        System.out.println(numbers);
        System.out.println(numbers.containsKey("one"));
        System.out.println(numbers.get("three"));
        System.out.println(numbers.remove("two"));
        numbers.replace("one",11);
        System.out.println(numbers);
        numbers.put("two",22);
        numbers.put("two",2);
        System.out.println(numbers);
        numbers.put(null,90);
        numbers.put(null,null);


        

        System.out.println(numbers);
    }
}
