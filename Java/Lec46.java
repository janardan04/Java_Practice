class base{
    public int x;
    base(){
        System.out.println("main ek constructor hoon");

    }
    base(int x){
      System.out.println("i am overloaded constructor with value of x :"+x);  
    }
    public int getx(){
        return x;
    }
    public void setc(int x){
        this.x=x;
    }
}
class derived extends base{
    public int y;
    derived(){
        System.out.println("i am constructor of derived");
    }
    derived(int x,int y){
        super(x);
        System.out.println("i am overloaded constructor of derived class with x,y as: "+x+"  "+y);
    }
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
    }
}
    class childderived extends derived{
        childderived(){
            System.out.println("i am child of derived class ");
        }
        childderived(int x ,int y ,int z){
            super(x,y);
            System.out.println("i the child of deried class with value "+z);
        }
    }
public class Lec46 {
    public static void main(String[] args) {
        // base b=new base();
        // derived d = new derived(14,4);
        childderived c = new childderived(8,9,3);
    }
}
