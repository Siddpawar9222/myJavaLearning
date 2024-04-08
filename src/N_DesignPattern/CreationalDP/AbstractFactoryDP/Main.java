package N_DesignPattern.CreationalDP.AbstractFactoryDP;

public class Main {
    public static void main(String[] args) {
         ServerFactory serverFactory = new ServerFactory("4GB", "5TB", "2.3GHz");
        Computer server =  ComputerFactory.getComputer(serverFactory);
        System.out.println(server);
    }
}
