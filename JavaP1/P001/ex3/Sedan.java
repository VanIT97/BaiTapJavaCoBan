package JavaP1.P001.ex3;

public class Sedan extends Car {
    private int length;

    public Sedan(int speed, double regular, String color, int length) {
        super(speed, regular, color);
        this.length = length;
    }

    public Sedan(int length) {
        this.length = length;
    }

    public Sedan() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (this.length >5) return 0.05;
        else return 0.1;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "length=" + length +
                '}';
    }
}
