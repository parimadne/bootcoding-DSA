package Array;

public class Example1 {
    public static void main(String[] args) {
        //linear search
        int[] arr = {10,20,30,40,50,60};
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println(" ");
        for (int j : arr) {
            int target = 40;
            if (j == target) {
                System.out.println("the target element: " + j);
            }
        }
    }
}
