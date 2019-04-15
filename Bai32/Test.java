package Bai32;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Nhap chuoi ki tu:");
        String chuoi = nhapString();
        xauDaiNhat(chuoi);
    }

    static void xauDaiNhat(String string){
        StringTokenizer st = new StringTokenizer(string, " ,\t,\n");
        int vitri = 1, i = 1;
        int dodaiMax = st.nextToken().length();
        String xauDaiNhat = "";
        while (st.hasMoreTokens()){
            i++;
            String kitu = st.nextToken();
            if (dodaiMax < kitu.length()){
                vitri = i;
                dodaiMax = kitu.length();
                xauDaiNhat = kitu;
            }
        }
        System.out.println("Xau dai nhat la " + xauDaiNhat + " co do dai " + dodaiMax + " o vi tri " + vitri);
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
