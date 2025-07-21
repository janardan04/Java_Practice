
public class Multiple_catch {

    public static void main(String[] args) {
        int a[] = {1, 0, 10, 23, 25};
        try {
            int c = a[0] / a[2];
            System.out.println(c);
            System.out.println(a[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index is bound");
        } catch (ArithmeticException e) {
            System.out.println("Divide with an valid non zero value");
        }
    }
}
