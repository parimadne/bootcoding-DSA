package PracticeProblems;
import java.util.Scanner;
public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int counteven = 0;
        int countodd = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                counteven++;
            } else if(a[i]%2!=0) {
                countodd++;
            }
        }
        System.out.println(" Even: " +counteven);
            System.out.print("odd: " +countodd);

    }
}
