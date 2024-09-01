package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DBConnection {


    private DBConnection() {
    }

    private static class DBConnectionHelper{
        private static  final  DBConnection    INSTANCE_OBJECT = new DBConnection();
    }


    public static  DBConnection getInstance(){
        return DBConnectionHelper.INSTANCE_OBJECT;
    }

}


/*
    Thread1  calling getInstance() lock/unlock
    Thread2  calling getInstance() lock/unlock
    Thread2  calling getInstance() lock/unlock
    .
    .
    .
    .
    Thread100 calling getInstance() lock/unlock
 */

final class MyImmutableClass{

    private  final String name;
    private final List<Object> petNameList;

    public MyImmutableClass(String name, List<Object> petNameList) {
        this.name = name;
        this.petNameList = petNameList;
    }

    public String getName() {
        return name;
    }

    public List<Object> getPetNameList() {
        /*

            this is required because making the list final
            means you can not now point to new list, but still can add, delete
            values in it so that's why we send the copy of it.

         */
        return new ArrayList<>(petNameList);
    }
}



class Main{
    public static void main(String[] args) {
        List<Object> petNames =new ArrayList<>();
        petNames.add("sam");
        petNames.add("sun");

        MyImmutableClass obj = new MyImmutableClass("myName", petNames);
        obj.getPetNameList().add("hellow");

        System.out.println(obj.getPetNameList());
    }
}










