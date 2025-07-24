
class mydata {

   synchronized  public void display(String str) {
        // synchronized (this) {

            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                }
            }
        // }

    }
}

class mythread1 extends Thread {

    mydata d;

    public mythread1(mydata d) {
        this.d = d;
    }

    public void run() {
        d.display("hello world ");
    }
}

class mythread2 extends Thread {

    mydata d;

    public mythread2(mydata d) {
        this.d = d;
    }

    public void run() {
        d.display("Welcome all");
    }
}

public class synchronization1 {

    public static void main(String[] args) {

        mydata d = new mydata();
        mythread1 t1 = new mythread1(d);
        mythread2 t2 = new mythread2(d);

        t1.start();
        t2.start();

    }
}
