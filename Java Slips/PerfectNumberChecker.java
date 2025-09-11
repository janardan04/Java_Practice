// Slip - 12 Q1 [JAVA]
// Write a JSP program to check whether given number is Perfect or not. (Use Include directive).

// This is one of the 3 files required for this program. [PAKAGE]

public class PerfectNumberChecker {
    public static boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i != num) {
                    sum = sum + i + num / i;
                } else {
                    sum = sum + i;
                }
            }
        }
        return sum == num && num != 1;
    }
}
