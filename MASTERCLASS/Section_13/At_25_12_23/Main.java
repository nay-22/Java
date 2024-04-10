package MASTERCLASS.Section_13.At_25_12_23;

import Challenge_1.Store;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(1, "Luffy", 2010),
                new Employee(2, "Zoro", 2007),
                new Employee(3, "Sanji", 2008),
                new Employee(4, "Nami", 2009),
                new Employee(5, "Robin", 2000),
                new Employee(6, "Chopper", 2012),
                new Employee(7, "Franky", 2014)
        ));
//        var comparator = new EmployeeComparator<Employee>();
//        employees.sort(comparator);
//        employees.sort(new Employee.EmployeeComparator<>("id"));
//        for (Employee e : employees) {
//            System.out.println(e);
//        }

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(100, "Shanks", 1985, "Aka gami"),
                new StoreEmployee(101, "Mihawk", 1982, "Taka no mei"),
                new StoreEmployee(102, "Kaido", 1975, "Hyakjo Kaizoku"),
                new StoreEmployee(103, "Big Mom", 1970, "Big Mom Kaizoku")
        ));

//        var emp = new StoreEmployee();
//        var storeComparator = new StoreEmployee().new StoreComparator<>(); // IMPORTANT
//        storeEmployees.sort(storeComparator);

//        for (StoreEmployee se : storeEmployees) {
//            System.out.println(se);
//        }

        class NameSort<T> implements Comparator<StoreEmployee> {

            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }

        var c0 = new EmployeeComparator<StoreEmployee>(); // General Way
        var c1 = new Employee.EmployeeComparator<>(); // static nested class
        var c2 = new StoreEmployee().new StoreComparator<>(); // inner class
        var c3 = new NameSort<>(); // local class
        var c4 = new Comparator<StoreEmployee>() { // anonymous class
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };


        sortIt(storeEmployees, c0);
        sortIt(storeEmployees, c1);
        sortIt(storeEmployees, c2);
        sortIt(storeEmployees, c3);
        sortIt(storeEmployees, c4);
        sortIt(storeEmployees, new Comparator<StoreEmployee>() { // anonymous class as method argument
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        // Lambda expression for the anonymous class
        sortIt(storeEmployees, (o1, o2) -> o1.getName().compareTo(o2.getName()));

    }

    public static <T> void sortIt(List<T> list, Comparator<? super T> comparator) {
        System.out.println("Sorting with Comparator: " + comparator.toString());
        list.sort(comparator);
        for (var element : list) {
            System.out.println(element);
        }
    }
}
