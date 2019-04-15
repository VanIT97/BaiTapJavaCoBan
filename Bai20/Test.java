package Bai20;

import java.util.Scanner;

public class Test {
    static  boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
    static boolean isFibonacci(int n) {
        return isPerfectSquare(5*n*n + 4) ||
                isPerfectSquare(5*n*n - 4);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n:"); int n = sc.nextInt();
        for (int i = n; i >= 1; i--){
            if (isFibonacci(i) == true){
                System.out.println(i);
                break;
            }
        }
    }

}
