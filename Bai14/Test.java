package Bai14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu:"); int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < n; i++){
            addElement(map,a[i]);
        }
        for (Integer key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
        System.out.println("/n");
        for (Integer key : map.keySet()){
            if (map.get(key) == 2){
                System.out.println(key + " " + map.get(key));
            }
        }
    }

    public static void addElement(Map<Integer, Integer> map, int element){
        if(map.containsKey(element)){
            int count = map.get(element) + 1;
            map.put(element, count);
        }
        else map.put(element, 1);
    }
}
