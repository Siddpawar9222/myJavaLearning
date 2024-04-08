package M_Java8.B_Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Basic2 {

    //Streams methods
     public static void main(String[] args) {
        List<String> strList = List.of("Abhi", "Ani", "kusal", "banny") ;
        strList.stream().filter(e->e.startsWith("A")).map(e->e.toUpperCase()).forEach(e->System.out.println(e));

        List<String> newList = strList.stream().filter(e->e.startsWith("b")).map(e->e.toUpperCase()).collect(Collectors.toList());
        System.out.println(newList);

        System.out.println(strList.stream().filter(e->!e.startsWith("A")).reduce("This is reduce " ,(x,y)-> x+y));
        
        List<Integer> intList = List.of(50 ,10,5,96,3,2) ;
        intList.stream().sorted().forEach(e->System.out.print(e + " "));
        System.out.println();

        intList.stream().min((x,y)->x.compareTo(y)).ifPresent(e->System.out.println(e)) ;

        intList.stream().max((x,y)->x.compareTo(y)).ifPresentOrElse(e->System.out.println(e) , ()->System.out.println("List is Empty")) ;



     }
}
/*
- filter(Predicate<? super T> predicate) 
   Here Predicate is functional interface who has one boolean method  
   The filter operation is used to eliminate elements from the stream that do not satisfy a given condition. It takes a Predicate as an argument, which is a functional interface that represents a boolean-valued function that tests a condition.
 
-map(Function<? super T, ? extends R> mapper)  
    The map operation is used to transform elements in the stream from one type to another. It takes a Function as an argument, which is a functional interface that represents a transformation operation. The map operation applies the function to each element in the stream and returns a new stream containing the transformed elements.

-reduce() (return T)
   It is used reduce the elements of a stream to a single value using a binary operator. It is used to perform aggregation operations on the elements of the stream, such as summing, multiplying, finding the maximum or minimum, or concatenating strings.



-sorted()    

-min() , max() (return Optional instance)

-collect(Collectors.toList()) 
   It is a terminal operation that collects the elements of a stream into a List. 

*/

/*
Predicate<? super T> predicate---->boolean test(T t);

String---> public boolean startsWith(String prefix) {
        return startsWith(prefix, 0);
    }

 */