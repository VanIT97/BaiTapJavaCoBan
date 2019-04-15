package Bai21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so :");
        int n = sc.nextInt();
        System.out.println("Tong cac chu so la:" + tongChuSo(n));
        List<Integer> list = phanTich(n);
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
    public static List<Integer> phanTich(int n){
        List<Integer> list = new ArrayList<>();
        int i = 2;
        while (n > 1){
            if (n%i == 0){
                list.add(i);
                n = n / i;
            }else i++;
        }
        return list;
    }

    public static int tongChuSo(int n){
        int tong = 0;
        while (n != 0){
            tong = tong + n % 10;
            n = n / 10;
        }
        return tong;
    }
}
