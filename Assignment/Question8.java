package Assignment;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder p = new StringBuilder(a);
        int s = sc.nextInt();
        int k = sc.nextInt();
        p.delete(s,k);
        System.out.println(p);
    }
}
