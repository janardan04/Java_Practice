
import java.io.IOException;
import java.io.PrintWriter;

public class GCD {

    public static void main(String[] args) {
        GCD x = new GCD();
        System.out.println(x.G(30, 15));
        try (PrintWriter pw = new PrintWriter("result.txt")) {
            pw.println(Max(10, 5));
            System.out.println("Succefully added to result.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    int G(int n, int m) {
        while (n != m) {
            if (n > m) {
                n = n - m;
            } else {
                m = m - n;
            }
        }
        return n;
    }

    static int Max(int x, int y) {
        return x > y ? x : y;
    }
    static float Max(float x, float y) {
        return x > y ? x : y;
    }
    static int 
}
