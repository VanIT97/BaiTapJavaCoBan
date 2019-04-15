package o7planning.vd21;

public class ValidateUtils {
    public static void checkPerson(Person person) throws ValidateException{
        try {
            AgeUtils.checkAge(person.getAge());
        } catch (Exception e) {
            throw new ValidateException(e);
        }
        if (person.getGender().equals(Person.FEMALE)) {

            GenderException e = new GenderException("Do not accept women");
            throw new ValidateException(e);

        }
    }
}
