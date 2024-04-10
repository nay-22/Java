package MASTERCLASS.Section_13.StaticNestedClass;

import MASTERCLASS.Section_13.StaticNestedClass.domain.Employee;
import MASTERCLASS.Section_13.StaticNestedClass.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
            new Employee(1001, "Ralph", 2015),
            new Employee(1005, "Carole", 2021),
            new Employee(1022, "Tim", 2013),
            new Employee(1045, "Jim", 2020),
            new Employee(1067, "Laura", 2018)
        ));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);
        System.out.println("\nSorted By ==> yearSorted");
        employees.sort(new Employee.EmployeeComparator<>("yearStarted"));
        System.out.println(employees);
        System.out.println("\nSorted By ==> name");
        employees.sort(new Employee.EmployeeComparator<>("name"));
        System.out.println(employees);
        System.out.println("\nSorted By ==> empId");
        employees.sort(new Employee.EmployeeComparator<>("empId"));
        System.out.println(employees);

        System.out.println("\n" + "-".repeat(30));

        System.out.println("\nReverse Sorted By ==> yearSorted");
        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());
        System.out.println(employees);
        System.out.println("\nReverse Sorted By ==> name");
        employees.sort(new Employee.EmployeeComparator<>("name").reversed());
        System.out.println(employees);
        System.out.println("\nReverse Sorted By ==> empId");
        employees.sort(new Employee.EmployeeComparator<>("empId").reversed());
        System.out.println(employees);

        System.out.println("\n---------------------Store Members--------------------");
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg", 2019, "Target"),
                new StoreEmployee(10005, "Tom", 2014, "Walmart"),
                new StoreEmployee(10045, "Joe", 2021, "Reliance"),
                new StoreEmployee(10098, "Zed", 2015, "Macy's"),
                new StoreEmployee(11015, "Ray", 2017, "Target")
        ));

//        INNER CLASS
        var comparator = new StoreEmployee().new StoreComparator<>();
        System.out.println(storeEmployees);
    }
}
