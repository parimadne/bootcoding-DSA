package PracticeProblems;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int r = 0;
        int org=n;
        while(n!= 0) {
            int d = n / 10;
            r = r * 10 + n % 10;
            n = d;
        }
           if (r == org ) {
               System.out.print("Palindrome: "+r);
            }else{
               System.out.println(" not palindrome: "+r);
           }

    }
}
