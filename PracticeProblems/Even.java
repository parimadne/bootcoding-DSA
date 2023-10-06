package PracticeProblems;

public class Even {
    public static void main(String[] args) {
        int [] a ={10,11,12,13,14,15,16};
        for (int j : a) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
    }
}
