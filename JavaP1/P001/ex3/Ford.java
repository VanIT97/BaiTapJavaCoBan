package JavaP1.P001.ex3;

public class Ford extends Car{
    private int year;
    private int manufactureDiscount;

    public Ford(int speed, double regular, String color, int year, int manufactureDiscount) {
        super(speed, regular, color);
        this.year = year;
        this.manufactureDiscount = manufactureDiscount;
    }

    public Ford() {
    }

    public Ford(int year, int manufactureDiscount) {
        this.year = year;
        this.manufactureDiscount = manufactureDiscount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getManufactureDiscount() {
        return manufactureDiscount;
    }

    public void setManufactureDiscount(int manufactureDiscount) {
        this.manufactureDiscount = manufactureDiscount;
    }

    @Override
    public String toString() {
        return "Ford{" +
                "year=" + year +
                ", manufactureDiscount=" + manufactureDiscount +
                '}';
    }

    @Override
    public double getSalePrice() {
        return this.manufactureDiscount;
    }
}
