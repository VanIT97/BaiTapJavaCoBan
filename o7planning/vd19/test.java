package o7planning.vd19;

public class test {
    public static void main (String[] args){
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println((s1==s2));
        String s3 = "abc";
        System.out.println("" + (s1==s3));
        String s4 = "abc";
        boolean b1 = (s3==s4);
        System.out.println("    " + b1);
        String s5 = s3;
        boolean b2 = (s5==s3);
        System.out.println("   " + (s5==s3));

        Integer a1 = new Integer(5);
        Integer a2 = new Integer(5);
        boolean b3 = (a1==a2);

        System.out.println(b3);
    }
}
