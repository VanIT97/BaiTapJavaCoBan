package o7planning.vd15;

public class AnimalDemo {
    public static void main(String[] args){
        CanEat caneat1 = new Cat("Tom");
        ((Cat) caneat1).eat();
        Cat cat = new Cat("Adksk");
        CanMove mouse = new Mouse();
        boolean check = caneat1 instanceof CanEat;
        System.out.println(check);
    }
}
