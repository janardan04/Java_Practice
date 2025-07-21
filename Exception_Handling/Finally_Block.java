public class Finally_Block {

    static void meth1() throws Exception{
        try {
          throw new Exception();  
        }finally {

            System.out.println("final message from meth1");
        }

    }
    public static void main(String[] args) throws Exception {
    
       meth1();
    }
}
