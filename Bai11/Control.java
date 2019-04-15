package Bai11;

public class Control {

    public void display(int a[], int k){
        for(int i = 1; i <= k; i++){
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
    public void tryy(int k,int n){
        boolean Bool[] = new boolean[n];
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            Bool[i] = false;
        }
        for (int i = 1; i <= n; i++) {
            if (!Bool[i]) {
                a[k] = i;
                Bool[i] = true;
                if (k == n)
                    display(a,n);
                else
                    tryy(k + 1,n);
                Bool[i] = false;
            }
        }
    }
}
