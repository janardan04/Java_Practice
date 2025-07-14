
class rectangle {

    private double length;
    private double breadth;

    public rectangle() {
        length = 2;
        breadth = 1;
    }

    public rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public double volume() {
        return length * breadth;
    }
}

public class Constructor_exx {

    public static void main(String[] args) {
        // rectangle r1 = new rectangle();
        rectangle r2 = new rectangle(5, 8);
        // System.out.println(r.volume());

        //array of objects
        rectangle r3[] = new rectangle[3];

        r3[0] = new rectangle(5, 6);

        r3[1] = new rectangle(5, 20);

        r3[2] = new rectangle(10, 6);

        System.out.println(r3[0].volume());

        System.out.println(r3[1].volume());

        System.out.println(r3[2].volume());

    }
}
