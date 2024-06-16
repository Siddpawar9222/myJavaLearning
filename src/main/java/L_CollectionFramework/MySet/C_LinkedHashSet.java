package L_CollectionFramework.MySet;

import java.util.LinkedHashSet;
import java.util.Set;

public class C_LinkedHashSet {
     public static void main(String[] args) {
		Set<Student> lhs = new LinkedHashSet<>();
		lhs.add(new Student("Siddhesh", 1));
        lhs.add(new Student("Rohan", 2));
        lhs.add(new Student("Akshay", 3));
        lhs.add(new Student("Adesh", 4));
        lhs.add(new Student("Avi", 2));
        lhs.add(new Student("Akshay", 10));
        System.out.println(lhs);
		
	}
}
