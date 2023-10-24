package PracticeProblems;
import java.util.Scanner;
public class MaxMiniArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int max= a[0];
        int mini = a[0];
            for(int i = 0;i<a.length;i++){
                if(a[i]>max){
                    max=a[i];
                }else if(a[i]<mini){
                    mini=a[i];
                }
            }
        System.out.println("maximum:"+ max);
        System.out.print("minimum:"+ mini);
    }

}
