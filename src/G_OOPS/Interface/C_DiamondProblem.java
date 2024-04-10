package G_OOPS.Interface;


interface A{
      
      default void doSomething(){
            System.out.println("A's doing something"); 
      }
}

interface B extends A{
      
      @Override
      default void doSomething(){
            System.out.println("B's doing something"); 
      }
}

interface C extends A{

      @Override
      default void doSomething(){
            System.out.println("C's doing something"); 
      }
}

//class D  implements B , C{ }     //compilation error




class D  implements B , C{
     @Override
     public void doSomething(){
            System.out.println("D's doing something"); 
     }
}



public class C_DiamondProblem {
      public static void main(String[] args) {
           A d = new D() ;
           d.doSomething();
      }
}


/*
 - Here we used default method in interface
 - We know that default method is not neccessary(compulsory) to implement in subclass.
 - still this code giving me error 
      class D  implements B , C{ }
 - Because  here compiler comfuse which method should  use either B's or C's 
  -By interface we solved this problem  
  
Note: Since both interfaces have the same method signature, it doesn't matter which interface the class explicitly implements; the class will be implementing the method only once.

*/