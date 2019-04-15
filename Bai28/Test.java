package Bai28;

import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("So dong la:"); int n = sc.nextInt();
        System.out.println("So cot la :"); int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        TreeSet<Integer> treeSet = sapxep(a,n,m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(a[i][j] + " " + vitri(treeSet, a[i][j]));
            }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (isNguyenTo(a[i][j])) System.out.println(a[i][j]);
//            }
//        }
        int dem = 0;
        for (int i = 0; i < n; i++) {
            dem = 0;
            for (int j = 0; j < m; j++) {
                if (isNguyenTo(a[i][j])) dem ++;
                if ( j ==  m -1) System.out.println(dem);
            }
        }
    }
    static boolean isNguyenTo(int n){
        for (int i = 2; i <= (int)Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    static TreeSet<Integer> sapxep(int[][] a, int n, int m){
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < n; i++){
            for (int j =0; j < m; j++)
            treeSet.add(a[i][j]);
        }
        return treeSet;
    }

    static int vitri(TreeSet treeSet, int k){
        int dem = 0;
        for (Object i : treeSet){
            if (k == (int)i) {
                return treeSet.size()  - dem;
            }
            else dem++;
        }
        return dem;
    }
}
