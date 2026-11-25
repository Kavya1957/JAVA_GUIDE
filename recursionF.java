public class recursionF {
    public void printNumbers(int n) {
        if(n==0)//base case
        {
            return;
        } else {
            System.out.println(n);
            printNumbers(n-1);//recursion call
        }
    }
    public static void main(String[] args){
        recursionF obj = new recursionF();
        obj.printNumbers(5);
    }
}
