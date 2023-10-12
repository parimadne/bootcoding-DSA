package Array;

public class StringEx3 {
    public static void main(String[] args) {
       // String s = new String("Hello");
        // String s ="Hello";
        StringBuilder s1 = new StringBuilder("Hello");
        System.out.println(s1);
        s1.append("java");
        System.out.println(s1);
        s1.setCharAt(0,'C');
        System.out.println(s1);
        s1.insert(1,"Java");
        System.out.println(s1);
        s1.replace(1,5,"cart");
        System.out.println(s1);
        s1.delete(1,6);
        System.out.println(s1);
    }
}
