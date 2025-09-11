public class HappyNumber {

    public static void main(String[] args) {
        int n = 19; // Example number, change it to test other values

        if (isHappy(n)) {
            System.out.println(n + " is a happy number.");
        } else {
            System.out.println(n + " is not a happy number.");
        }
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }

        return fast == 1;
    }

    private static int getNext(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}