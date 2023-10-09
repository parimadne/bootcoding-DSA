package PracticeProblems;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a=new int[n];

        for(int i =0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Negative Elements:");
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                System.out.print(a[i]+" ");
            }
        }
    }
}
