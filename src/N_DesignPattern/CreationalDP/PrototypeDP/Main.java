package N_DesignPattern.CreationalDP.PrototypeDP;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee();
        e1.loadData();
        
        Employee e2 = (Employee)e1.clone();


        e2.setEmp("Joe Doe");
        e2.setEmp("Pratilk");
        e2.setEmp("Kaalo");

        System.out.println(e1);
        System.out.println(e2);
    }
}
/*
Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing. Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. Prototype design pattern uses java cloning to copy the object.
 */