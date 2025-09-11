abstract class Parent1{
 Parent1(){
    System.out.println("i am constructor of Parent1");
 }
 public void sayhello(){
    System.out.println("hello");
 }
 abstract public void greet();
 abstract public void greet2();
 abstract public void th();
}
class Child extends Parent1{
    @Override
    public void greet(){
        System.out.println("hello");
    } public void greet2(){
        System.out.println("hello ");
    } 
    public void th(){
        System.out.println("hell "); 
     }

    
}
  class Child2 extends Parent1{
    @Override
    public void th(){
       System.out.println("hell 3"); 
    }
    @Override
    public void greet2(){
        System.out.println("hello 2");
    }public void greet(){
        System.out.println("hello 2");

}}
public class Lec52 {
    public static void main(String[] args) {
        Child c = new Child();
       c.greet2();
       c.th();
       c.greet();

        Child2 c1= new Child2();
    }
}
