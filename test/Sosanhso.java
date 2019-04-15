package test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Sosanhso {
    public static void main(String[] args){
        int a , b;
        int[] array1 = new int[100];
        int[] array2 = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu mang 1:"); a = sc.nextInt();
        System.out.println("So phan tu mang 2:"); b = sc.nextInt();

        for(int i = 0; i< a ; i++){
            array1[i] = sc.nextInt();
        }
        for(int i = 0; i< b ; i++){
            array2[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < a; i++){
            hashMap.put(array1[i],array1[i]);
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < b; i++){
            if (hashMap.get(array2[i]) == null) continue;
            else if (array2[i] == hashMap.get(array2[i])){
                treeSet.add(array2[i]);
            }
        }
        System.out.println(treeSet);

    }
}
