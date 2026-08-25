import java.util.*;
class ArrSmallest
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
        int small=a[0];
        for(int i=0;i<n;i++)
        {
            if(small>a[i]){
                small=a[i];
            }
        }
        System.out.println("SMALLEST NUMBER:" + small);
    }
}
