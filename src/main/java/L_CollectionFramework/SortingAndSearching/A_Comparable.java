package L_CollectionFramework.SortingAndSearching;

import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	String name;
	int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

//	@Override
//	public int compareTo(Student o) {
//		return this.id - o.id;
//	}

	@Override
	public String toString() {
		return "\n Student [name=" + name + ", id=" + id + "]\n";
	}

@Override
public int compareTo(Student o) {
	if( (this.id % 10) > (o.id % 10)) {
    	return 1 ;
    }else {
		return -1 ;
	}
}

}

public class A_Comparable {

	public static void main(String[] args) {
		Set<Student> ts = new TreeSet<>();

		ts.add(new Student("Guarav", 10));
		ts.add(new Student("Prathamesh", 1));
		ts.add(new Student("Nikil", 15));
		ts.add(new Student("Surabh", 20));
		ts.add(new Student("Avi", 13));
		System.out.println(ts);         
		// Without comparable and comparator TreeSet gives exception

	}

}

// The compareTo() method is implicitly called by the TreeSet class during the insertion of elements into the set./

//        Gaurav (10)
///        /        \  
//Prathamesh (1)  Nikil (15)
//                /    \
//         Avi(13)      Surabh (20)
