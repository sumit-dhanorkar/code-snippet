package annotation;

import java.util.ArrayList;
import java.util.List;

public class Log {
    @SafeVarargs
    public static void printLogValues(List<Integer>... logNumbers){
        Object[] ObjectList = logNumbers;
        List<String > stringList = new ArrayList<>();
        stringList.add("Log Value");
        ObjectList[0]= stringList;
    }


}
