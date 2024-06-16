package N_DesignPattern.CreationalDP.FactoryMethodDP;

public class Main {
    public static void main(String[] args) {
     Computer pc =   ComputerFactory.getComputer("pc", "8GB", "1TB", "2.4GHz");
     System.out.println(pc.toString());

     Computer server =   ComputerFactory.getComputer("server", "8GB", "1TB", "2.4GHz");
     System.out.println(server.toString());


    }
}
