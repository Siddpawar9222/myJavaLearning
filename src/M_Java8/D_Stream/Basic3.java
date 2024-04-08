package M_Java8.D_Stream;

import java.util.Arrays;

public class Basic3 {
      public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3};

        //primitives to object
        
        Integer[] arr =   Arrays.stream(nums).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

        //object to primitives

        int[] primitiveArray = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();

      }
}
