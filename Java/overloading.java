public class overloading {
    static void joke(){
        System.out.println("Good morning bro!");
    }
    static void joke(int a){
    System.out.println("Good morning "+a+" bro");
    }
    static void joke(int a,int b){
    System.out.println("Good morning "+a+" bro love you "+b);
    }
    public static void main(String[] args) {
        //int a=2000;
        //int b=3000;
        joke();
        joke(4000);
        joke(4000,5000);
    }
}
