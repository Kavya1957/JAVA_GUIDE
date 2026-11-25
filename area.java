public class area {
    public void area(int a) {
        System.out.println("Area of square: " + (a * a));
    }

    public void area(int l, int b) {
        System.out.println("Area of rectangle: " + (l * b));
    }

    public void area(double r) {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }

    public static void main(String[] args) {
        area a = new area();
        a.area(5);
        a.area(4, 6);
        a.area(3.5);
    }
}
