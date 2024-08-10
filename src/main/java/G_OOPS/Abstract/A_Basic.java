package G_OOPS.Abstract;

abstract class Vehicle{
	private String color;
    private int maxSpeed;

    public Vehicle(){

    }
    
    public Vehicle(String color, int maxSpeed){
          this.color=color;
          this.maxSpeed=maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    
   abstract void driveEngine() ;
   
  
}

class Car extends Vehicle{

	@Override
	 void driveEngine() {
	 System.out.println("My car is Running");
}
	
}

public class A_Basic {

	public static void main(String[] args) {
		
		Vehicle c = new Car();
		c.driveEngine();

	}

}

/*
 In Java, the "abstract" keyword is used to define abstract classes and methods. An abstract class is a class that cannot be instantiated (meaning you cannot create objects of that class directly), and it is typically used as a blueprint for other classes to inherit from.


why abstract ?
if you want to provide implementation details to your children but don't want to allow an instance of your class to be directly instantiated (which allows you to partially define a class).
simple contract

Points to Remember: 
An abstract class must be declared with an abstract keyword.
It cannot be instantiated.
It can have abstract and non-abstract methods.
It can have constructors(With help of super keyword from child class we can call constructor) and static methods also , instance variable too .
It can have final methods which will force the subclass not to change the body of the method

Rules :
If there is an abstract method in a class, that class must be abstract.
If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract.



An abstract class is faster than an interface because the interface involves a search before calling any overridden method in Java whereas abstract class can be directly used.

//// ******** Real World Example: *************  ///

Think of it this way: Imagine you want to create a game that involves different types of vehicles, such as cars, bicycles, and motorcycles. All these vehicles share some common characteristics, like having a color, a maximum speed, and a method to start the engine. However, each type of vehicle will also have its own specific behaviors, like a car having a method to open the trunk or a bicycle having a method to ring the bell.

In this scenario, you can create an abstract class called "Vehicle" that contains the common characteristics and methods shared by all vehicles. This abstract class cannot be directly instantiated because it's not meant to represent a specific vehicle; it's just a general blueprint.

*/




