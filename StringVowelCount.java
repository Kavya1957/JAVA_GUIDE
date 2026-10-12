import java.util.*;
public class StringVowelCount {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int count = 0;
        for(int i =0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
            System.out.println("Count of vowels is"+count);
        }


    }
}
