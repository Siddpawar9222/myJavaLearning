package L_CollectionFramework.MyMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class A_TreeMap {

	public static void main(String[] args) {

		Map<String, Integer> tm = new TreeMap<>();
		tm.put("Rohit", 45);
		tm.put("Virat", 18);
		tm.put("MSD", 7);
		tm.put(null, null);
		System.out.println(tm);

	}

}

/*
Sure, let's talk about a real-world example that illustrates the difference between priority and sorting.

Imagine you're running a hospital emergency room. Patients come in with different levels of urgency, and you need to prioritize their treatment accordingly.

**Priority:**  
In this scenario, prioritizing patients means assessing the severity of their condition and treating those with the most critical needs first. For example, if someone comes in with a heart attack, they would be given top priority because their condition is life-threatening and requires immediate attention. Other patients with less severe issues, like a minor cut or bruise, would be treated afterward.

**Sorting:**  
Sorting, on the other hand, involves arranging patients based on a certain criterion. For instance, you might sort patients by their arrival time. This means that the patient who arrived first would be treated before those who came later, regardless of the severity of their condition. So even if someone comes in with a less urgent issue but arrived earlier, they would be treated before someone with a more severe problem who arrived later.

In this example:
- **Priority** is about addressing the most critical needs first, ensuring that resources are allocated where they're needed most urgently.
- **Sorting** is about organizing patients based on a specific criterion, such as arrival time, to ensure fairness and efficiency in managing the queue.

So, in the context of the hospital emergency room, prioritizing patients based on the severity of their condition reflects the concept of priority, while sorting them based on arrival time demonstrates the concept of sorting. Both concepts are important in managing resources effectively and providing timely care to patients.


  
TreeSet:
Ordered Set:
TreeSet is an ordered set, meaning that it maintains elements in sorted order.
Elements are sorted based on their natural ordering or according to a custom comparator provided at the time of creation.

No Duplicates:
Like other Set implementations, TreeSet does not allow duplicate elements.



Priority Queue:
PriorityQueue is a queue data structure where elements are processed based on their priority.
The elements are ordered according to their natural ordering or by a custom comparator provided at the time of creation.

No Guarantee of Sorted Order:
Unlike TreeSet, PriorityQueue does not guarantee sorted order across the entire queue. It ensures that the highest (or lowest) priority element is processed first.


 */