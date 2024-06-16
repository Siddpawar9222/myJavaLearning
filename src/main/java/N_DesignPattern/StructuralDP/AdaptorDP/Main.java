package N_DesignPattern.StructuralDP.AdaptorDP;

public class Main {
    public static void main(String[] args) {
        WallSocket wallSocket = new StandardWallSocket();
        MobileCharger mobileCharger = new SocketAdaptor(wallSocket);
        mobileCharger.charge();
    }
}
/*
Imagine you have a mobile phone that needs a specific type of charger like MobileCharger . However you have power source like StandardWallSocket which is not compatable with MobileCharger . This is where adaptor DP comes in .
 */