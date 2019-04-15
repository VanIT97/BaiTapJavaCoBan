package Bai9;

import Bai2.ChuyenCoSo;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Test {
    public static void main(String[] args) {
        Control control = new Control();
        Scanner sc = new Scanner(System.in);
        ChuyenCoSo chuyenCoSo = new ChuyenCoSo();
        System.out.println("Xau co do dai:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < pow(2,n); i++){
            control.display(a,n);
            control.xuat(a,n);
        }


    }
}
