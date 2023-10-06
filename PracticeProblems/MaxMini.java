package PracticeProblems;

public class MaxMini {
    public static void main(String[] args) {
        int [] a ={11,23,34,45,56,67,78,89,90};
        int max= a[0];
        int mini = a[0];
        for (int j : a) {
            if (j > max) {
                max = j;
            } else if (j < mini) {
                mini = j;
            }

        }
        System.out.println(max);
        System.out.print(mini);
    }
}
