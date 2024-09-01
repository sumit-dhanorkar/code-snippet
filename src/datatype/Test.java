package datatype;
class Employee{

    int empId;
    public Employee(int val) {
        this.empId=val;
    }

}

class Manager extends  Employee{

    public Manager(int val) {
        super(val);
    }
}

/*
    Sum without casting: 128
    Type of sum without casting: Integer
    Sum with casting to byte: -128
    Type of sum with casting: Byte
    Value of x: 5.7
    Value of y after casting: 5
    Large value: 130
    Small value after casting: -126
 */


/*
              8 4 2 1
              -------

       +3 ->  0 0 1 1

       -3 ->
              0 0 1 1  +3

              1 1 0 0  1st complement
             +      1  2nd complement
             --------
             1 1 0 1  -> -3


*/


class Calculation{

    //...variable will get the multiple args as list
    public  int sum(int ...varible){
        int output=0;
        for (int var:varible) {
            output += var;
        }
        return output;
    }


    //only one method can be present in the argument means we can not have like this
//    public int sum(int ...vars1, int ...vars2){
//
//    }
//
//    //varible args can not be the last argument in the list so if we do like this it is wrong
//    public int sum(int ...vars, int a){
//
//    }

    //this is allowed
    public  int sum(int a, int ...vars){

        return 0;
    }


}

public class Test {
    public static void main(String[] args) {
        Calculation calculation=new Calculation();
//        calculation.sum(1,2);
//        calculation.sum(1,2,3);
//        calculation.sum(1,2,3,4,4,5);
//        calculation.sum(34,6,7,8,6,5,4,34,3,3,2);

    }

}


//
//class Peigon{
//    public void method1(){
//
//    }
//    public static void method(){
//
//    }
//}

//public class Main{
//    public static void main(String[] args) {
//        Peigon obj1=new Peigon();
//        Peigon obj2=new Peigon();
//
//        obj1.method1();
//        obj2.method1();
//    }
//}



interface Service{
    public void print();
}

class ServiceImpl implements  Service{
    @Override
    public void print() {

    }
}





