class Emp{
    private int salary;
    private String name;

    public void setsalary(int a){
        salary = a;
    }
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
public class Lect40 {
    public static void main(String[] args) {
    Emp jay =new Emp();
    // jay.name="janardhan"; throws error due to private accessor
    jay.setname("jayesh");
    jay.setsalary(5000);
    System.out.println(jay.getsalary());
    System.out.println(jay.getname());


    }
}
