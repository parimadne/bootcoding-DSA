package PracticeProblems;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int first= max(a, Integer.MAX_VALUE);
        int second= max(a, first);

        System.out.print(second);

    }


    public static int max(int[] a, int maxValue){
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max && a[i]< maxValue) {
                max = a[i];
            }
        }
        return max;
    }
}