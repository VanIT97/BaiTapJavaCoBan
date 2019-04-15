package o7planning.vd14;

public class PersonDemo {
    public static void main(String[] args){
        Person edison = new Person("Thomas Edison",1900);
        Person dodinhvan = new Person("van",1997,"Vinh Phuc");

        System.out.println("Info");
        System.out.println("Name: " + edison.getName());
        System.out.println("Born Year: " + edison.getBornYear());

        System.out.println("Info");
        System.out.println("Name: " + dodinhvan.getName());

    }
}
