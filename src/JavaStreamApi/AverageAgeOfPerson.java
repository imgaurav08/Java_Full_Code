package JavaStreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AverageAgeOfPerson {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Gaurav",25),
                new Person("Nishant", 30),
                new Person("Avi", 27)
        );

       Double age= personList.stream()
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();
        System.out.println(age);

        Optional<Person> max = personList.stream().max(Comparator.comparingInt(Person::getAge));
        max.ifPresent(person ->
                System.out.println("Oldest person: " + person.getName() + " with age " + person.getAge())
        );

    }
}
