package Bai22;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so"); int n = sc.nextInt();
        int dem = 0;
        for (int i = 2; i < n; i++){
            if (isUocSo(i, n)){
                System.out.print(i + " ");
                dem++;
            }
        }

        System.out.println("\nSo uoc la :" + dem);
        for (int i = 2; i < n; i++){
            if (isUocSo(i, n) && isNguyenTo(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isNguyenTo(int n){
        for (int i = 2; i <= (int)Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isUocSo(int i, int n){
        if (n%i == 0){
            return true;
        }
        else return false;
    }
}
