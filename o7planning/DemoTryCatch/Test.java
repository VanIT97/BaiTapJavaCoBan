package o7planning.DemoTryCatch;

public class Test {
    public static void main(String[] args){
        int a = 10;
        try{
            int b = a/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("12412343");
            System.out.println("1231412312321");
        }
        finally {
            System.out.println("ầdfdadfasfas");
        }
    }
}
