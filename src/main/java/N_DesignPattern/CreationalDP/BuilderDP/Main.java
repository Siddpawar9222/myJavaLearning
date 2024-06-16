package N_DesignPattern.CreationalDP.BuilderDP;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("1Tb saata","8GB")
                                 .setGraphicsCardEnabled(true)
                                 .setBluetoothEnabled(true)
                                 .build();

        System.out.println(computer);
    }
}
