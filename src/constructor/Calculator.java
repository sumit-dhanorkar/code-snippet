package constructor;

class Calculator {

    String name;
    int id;

    Calculator(){
        this("sumit");
    }


    Calculator(String name){
        this("sumit",123);
    }


    Calculator(String name,int empId){
        this.name=name;
        this.id=empId;
    }

}


class Person{

    int empId;
    Person(int empId){
        this.empId=empId;
        System.out.println("this is person class : no args");
    }
}

class Manager extends Person{

    int age;

    Manager(int empId, int age){
        super(empId); //parent takes initiatlizaion
        this.age=age;
        System.out.println("this is child class : no args");
    }
}


class Test{
    public static void main(String[] args) {
        //this will call the constructor of the manager class.
        Manager manager=new Manager(12,34);
    }
}


