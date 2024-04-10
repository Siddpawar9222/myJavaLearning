package G_OOPS.NestedClasses;

class StaticClass {
    static int data = 30;

    static class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }
}

public class D_StaticNestedClass {
    public static void main(String[] args) {

        StaticClass.Inner inner = new StaticClass.Inner();

        inner.msg();
    }
}

/*
Static Nested Class :
-A static class is a class that is created inside a class, is called a static nested class in Java. 
-It can access static data members of the outer class, including private.
-The static nested class cannot access non-static (instance) data members or methods .

 */
