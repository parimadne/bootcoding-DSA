package PracticeProblems;
public class FirstLast {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,0,1};
        int p = a.length-1;
            if(a[0]==a[p]){
                System.out.println("The last and First index numbers are equal ");
            }else{
                System.out.println("The last and First index numbers are not equal");
            }

    }
}
