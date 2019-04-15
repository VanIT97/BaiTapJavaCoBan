package o7planning.vd21;

public class TryCatchDemo {
    public static void main(String[] args){
        int age = 35;
        try{
            AgeUtils.checkAge(age);
            System.out.println("You pass");
        }catch (AgeException e){
            System.out.println(e.getMessage());
        }
    }
}
