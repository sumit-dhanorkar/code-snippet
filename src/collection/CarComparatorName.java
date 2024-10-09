package collection;

import java.util.Comparator;

public class CarComparatorName implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.carName.compareTo(o1.carName);
    }
}
