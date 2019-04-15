package Bai11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu :"); n = sc.nextInt();
        Control control = new Control();

        control.tryy(1,n);
    }
}
