package BuilderPattern;

public class Computer {
    private String hdd;
    private String ram;

    private boolean isGraphicscaCardEnable;
    private boolean isBluetoothEnable;


    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public boolean isGraphicscaCardEnable() {
        return isGraphicscaCardEnable;
    }

    public boolean isBluetoothEnable() {
        return isBluetoothEnable;
    }

    public Computer(String hdd, String ram, boolean isGraphicscaCardEnable, boolean isBluetoothEnable) {
        this.hdd = hdd;
        this.ram = ram;
        this.isGraphicscaCardEnable = isGraphicscaCardEnable;
        this.isBluetoothEnable = isBluetoothEnable;
    }

    private Computer(ComputerBuilder builder) {
        this.hdd = builder.HDD;
        this.ram = builder.RAM;
        this.isBluetoothEnable = builder.isBluetoothEnabled;
        this.isGraphicscaCardEnable = builder.isGraphicsCardEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ", isGraphicscaCardEnable=" + isGraphicscaCardEnable +
                ", isBluetoothEnable=" + isBluetoothEnable +
                '}';
    }

    public static class ComputerBuilder {
        private String HDD;
        private String RAM;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }
        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }


        public Computer build() {
            return new Computer(this);
        }
    }
}
