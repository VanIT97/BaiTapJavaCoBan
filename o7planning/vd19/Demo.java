package o7planning.vd19;

public class Demo {
    public static void main(String[] args){
        NumberOfMedals american = new NumberOfMedals(10, 5,2);
        NumberOfMedals japan = new NumberOfMedals(1,2,3);
        NumberOfMedals vietnam = new NumberOfMedals(1,2,3);
        System.out.println(japan.equals(vietnam));
    }
}
