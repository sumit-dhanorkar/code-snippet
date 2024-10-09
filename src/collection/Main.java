package collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("SUV", "petrol"));
        carList.add(new Car("Sedan", "diesal"));
        carList.add(new Car("HatchBack", "CNG"));

        Collections.sort(carList);
        Car[] carArray = new Car[3];
        carArray[0]=new Car("SUV", "petrol");
        carArray[1]=new Car("Sedan", "diesel");
        carArray[2]=new Car("HatchBack", "CNG");


        Arrays.sort(carArray, ((Car obj1,Car obj2)->
                obj2.carType.compareTo(obj1.carType)));


        for(Car car : carArray){
            System.out.println(car.carName+".."+car.carType);
        }

        carList.forEach((Car obj)-> System.out.println(obj.carName+"..."+obj.carType));

    }
}

/*
    Sedan...diesel
    SUV...petrol
    HatchBack...CNG
 */
