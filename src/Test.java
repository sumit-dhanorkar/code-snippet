//import java.util.ArrayList;
//import java.util.List;
//
//public  class Test{
//    public static void main(String[] args) {
//        //anonymous class as here i dont want to create Audi class and implement pressBreak method
//        // so i created anonymous class and implementd method
//        Car audicarObj=new Car() {
//            @Override
//            public void pressBreak() {
//                System.out.println("audi specific break changes");
//            }
//        };
//        audicarObj.pressBreak();
//    }
//}
//
//
//
//
//
//
//public class ColorPrint<T> extends  Print<T>{
//
//}
//
//
//public class Pair<K,V>{
//    private K key;
//    private V value:
//
//    public void put(K key,V value){
//        this.key=key;
//        this.value=value;
//    }
//}
//
//
//
//
//
//class ParentClass{
//
//}
//
//interface Interface1{}
//interface Interface2{}
//
//
//
//public class Peigon extends  ParentClass implements  Interface1,Interface2{
//
//}
////                  concrete class    interface ..........
////class Print<T extends  ParentClass & Interface1 & Interface2>{
////    T value;
////
////    public T getPrintValue() {
////        return value;
////    }
////
////    public  void setPrintValue(T value){
////        this.value=value;
////    }
////}
//
//class Vehicle{
//
//}
//
//class Bus extends Vehicle{
//
//}
//
//class Car extends Vehicle{
//
//}
////
////class Print{
////
////    //wild card method
////    public  void computeList(List<? extends Number> source, List<? extends Number> destination ){
////        //so here all the child of Number will be accepted here
////    }
////
////    //generic type method
////    public <T extends Number> void computeList1(List<T> source,List<T> desination){
////
////    }
////}
//
//
//
//
//public  class Main{
//    public static void main(String[] args) {
//        List<Integer> wildCardSourceList=new ArrayList<>();
//        List<Float> wildCardDestinationList=new ArrayList<>();
//
//        Print printObj=new Print();
//        //this will works fo wildcard to pass different types
//        printObj.computeList(wildCardSourceList,wildCardDestinationList);
//
//        //but here need to pass only one type T for both source and destination
//        printObj.computeList1(wildCardSourceList,wildCardDestinationList);
//
//
//    }
//}
//
//
//class Print{                                             class Print{
//
//    public <T extends Bus> void setValue(T value){    =>    public void setValue(Bus value){
//        // do something                           /             /do something
//    }                                                       }
//}                                                         }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
