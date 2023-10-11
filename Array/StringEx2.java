package Array;
public class StringEx2 {
    public static void main(String[] args) {
        String name = "Bootcoding";
        String value = "bootcoding";
        String s = name.toLowerCase();
             System.out.println(s);
             String p = name.toUpperCase();
                System.out.println(p);
        String str ="  Java";
             System.out.println(str);
                String str1 = str.trim();
                    System.out.println(str1);
                         String t= name.substring(4);
                             System.out.println(t);
                             String s1=name.substring(0,4);
        System.out.println(s1);
       String s2= name.replace('B','P');
        System.out.println(s2);
        String s3= name.replace("Boot","Cute");
        System.out.println(s3);
        Boolean s4=name.startsWith("Bo");
        System.out.println(s4);
        Boolean s5=name.endsWith("ing");
        System.out.println(s5);
        char s6= name.charAt(4);
        System.out.println(s6);
        int s7= name.indexOf('n');
        System.out.println(s7);
        int s8= name.lastIndexOf('o');
        System.out.println(s8);
        Boolean s9 = name.equals(value);
        System.out.println(s9);
        Boolean s0 = name.equalsIgnoreCase(value);
        System.out.println(s0);
    }
}
