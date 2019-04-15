package Bai1;

import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap so thu nhat:"); a = sc.nextInt();
        System.out.println("Nhap so thu hai:"); b = sc.nextInt();
        CapSo capSo = new CapSo(a,b);
        System.out.println("UCLN:" + capSo.UCLN());
        System.out.println("BCNN:" + capSo.BCNN());
    }
}
