package MASTERCLASS.Section_14.At_25_12_23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    record Person(String firstName, String lastName) {
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Person("Zoro", "Roronoa"),
                new Person("Sanji", "Vinsmoke"),
                new Person("Luffy", "D. Monkey"),
                new Person("Eustass", "Kidd"),
                new Person("Trafalgar", "D. Waterlaw")
        ));
        var personComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        };

        people.sort(personComparator);

        people.sort((o1, o2) -> o1.firstName().compareTo(o2.firstName()));
        System.out.println(people);


    }
}
