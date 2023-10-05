package Array;

public class Example2C {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        int p = 5;
        int position = 4;
        for (int k : arr) {

            System.out.print(k + " ");
        }
        System.out.println(" ");
        int[] dummy = new int[arr.length + 1];
        System.arraycopy(arr, 0, dummy, 0, position);
        System.arraycopy(arr, position + 1 - 1, dummy, position + 1, dummy.length - (position + 1));
        dummy[position] = p;
        for (int i : dummy) {
            System.out.print(i + " ");
        }
    }
}
