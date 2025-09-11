class parent{
    // private int a,b;
    public void display(){
        System.out.println("I am parent");
    }
    public int add(int a,int b){
        return a+b;
    }
}

class child extends parent{
    @Override
    public void display(){
        System.out.println("hello i am child");
    }
    public int add(int a,int b, int c){
        return a+b+c;
    }
}



public class DMD {
    public static void main(String[] args) {
        child obj = new child();
        obj.display();

        int a=obj.add(1,5,12);
        System.out.println(a);
    }
}
