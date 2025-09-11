import java.util.*;
public class S8_1 implements Runnable 
{
    private String text;
    private int times;

    public S8_1(String text, int times)
    {
        this.text = text;
        this.times = times;
    }

    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
}

public class S8
{
    public static void main(String[] args) 
    {
        S8_1 task1 = new S8_1("COVID19", 10);
        S8_1 task2 = new S8_1("LOCKDOWN2020", 20);
        S8_1 task3 = new S8_1("VACCINATED2021", 30);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
