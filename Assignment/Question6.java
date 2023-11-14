package Assignment;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        String a = sc.next();
        char ch= a.charAt(0);
        int count = 0;
        char[] o = p.toCharArray();
        for(int i =0; i<p.length();i++){
            if(o[i]==ch){
                count++;
            }
        }
        System.out.println("The count of specific character: " +count);
    }
}
