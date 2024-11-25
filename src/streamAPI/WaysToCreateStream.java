package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WaysToCreateStream {
    public static void main(String[] args) {

        List<Integer> salaryList = Arrays.asList(3000, 4100, 9000, 1000, 3500);
        Stream<Integer> stream = salaryList.stream();

        Integer[] salaryArray = {3000, 4100, 9000, 1000, 3500};
        Stream<Integer> stream1 = Arrays.stream(salaryArray);

        Stream<Integer> integerStream = Stream.of(3000, 4100, 9000, 1000, 3500);

        Stream<Integer> streamFromIterate = Stream.iterate(1000, (Integer n) -> n + 5000).limit(5);

        
        Stream.Builder<Integer> builder = Stream.builder();
        builder.add(1000).add(30000).add(4100).add(9000);
        Stream<Integer> stream2 = builder.build();

    }
}
