package PracticeProblems;
import java.util.Scanner;
public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Sum of all Array Element: ");
        for(int i =0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum+ " ");
    }
}
