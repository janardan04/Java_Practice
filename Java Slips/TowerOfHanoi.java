import java.util.Stack;
public class TowerOfHanoi{
    private static void printRods(Stack<Integer>[] rods) {
        System.out.println("Current state of rods:");
        for (int i = 0; i < rods.length; i++) 
        {
            System.out.print("Rod " + (char) ('A' + i) + ": " + rods[i]);
        }
        System.out.println("\n");
    }
    public static void solveHanoi(int n, Stack<Integer>[] rods, int source, int target, int auxiliary) {
        if (n == 1) {
            int disk = rods[source].pop();
            rods[target].push(disk);
            System.out.println("Move disk " + disk + " from " + (char) ('A' + source) + " to " + (char) ('A' + target));
            printRods(rods);
            return;
        }
        solveHanoi(n - 1, rods, source, auxiliary, target);
        int disk = rods[source].pop();
        rods[target].push(disk);
        System.out.println("Move disk " + disk + " from " +(char) ('A' + source) + " to " + (char) ('A' + target));
        printRods(rods);
        solveHanoi(n - 1, rods, auxiliary, target, source);
    }
        public static void main(String[] args) {
        int n = 3;
        @SuppressWarnings("unchecked")
        Stack<Integer>[] rods = new Stack[3];
        for (int i = 0; i < 3; i++) {
            rods[i] = new Stack<>();
        }
        for (int i = n; i >= 1; i--) {
            rods[0].push(i);
        }
        System.out.println("Initial state of rods:");
        printRods(rods);
        solveHanoi(n, rods, 0, 2, 1);
    }
}
