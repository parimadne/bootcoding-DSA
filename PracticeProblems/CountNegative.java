package PracticeProblems;
import java.sql.SQLOutput;
import java.util.Scanner;
public class CountNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a=new int[n];
        int count = 0;
        for(int i =0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Negative Count: ");
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                count++;
            }
        }
        System.out.println(count);
    }
}
