package Bai23;


import java.util.Scanner;

public class Test {
    public static boolean isNguyenTo(int n){
        for (int i = 2; i <= (int)Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    static  boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
    static boolean isFibonacci(int n) {
        return isPerfectSquare(5*n*n + 4) ||
                isPerfectSquare(5*n*n - 4);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:"); int n = sc.nextInt();
        int dem = 0;
        for (int i = 2; ; i++){
            if (dem == n) break;
            else {
                if (isFibonacci(i)){
                    System.out.print(i + " ");
                    dem++;
                }
            }
        }
        System.out.println("\n");
        dem = 0;
        for (int i = 2; ; i++){
            if (dem == n) break;
            else {
                if (isNguyenTo(i)){
                    System.out.print(i + " ");
                    dem++;
                }
            }
        }
    }
}
