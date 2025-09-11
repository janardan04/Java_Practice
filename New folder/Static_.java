
class employee {

    int empid;
    String name;
    static String compamy = "SP";

    public employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    String display() {
        return " empid " + empid + " name " + name + " Company " + compamy;
    }

    static void displayu2() {
        System.out.println(compamy);
    }

}

class Static_ {

    static {
        System.out.println("hello janardhan");
    }

    public static void main(String[] args) {
        employee e1 = new employee(21, "om");
        System.out.println(e1.display());

        employee.displayu2();

    }
}
