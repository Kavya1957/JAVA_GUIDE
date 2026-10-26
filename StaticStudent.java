public class StaticStudent {
    int rollNo;
    String name;   // instance variable object member
static String college = "dsu"; // static variable class member

    // constructor
    StaticStudent(int r, String n) {
        rollNo = r;
        name = n;
    }

    // method to display values
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    // main method
    public static void main(String args[]) {
        StaticStudent s1 = new StaticStudent(111, "Karan");
        StaticStudent s2 = new StaticStudent(222, "Aryan");

        s1.display();
        s2.display();
    }
}
