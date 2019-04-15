package Bai1;

public class CapSo {
    private int a;
    private int b;

    public CapSo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int UCLN(){
        int a = this.a;
        int b = this.b;
        int temp;
        while (b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public int BCNN(){
        return a * b / UCLN();
    }

}
