package COLLECTION_FRAMEWORK.Top30InterviewPrograms.Comparator;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private int rollNo;

    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getRollNo() {
        return rollNo;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                '}'+"\n";
    }

    public static void main(String[] args) {
        List<Student> stu = new ArrayList<>();
        stu.add(new Student("Nay",21,22));
        stu.add(new Student("Jay",12,14));
        stu.add(new Student("May",17,54));

        System.out.println("Before Sorting");
        System.out.println(stu);

        stu.sort(new AgeComparator());

        System.out.println("Before Sorting");
        System.out.println(stu);
    }
}
