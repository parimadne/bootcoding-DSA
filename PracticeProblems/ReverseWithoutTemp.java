package PracticeProblems;
import java.util.Scanner;
public class ReverseWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Reverse Array:");
        int[] arr = reverse(a);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] reverse(int[]arr){
       int i =0;
       int j = arr.length-1;
       while(i<j){
           arr[i]=arr[i]^arr[j];
           arr[j]=arr[i]^arr[j];
           arr[i]=arr[i]^arr[j];
           i++;
           j--;
        }
        return arr;
    }
}
