class Array3
{
    public static void main(String[]args)
    {
        int a[][]=new int[3][3];
        a[0][0]=2;
        a[0][1]=3;
        a[0][2]=4;
        a[1][0]=5;
        a[1][1]=6;
        a[1][2]=7;
        a[2][0]=8;
        a[2][1]=9;
        a[2][2]=10;
        System.out.println("ARRAY ELEMENTS ARE:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            {
                System.out.printf(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
