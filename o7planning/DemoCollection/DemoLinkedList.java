package o7planning.DemoCollection;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("aaaa");
        linkedList.add("bbbb");
        linkedList.add(0,"ccc");

        System.out.println(linkedList);
        System.out.println(linkedList.getClass());
        System.out.println(linkedList.clone());

    }
}
