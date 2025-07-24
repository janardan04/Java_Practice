
class mythread extends Thread {

    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++ +" My thread");
            // try{Thread.sleep(5);}catch(Exception e){};
        }
    }
}

public class Thread_methods {

    public static void main(String[] args) throws Exception
    {
        mythread t = new mythread();

      
        t.start();
        
        int count=1;
        while(true){
            System.out.println(count++ + " Main thread");

            Thread.yield();//it gives more chance to the my thread rather than main thread
        }
    
      
    }

}
