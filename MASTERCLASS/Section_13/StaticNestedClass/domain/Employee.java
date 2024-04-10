package MASTERCLASS.Section_13.StaticNestedClass.domain;

import java.util.Comparator;

public class Employee {
    public static class EmployeeComparator <T extends Employee> implements Comparator<Employee> {
        private String sortType;

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            return switch (sortType) {
                case "yearStarted" -> o1.yearStarted - o2.yearStarted;
                case "name" -> o1.name.compareTo(o2.name);
                default -> o1.empId - o2.empId;
            };
        }
    }

    private int empId;
    private String name;
    private int yearStarted;

    public Employee() {

    }

    public Employee(int empId, String name, int yearStarted) {
        this.empId = empId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\n  %d %-8s %d".formatted(empId, name, yearStarted);
    }
}
