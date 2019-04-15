package o7planning.vd15;

public class Cat extends Animal implements CanDrink,CanEat{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void drink() {
        System.out.println("Cat drink.");
        }

    @Override
    public void eat() {
        System.out.println("Cat eat.");
    }

    @Override
    public void back() {
        System.out.println("Cat back");
    }

    @Override
    public int getVelocity() {
        return 10;
    }
}
