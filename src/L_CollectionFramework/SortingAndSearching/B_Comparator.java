package L_CollectionFramework.SortingAndSearching;



import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Candinate {
	String name;
	int id;

	public Candinate(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "\n Candinate [name=" + name + ", id=" + id + "] \n";
	}

}

class CandinateComparator implements Comparator<Candinate> {

	@Override
	public int compare(Candinate c1, Candinate c2) {
	    if( (c1.id % 10) > (c2.id % 10)) {
	    	return 1 ;
	    }else {
			return -1 ;
		}
	}

}

public class B_Comparator {

	public static void main(String[] args) {
//		Comparator<Candinate> cm = new Comparator<Candinate>() {
//
//			@Override
//			public int compare(Candinate c1, Candinate c2) {
//				return c2.id - c1.id;
//			}
//
//		}; //anonymous inner class

		// OR

		Comparator<Candinate> cm1 = new CandinateComparator();

		Set<Candinate> ts = new TreeSet<>(cm1);
		ts.add(new Candinate("Vijay", 93));
		ts.add(new Candinate("Ajay", 27));
		ts.add(new Candinate("Jai", 31));
		ts.add(new Candinate("Ajay", 55));
 	    System.out.println(ts);
	}

}

