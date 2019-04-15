package Bai2;

public class ChuyenCoSo {
    private int soTuNhien;
    private int coSo;

    public ChuyenCoSo(int soTuNhien, int coSo) {
        this.soTuNhien = soTuNhien;
        this.coSo = coSo;
    }
    public ChuyenCoSo(){

    }
    public String convert(int soTuNhien, int coSo){
        int  sodu;
        String array = "";
        while (soTuNhien > 0){
            sodu = soTuNhien % coSo;
            if (sodu < 10){
                array = (char)('0' + sodu) + array;
            }
            else {
                array = (char)('A' + (sodu - 10)) + array;
            }
            soTuNhien = soTuNhien / coSo;
        }
        return array;
    }
}
