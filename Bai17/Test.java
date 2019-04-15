package Bai17;

import java.util.*;

public class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang :"); int n = sc.nextInt();
        double a[] = new double[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextDouble();
        }
        xeptangdan(a);

    }

    public static void xeptangdan(double mang[])
    {
        int sort[] = new int[mang.length];
        for(int i = 0; i < sort.length; i++)
            sort[i] = i;
        for(int i = 0; i < sort.length; i++)
            for(int j = i+1; j < sort.length; j++)
                if(mang[sort[i]] > mang[sort[j]])
                {
                    double temp = mang[sort[i]];
                    mang[sort[i]] = mang[sort[j]];
                    mang[sort[j]] = temp;
                }
        for(int i = 0; i < sort.length; i++)
            System.out.println(mang[sort[i]]);
    }
}
