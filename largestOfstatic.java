public class largestOfstatic {
    static void largest(int a, int b,int c){
        if(a>b && a>c){
            System.out.println(a + " is the largest number.");
        } else if(b>a && b>c){
            System.out.println(b + " is the largest number.");
        }else{
            System.out.println(c + " is the largest number.");
        }
    }public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        largest(a, b, c);
    }
}
