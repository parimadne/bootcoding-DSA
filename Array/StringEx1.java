package Array;

public class StringEx1 {
    public static void main(String[] args) {
        String s="Bootcoding";
        String s1 = new String( "Bootcoding");
        Boolean v = s.equals(s1);
        System.out.println(v);
        String p = "Hello" ;
        String k = " World";
        String w = p.concat(k);
        System.out.println(w);
    }
}
