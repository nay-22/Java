package MASTERCLASS.Section_13.At_25_12_23;

import java.util.Comparator;

public class Employee {

    public static class EmployeeComparator <T extends Employee> implements Comparator<Employee> {
        private final String sortType;

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        public EmployeeComparator() {
            this("name");
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            return switch (sortType) {
                case "id" -> o1.id - o2.id;
                case "yearStarted" -> o1.yearStarted - o2.yearStarted;
                default -> o1.name.compareTo(o2.name);
            };
        }
    }

    private int id;
    private String name;
    private int yearStarted;

    public Employee() {}

    public Employee(int id, String name, int yearStarted) {
        this.id = id;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d - %d - %s".formatted(id, yearStarted, name);
    }
}
