package L_CollectionFramework.MyQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class A_PriorityQueue {

	public static void main(String[] args) {
	 
		Queue<String> pq = new PriorityQueue<>();
		pq.add("Siddhesh");
		pq.add("Is");
		pq.add("Good");
		pq.add("Guy");
		System.out.println(pq);
		System.out.println(pq.peek());

	}

}
