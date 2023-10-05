package Array;

public class Example2B {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        int p = 5;
        for (int k : arr) {

            System.out.print(k + " ");
        }
        System.out.println(" ");
        int[] dummy = new int[arr.length + 1];
        System.arraycopy(arr, 0, dummy, 0, arr.length);

        dummy[dummy.length - 1] = p;
        for (int j : dummy) {
            System.out.print(j + " ");
        }
    }
}
