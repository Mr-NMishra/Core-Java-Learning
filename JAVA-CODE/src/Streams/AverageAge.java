package Streams;

import java.util.Arrays;
import java.util.List;

public class AverageAge {
    /*
    Calcualte the average age of a list person objects using
     */
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        double  averageAge=persons.stream().mapToInt(Person::getAge).average().orElse(0);
        System.out.println("Average age :"+averageAge);
    }
}
class Person{
    int age;
    String name;

    public Person(String name,int age) {
        this.age = age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
