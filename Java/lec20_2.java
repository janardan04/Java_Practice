import java.util.*;

public class lec20_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 4) {
            Random rand = new Random();
            System.out.println("Press 1 for Scissors \nPress 2 for paper \nPress 3 for stone");
            int u = sc.nextInt();
            if (u > 0 && u <= 3) {
                if (u == 1 && u <= 3 && u > 0) {
                    System.out.println("You choose the scissor!");
                    System.out.println("now computers turn");
                } else if (u == 2 && u <= 3 && u > 0) {
                    System.out.println("You choose the Paper!");
                    System.out.println("now computers turn");
                } else if (u == 3 && u <= 3 && u > 0) {
                    System.out.println("You choose the stone!");
                    System.out.println("now computers turn");
                }
                int c = rand.nextInt(3);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //System.out.println("Computer choose :");
                if (c == 0) {
                    System.out.println("Computer choose the scissor!");
                } else if (c == 1) {
                    System.out.println("Computer choose the paper!");
                } else if (c == 2) {
                    System.out.println("Computer choose the Stone!");
                }
                if (u == 1 && c == 1 || u == 2 && c == 2 || u == 3 && c == 0) {
                    System.out.println("!!!!You win the game!!!!");
                } else if (u == c) {
                    System.out.println("oops! draw try again");
                } else {
                    System.out.println("You loose the game :(");
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        }
    }
}
