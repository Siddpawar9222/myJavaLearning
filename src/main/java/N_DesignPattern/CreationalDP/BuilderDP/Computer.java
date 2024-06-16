package N_DesignPattern.CreationalDP.BuilderDP;

public class Computer {
    // required parameters
    private final String HDD;
    private final String RAM;

    // optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder){
        this.HDD=builder.HDD;
		this.RAM=builder.RAM;
		this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled=builder.isBluetoothEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    // Builder Class
    public static class ComputerBuilder {
        // ComputerBuilder cb = new ComputerBuilder(String HDD, String RAM); ----->this

        // required parameters
        private final String HDD;
        private final String RAM;

        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }


        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
            this.isGraphicsCardEnabled=isGraphicsCardEnabled;
            return this ;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
            this.isBluetoothEnabled=isBluetoothEnabled;
            return this ;
        }

        public Computer build(){
            return new Computer(this) ;
        }
    }

    @Override
    public String toString() {
        return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
                + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
    }

    

}
