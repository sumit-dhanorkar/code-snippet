package collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashCodeAndEqualsTest {
    public static void main(String[] args) {
        PersonS person1 = new PersonS("Alice", 30);
        PersonS person2 = new PersonS("Alice", 30);
        PersonS person3 = new PersonS("Bob", 25);


        Set<PersonS> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2); // person2 is equal to person1 (same name and age)
        personSet.add(person3);

        // Set will contain only two unique persons, because person1 and person2 are equal
        System.out.println("Person set: " + personSet);
    }

}
