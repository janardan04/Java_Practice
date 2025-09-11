public class Npr {
    public static void main(String[] args) {
        int n=5,r=2;
        int n1=npr(n)/npr(n-r);
        System.out.println(n1);
    }
    static int npr(int n){
        if(n==0){
            return 1;
        }
        else{
            return npr(n-1)*n;
        }
    }
}
