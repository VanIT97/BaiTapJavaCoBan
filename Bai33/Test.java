package Bai33;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Nhap ho ten:");
        String hoten = nhapString();
        convertHoTen(hoten);
    }

    static void convertHoTen(String hoten){
        String Ten = "";
        String TenHo = "";
        StringTokenizer st = new StringTokenizer(hoten, " ,\t,\n");
        while (st.hasMoreTokens()){
            Ten = st.nextToken();
        }
        TenHo = Ten;
        StringTokenizer st1 = new StringTokenizer(hoten, " ,\t,\n");
        String buffer = "";
        while (st1.hasMoreTokens()){
            buffer = st1.nextToken();
            if (!buffer.equals(Ten)) TenHo = TenHo + " " + buffer;
        }
        System.out.println("Ho ten sau la: " + TenHo);
    }

    static String nhapString(){
        String string= "";
        Boolean check = true;
        while (check){
            try {
                string = sc.nextLine();
                check = false;
            }catch (Exception e){
                System.out.println("Ban phai nhap chuoi ki tu.");
                sc.nextLine();
            }
        }
        return string;
    }
}
