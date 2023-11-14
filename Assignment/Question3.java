package Assignment;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int p = a.length();
        if(p==0){
            System.out.println("The String is Empty ");
        }else{
            System.out.println("The String is not empty");
        }
    }
}
