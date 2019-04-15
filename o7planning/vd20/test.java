package o7planning.vd20;

public class test {


    public static void main (String[] args){
        String s1 = "one";
        String s2 = "true";
        String s3 = "three";
        System.out.println(s1.compareToIgnoreCase("a"));

        StringBuilder sb = new StringBuilder("aa");
        System.out.println(sb.length());
        sb.append("Hello");
        System.out.println(sb);
    }
}
