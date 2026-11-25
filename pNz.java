import java.util.*;
public class pNz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int y = sc.nextInt();
        positiveNegativeZero(y);
        sc.close();
    }
    
    public static void positiveNegativeZero(int n) {
        if (n > 0) {
            System.out.println("The number is positive.");
        } else if (n < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}