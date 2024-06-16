package L_CollectionFramework.MyList;



import java.util.*;

public class D_Stack {
    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();
        List<String> animals1 = new Stack<>();
        animals1.add("Human");
        // Stack<Integer> a = new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Horse"); // Add the elements
        System.out.println("Stack " + animals);
        System.out.println(animals.peek()); // show first out element

        System.out.println(animals.peek().getClass().getName());

        animals.pop();               // remove the last-in element

        System.out.println(animals.peek());
    }

}

/*

  The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack. The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties
  
 */