package PracticeProblems;

import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int p= a.length;

        for(int i=0;i<p;i++){
            for(int j=0;j<p-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
