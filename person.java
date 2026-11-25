class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int marks;

    Student(String name, int marks) {
        super(name);
        this.marks = marks;
    }

    void displayMarks() {
        System.out.println("Marks: " + marks);
    }
}

public class person {
    public static void main(String[] args) {
        Student s = new Student("Rahul", 95);

        s.displayName();
        s.displayMarks();
    }
}