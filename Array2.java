import java.util.*;
class Array2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n =sc.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("THE ARRAY ELEMENTS ARE");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
