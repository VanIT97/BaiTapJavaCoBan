package JavaP1.P001.ex3;

public class Trunk extends Car{
    private int weight;

    public Trunk(int speed, double regular, String color, int weight) {
        super(speed, regular, color);
        this.weight = weight;
    }

    public Trunk() {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (this.weight > 2000){
            return 0.1;
        }
        else return 0.2;
    }

    @Override
    public String toString() {
        return super.toString()+"Trunk" +
                "weight=" + weight ;
    }
}
