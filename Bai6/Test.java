package Bai6;

import Bai5.NguyenTo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        NguyenTo check = new NguyenTo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so  cac so nguyen to"); int n = sc.nextInt();
        int dem = 0;
        for (int i = 2 ; ; i++){
            if (check.checkNguyenTo(i)){
                System.out.print(i + " ");
                dem ++;
                if(dem == n){
                    break;
                }
            }
        }
    }
}
