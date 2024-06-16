package G_OOPS.Polymorphism;

/* 
When a method in a subclass has the same name, same parameters or signature, and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.
runtime polymorphism

Rules :
 - private ,static, final methods cannot be overridden
 - method overriding is based on dynamic binding at runtime and the static methods are bonded -  - using static binding at compile time. So, we cannot override static methods.
 (Another Analogy : For overriding--->instance of class and static--->belongs to class)

*/

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
public class Method_Overriding {

	public static void main(String[] args) { 

        Animal animal = new Animal();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();

        animal = new Dog();
        animal.makeSound();

   }

}

//This is an example of method overriding, where a subclass provides its own implementation of a method that is already defined in its superclass. By overriding the makeSound() method, the Dog and Cat classes are able to provide more specific behavior that is appropriate for their respective types of animals.
