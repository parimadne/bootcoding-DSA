package PracticeProblems;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int p= sc.nextInt();
            for(int i = 0;i<a.length;i++){
                if(a[i]==p){
                    System.out.println("Search: "+i);
                }
            }
    }
}
