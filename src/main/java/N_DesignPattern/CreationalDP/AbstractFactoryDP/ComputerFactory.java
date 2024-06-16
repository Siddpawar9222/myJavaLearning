package N_DesignPattern.CreationalDP.AbstractFactoryDP;

public class ComputerFactory {
     public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
         return computerAbstractFactory.createComputer() ;
     }
}
