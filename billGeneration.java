import java.util.Scanner;

class billGeneration {

    void bill(int quantity, int price) {
        System.out.println("Total Bill: " + (quantity * price));
    }

    void bill(int quantity, double price) {
        System.out.println("Total Bill: " + (quantity * price));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        billGeneration obj = new billGeneration();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        obj.bill(quantity, price);

        sc.close();
    }
}