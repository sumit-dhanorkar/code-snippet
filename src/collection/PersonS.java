package collection;

import java.util.Objects;

class PersonS {
    private String name;
    private int age;

    public PersonS(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonS person = (PersonS) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    // Override hashCode method
    //comment to check second contract of hashcode and equals
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    // To make printing easier
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
