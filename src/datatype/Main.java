package datatype;

public class Main {
    public static void main(String[] args) {
        String s1="hello";
        //here whether literal hello is present in SCP are checked if present then s2 will point to same object to which s1 is pointing
        String s2 ="hello";

        System.out.println(s1==s2); //cheking whether both pointing to same memory so this will return true.

        System.out.println(s1.equals(s2)); //this is just checking values

        //now
        String s3 = new String("hello");
        System.out.println(s1.equals(s3));//checks literal value

        System.out.println(s1==s3); //checks reference

        /*
        output:
            true
            true
            true
            false

         */

    }
}
//
//
//public interface  Person{
//    public String profession();
//}
//
//
//class Teacher implements  Person{
//
//
//    @Override
//    public String profession() {
//        return "Teacher";
//    }
//}
//
//
//class Enginner implements Person{
//    @Override
//    public String profession() {
//        return "Enginner";
//    }
//}


//public class Test1{
//    public static void main(String[] args) {
//        Person softwareEnginner= new Enginner();
//
//        Person teacher = new Teacher();
//
//        Teacher teacher1=new Teacher();
//
//        Enginner SoftwareEnginner1=new Enginner();
//    }
//}