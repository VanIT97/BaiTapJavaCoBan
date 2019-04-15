package Bai29;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = 0;
        System.out.println("Bac cua bieu thuc :"); n = nhapso();
        int a[] = new int[n+1];
        for (int i = 0; i <= n; i++){
            System.out.println("Nhap he so cua x^" + i);
            a[i] = nhapso();
        }
        System.out.print("Bieu thuc: "); inBieuThuc(a, n);
        System.out.println("\nGia tri bien cua bieu thuc: "); int x = nhapso();
        System.out.println("Gia tri bieu thuc :" + horner(a, n, x));
        int[] b = daoham(a, n);
        System.out.print("Bieu thuc sau dao ham :"); inBieuThuc(b, n-1);
        int m = 0;
        System.out.println("\nBac cua bieu thuc :"); m = nhapso();
        int c[] = new int[m+1];
        for (int i = 0; i <= m; i++){
            System.out.println("Nhap he so cua x^" + i);
            c[i] = nhapso();
        }
        System.out.print("Bieu thuc: "); inBieuThuc(c, m);
        System.out.println("\nGia tri bien cua bieu thuc: "); int y = nhapso();
        System.out.println("Gia tri bieu thuc :" + horner(c, m, y));
        System.out.println("Tong hai da thuc :" + (horner(a, n, x) + horner(c, m, y)));
    }

    static int nhapso(){
        int i = 0;
        boolean check = true;
        while (check){
            try {
                i = sc.nextInt();
                check = false;
            }catch (Exception e){
                System.out.println("Ban phai nhap so");
                sc.nextLine();
            }
        }
        return i;
    }
    static int[] daoham(int a[], int n){
        int[] b = new int[n];
        for (int i=0; i<n; i++){
            b[i] = a[i+1] * (i+1);
        }
        return b;
    }

    static void inBieuThuc(int a[], int n){
        System.out.print(a[0]);
        for (int i = 1; i <= n; i++){
            System.out.print("+" + a[i] + "." + "x^" + i);
        }
    }

    static int horner(int a[],int n, int x){
        int T = 0;
        T = a[n];
        for (int i = n - 1; i >= 0; i--){
            T = T * x + a[i];
        }
        return T;
    }
}
