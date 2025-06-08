

public class Reverse_copying {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b=new int[5];
        int n=a.length-1;
        for(int i=0;i<=n;i++){
            b[i]=a[i];
        }
        for(int x:b){
            System.out.print(x+" ");
        }
        System.out.println();
        increasing_size(a);
        // System.out.println(a.length);
    }
    public static void increasing_size(int []a){
        int []c=new int[10];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        a=c;
        c=null;
        System.out.println(a.length);

    }
}
