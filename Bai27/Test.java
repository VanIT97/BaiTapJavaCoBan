package Bai27;

import java.util.*;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang :"); int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        TreeSet<Integer> treeSet = sapxep(a);
        System.out.println(treeSet);
        for (int i = 0; i < n; i++){
            System.out.println(a[i] + " " + vitri(treeSet, a[i]));
        }

    }
    static TreeSet<Integer> sapxep(int[] a){
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < a.length; i++){
            treeSet.add(a[i]);
        }
        return treeSet;
    }

    static int vitri(TreeSet treeSet, int n){
        int dem = 0;
        for (Object i : treeSet){
            if (n == (int)i) {
                return treeSet.size()  - dem;
            }
            else dem++;
        }
        return dem;
    }
}
