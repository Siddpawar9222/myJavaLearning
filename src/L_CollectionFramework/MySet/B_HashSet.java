package L_CollectionFramework.MySet;
/*
HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode. 
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.
It is like a bag . We dont know dont know which element is comes out 
*/


import java.util.*;
public class B_HashSet {
    public static void main(String[] args) {
        //  Set<Integer> h = new HashSet<>();
        //  h.add(177);
        //  h.add(455);
        //  h.add(66);
        //  h.add(666);
        //  h.add(66);
        //  System.out.println(h); 
        //  h.remove(666);
        //  System.out.println(h);
        //  h.contains(170);
        //  //h.clear();
        //  System.out.println(h.isEmpty());
        //  h.size();
        //  System.out.println(h);

          Set<Student> s = new HashSet<>();
          //see Student class
          s.add(new Student("Alice", 25));
          s.add(new Student("Bob", 30));
          s.add(new Student("Prince", 25));
          System.out.println(s);
           
        }
    
}
/*
 If we dont overridden hashCode and equals method, the HashSet will treat each Student object as distinct, even if their attributes are the same. This is because the default hashCode generates different hash codes for different memory addresses, and the default equals method checks for reference equality.
 */