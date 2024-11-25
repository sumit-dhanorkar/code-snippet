package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 1, 4, 7, 10);
        Stream<Integer> numbersStream = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .peek((Integer val) -> System.out.println("after filter : " + val))
                .map((Integer val) -> val * -1)
                .peek((Integer val) -> System.out.println("after negating : " + val))
                .sorted()
                .peek((Integer val) -> System.out.println("after sorted : " + val));

        List<Integer> filteredNumberStream = numbersStream.collect(Collectors.toList());


    }
}

/*
    Expected output:
    after filter : 4
    after filter : 7
    after filter : 10

    after negating : -4
    after negating : -7
    after negating : -10

    after sorted : -10
    after sorted : -7
    after sorted : -4


    Actual output comes:
    after filter : 4
    after negating : -4
    after filter : 7
    after negating : -7
    after filter : 10
    after negating : -10
    after sorted : -10
    after sorted : -7
    after sorted : -4

 */
