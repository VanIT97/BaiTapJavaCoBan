package Bai7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Fibonaci f = new Fibonaci();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so cac so fibo dau tien:"); int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print(f.fibonaci(i)+ " ");
        }
    }
}
