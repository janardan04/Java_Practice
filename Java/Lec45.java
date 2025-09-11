class Base{
    int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        System.out.println("Im in base and setting x now ");
        this.x=x;
    }
}
class derived extends Base{
    int y;
    public int gety(){
        return y;
    }
    public void sety(int y){ 
        this.y=y;
    }
}
public class Lec45 {
    public static void main(String[] args) {
        derived d=new derived();
        d.setx(15);
        d.sety(45);
        System.out.println(d.getx());
        System.out.println(d.gety());
    }
}
