package MASTERCLASS.Section_14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    record Person(String firstName, String lastName){
        @Override
        public String toString() {
            return lastName + " " + firstName;
        }
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Person("Luffy", "Monkey D."),
                new Person("Zoro", "Roronoa"),
                new Person("Dragon", "Monkey D."),
                new Person("Sanji", "Vinsmoke"),
                new Person("Ace", "Portgas D."),
                new Person("Rogers", "Gold D.")
        ));

        System.out.println(people);

//        people.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.lastName.compareTo(o2.lastName);
//            }
//        });
        people.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName));
        System.out.println(people);

//        Compare firstnames if last names match (EnhancedComparator) Can't use Lambda here
        interface EnhancedComparator<T> extends Comparator<T> {
            int secondLevel(T o1, T o2);
        }
        var comparatorMixed = new EnhancedComparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName().compareTo(o2.lastName());
                return (result==0?secondLevel(o1,o2):result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.firstName);
            }
        };
        people.sort(comparatorMixed);
        System.out.println(people);
    }
}
