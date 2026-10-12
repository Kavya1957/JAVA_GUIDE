import java.util.Scanner;

public class prob2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if (marks >= 35) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        sc.close();
    }
}
