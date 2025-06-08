public class Value_Update {
    static void update(int a[],int index, int value){
        a[index]=value;
    }
    public static void main(String[] args) {
        int []a={1,3,4,5,6};//because the array is non primitive  
        int index=2;
        int value=100;
        update(a, index, value);
        for(int x:a){
            System.out.println(x);
        }
    }
}
