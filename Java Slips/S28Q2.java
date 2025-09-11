// Slip - 28 Q1 [JAVA]
// Write a java program to display name of currently executing Thread in multithreading. 

public class S28Q2 {
    public static void main(String[] args) {
        // Create and start a new thread
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        
        // Display the name of the main thread
        System.out.println("Main thread name: " + Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Currently executing thread name: " + Thread.currentThread().getName());
    }
}
