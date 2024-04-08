package L_CollectionFramework.MyList;
import java.util.*;

public class C_LinkedList {
    public static void main(String[] args) {
        
        // Queue<Integer> q = new LinkedList<>();
        // q.offer(100);
        // q.offer(300);
        // q.offer(800); // add elements
        // System.out.println(q);

        // System.out.println(q.poll()); //remove first out element
        // System.out.println(q.peek()); // which element will come out first
         

        //Most of methods like Arryalist Methods
        List<String> lk = new LinkedList<String>();
        
        lk.add("Siddhesh is good guy");
        lk.add("Pawar");
        lk.add("How are you");
        
        System.out.println(lk);
        System.out.println(lk.get(1));

         // peek() , peekfirst(), peeklast()
        // System.out.println(ll.peek());
        // System.out.println(((LinkedList<String>) ll).peekFirst());
        // System.out.println(ll.peekLast());

    }

}

/* 
LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. It can store the duplicate elements. It maintains the insertion order and is not synchronized. In LinkedList, the manipulation is fast because no shifting is required
*/