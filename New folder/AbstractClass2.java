abstract class Hospital{
    abstract void emergency();
    abstract void admit();
    abstract void billing();
}
class myHospital extends Hospital{
    public void emergency(){
        System.out.println("emergency ward");
    }
    public void admit(){
        System.out.println("Admitting");
    }
    public void billing(){
        System.out.println("generating bill's");
    }
}

public class AbstractClass2 {
    public static void main(String[] args) {
        
    }
}
