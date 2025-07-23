

public class thread1 extends Thread {

    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
    thread1 t1 = new thread1();
        t1.start();

        int i = 1;
        while (true) {
            System.out.println(i + " world");
            i++;

        }
    }
}
