package o7planning.vd21;

public class AgeUtils {
    public static void checkAge(int age) throws TooOldException,TooYoungException{
        if (age < 18){
            throw new TooYoungException("Age " + age + " too young");
        }
        else if (age >40){
            throw new TooOldException("Age " + age + " too old");
        }
        else System.out.println("Age " + age + " Ok");
    }
}
