package N_DesignPattern.CreationalDP.SingletonDP;

public class Main {
     public static void main(String[] args) {
       GovernmentOffice go1 = GovernmentOffice.getgovernmentOffice();
       GovernmentOffice go2 = GovernmentOffice.getgovernmentOffice();
       System.out.println(go1==go2);
     }
}

/*
How to create Singleton class ? 
-Private constructor to restrict instantiation of the class from other classes.(If we create public then a person can create mutiple object )
-Private static variable of the same class that is the only instance of the class.
-Public static method that returns the instance of the class, this is the global access point for the outer world to get the instance of the singleton class.
 */