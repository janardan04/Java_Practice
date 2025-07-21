


class lowBalancedException extends Exception{
    public String toString(){
        return "balanced is low";
    }
}

public class Test2 {
    public static void main(String[] args) {
        display();
        fun1();
    }
    public static void display(){
        int i=10;
        int j=0;
        try {
            int c=i/j;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public static void fun1(){
       try {
           throw new lowBalancedException();
       } catch (lowBalancedException e) {
        System.out.println(e);
       }
    }
}
