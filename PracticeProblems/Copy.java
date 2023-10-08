package PracticeProblems;

import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Array A:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        System.out.println("Array B:");
        for(int i=0;i<a.length;i++) {
            b[i] = a[i];
            System.out.print(b[i]+" ");

        }
    }
}
