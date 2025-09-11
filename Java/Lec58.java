// interfaces can extends another interfaces but cant implements interfaces
interface sample{
    void meth1();
    void meth2();
}
interface childsample extends sample{
    // void meth1();
    // void meth2();
    void meth3();
    void meth4();
}
class mysampleclass implements childsample{
    public void meth3(){
        System.out.println("i am meth 3");
    }
    public void meth4(){
        System.out.println("i am meth 4");
    }
    public void meth2(){
        System.out.println("i am meth 2");
    }
    public void meth1(){
        System.out.println("i am meth 1");
    }

}
public class Lec58 {
     static public void main(String []q) {
        mysampleclass a= new mysampleclass();
        a.meth1();
        a.meth2();
        a.meth3();
        a.meth4();
    }
}
