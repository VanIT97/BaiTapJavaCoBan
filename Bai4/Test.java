package Bai4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so:"); int n = sc.nextInt();
        int dem;
        for(int i = 2; i <= n; i++){
            dem = 0;
            while(n % i == 0){
                ++dem;
                n /= i;
            }
            if (dem != 0) {
                System.out.print(i);
                if(dem > 1) System.out.print("^" + dem);
                if(n > i){
                    System.out.print("*");
                }
            }
        }
    }
}
