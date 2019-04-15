package Bai5;

public class NguyenTo {

    public boolean checkNguyenTo(int So){
        for (int i=2; i< So; i++){
            if(So%i == 0) return false;
        }
        return true;
    }
}
