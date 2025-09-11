
class Circle {

    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }

}

class reactangle {

    public int lenght;
    public int breadth;

    public boolean issquare() {
        return lenght == breadth;
    }
}

class Cylinder {

    public double radius;
    public double height;

    double volume() {
        return 2 * Math.PI * radius * radius * height;
    }
}

class Student {

    private int roll;
    private String name;
    private String course;
    public int m1, m2, m3;

    public int getroll() {
        return roll;
    }

    public String getname() {
        return name;
    }

    public String getcourse() {
        return course;
    }

    public void setroll(int r) {
        roll = r;
    }

    public void setname(String n) {
        name = n;
    }

    public void setcourse(String c) {
        course = c;
    }

    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return total() / 3;
    }

    public String details() {
        return "Roll No: " + roll + "\n" + "Name: " + name + "\n" + "Course: " + course + "\n" + "Total Marks: " + total() + "\n" + "Average: " + average();
    }

}

class day12 {

    public static void main(String[] args) {
        Circle obj = new Circle();

        obj.radius = 25;

        System.out.println(obj.area());

        System.out.println(obj.perimeter());

        Circle obj2 = new Circle();

        obj2.radius = 7;
        System.out.println(obj2.area());

        System.out.println(obj2.perimeter());

        reactangle objr = new reactangle();
        objr.lenght = 20;
        objr.breadth = 220;
        System.out.println(objr.issquare());

        Cylinder objC = new Cylinder();
        objC.radius = 7;
        objC.height = 10;
        System.out.println(objC.volume());

        Student std = new Student();
        std.setcourse("Computer Science");
        std.setname("Janardan");
        std.setroll(2);
        std.m1 = 99;
        std.m2 = 94;
        std.m3 = 89;

        System.out.println(std.details());
    }
}
