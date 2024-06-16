package N_DesignPattern.StructuralDP.AdaptorDP;

public class SocketAdaptor implements MobileCharger {

    private WallSocket wallSocket ;
    
    public SocketAdaptor(WallSocket wallSocket) {
        this.wallSocket = wallSocket;
    }
    

    @Override
    public void charge() {
        wallSocket.powerSupply();
        System.out.println("Charging Your Mobile.....");
     }
    
}
