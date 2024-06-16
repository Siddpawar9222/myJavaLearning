package G_OOPS.Object;

import java.util.Objects;

//Object is a class in the java.lang package which is the root of the class hierarchy in Java. All classes in Java implicitly extend the Object class. 


//Objects, on the other hand, is a utility class in the java.util package that provides various utility methods to work with objects, including the equals(Object a, Object b) method, which compares two objects for equality, and the requireNonNull(Object obj) method, which checks whether an object is null and throws a NullPointerException if it is.


//So, while Object is a class that is a part of the Java core libraries and is used as the base class for all Java objects, Objects is a utility class that provides various utility methods to work with objects.


class Animal {}
class Cat extends Animal {}


public class A_Basic {
	public static void main(String[] args) {
	    //getClass  
		A_Basic b = new A_Basic();
		A_Basic b1 =new A_Basic();
		System.out.println(b.getClass());      //------>class G_OOPS.Object.Basic
		//It returns the Class objects that represent the runtime class of this object.
		
		  System.out.println(Object.class);
//		 .class is a special operator used to get the class object .
//		 .class is used when there isn't an instance of the class available.(className.class)
//	     .getClass() is used when there is an instance of the class available(Here we have b instance of class)
		
		
		System.out.println(b.getClass().getName()); 
		//.getName()--> Returns the name of the entity (class, interface, array class, primitive type, or void) represented by this Class object, as a String.
		
		System.out.println(Objects.equals(b, b1)); //static method
		
//----------------------------------------------------------------------------
//Typecasting in Objects
// Only when there is relationship of inheritance.

//Typecasting in Java refers to the process of converting a value from one data type to another. In the case of objects, typecasting is used to convert an object of one class to another.
// 1}Upcasting: Upcasting is when an object of a subclass is cast to its superclass type. This is always safe and does not require an explicit cast. For example:		
        //===================================//
		Cat cat = new Cat();
		Animal animal = cat; // Upcasting
//In this example, cat is an object of the Cat class, and animal is a reference of the Animal class. The assignment animal = cat is an example of upcasting, which is implicitly done by the Java compiler.		
		//====================================//
		
//  2}Downcasting: Downcasting is when an object of a superclass is cast to its subclass type. This is not always safe and requires an explicit cast. For example:		
		Animal animal1 = new Cat();
		Animal animal2 = new Animal();
		Cat cat1 = (Cat) animal1; // Downcasting
//In this example, animal is an object of the Animal class, and cat is a reference of the Cat class. The assignment cat = (Cat) animal is an example of downcasting, which requires an explicit cast. 
        //Cat cat2 = (Cat) animal2 ;	//runtime error	
//If the object being cast is not an instance of the subclass, a ClassCastException will be thrown at runtime.
		
		
	}

}

/*
- .class is used at the class level and provides information about the class itself.
- .getClass() is used at the object level and provides information about the runtime class of the object.
- Both gives information with fully qualified name .
- The fully qualified name of a class is the name of the class prefixed with the package name.


In general, you might use .class when you know the class at compile time, and you use getClass() when you want to determine the class of an object dynamically at runtime.
 */