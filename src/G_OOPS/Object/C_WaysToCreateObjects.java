package G_OOPS.Object;

import java.lang.reflect.Constructor;

class JavaNew{
	String name = "Harry Potter";
}
class NewInstance{
	String name = "Aeron";
}
class NewInstanceCon{
	 String name ="Jenny";
}

class LetsClone implements Cloneable {
	String name ="puppy";
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class C_WaysToCreateObjects {

	public static void main(String[] args) {
//		1) Java new Operator
//		This is the most popular way to create an object in Java. A new operator is also followed by a call to constructor which initializes the new object. While we create an object it occupies space in the heap.
		
		JavaNew n = new JavaNew();
		System.out.println(n.name);
		
  //===================================================//
		
//		2) Java Class.newInstance() method
//Java Class.newInstance() is the method of Class class. The Class class belongs to java.lang package. It creates a new instance of the class represented by this Class object. It returns the newly created instance of the class.
		try {
			Class<NewInstance> clazz = NewInstance.class;
			NewInstance obj = clazz.newInstance();
			System.out.println(obj.name);
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
//It throws IllegalAccessException if the class or its nullary constructor is not accessible. It also throws InstantiationException, if the Class represents an abstract class, an interface, an array class, or a primitive type.		
	
		//===================================================//
		
//        3) Java newInstance() method of Constructor class
//Java Constructor class also has a newInstance() method similar to newInstance() method of Class class. The newInstance() method belongs to java.lang.reflect.Constructor class. Both newInstance() method are known as reflective ways to create object. In fact the newInstance() method of Class class internally uses newInstance() method of Constructor class. The method returns a new object created by calling the constructor.
		  
		try {
			Constructor<NewInstanceCon> clazz = NewInstanceCon.class.getDeclaredConstructor();
				NewInstanceCon obj = clazz.newInstance();
				 System.out.println(obj.name);
		}catch (Exception e) {
			System.out.println(e);
		}
		
//		The newInstance() method throws the following Exception:
//
//			IllegalAccessException: If the constructor is inaccessible.
//			IllegalArgumentException: If the actual and formal parameter differ in number.
//			InstantiationException: If the class constructor represents an abstract class.
//			InvocationTargetException: If the underlying constructor throws an exception.
//			ExceptionInInitializerError: If the initialization provoked by this method fails.
//			NoSucMethosException : getConstructor(); not work then use getDeclaredConstructor();
	//===================================================//	
		
		 //4) Java Object.clone() method
//Java clone() method creates a copy of an existing object. It is defined in Object class. It returns clone of this instance. The two most important point about clone() method is:

//			The Cloneable interface must be implement while using clone() method. It is defined in java.lang package.
		
//			The clone() method must be override with other classes.
//When we use clone() method in class, the class must call super.clone() to obtain the cloned object reference.		 
		LetsClone c = new LetsClone();
		
		try {
			LetsClone ccopy = (LetsClone) c.clone(); //clone() method present in Object class----> Downcasting
			System.out.println(ccopy.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		//===================================================//
		 
//		5) Java Object Serialization and Deserialization
		 //after IO file chapter
	}
	

}
