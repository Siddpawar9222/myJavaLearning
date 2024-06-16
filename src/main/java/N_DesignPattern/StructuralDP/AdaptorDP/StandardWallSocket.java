package N_DesignPattern.StructuralDP.AdaptorDP;

public class StandardWallSocket implements WallSocket {

    @Override
    public void powerSupply() {
         System.out.println("Power is On");
    }
    
}
