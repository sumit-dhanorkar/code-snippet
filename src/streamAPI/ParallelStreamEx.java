package streamAPI;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100, 110,120, 130, 140, 150);

        //sequential processing
        long sequentialProcessingStartTime = System.currentTimeMillis();
        numbers.stream()
                .map((Integer val)-> val*val)
                .forEach((Integer val)-> System.out.println(val));
        System.out.println("Sequential processing time: " + (System.currentTimeMillis()-sequentialProcessingStartTime));

        //parallel processing
        long parallelProcessingStartTime = System.currentTimeMillis();
        numbers.parallelStream()
                .map((Integer val)-> val*val)
                .forEach((Integer val)-> System.out.println(val));

        System.out.println("Parallel processing time: " + (System.currentTimeMillis()-parallelProcessingStartTime));

    }
}

/*
    Output:
    121 484 1089 1936 3025 4356 5929 7744 9801 10000 12100 14400 16900 19600 22500
    Sequential processing time: 3
    10000  12100 9801 7744 19600 22500 14400 3025 16900 5929 4356 121 1936 484 1089
    Parallel processing time: 5
 */
