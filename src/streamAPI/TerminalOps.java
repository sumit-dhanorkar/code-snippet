package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 1, 4, 7, 10);

        //findAny()
        Optional<Integer> any = numbers.stream()
                .filter((Integer value) -> value >= 3)
                .findAny();

        System.out.println(any.get());
        //Output: 4



        //findFirst()
        Optional<Integer> firstVal = numbers.stream()
                .filter((Integer value) -> value >= 3)
                .findFirst();

        System.out.println(firstVal.get());
       //Output: 4

        //noneMatch()
        boolean hasEvenValue = numbers.stream()
                .noneMatch((Integer value) -> value >=3);

        System.out.println(hasEvenValue);
        //Output:false

        //allMatch()
        boolean hasEvenValue2 = numbers.stream()
                .allMatch((Integer value) -> value % 2 == 0);

        System.out.println(hasEvenValue2);
        //Output:false

        //anyMatch()
        boolean hasEvenValue1 = numbers.stream()
                .anyMatch((Integer value) -> value % 2 == 0);

        System.out.println(hasEvenValue1);
        //Output:true


        //count()
        long noOfValuePresent = numbers.stream()
                .filter((Integer value) -> value >= 3)
                .count();
        System.out.println(noOfValuePresent);
        //Output: 3

        //min() / max()
        Optional<Integer> minVal1 = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .min((Integer val1, Integer val2) -> val1 - val2);
        System.out.println(minVal1.get());
        //Output: 4

        Optional<Integer> minVal2 = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .min((Integer val1, Integer val2) -> val2 - val1);

        System.out.println(minVal2.get());
        //Output: 10

        Optional<Integer> maxVal1 = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .max((Integer val1, Integer val2) -> val1 - val2);
        System.out.println(maxVal1.get());
        //output: 10
        Optional<Integer> maxVal2 = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .max((Integer val1, Integer val2) -> val2 - val1);
        System.out.println(maxVal2.get());
        //Output: 4

        System.out.println("swdfdsf");


        //collect()
        List<Integer> filterNumberList = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .collect(Collectors.toList());


        //reduce
        Optional<Integer> reduceValue = numbers.stream()
                .reduce((Integer val1, Integer val2) -> val1 + val2);

        System.out.println(reduceValue.get());
        //output : 24




        /*
        toArray()
        when we do toArray() it will return Objects[] array
         */
        Object[] filteredArray1 = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .toArray();

        /*
            if we want specific Integer array then inside the toArray we san tell we want this integer array.
         */
        Integer[] filteredArray2 = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .toArray((int size) -> new Integer[size]);

        numbers.stream()
                .filter((Integer val)-> val>=3)
                .forEach((Integer val)-> System.out.println(val));
        /*
            Output:
            [4 7 10]
         */




    }
}
