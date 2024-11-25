package streamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        Stream<String> nameStream = Stream.of("HELLO", "Everybody", "HOW", "ARE", "YOU", "DOING");
        //filter()
//        Stream<String> filteredStream = nameStream.filter((String name) -> name.length() <= 3);
//        List<String> filteredNameList = filteredStream.collect(Collectors.toList());
        //Output: [HOW, ARE, YOU]

        //map()

        Stream<String> stringStream = nameStream.map((String str) -> str.toLowerCase());
        List<String> lowerCases = stringStream.collect(Collectors.toList());
        //Output: [hello, everybody, how, are, you, doing]

        //flatMap()
        List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("I", "LOVE", "JAVA"),
                Arrays.asList("CONCEPTS", "ARE", "CLEAR"),
                Arrays.asList("ITS", "VERY", "EASY")
        );

        Stream<String> wordStream1 = sentenceList.stream()
                .flatMap((List<String> sentence) -> sentence.stream());
        List<String> wordList1 = wordStream1.collect(Collectors.toList());
        // OutPut: [I, LOVE, JAVA, CONCEPTS, ARE, CLEAR, ITS, VERY, EASY]

        Stream<String> wordStream = sentenceList.stream()
                .flatMap(
                        (List<String> sentence) ->
                                sentence.stream()
                                        .map((String value) -> value.toLowerCase())
                );
        List<String> wordList2 = wordStream.collect(Collectors.toList());
        //[i, love, java, concepts, are, clear, its, very, easy]


        //distinct()
//        Integer[] array = {1, 5, 2, 7, 4, 4, 2, 0, 9};
//        Stream<Integer> arrStream = Arrays.stream(array).distinct();
//        List<Integer> arrList = arrStream.collect(Collectors.toList());
//        System.out.println(arrList);
        //[1, 5, 2, 7, 4, 0, 9]

        Integer[] array = {1, 5, 2, 7, 4, 4, 2, 0, 9};
        //for asc
        Stream<Integer> ascStream = Arrays.stream(array).sorted();
        //for desc
        Stream<Integer> descStream = Arrays.stream(array).sorted((Integer a, Integer b) -> b - a);
        List<Integer> ascList = ascStream.collect(Collectors.toList());
        List<Integer> descList = descStream.collect(Collectors.toList());
        System.out.println(ascList);
        System.out.println(descList);
        //[0, 1, 2, 2, 4, 4, 5, 7, 9]
        //[9, 7, 5, 4, 4, 2, 2, 1, 0]


        //peek()
        List<Integer> numbers = Arrays.asList(2, 1, 3, 4, 6);
        Stream<Integer> numberStream = numbers.stream()
                .filter((Integer val) -> val > 2)
                .peek((Integer val) -> System.out.print(val + " ")) //this will print [3, 4, 6]
                .map((Integer val) -> -1 * val);

        List<Integer> numberList = numberStream.collect(Collectors.toList());
        System.out.println(numberList);

        //output
        // 3 4 6
        // [-3, -4, -6]

        //limit()
        List<Integer> nums = Arrays.asList(2, 1, 3, 4, 6);
        Stream<Integer> numsStream = nums.stream().limit(3);
        List<Integer> numsList = numsStream.collect(Collectors.toList());
        System.out.println(numsList);
        //[2, 1, 3]

        //skip()
        List<Integer> numss = Arrays.asList(2, 1, 3, 4, 6);
        Stream<Integer> numsStreams = numss.stream().skip(3);
        List<Integer> numsLists = numsStreams.collect(Collectors.toList());
        System.out.println(numsLists);
        //Output: [4, 6]

        //mapToInt()
        List<String> numbersList = Arrays.asList("2", "1", "4", "7");
        IntStream intStream = numbersList.stream().mapToInt((String val) -> Integer.parseInt(val));
        int[] numArray = intStream.toArray();
        System.out.println(Arrays.toString(numArray));
        //[2, 1, 4, 7]
        int[] numbersArray = {2, 1 ,4, 7};
        IntStream filteredStream = Arrays.stream(numbersArray).filter(val -> val > 2);
        int[] filteredArray = filteredStream.toArray();
        System.out.println(Arrays.toString(filteredArray));
        //[4, 7]

        //mapToLong()
        List<String> list = Arrays.asList("24", "245", "1000",
                "20", "15");

        list.stream().mapToLong(num -> Long.parseLong(num))
                .filter(num -> num %2==0 )
                .forEach(num-> System.out.print(num + " "));
        //Output: [24 1000 20]


        //mapToLong()
        List<String> list1 = Arrays.asList("24", "245", "1000",
                "20", "15");

        list1.stream().mapToDouble(num -> Double.parseDouble(num))
                .filter(num -> num %2==0 )
                .forEach(num-> System.out.print(num + " "));
        //Output: [24.0 1000.0 20.0]

    }
}
