

class myuthread extends  Thread{
    public myuthread(String name){
        super(name);
        setPriority(Thread.MIN_PRIORITY+3);
    }
    @Override
    public void run(){
        int count=1;
        while (true) { 
            System.out.println(count++);
            try {
                Thread.sleep(1000) ;              
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}

public class thread2 {
    public static void main(String[] args) {
        myuthread t=new myuthread("my thread 1");

        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.start();
        t.interrupt();
        System.out.println(t.getState());
        System.out.println(t.isAlive());
    }

}
