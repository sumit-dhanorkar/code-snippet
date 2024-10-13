package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        //add(int index, E element)
        list1.add(0,100);
        list1.add(1,200);
        list1.add(2,300);

        /*
            List: [ 100 200 300 ]
         */

        //addAll(int index, Collection c)
        List<Integer> list2=new ArrayList<>();
        list2.add(0,400);
        list2.add(1,500);
        list2.add(2,600);
        list1.addAll(2,list2);

        /*
            Output:
            [ 100 200 400 500 600 300 ]
         */

        //replaceAll(UnaryOperator op)
        /*
           if we see in List interface we have method called replaceAll
               default void replaceAll(UnaryOperator<E> operator) {
                Objects.requireNonNull(operator);
                final ListIterator<E> li = this.listIterator();
                while (li.hasNext()) {
                    li.set(operator.apply(li.next()));
                }

                where we have UnaryOperator which is nothing but functional interface
                @FunctionalInterface
                public interface UnaryOperator<T> extends Function<T, T> {
                    static <T> UnaryOperator<T> identity() {
                        return t -> t;
                    }
                }

                so in this replaceAll(UnaryOperator o) method as UnaryOperator is functional interface so we can use lambda expression so
                So in below we are passing the lambda expression that for each value
                of the list what it should do it if we see in replaceAll() method implementation
                we are iterating while(li.hasNext()) and will pass to the method of this functional interface.
                and what it method it is .apply() functional interface method and its implementation
                we have given is (Integer val)-> -1*val what it should do.

                so this replaceAll method will iterate over each item of the list and multiply it wih -1 .
         */
        list1.replaceAll((Integer val)-> -1*val);
        /*
            Output:
            After replaceAll
            [ -100 -200 -400 -500 -600 -300 ]

         */

        //sort(Comparator c) => sorts in increasing order
        list1.sort((Integer val1, Integer val2) -> val1-val2);
        /*
            Output:
            After sort
            [ -600 -500 -400 -300 -200 -100 ]

         */

        //get(int index)
        System.out.println("value present at index 2 is "+list1.get(2));
        /*
            Output:
            value present at index 2 is -400

         */

        //set(int index, Element e)
        list1.set(2, -4000);
        /*
            Output:
            after set method
            [ -600 -500 -4000 -300 -200 -100 ]
         */

        //remove(int index)
        list1.remove(2);
        /*
            Output
            After removing
            [ -600 -500 -300 -200 -100 ]
         */

        //indexOf(Object o) -> from first occurence if want from last occurence then use lasIndexOf()
        System.out.println("index of -200 Integer Object is "+list1.indexOf(-200));
        /*
            Output:
            index of -200 Integer Object is 3
         */

        ListIterator<Integer> listIterator=list1.listIterator();
        //traversing forward direction
        /*
            CurrentList : [ -600 -500 -300 -200 -100 ]
         */
        while(listIterator.hasNext()){
            int val=listIterator.next();
            System.out.println("traversing forward: "+val+ " nextIndex: "+listIterator.nextIndex()+" previousIndex: "+listIterator.previousIndex());
            if(val==-200){
                listIterator.add(-100);
            }
        }
        /*
            Output:
            traversing forward: -600 nextIndex: 1 previousIndex: 0
            traversing forward: -500 nextIndex: 2 previousIndex: 1
            traversing forward: -300 nextIndex: 3 previousIndex: 2
            traversing forward: -200 nextIndex: 4 previousIndex: 3
            traversing forward: -100 nextIndex: 6 previousIndex: 5

            after adding -100 in list will look like
            [ -600 -500 -300 -200 -100 -100 ]
         */

        //traversing backward
        /*
            Current List: [ -600 -500 -300 -200 -100 -100 ]
         */
        //need to provide the index in list iterator from where it has to start
        ListIterator<Integer> listIterator1=list1.listIterator(list1.size());
        while(listIterator1.hasPrevious()){
            int prevVal=listIterator1.previous();
            System.out.println("traversing backward: "+prevVal+" nextIndex: "+listIterator1.nextIndex()+" previousIndex: "+listIterator1.previousIndex());
            if(prevVal==-100){
                listIterator1.set(-50);
            }
        }
        /*
            Output:
            traversing backward: -100 nextIndex: 5 previousIndex: 4
            traversing backward: -100 nextIndex: 4 previousIndex: 3
            traversing backward: -200 nextIndex: 3 previousIndex: 2
            traversing backward: -300 nextIndex: 2 previousIndex: 1
            traversing backward: -500 nextIndex: 1 previousIndex: 0
            traversing backward: -600 nextIndex: 0 previousIndex: -1

            after setting -50 we will have list
            [ -600 -500 -300 -200 -50 -50 ]
         */

        /*
            Current List: [ -600 -500 -300 -200 -50 -50 ]
         */
        List<Integer> subList=list1.subList(1,4);
        System.out.print("SubList: [");
        subList.forEach((Integer val)-> System.out.print(" "+val));
        System.out.println(" ]");
        /*
            Output:
            SubList: [ -500 -300 -200 ]
         */

        subList.add(-900);
        System.out.println("after adding in sublist");
        System.out.print("[");
        list1.forEach((Integer val)-> System.out.print(" "+val));
        System.out.println(" ]");

        /*
            Output:
            after adding in sublist see list1 also changes
            [ -600 -500 -300 -200 -900 -50 -50 ]
         */
    }
}
