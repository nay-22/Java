package MASTERCLASS.Section_7.TheObjectClass;

public class Main extends Object{
    public static void main(String[] args) {
        Student max = new Student("Max", 20);
        System.out.println("\n"+max.toString());

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 20, "James");
        System.out.println("\n"+jimmy);
    }
}

class Student {
    private String name;
    private int age;


    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName+"'s kid, "+super.toString();
    }
}