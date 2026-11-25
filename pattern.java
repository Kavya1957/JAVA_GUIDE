import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
      for(int r=1;r<=num;r++){
        for(int c=1;c<=r;c++){
            System.out.print("*");
        }
        System.out.println();
      }
    sc.close();}
}
