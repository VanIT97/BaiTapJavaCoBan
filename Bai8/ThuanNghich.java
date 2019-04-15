package Bai8;

public class ThuanNghich {
    public boolean check(int n){
        int n1 = n % 10; n = n / 10;
        int n2 = n % 10; n = n / 10;
        int n3 = n % 10; n = n / 10;
        int n4 = n % 10; n = n / 10;
        int n5 = n % 10; n = n / 10;
        int n6 = n % 10;
        if ( n1 == n6 && n2 == n5 && n3 ==n4) return true;
        else return false;
    }
}
