package L_CollectionFramework.SortingAndSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
	int id;
	String name;

	public Employee() {

	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]\n";
	}
}
class Employee1 implements Comparable<Employee1> {
	int id;
	String name;
	
	public Employee1() {
		
	}
	
	public Employee1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]\n";
	}

	@Override
	public int compareTo(Employee1 o) {
		 return this.id - o.id ;
	}
}

public class C_BetterExample {
	public static void main(String[] args) {

		List<Employee> e = new ArrayList<>();
		e.add(new Employee(10, "Mark"));
		e.add(new Employee(1, "kol"));
		e.add(new Employee(0, "klaus"));
		e.add(new Employee(50, "Ellaja"));

		// Collections.sort(e);
		Collections.sort(e, (e1, e2) -> (e1.id > e2.id) ? 1 : -1);
		System.out.println(e);
		
		
		List<Employee1> e1 = new ArrayList<>();
		e1.add(new Employee1(10, "Mark"));
		e1.add(new Employee1(1, "kol"));
		e1.add(new Employee1(0, "klaus"));
		e1.add(new Employee1(50, "Ellaja"));
		
		Collections.sort(e1);
		System.out.println(e1);
		
		

	}
}
