import java.util.*;
class ArrayEvenOdd
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
        int l=0;
        int m=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                l++;
            }
            else
            {
                m++;
            }
        }
        System.out.println("EVEN="+l);
        System.out.println("ODD="+m);
    }
    
}
