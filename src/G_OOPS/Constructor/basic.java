package G_OOPS.Constructor;

/*A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes 
     ---Note that the constructor name must match the class name, and it cannot have a return type
     ----All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.

*/

class Employee
{
    String name,batch;

    Employee()
    {
        System.out.println(" Without Parameter---->");       //Default Constructor
    }

    Employee(String  n ,String b)
    {
        //   name = n ;
        //   batch = b ;
        System.out.println(" Two parameter-----> The name and batch is " + n + " " + b);
    }

    Employee(String n ,int i , float salary )
    {
        System.out.println(" Three parameter --->The name of the Employee is "+n);
        System.out.println(" Three parameter --->The id of the Employee is "+i);
        System.out.println(" Three parameter --->The salary of the Employee is "+salary);
    }


}
public class Basic {
    public static void main(String[] args) {
        
        Employee sp = new Employee();
        
//        Employee sp1 = new Employee("Rohit", "Java_batch2");
//       Employee sp2 = new Employee("Siddhesh Pawar", 22, 5555);

        // System.out.println("The name of the Employee is "+sp1.name);
        // System.out.println("The batch of the Employee is "+sp1.batch);

        /* 
        */
    	
    	System.out.println("success");
}
    
}
