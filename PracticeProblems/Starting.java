package PracticeProblems;
import java.util.Scanner;
public class Starting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        int[] dummy = new int[a.length+1];
        dummy[0]=p;
        for(int j=1;j<=a.length;j++){
          dummy[j]=a[j-1] ;

        }

        for (int j = 0;j<dummy.length;j++) {
            System.out.print(dummy[j] + " ");
        }

    }
}
