package JavaP1.P001.ex3;

public abstract class Car {
    private int speed;
    private double regular;
    private String color;

    public Car(int speed, double regular, String color) {
        this.speed = speed;
        this.regular = regular;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", regular=" + regular +
                ", color='" + color + '\'' +
                '}';
    }

    public Car() {
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRegular(double regular) {
        this.regular = regular;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRegular() {
        return regular;
    }

    public String getColor() {
        return color;
    }

    public abstract double getSalePrice();
}
