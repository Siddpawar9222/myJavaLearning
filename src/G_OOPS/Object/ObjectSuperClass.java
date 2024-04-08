package G_OOPS.Object;

import java.util.Objects;

class Check {     // Normal class(Check--->Object class)
	String name;
	int id;

	Check(String name, int id) {
		this.name = name;
		this.id = id;
	}

}

class Check1 {    // Override class(Check1--->Object class)
	String name;
	int id;
    Check1(){
    	System.out.println("Default constructor");
    }
	Check1(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return name + " " + id;
	}

	@Override
	public int hashCode(){
		return id ; 
	}
	
    @Override
	public boolean equals(Object o) {
		Check1 c = (Check1)o;
		if (this == o) {
			return true;
		} else if (o == null ||getClass() !=o.getClass()) {
			return false;
        }
        else {
			return (id==c.id) &&(Objects.equals(name,c.name));
		}
	}
    
    @Override
    	protected void finalize() throws Throwable {
        try {
        	 
            System.out.println("inside demo's finalize()");
        }
        catch (Throwable e) {
 
            throw e;
        }
        finally {
 
            System.out.println("Calling finalize method"
                               + " of the Object class");
 
            // Calling finalize() of Object class
            super.finalize();
        }
    	}

}

public class ObjectSuperClass {

	public static void main(String[] args) {
		// Object Superclass has 11 methods
		Check c = new Check("Siddhesh", 121);
		// check here methods . e.g c.toString();
		//System.out.println(c.hashCode());

//----------------------------------------------------------------------------------------------
//	Object's toString() method is pretty generic:
//		public String toString() {
//		    return getClass().getName()+"@"+Integer.toHexString(hashCode());
//		}
	  
		//hashCode
//		@Override
//		public int hashCode() {
//			return Objects.hash(id, name);
//		}		

//-------------------------------------------------------------------------------		
	   String name = "Siddhesh";
//	   System.out.println(name.toString()); //String class has its own String implemention 

//	   String n1 = new String("Invicible Siddhesh");
//	   System.out.println(n1.toString());
	   Check c1 = new Check("Siddhesh", 121);
	   Check c11 = new Check("Siddhesh", 121);
	   Check c111 = c1;
//	   c1.name ="Lord Pawar";
//	   String s1 = c1.toString();
//	   System.out.println(s1);
	   System.out.println(c1.hashCode());

		System.out.println(c1.equals(c11)); // In Java, the equals() method is used to compare two objects for equality.
											// By default, the equals() method compares object references, not object
											// contents.
		System.out.println(c1.equals(c111)); // Object reference are same here

//	   Check1 c2 = new Check1("Virat", 451);
//	    System.out.println(c2.toString());
//	    System.out.println(c2.hashCode());
		
//-------------------------------------------------------------------------------        
//		The Java finalize() method of Object class is a method that the Garbage Collector always calls(only once on any object) just before the deletion/destroying the object which is eligible for Garbage Collection to perform clean-up activity.	
//https://www.geeksforgeeks.org/finalize-method-in-java-and-how-to-override-it/		
		Check1 ck = new Check1();
		try {
			ck.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
//-------------------------------------------------------------------------------
		
		
	}
                
}
