package MASTERCLASS.Section_12.Comparison;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class TestComparator {
    private static final Comparator<Student> studentGPAComparator = new StudentGPAComparator();

    public static void main(String[] args) {
        String[] fruit = {"apple", "banana","pear", "BANANA", "Dragon Fruit"};
        String banana = "banana";

        for (String f : fruit) {
            int val = banana.compareTo(f);
            System.out.println("compareTo " + f + " = " + val);
        }

        Student tim = new Student("Jimbei");
        Student[] students = {
                new Student("Zoro"),
                new Student("Luffy"),
                new Student("Chopper"),
                new Student("Robin"),
                new Student("Brooks")
        };

        System.out.println("Unsorted:\n\t" + Arrays.toString(students));
        Arrays.sort(students);
        System.out.println("Sorting (ASC) by ID using Comparable:\n\t" + Arrays.toString(students));
        Arrays.sort(students, studentGPAComparator);
        System.out.println("Sorting (ASC) by GPA using Comparator:\n\t" + Arrays.toString(students));
        Arrays.sort(students, studentGPAComparator.reversed());
        System.out.println("Sorting (DESC) by GPA using Comparator:\n\t" + Arrays.toString(students));
    }
}

class StudentGPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
    }
}

class Student implements Comparable<Student> {

    private static int LAST_ID = 0;
    private static final Random random = new Random();
    protected final String name;
    private final int id;
    protected double gpa;

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

    @Override
    public int compareTo(Student o) {
//        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
        return Integer.compare(id, o.id);
    }
}

