import java.awt.*;
import java.awt.event.*;
public class S4_1 extends Frame implements Runnable
{
    Thread t;
    Label l1;
    int f;
    public S4_1()
    {
        t=new Thread(this);
        t.start();
        setLayout(null);
        l1=new Label("Welcome to java");
        l1.setBounds(100,100,100,40);
        l1.setFont(new Font("Arial", Font.BOLD, 12));
        add(l1);
        setSize(300,300);
        setVisible(true);
        f=0;
    }
    public void run()
    {
        try
        {
            if(f==0)
            {
                t.sleep(200);
                l1.setText("");
                f=1;
            }
            if(f==1)
            {
             t.sleep(200);
             l1.setText("Welcome To Java");
             f=0;   
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
        run();
    }
    public static void main(String args[])
    {
        new S4_1();
    }
}