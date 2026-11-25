import java.util.*;
public class pattern2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        for(int r=0;r<num;r++){
            for(int c=0;c<num;c++){
                if (r==0 || r==num-1 || c==0 || c==num-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
