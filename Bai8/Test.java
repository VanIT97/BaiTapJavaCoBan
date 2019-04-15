package Bai8;

public class Test {
    public static void main(String[] args){
        ThuanNghich thuanNghich = new ThuanNghich();
        for (int i = 100000; i <= 999999 ; i++){
            if (thuanNghich.check(i)) System.out.print(i + " ");
        }
    }
}
