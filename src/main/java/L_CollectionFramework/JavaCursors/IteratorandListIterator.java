package L_CollectionFramework.JavaCursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorandListIterator {
	public static void main(String[] args) 
	{

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			al.add(i);
		}
		System.out.println(al);

		Iterator<Integer> i = al.iterator();

		while (i.hasNext()) {
			int num = i.next();
			System.out.print(num + " ");

			if (num % 2 == 0) {
				i.remove();
			}
		}
		System.out.println();
		
		ListIterator<Integer> li  =	al.listIterator() ;
		while (li.hasNext()) {
			System.out.print(li.next() +" "); 
		}
		System.out.println();
		while (li.hasPrevious()) {
			System.out.print(li.previous() +" "); 
		}
		System.out.println();
		
		li.forEachRemaining((element)->System.out.print(element + " "));
	}

}

/*
Spliterator (not SplitIterator) is an interface introduced in Java 8 as part of the Stream API. It is designed to facilitate the parallel processing of data by splitting a data source into multiple chunks that can be processed independently. Spliterator provides a way to iterate and partition the elements of a collection or other data source.
 */
