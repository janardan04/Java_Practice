class Test1{
    public static void main(String []args){
        int a=10,b=0,c;
        try{
        c=a/b;
        System.out.println(5);

        System.out.println("bye");
        }
        catch(ArithmeticException e){
            System.out.println("divide by zero");
        }
    }
}