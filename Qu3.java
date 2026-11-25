import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int count = 0;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit != 0 && n % digit == 0)
                count++;

            temp /= 10;
        }

        System.out.println(count);
    }
}
