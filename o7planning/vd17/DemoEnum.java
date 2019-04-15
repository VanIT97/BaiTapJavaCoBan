package o7planning.vd17;

public class DemoEnum {
    public static void main(String[] args){
        Season oneSeason = Season.SPRING;
        Season[] allSeason = Season.values();
        for ( Season season : allSeason){
            System.out.println("Season: " + season);
        }
    }
}
