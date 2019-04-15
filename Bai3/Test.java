package Bai3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so:"); a = sc.nextInt();
        int sum = 0;
        while (a > 0){
            sum = sum + a % 10;
            a = a / 10;
        }
        System.out.println("Tong chu so:" + sum);
    }




}
