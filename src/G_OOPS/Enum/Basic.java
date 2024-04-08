package G_OOPS.Enum;

public class Basic {
    public static void main(String[] args) {

        Status s = Status.SUCCESS;

        System.out.println(s);
        Status[] s1 = Status.values();

        for (Status element : s1) {
            System.out.println(element + " " + element.ordinal());
        }
    }
}

/*
-Enum is stand for "enumerations", which means "specifically listed".
-An enum is a special "class" that represents a group of constants
(unchangeable variables, like final variables).
- Enums provide a way to create a collection of related constants, making the code more expressive, readable, and type-safe  
-Enum is abstract class in java which has some methods

properties :
-We cannot extends enum classes(Fixed Set Of Constants)
-Can have private constructors, methods , Comparable,instance variable
-Enum Sets and Enum Maps: Java provides special collections (EnumSet and EnumMap) optimized for enums.
-enums can have abstract methods.
  e.g..
     public enum Animal {
    CAT {
        public String makeNoise() { return "MEOW!"; }
    },
    DOG {
        public String makeNoise() { return "WOOF!"; }
    };

       public abstract String makeNoise();
     }
*/
