package G_OOPS.InnnerClasses;

public class D_final {
    
}

/*
In Java, when you have a local inner class inside a method, it can access variables from that method. However, there are rules about which variables it can access:

1. **Final Variables:** If a variable in the method is declared with the `final` keyword, the local inner class can access it without any issues. A `final` variable cannot be changed after it's given a value.

   void someMethod() {
       final int localVar = 42; // localVar is declared final
       
       class LocalInner {
           void innerMethod() {
               System.out.println(localVar); // This is allowed.
           }
       }
   }
   ```

2. **Effectively Final Variables:** If a variable is not explicitly declared as `final` but it's never changed (effectively final), the local inner class can also access it.

   void someMethod() {
       int localVar = 42; // localVar is effectively final because it's not changed.
       
       class LocalInner {
           void innerMethod() {
               System.out.println(localVar); // This is allowed.
           }
       }
   }

In both cases, the variable in the method should not change its value after the inner class is defined. If it does, you'll encounter a compilation error. The reason for this rule is to ensure that the inner class relies on stable values and doesn't encounter unexpected changes in the variables it uses.

Summary :
If a variable is explicitly declared as final, it's clear that its value won't change, and you can access it from the inner class.
If a variable is not declared as final but its value is effectively final (meaning it's assigned once and doesn't change afterward), you can also access it from the inner class.
 */