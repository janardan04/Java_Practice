public class Lec31 {
     int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z= (x+y)*5;
        }
        return z;
    }
    //static void joke()
    public static void main(String[] args) {
        int a=5;
        int b=8;
        int c;
       
        int x=8;
        int r=10;
        int c1;
       // c1=logic(x, r);// if we create a static method
        // without using static method
        Lec31 obj= new Lec31();
        c1=obj.logic(x, r);
        c= obj.logic(a,b);
        System.out.println(c1);
        System.out.println(c);
    }
}
