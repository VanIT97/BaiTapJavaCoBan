package o7planning.DemoCollection;

import java.util.ArrayList;
import java.util.ListIterator;

public class DemoArrayList {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<>(2);
        int n = a.size();
        System.out.println(" " + n);
        a.add("1");
        a.add("aaa");
        a.add("bbbb");
        a.add("sâss");
        System.out.println(a.listIterator());
        System.out.println(a.get(1));
        System.out.println(a.contains("aaa"));
        ListIterator<String>  iterator = a.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
        System.out.println("-----");
        System.out.println(a.clone());
    }
}
