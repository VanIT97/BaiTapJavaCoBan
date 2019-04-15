package o7planning.DemoCollection;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

    public static void main(String[] args){
        Queue<String> a1 = new LinkedList<String>();
        a1.add("aa");
        System.out.println(((LinkedList<String>) a1).get(1));
    }
}
