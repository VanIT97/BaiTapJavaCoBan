package Bai30;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Nhap vao so phan tu cua mang:"); int n = nhapso();
        int a[] = new int[n+1];
        for (int i = 1; i <= n; i ++){
            a[i] = nhapso();
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet = sapxep(a, n);
        for (int i = 1; i <= n; i++){
            System.out.println(a[i] + ": " + vitri(treeSet, a[i]));
        }
        Arrays.sort(a);
        for (int i = 1; i <= n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("Nhap vao phan tu them:"); int m = sc.nextInt();
        a[0] = m;
        Arrays.sort(a);
        for (int i = 0; i <= n; i++){
            System.out.print(a[i] + " ");
        }
    }

    static int vitri(TreeSet<Integer> treeSet, int n){
        int dem = 0;
        for (int i : treeSet){
            if (i == n){
                return treeSet.size() - dem;
            }
            else dem++;
        }
        return dem;
    }

    static TreeSet sapxep(int a[], int n){
        TreeSet<Integer> treeSet = new TreeSet();
        for (int i = 1; i <= n; i++){
            treeSet.add(a[i]);
        }
        return treeSet;
    }

    static int nhapso(){
        int i = 0;
        boolean check = true;
        while (check){
            try {
                i = sc.nextInt();
                check = false;
            }catch (Exception e){
                System.out.println("Ban phai nhap vao so...");
                sc.nextLine();
            }
        }
        return i;
    }
}
