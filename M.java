abstract class Vehicle {
    int speed;  
    int fuel;

    Vehicle(int fuel) {
        this.fuel = fuel;
    }

    void start() {
        System.out.println("Vehicle started...");
    }

    abstract void race();
}
interface a{
    void b();
    default void c(){
        System.out.println("i am from c");
    }
}
class Car extends Vehicle implements a{
    Car(int fuel) {
        super(fuel);
    }
    @Override
    void race() {
        System.out.println("Car is racing at " + fuel*10 + " km/h!");
    }

    public void b(){
        System.out.println(" i am b");
    }
}

class Bike extends Vehicle {
    Bike(int fuel) {
        super(fuel);
    }
    @Override
    void race() {
        System.out.println("Bike is racing at " + fuel*5 + " km/h!");
    }
}
public class M{
    public static void main(String[] args){
        Car c1=new Car(85);
        // c1.race();
        Car ref=new Car(30);
        ref.b();
        ref.c();
        ref.race();

        
    }
}