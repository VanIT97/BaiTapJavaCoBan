package Bai13;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu mang 1:"); int n = sc.nextInt();
        System.out.println("So phan tu mang 2:"); int m = sc.nextInt();
        int a[] = new int[n+1];
        int b[] = new int[m+1];
        for(int i=1; i <= n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=1; i <= m; i++){
            b[i] = sc.nextInt();
        }
        int c[] = new int[n+m+1];
        int j = 1, k = 1;
        for(int i = 1; i < n+m+1; i++){
            if ( j == n+1) {
                c[i] = b[k];
                k++;
            }
            if ( k == m+1){
                c[i] = b[j];
                j++;
            }
                if (j <= n && k <= m){
                    if(a[j] > b[k]){
                        c[i] = b[k];
                        k++;
                    } else {
                        c[i] = a[j];
                        j++;
                    }
                }
        }
        for(int i = 1; i < n+m+1; i++){
            System.out.print(c[i] + " ");
        }
    }
}
