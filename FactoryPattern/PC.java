package FactoryPattern;

public class PC extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
        return null;
    }

    @Override
    public String getHdd() {
        return null;
    }

    @Override
    public String getCpu() {
        return null;
    }
}
