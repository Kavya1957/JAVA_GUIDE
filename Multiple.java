interface A {
    void display();
}

interface B {
    void show();
}

class Main implements A, B {
    public void display() {
        System.out.println("Interface A");
    }

    public void show() {
        System.out.println("Interface B");
    }

    public static void main(String[] args) {
        Main obj = new Main();

        obj.display();
        obj.show();
    }
}