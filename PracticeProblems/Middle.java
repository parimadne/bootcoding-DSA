package PracticeProblems;

import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }


        int p = sc.nextInt();
        int position= sc.nextInt();
        int[] dummy = new int[a.length+1];
        for(int j=0;j<position+1;j++){
            dummy[j]=a[j] ;
        }
        for(int i =position+1;i<dummy.length;i++){
            dummy[i]=a[i-1];
        }
        dummy[position]=p;
        for (int j = 0;j<dummy.length;j++) {
            System.out.print(dummy[j] + " ");
        }
    }
}
