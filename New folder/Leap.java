public class Leap {
    public static void main(String[] args) {
        int n = 1000;
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }
    }
}
