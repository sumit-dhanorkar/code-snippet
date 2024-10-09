package operator;

import annotation.ChildClass;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ParentClass obj=new ParentClass();
        System.out.println(obj instanceof ParentClass);
        System.out.println(obj instanceof ChildClass1);

        ChildClass1 childObj=new ChildClass1();
        System.out.println(childObj instanceof ChildClass1);


        String val="hello";
        System.out.println(val instanceof String);


        Object unknownObj=new Random();
//        System.out.println(unknownObj instanceof RandomClass);

    }
}
