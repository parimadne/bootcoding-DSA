package PracticeProblems2;
import java.util.Scanner;
public class Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First String:");
        String s = sc.next();
        System.out.println("Second String:");
        String s1 = sc.next();
        String s2 = s.concat(s1);
        System.out.println("My Name: " +s2);
    }
}
