package MASTERCLASS.Section_11.Comparing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for (Integer i: others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five, (val==0?"==":(val<0)?"<":">"), i, val);
        }

        String banana = "banana";
        String[] fruit = {"apple", "banana", "mango", "pear", "papaya", "BANANA"};

        for(String str: fruit) {
            int val = banana.compareTo(str);
            System.out.printf("%s %s %s: compareTo=%d%n", banana, (val==0?"==":(val<0)?"<":">"), str, val);
        }

        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        Student[] students = {
                new Student("Ajit"),
                new Student("Bane"),
                new Student("Zach"),
//                new Student("Roy"),
//                new Student("Priya"),
//                new Student("Nate")
        };
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        Student tim = new Student("Tim");
        Student mary = new Student("Mary");
        System.out.println(tim.compareTo(mary));

        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());
        System.out.println(Arrays.toString(students));
    }
}

class StudentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
    }
}

class Student implements Comparable<Student> {
    String name;
    private static int LAST_ID = 1000;
    private static final Random random = new Random();
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
        return Integer.valueOf(id).compareTo(o.id);
//        return Integer.compare(id, o.id);
    }
}
