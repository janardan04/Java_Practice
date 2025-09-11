class Ekclass{
int a;
public int get(){
    return a;
}
Ekclass(int a){
   this.a= a; 
}
public int returnone(){
    return 1;

}}

class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("Me ek constructor hoon !!!!");
    }
}
public class Lec47 {
    public static void main(String[] args) {
        Ekclass v = new Ekclass(5);
        Doclass b= new Doclass(2);
        System.out.println(v.get());
        
    }
}
