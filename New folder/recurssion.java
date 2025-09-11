public class recurssion
{
    public static void main(String[] args) {
        int x= 10;
        // double y= 2;
        fun1(x);
    }
    public static void fun1(int n){
        if(n>0){
            System.out.println(n );
            fun1(n-1);
            
        }
    }
}