package Bai19;

import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tong chu so la: "); int n = sc.nextInt();
        for (int i = 10000; i <= 99999; i++){
            if (isNguyenTo(i) && tongChuSo(i) == n){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isNguyenTo(int n){
        for (int i = 2; i <= (int)Math.sqrt(n); i++){
            if (n%i == 0) return false;
        }
        return true;
    }
    public static int tongChuSo(int n){
        int tong = 0;
        while (n != 0){
            tong = tong + n%10;
            n = n / 10;
        }
        return tong;
    }
}
