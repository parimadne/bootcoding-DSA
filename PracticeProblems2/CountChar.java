package PracticeProblems2;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] p =a.toCharArray();
        char c = sc.next().charAt(0);
        int count=0;
        for(int i=0;i<a.length();i++) {
            if (p[i] == c) {
                count++;
            }
        }
            System.out.println("The count: " + count);
    }
}
