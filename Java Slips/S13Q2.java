// Slip - 13 Q2 [JAVA]
// Write a Java program to show lifecycle (creation, sleep, and dead) of a thread. Program should print randomly the name of thread and value of sleep time. The name of the thread should be hard coded through constructor. The sleep time of a thread will be a random integer in the range 0 to 4999.

import java.util.Random;

public class S13Q2 {
    public static void main(String args[]) {
        Thread thread = new CustomThread("CustomThread");
        thread.start();
    }

    static class CustomThread extends Thread {
        public CustomThread(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + " is created.");

            Random random = new Random();
            int sleepTime = random.nextInt(5000);

            System.out.println(getName() + " will sleep for " + sleepTime + " milliseconds.");

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(getName() + " is dead.");
        }
    }
}
