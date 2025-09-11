
abstract class neeed{
    abstract void race();
}
interface Car{
    //we can create properties in interfaces but cant modify them such as below we create an property of a
    int a=50;
    void applybrake(int decrement);
    void speedUp(int increment);
    default void horn(int h){
        System.out.println("car is making noise");
    }
}
interface CarFeatures{


    void Sunroof();
    void AirSuspension(int increment );
}
class Control implements Car,CarFeatures{
//remember whenever you implementing the interface method then you have to used "public"
   void blowhorn(){
        System.out.println("pee pee");
    }
   
   public  void applybrake(int decrement){
        System.out.println("applying brake with the pressure of "+decrement);
    }
    @Override
    public void speedUp(int increment) {
        System.out.println("speed increasing by "+increment);
        
    }
    public void Sunroof(){
        System.out.println("opening sunroof");
    }
    public void AirSuspension(int increment){
        System.out.println("Icrementing the ground clearence of our DEFENDER By "+increment);
    }
    
}

public class interface1 {
   public static void main(String[] args) {
    Control obj= new Control();
    obj.applybrake(29);
    Car o=new Control();
    o.horn(23);
    o.blowhorn();
    System.out.println(o.a);
    // if i try to change the value of a then it shows me error
    // obj.a=123;
    // System.out.println(obj.a);

    // obj.AirSuspension(50);
    // obj.Sunroof();
   } 
}
