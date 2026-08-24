import java.util.*;
class Arr
{
public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n =sc.nextInt();
        int m =sc.nextInt();
        int a[][]=new int[n][m];
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                {
            a[i][j]=sc.nextInt();
        
                 }
    }
        System.out.println("THE ARRAY ELEMENTS ARE");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                {
            System.out.printf(a[i][j]+ " ");
                }
                System.out.println("");
        }
    }
    
}
