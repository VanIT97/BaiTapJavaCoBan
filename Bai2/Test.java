package Bai2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so tu nhien:"); int a = sc.nextInt();
        System.out.println("Nhap vao co so <36:"); int b = sc.nextInt();
        ChuyenCoSo chuyenCoSo = new ChuyenCoSo();
        System.out.println("" + chuyenCoSo.convert(a,b));

    }
}
