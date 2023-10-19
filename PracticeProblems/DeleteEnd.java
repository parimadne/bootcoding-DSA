package PracticeProblems;

import java.util.Scanner;

public class DeleteEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        int p = a.length-1;
        int indextoremove=p;
        if(indextoremove>=0 && indextoremove<a.length){
            int[]dummy = new int[a.length-1];
            int j =0;
            for(int i =0;i<a.length;i++){
                if(i != indextoremove){
                    dummy[j]=a[i];
                    j++;
                }
            }
            for(int i =0;i<dummy.length;i++){
                System.out.print(dummy[i]+" ");
            }
        }
        else {
            System.out.println("Array Element not found ");
        }
    }
}
