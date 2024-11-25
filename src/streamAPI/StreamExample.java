package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 1, 4, 7, 10);
        Stream<Integer> numberStream = numbers.stream() //creating stream
                .filter((Integer val) -> val >= 3) //intermediate operation
                .peek((Integer val) -> System.out.print(val + " "));//intermediate operation

        numberStream.count(); //count() is one of the terminal operation

        //Output: 4 7 10
    }
}
