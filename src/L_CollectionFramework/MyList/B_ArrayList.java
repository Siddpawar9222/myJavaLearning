package L_CollectionFramework.MyList;

import java.util.*;

public class B_ArrayList {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(55); // add element at end of list
        // System.out.println(a);
        /*
         * Initally It will create array of size 10 .When we add 10 elements in array ,
         * then size(n) will ne n + n/2 + 1
         */
        a.add(0, 122);
        // System.out.println(a);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(100);
        b.add(200);
        b.add(300);

        a.addAll(b);
        System.out.println(a); // Add another array at the end of list

        System.out.println(a.get(0)); // get the value

        // a.remove(index);
        a.remove(Integer.valueOf(100)); // It will remove 100 from list
        System.out.println(a);

        // a.clear(); // Empty all list

        // a.set(2 , 555); //Update the index value
        // System.out.println(a.contains(55)); // present or not

        // System.out.println("Using for");
        // for(int i= 0 ; i<a.size() ; i++)
        // {
        // System.out.println(" " + a.get(i));
        // }

        // System.out.println("Using forEach");
        // for(Integer element: a)
        // {
        // System.out.println(" " + element);
        // }

        System.out.println("iterator ");

        Iterator<Integer> it = a.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        a.removeIf(items -> (items > 100));
        // Lambda expression

    }
}

/*
 The ArrayList class implements the List interface. 
 It uses a dynamic array to store the duplicate element of different data types . 
 The ArrayList class maintains the insertion order and is non-synchronized. The elements stored in the ArrayList class can be randomly accessed. Size can shrink or expand according to our need (Shift the elements when delete or add ) .
 */