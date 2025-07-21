class NegativeException extends Exception{
    public String toString(){
        return "dimension is not be zero";
    }
}

public class test3 {

    static int  area(int l,int h) throws NegativeException{
        if(l<0 || h<0){
            throw new NegativeException();
        }
        return l*h;
    }
    static void meth1() throws NegativeException{
        System.out.println("area is :"+area(-5,5));
    }





    public static void main(String[] args) {
        try {
        meth1();    
        } catch (NegativeException  e) {
            System.out.println(e);
        }
        
    }
}
