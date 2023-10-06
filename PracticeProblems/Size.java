package PracticeProblems;
import java.util.Scanner;
public class Size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i =0;i<b.length;i++){
            b[i]= sc.nextInt();
        }
            int p = a.length;
            int c = b.length;

        if(p==c){
            System.out.println(" Equal" );
        }else{
            System.out.println("Not Equal");;
        }
    }
}
