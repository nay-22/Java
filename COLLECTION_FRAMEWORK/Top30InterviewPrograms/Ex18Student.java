package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class Ex18Student implements Comparable<Ex18Student> {
    private String name;
    private int rollno;
    private  int age;

    public Ex18Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getRollno() {
        return rollno;
    }
    public int getAge() {
        return age;
    }

//    Comparable Interface method
    @Override
    public int compareTo(Ex18Student o) {
        int compareAge = o.getAge();
        return this.age - compareAge;
    }

    @Override
    public String toString() {
        return "Ex18Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Ex18Student> stu = new ArrayList<>();
        stu.add(new Ex18Student(12,"Robin",28));
        stu.add(new Ex18Student(10,"Luffy",19));
        stu.add(new Ex18Student(11,"Zoro",25));


        System.out.println("Before Sorting: ");
        for(Ex18Student s : stu) {
            System.out.println(s);
        }

        Collections.sort(stu);

        System.out.println("After Sorting: ");
        for(Ex18Student s : stu) {
            System.out.println(s);
        }
    }


}
