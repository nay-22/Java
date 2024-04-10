package MASTERCLASS.Section_13.ChallengeLocalAnonymous;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Luffy", "Monkey D.", 2001),
                new Employee("Zoro", "Roronoa", 2002),
                new Employee("Sanji", "Vinsmoke", 2004),
                new Employee("Rogers", "Gold D.", 1985),
                new Employee("Big", "Mom", 1995)
        ));
        processEmployees(employees);
    }

    public static void processEmployees(List<Employee> l) {
        int currentYear = LocalDate.now().getYear();
        class localClass {
            private final String fullName;
            private final int yearsWorked;

            public localClass(Employee containedEmployee) {
                fullName = String.join(" ", containedEmployee.lastName(), containedEmployee.firstName());
                yearsWorked = currentYear - containedEmployee.hireDate();
            }

            @Override
            public String toString() {
                return "\n%s has been working for %d years".formatted(fullName, yearsWorked);
            }
        }
//        PRINT list in the order it is created
        List<localClass>  list = new ArrayList<>();
        for (Employee e : l) {
            list.add(new localClass(e));
        }
        System.out.println(list);

//        PRINT list in ascending order of years worked using anonymous class
        list.sort(new Comparator<localClass>() {
            @Override
            public int compare(localClass o1, localClass o2) {
                return o1.yearsWorked - o2.yearsWorked;
            }
        });
//        list.sort((o1, o2) -> o1.yearsWorked - o2.yearsWorked); //Lambda Function
        System.out.println(list);

//        PRINT list in descending order of years worked using anonymous class
        list.sort(new Comparator<localClass>() {
            @Override
            public int compare(localClass o1, localClass o2) {
                return o1.yearsWorked - o2.yearsWorked;
            }
        }.reversed());


        System.out.println(list);
    }
}
