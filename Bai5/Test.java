package Bai5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        NguyenTo check = new NguyenTo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so:"); int n = sc.nextInt();
        for (int i = 2 ; i < n; i++){
            if (check.checkNguyenTo(i)){
                System.out.print(i + " ");
            }
        }
    }

}
