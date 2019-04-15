package Bai7;

public class Fibonaci {
    public int fibonaci(int n){
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 1;
        }
        if ( n >=3){
            return fibonaci(n-1) + fibonaci(n-2);
        }
        return 0;
    }
}
