package Bai25;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        for (int i = 10000; i <= 99999; i++){
            if (isNguyenTo(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
        for (int i = 10000; i <= 99999; i++){
            if (isAllNguyenTo(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
        for (int i = 10000; i <= 99999; i++){
            if (isThuanNghich(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isNguyenTo(int n){
        for (int i = 2; i <= (int)Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isThuanNghich(int n){
        List<Integer> list = new ArrayList<>();
        while (n > 0){
            int i = n % 10;
            list.add(i);
            n = n / 10;
        }
        for (int i = 0; i < list.size()/2; i++){
            if (list.get(i) != list.get(list.size() - i - 1)) return false;
            }
        return true;
        }

    static boolean isAllNguyenTo(int n){
        while (n > 0){
            int i = n % 10;
            if (!isNguyenTo(i)) return false;
            n = n / 10;
        }
        return true;
    }
}
