package PracticeProblems;
import java.util.Scanner;
public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            System.out.print(a[i]+" ");
        }
    }
}
