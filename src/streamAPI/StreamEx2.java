package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(3000);
        salaryList.add(4100);
        salaryList.add(9000);
        salaryList.add(1000);
        salaryList.add(3500);

        long count = salaryList
                .stream()  //create a stream from salaryList datasource
                .filter((salary) -> salary > 3000) //intermidate opeartion
                .count(); //terminal operation
        System.out.println("Total employee with salary > 3000: "+count);
    }
}
/*
    Total employee with salary > 3000: 3
 */