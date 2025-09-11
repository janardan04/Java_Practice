class one{
    public void greet(){
        System.out.println("Good monrning");
    }
    public void name(){
        System.out.println("my name is java!!");
    }

}
class two extends one{
    public void swagat(){
        System.out.println("apka swagat hain!!");
    }
        public void name(){
        System.out.println("My name is java in class two");
    }
}
public class lec49 {
    public static void main(String[] args) {
    //    one o= new one(); 
    //    two ob= new two();
       one s= new two();
    //    two f= new one();// not allowe
        s.greet();
        s.name();  
        // s.swagat();
        int n= 4*4;
        System.out.println(n);

    }
}
