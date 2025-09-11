// Slip - 20 Q1 [JAVA]
// Create a JSP page to accept a number from a user and display it in words: Example: 123 – One Two Three. The output should be in red color.

public class NumberConverter {
    public static String convertToWords(long number) {
        String[] digitWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String result = "";
        boolean isFirstDigit = true;

        while (number > 0) {
            int digit = (int) (number % 10);
            if (isFirstDigit) {
                result = digitWords[digit] + result;
                isFirstDigit = false;
            } else {
                result = digitWords[digit] + " " + result;
            }
            number /= 10;
        }
        return result;
    }
}
