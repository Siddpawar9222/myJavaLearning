package L_CollectionFramework.MyQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class B_ArrayDeque {

	public static void main(String[] args) {
		Deque<String> ad = new ArrayDeque<>();
		ad.addFirst("Hii");
		ad.addLast("am");
		ad.addFirst("Siddhesh");
		System.out.println(ad);

	}

}
