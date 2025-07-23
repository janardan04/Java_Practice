// package Multithreading;

class runna implements Runnable{
    @Override
    public void run(){
        int i=1;
        while (true) { 
            
         System.out.println(i+" hello");   ;
         i++;
        }
    }
}


public class runn {
    public static void main(String[] args) {
        runna r1=new runna();//in this the logic that we want to thread to execute it is like the task
        Thread t1=new Thread(r1);//this basically said that when you start run whateverr that is defined in r1.run() it is like the worker

        t1.start();

        int i=1;
        while (true) { 
         System.out.println(i+" world");   
        }
    }    
}
//Imagine r1 is a "document" (task to print),
// and t1 is the "printer" (the thread that executes the task).
// You hand the document (r1) to the printer (t1) to print it out.