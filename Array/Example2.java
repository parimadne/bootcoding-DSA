package Array;

public class Example2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9};
        int p = 5;
        for (int k : arr) {

            System.out.print(k + " ");
        }
        System.out.println(" ");
        int[] dummy = new int[arr.length+1];
        System.arraycopy(arr, 0, dummy, 1, arr.length);
        dummy[0]=p;
        for (int j : dummy) {
            System.out.print(j + " ");
        }

    }
}
