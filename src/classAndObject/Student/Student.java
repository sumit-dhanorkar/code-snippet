package classAndObject.Student;

public class Student {
    //data variables
    int age;
    String address;

    //data methods or functions
    public void updateAddress(){
//        ...
    }

    public int getAge(){
//        ....
        return 0;
    }

}



//interface  Car{
//    public void pressBreak();
//}
//
//
//class Audi implements  Car{
//
//    @Override
//    public void pressBreak() {
//        //internal
//    }
//}

class Dog{
    String color;
    String bread;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
}


abstract class Person{
    public final void profession(){
        System.out.println("i am person");
    }

    //this has only declaration and implementation responsibility is of
    //child class
    public abstract  int print();
}


class Doctor extends  Person{

    @Override
    public int print() {
        return 0;
    }
}

