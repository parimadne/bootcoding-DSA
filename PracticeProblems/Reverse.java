package PracticeProblems;

public class Reverse {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};
        int[]arr=reverse(a);
        for(int i =0;i<a.length;i++) {
            System.out.print(a[i]+ " ");
        }
    }
        public static int[] reverse(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
          return arr;
    }
}
