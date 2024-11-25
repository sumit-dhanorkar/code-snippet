package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Terminal {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 1, 4, 7, 10);

        //intermediate operation applied
        Stream<Integer> filterNumberStream = numbers.stream()
                .filter((Integer val) -> val >= 3);

        //consumed the filterNumberStream
        filterNumberStream.forEach(System.out::println);

        //trying to use the closed /consumed stream again
        List<Integer> listFromStream = filterNumberStream.collect(Collectors.toList());


        /*
            Output:
            4
            7
            10
            Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
                at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229)
                at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
                at streamAPI.Terminal.main(Terminal.java:21)

         */
    }
}
