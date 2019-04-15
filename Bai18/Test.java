package Bai18;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chuoi :"); String chuoi = sc.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(chuoi);
        int count = stringTokenizer.countTokens();
        System.out.println("Số từ trong chuỗi :" + count);
    }
}
