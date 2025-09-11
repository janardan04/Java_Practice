
interface camera {

    void takesnap();
    void record();
    default void play(){
        greet();
        System.out.println("playing");
    }
    private void greet(){
        System.out.println("greeting");
    }
}

interface wifi {

    String[] getnetworks();

    void connecttonetwork(String network);
}

class cellphone {

    void cellnumber(int number) {
        System.out.println("calling" + number);
    }

    void pickcall() {
        System.out.println("Connecting");
    }

}

class smartphone extends cellphone implements camera, wifi {

    public void takesnap() {
        System.out.println("taking snap");
    }

    public void record() {
        System.out.println("recording is start");
    }
    // public void play(){
    //     System.out.println("playing songs");
    // }
    
    public String[] getnetworks(){
        System.out.println("getting list of numbers!!");
        String[] networklist ={"marry", "savita","sakshi","sanika"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("connecting to :"+ network);
    }

}

public class Lec57 {
    public static void main(String[] args) {
        smartphone s= new smartphone();
        String[] a=s.getnetworks();
        for(String i: a){
            System.out.println(i);
        }
        s.play();
        

    }
}
