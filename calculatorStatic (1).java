public class calculatorStatic {
    static void square(int n) {
        System.out.println("Square of " + n + " is: " + (n * n));
    }

    public static void main(String[] args) {
        calculatorStatic.square(5);
        calculatorStatic.square(10);
    }
}
