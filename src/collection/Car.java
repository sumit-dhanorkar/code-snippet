package collection;

public class Car implements Comparable<Car>{
    String carName;
    String carType;

    public Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    @Override
    public int compareTo(Car o) {
        return this.carType.compareTo(o.carType);
    }
}

