package PracticeProblems;

import java.util.Scanner;

public class SecondLargest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max ) {
                max=a[i];
            }
        }
        int maximum=a[0];
        for(int i =0;i<a.length;i++){
            if(a[i]>maximum && max>a[i]){
                maximum=a[i];
            }
        }
        System.out.println(maximum);
    }
}
