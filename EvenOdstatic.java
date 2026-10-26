public class EvenOdstatic {
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        int number = 10; 

        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else if (isOdd(number)) {
            System.out.println(number + " is odd.");
        }
    }
}
