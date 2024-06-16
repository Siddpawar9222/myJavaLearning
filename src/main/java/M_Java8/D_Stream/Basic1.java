package M_Java8.D_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Basic1 {
    // Different ways to create Stream object(Some basic ways)
    public static void main(String[] args) {

        // 1st way
        Stream<Object> s1 = Stream.empty();
        s1.forEach(e -> System.out.println(e));

        // 2nd ways
        Stream<String> s2 = Stream.of(new String[] { "satish", "manoj " });
        s2.forEach(e -> System.out.println(e));

        // 3rd way
        Stream.Builder<Integer> streamBuilder = Stream.builder();

        // Add elements to the builder
        streamBuilder.add(1);
        streamBuilder.add(2);
        streamBuilder.add(3);

        // Build the stream
        Stream<Integer> stream = streamBuilder.build();

        // Process the stream elements
        stream.forEach(System.out::println); // (Learn it)

        // 4th way
        IntStream intStream = Arrays.stream(new int[] { 88, 70, 20 });
        intStream.forEach(e -> System.out.println(e));

        // 5th way
        List<Integer> listOfEven = new ArrayList<>();
        Stream<Integer> stream2 =  listOfEven.stream();
    }

}

/* 
We can use stream with collection objects. 
Stream is not limited with collections.
*/