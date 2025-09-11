
class circle {

    public double r;

    public double area() {
        return 3.14 * r * r;
    }
}

class cylinder extends circle {

    public double height;

    public double volume() {
        return area() * height;
    }
}

class parent {

    public parent() {
        System.out.println("I am parent !");
    }

    parent(int x) {
        System.out.println("p of parent");
    }
}

class child extends parent {

    public child() {
        System.out.println("i am child");
    }

    child(int y) {

        super(y);
        System.out.println("p of child");
    }
}

class grandchild extends child {

    public grandchild() {
        System.out.println("i am grandchild");
    }
}

public class Inheritance {

    public static void main(String[] args) {

        cylinder obj = new cylinder();

        obj.r = 7;
        obj.height = 10;

        System.out.println(obj.volume());

        System.out.println(obj.area());

        child c = new child(20);
    }
}
