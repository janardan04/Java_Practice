
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

        System.out.println(r2.volume());
    }
}
