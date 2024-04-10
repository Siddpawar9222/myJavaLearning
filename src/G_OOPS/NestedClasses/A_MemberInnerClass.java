package G_OOPS.NestedClasses;

class A {
    int age;

    public void name() {
        System.out.println("This is name");
    }

    class B {
        int month;

        public B(int month) {
            this.month = month;
        }

        public void insideName() {
            System.out.println("This is insideName of Class B");
        }
    }
}

public class A_MemberInnerClass {

    public static void main(String[] args) {
       A a = new A();  
       A.B b = a.new B(11) ;

       System.out.println(b.month);
    }
}
/*
Member inner class : 
- A non-static class that is created inside a class but outside a method is called member inner class. It is also known as a regular inner class. 
- It can be declared with access modifiers like public, default, private, and protected.

Syntax : 
          class Outer{  
           //code  
           class Inner{  
            //code  
           }  
          }  

 */