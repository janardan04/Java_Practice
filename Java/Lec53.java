interface Bicycle{
    int b=45;
    void applyBrake(int decrement);
    void speedup(int increment);

}
interface horn{
    void blomhorn();
    void bloghorn();
}
class Avoncycle implements Bicycle, horn{
    void blowhorn(){
        System.out.println("pee pee poo poo");
    }
   public void applyBrake(int decrement){
        System.out.println("applying brake");
    }
   public void speedup(int increment){
        System.out.println("speed up");
        
    }
    public void blomhorn(){
        System.out.println("luka chhupi");
    }
    public void bloghorn(){
        System.out.println("shadi mein jarur aana");
    }
    
}


public class Lec53 {
public static void main(String[] args) {
    Avoncycle a= new Avoncycle();
    a.applyBrake(23);
    System.out.println(a.b);
    a.bloghorn();
    a.blomhorn();
    a.blowhorn();
}    
}
