package M_Java8.D_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example01 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 0, 2, 5, 4);
		Stream<Integer> data = list.stream();

//		Stream<Integer> sortedData = data.sorted();
//		sortedData.forEach(element -> System.out.println(element));
		
         Stream<Integer> mappedData = data.map(n->2*n);
         mappedData.forEach(element->System.out.println(element));
         
         
         //data.forEach(element->System.out.println(element));
		// data.forEach(element->System.out.println(element)); *

	}

}
//stream =flow of water
//* --> Once we consumed data stream then we cannot use it again(avoid data leak, unused open resources)
//Another e.g-->
//   System.out.println(data.count());
//   data.forEach(element->System.out.println(element));