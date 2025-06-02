import java.util.*;

public class WaterJugDFS {

    static class Pair {
        int jug1, jug2;

        Pair(int jug1, int jug2) {
            this.jug1 = jug1;
            this.jug2 = jug2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair p = (Pair) o;
            return jug1 == p.jug1 && jug2 == p.jug2;
        }

        @Override
        public int hashCode() {
            return Objects.hash(jug1, jug2);
        }

        @Override
        public String toString() {
            return "(" + jug1 + "," + jug2 + ")";
        }
    }

    public static boolean waterJugDFS(int jug1Capacity, int jug2Capacity, int target) {
        Set<Pair> visited = new HashSet<>();
        Stack<Pair> stack = new Stack<>();

        stack.push(new Pair(0, 0));

        while (!stack.isEmpty()) {
            Pair current = stack.pop();

            if (visited.contains(current)) {
                continue;
            }

            visited.add(current);
            System.out.println(current);

            if (current.jug1 == target || current.jug2 == target) {
                System.out.println("Target Reached");
                return true;
            }

            // Generate next states
            List<Pair> nextStates = Arrays.asList(
                new Pair(jug1Capacity, current.jug2),  // Fill jug1
                new Pair(current.jug1, jug2Capacity),  // Fill jug2
                new Pair(0, current.jug2),             // Empty jug1
                new Pair(current.jug1, 0),             // Empty jug2

                // Pour jug1 -> jug2
                new Pair(
                    current.jug1 - Math.min(current.jug1, jug2Capacity - current.jug2),
                    current.jug2 + Math.min(current.jug1, jug2Capacity - current.jug2)
                ),

                // Pour jug2 -> jug1
                new Pair(
                    current.jug1 + Math.min(current.jug2, jug1Capacity - current.jug1),
                    current.jug2 - Math.min(current.jug2, jug1Capacity - current.jug1)
                )
            );

            // Push non-visited states into stack
            Collections.reverse(nextStates); // to simulate DFS properly
            for (Pair next : nextStates) {
                if (!visited.contains(next)) {
                    stack.push(next);
                }
            }
        }

        System.out.println("Target not reachable");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Jug 1 Capacity: ");
        int j1=sc.nextInt();
        System.out.println("Enter the Jug 2 Capacity: ");
        int j2=sc.nextInt();
        System.out.println("Enter the target: ");
        int t=sc.nextInt();
        waterJugDFS(j1, j2, t); // Example: jug1=5L, jug2=4L, target=2L
    }
}
