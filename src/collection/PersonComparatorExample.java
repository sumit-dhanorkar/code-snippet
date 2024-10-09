package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PersonComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sort using a custom Comparator (descending order by age)
        Comparator<Person> ageDescendingComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p2.age - p1.age; // Descending order
            }
        };

        Collections.sort(people, ageDescendingComparator); // Sort using Comparator
        
        System.out.println("Sorted by age (descending, using Comparator):");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}

