package M_Java8.B_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Example02 {

	public static void main(String[] args) {

//map(n->2*n) equivalent to 	

		Function<Integer, Integer> ft = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return 2 * t;
			}
		};

		List<Integer> list = Arrays.asList(1, 0, 2, 5, 4);

		// In short
		//list.stream().sorted().map(ft).forEach(n -> System.out.println(n)); // *
		
		//using filter
		list.stream().filter(n->(n%2==0)).sorted().map(ft).forEach(n -> System.out.println(n));
		
		//reduce
		int result = list.stream().filter(n->(n%2)==0).map(ft).reduce(0,(c,e)->(c+e)) ;
		System.out.println(result);

	}

}
//ctrl + hover --> open declaration --> Go to java declaration
// * --> It will not take memory for every stream, because once we used stream it destory and replace by another one
