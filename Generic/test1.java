// pack/age Generic;


class test2 <T>{
    private T obj;
    public void setdata(T v){
        obj=v;
    }
    public T getdata(){
        return obj;
    }
}
@SuppressWarnings("unchecked")
class myArray <T>{
    T A[]= (T[])new Object[10];

    int length=0;
    public void append(T v){
        A[length++]=v;
    }
    public void Display(){
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
}
public class test1 {
    

    public static void main(String[] args) {
       
        // test2<Integer> n=new test2<>();
        // n.setdata(25);
        // System.out.println(n.getdata());

        myArray<Integer> arr= new myArray<>();

        arr.append(20);

        arr.append(24);

        arr.Display();

        System.out.println(arr.length);
    }
}
