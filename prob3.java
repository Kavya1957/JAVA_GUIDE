import java.util.Scanner;

public class prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (num >= a && num <= b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
