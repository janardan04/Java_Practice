class Emp{
    private int salary;
    private String name;
    // public Emp(){
    //     salary=13000;
    //     name="nishidh";
    //     }
    public Emp(String myname, int mysalary){
        salary=mysalary;
        name=myname;
        }
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
public class Lec42 {
    public static void main(String[] args) {
       Emp harry = new Emp("nishidh",230000);
    //    harry.setname("jayesh");
    //    harry.setsalary(150000);
    System.out.println(harry.getname()+"\n"+harry.getsalary());

    }
    
}
