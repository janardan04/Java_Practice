
public class MethodO {

    static int max(int x, int y) {

        return x > y ? x : y;
    }

    static byte max(byte x, byte y) {
        return x > y ? x : y;
    }

    static float max(float x, float y) {
        return x > y ? x : y;
    }

    static void reverse(int a) {
        int reverse = 0;
        while (a != 0) {
            int rem = a % 10;
            reverse = reverse * 10 + rem;
            a = a / 10;
        }
        System.out.println(reverse);
    }

    static void reverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
    static boolean validate(String name){
       return  name.matches(
            "[a-zA-Z\\s]*");
    }
    static boolean validate(int age){
        return age>=3 && age<=15;
    }


    public static void main(String[] args) {
        System.out.println(max(3, 8));
        byte x = 20, y = 34;
        System.out.println(max(x, y));
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverse(123456);
        reverse(arr);
        System.out.println();

        System.out.println(validate(25));
        System.out.println(validate("harshal"));

    }
}
