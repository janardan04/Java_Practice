// Slip - 8 Q1 [JAVA]
// Write a java program to define a thread for printing text on output screen for ‘n’ number of times. Create 3 threads and run them. Pass the text ‘n’ parameters to the thread constructor.  Example:   
// i. First thread prints “COVID19” 10 times.  
// ii. Second thread prints “LOCKDOWN2020” 20 times
// iii. Third thread prints “VACCINATED2021” 30 times

import java.io.*;

class ThreadDemo extends Thread {
    String msg;
    int n;

    ThreadDemo(String msg, int n) {
        this.msg = msg;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println(msg + ": " + (i+1));
        }
    }
}

class A1 {
    public static void main(String args[]) throws IOException {
        ThreadDemo t1 = new ThreadDemo("Thread1 -> COVID19", 10);
        ThreadDemo t2 = new ThreadDemo("Thread2 -> LOCKDOWN2020", 20);
        ThreadDemo t3 = new ThreadDemo("Thread3 -> VACCINATED21", 30);

        t1.start();
        t2.start();
        t3.start();
    }
}
