import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int guess=0;
    public int no;
    public int n;

    public int getnumberofguesses(){
        return guess;
    }
    public void setnumberofguesses(int guess){
        this.no = guess;
    }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);

    }
    int  Uinput(){
    System.out.println("Guess the number");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    return n;
    }
    boolean iscorrectnum(){
        no++;
        if(n==number){
            System.out.format("You won the game the number is %d\n You guess in %d attempts",number,no);
            return true;
        }
        else if(n > number){
            System.out.println("too high");
        }
        else if(n <number){
            System.out.println("too low");
        }
            return false;
    }
 }
public class GuessTheNumber {
public static void main(String[] args) {
    Game g= new Game();

    boolean b= false;
while(!b){
    g.Uinput();
    b = g.iscorrectnum();
    System.out.println(b);
}
}    
}
