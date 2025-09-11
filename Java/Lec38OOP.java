

class Emp{
int id;
String name;
int salary;
//deine method
public void print(){
    System.out.println(id);
    System.out.println(name);
}
public class salary1()
{
    System.out.println(salary);
}
}
public class Lec38OOP {
    public static void main(String[] args) {
      System.out.println("This is custom class!!");
      Emp Jay=new Emp() ;//instatiating a new emp object
      Jay.id=21;//setting attribute or properties
      Jay.name="Jayesh";//setting attribute
      Jay.salary=25000;
       //System.out.println(Jay.id);
       //System.out.println(Jay.name);
       Jay.print();
       Jay.salary1(); 
    }
}
