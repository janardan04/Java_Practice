public class ThreadSafeExample {

    static StringBuffer buffer = new StringBuffer("Hello");
    static StringBuilder builder = new StringBuilder("Hello");

    public static void main(String[] args) throws InterruptedException {
        // Create 2 threads that modify StringBuffer (thread-safe)
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                buffer.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                buffer.append("B");
            }
        });

        // Create 2 threads that modify StringBuilder (NOT thread-safe)
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                builder.append("X");
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                builder.append("Y");
            }
        });

        // Start all threads
        t1.start(); t2.start(); t3.start(); t4.start();

        // Wait for all threads to finish
        t1.join(); t2.join(); t3.join(); t4.join();

        // Output final results
        System.out.println("Length of StringBuffer: " + buffer.length());   // Always 2010 (Hello + 1000A + 1000B)
        System.out.println("Length of StringBuilder: " + builder.length()); // May vary due to race condition
    }
}
