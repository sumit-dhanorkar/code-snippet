package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Implementing compareTo() for natural order (ascending order by age)
    @Override
    public int compareTo(Person other) {
        return this.age - other.age; // Ascending order
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        Collections.sort(people); // Sort using Comparable (ascending by age)
        
        System.out.println("Sorted by age (ascending, using Comparable):");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
