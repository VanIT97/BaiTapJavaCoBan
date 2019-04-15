package JavaP1.P001.ex3;

public class test{
    public static void main(String[] args){
        Trunk trunk1 = new Trunk(50,2.2,"green",1000);
        Ford ford1 = new Ford(2018, 1.2, "white", 2019, (int) 0.05);
        Sedan sedan1 = new Sedan(6,1.9, "Black", (int) 2.3);

        System.out.println(trunk1.toString());
        System.out.println(ford1.toString());
        System.out.println(sedan1.toString());
    }
}
