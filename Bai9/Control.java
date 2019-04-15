package Bai9;

public class Control {
    public void display(int a[], int n){
        for (int i = 0; i < n; i++){
            System.out.print(a[i]);
        }
        System.out.println(" ");
    }
    public void xuat(int a[], int n){
        for (int i = n-1; i >= 0; i--){
            if (a[i] == 0){
                a[i] = 1;
                if(i <= n-2){
                    for(int j = i+1; j <= n-1; j++){
                        a[j] = 0;
                    }
                }
                break;
            }
        }
    }
}
