
abstract class Super{
    public Super(){
        System.out.println("super constructor ");
    }
    public void method(){
        System.out.println("method 1 super");
    }

    abstract public void meth2();  
}
class Sub extends Super{
    @Override
    public void meth2(){
      System.out.println("sub meth2");  
    }
}



public class abstractclass {
    public static void main(String[] args) {
        Super s=new Sub();
        s.meth2();
        
    }
}
