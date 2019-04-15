package o7planning.vd23;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        System.out.println(list.get(1));
        ListIterator<String> listIterator = list.listIterator();
        String first = listIterator.next();
        System.out.println("first:" + first);// -->"One"

        String second = listIterator.next();
        System.out.println("second:" + second);// -->"Two"
        if (listIterator.hasPrevious()) {
            String value = listIterator.previous();
            System.out.println("value:" + value);// -->"Two"
        }
        System.out.println(" ----- ");
        while (listIterator.hasNext()) {
            String value = listIterator.next();
            System.out.println("value:" + value);
        }
    }

}
