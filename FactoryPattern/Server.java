package FactoryPattern;

public class Server extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu) {
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
