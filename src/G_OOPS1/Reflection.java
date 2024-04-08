package G_OOPS1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }
    private void sayHello1() {
        System.out.println("Hello , I'm Secret Agent name " + name);
    }
}


public class Reflection {
    public static void main(String[] args) throws Exception {
        Class<?> personClass = Class.forName("G_OOPS1.Person");

        Constructor<?> constructor = personClass.getConstructor(String.class);
        Object personInstance = constructor.newInstance("Alice");

        Method sayHelloMethod = personClass.getDeclaredMethod("sayHello");
        sayHelloMethod.invoke(personInstance);
        


        Method m =personClass.getDeclaredMethod("sayHello1");
        m.setAccessible(true);
        m.invoke(personInstance);

    }
}
/*
Reflection in Java is a feature that allows a program to examine the structure, attributes, and behavior of classes, interfaces, fields, methods, and other components of a Java program at runtime. It provides a way to inspect and manipulate class and object metadata, even if the classes were not available or known at compile time.
*/