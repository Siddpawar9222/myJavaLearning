package N_DesignPattern.CreationalDP.FactoryMethodDP;

public class Server implements Computer {

    private String ram ;
    private String hdd ;
    private String cpu ;

   public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
   }

    @Override
    public String getRAM() {
       return this.ram ;
    }

    @Override
    public String getHDD() {
        return this.hdd ;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String toString() {
        return "Server [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
    }

    
    
}
