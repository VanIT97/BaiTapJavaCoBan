package Bai10;

import Library.database.ConnectDB;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Control control = new Control();
        Scanner sc = new Scanner(System.in);
        System.out.println("Tap hop co so phan tu la :"); int n = sc.nextInt();
        System.out.println("Tap con co so phan tu la :"); int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 1; i <= k; i++){
            a[i] = i;
        }
        control.display(a,k);
        for(int i = k; i>=1; i--){
            while (a[i] < n-k+i){
                a[i]++;
                control.display(a,k);
            }
        }
    }
}
