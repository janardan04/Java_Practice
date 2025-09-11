class Emp{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
}
class cellphone{
    public void ringing(){
        System.out.println("ringing");
    }
    public void vibrate(){
        System.out.println("vibrate");
    }
    public void call(){
        System.out.println("calling rahul");
    }
}
class square{
    int side;
    public  int area(){
        return side*side;
    }
    public int  perimeter(){
        return 4*side;
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class Ch8Practiceset {
    public static void main(String[] args) {
        Emp jay = new Emp();
        jay.setname("Somnath");
        jay.salary=70000;
        System.out.println(jay.getsalary());
        System.out.println(jay.getname());
        cellphone  moto =new cellphone();
        moto.call();
        moto.vibrate();
        moto.ringing();

        square n= new square();
        n.side =5;
        System.out.println(n.area());
        System.out.println(n.perimeter());
        Tommy game=new Tommy();
        game.hit();
        game.fire();
        game.run();
    }
}
