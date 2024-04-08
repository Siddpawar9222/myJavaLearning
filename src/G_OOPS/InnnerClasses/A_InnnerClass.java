package G_OOPS.InnnerClasses;

class A{
	int age ;
	public void name() {
		System.out.println("This is name");
	}
	class B{
		int month ;
		public void insideName() {
			System.out.println("This is insideName of Class B");
		}
	}
	    static class C{
		public void insideName() {
			System.out.println("This is insideName of class C");
		}
		//Only inner classes can be static
	}
}

public class A_InnnerClass {

	public static void main(String[] args) {
		
		A objA = new A() ;

//        A.B objB =  objA.new B();
        A.B objB = new A().new B();
        System.out.println(objB.month);
        objB.insideName();
        
          //static class
//        A.C objC = new A.C();
//        objC.insideName();
        
//        A.C objs = new A().new C();
//        objs.insideName();   inner class can be private , protected
		
		

	}

}
/* 
The main use of inner classes is to group classes together in a way that makes sense and to increase encapsulation ,logical grouping and code organization. Inner classes can access private members of the enclosing class, which can be useful for implementing certain design patterns. They can also be used to create more readable and maintainable code by reducing the scope of certain classes and by making code more modular. Finally, anonymous inner classes are often used to create event handlers or to implement interfaces.
Types : 
1. Inner Class (Non-static Nested Class):
class Outer {
    class Inner {
        // Inner class code
    }
}

2. Local inner class
class Outer {
    void someMethod() {
        class LocalInner {
            // Local inner class code
        }
    }
}


3. Anonymous inner class
 MyInterface myObj = new MyInterface() {
    // Anonymous inner class implementation
};

4. Static nested class(Static Inner Class)
class Outer {
    static class StaticNested {
        // Static nested class code
    }
}

*/
