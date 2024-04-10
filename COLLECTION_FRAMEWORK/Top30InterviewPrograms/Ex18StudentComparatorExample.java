package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.*;

public class Ex18StudentComparatorExample {
    private String name;
    private int rollno;
    private  int age;

    public Ex18StudentComparatorExample(int rollno, String name, int age) {
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
    public String toString() {
        return "Ex19Ex20Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", age=" + age +
                '}';
    }

    /*Comparator for sorting the list by name*/
    public static Comparator<Ex18StudentComparatorExample> StuNameComparator = new Comparator<Ex18StudentComparatorExample>() {
        public int compare(Ex18StudentComparatorExample s1, Ex18StudentComparatorExample s2) {
            String Ex20StudentName1 = s1.getName().toUpperCase();
            String Ex20StudentName2 = s2.getName().toUpperCase();
            //ascending order
            return Ex20StudentName1.compareTo(Ex20StudentName2);
            //descending order
            //return Ex20StudentName2.compareTo(Ex20StudentName1);
        }};

    /*Comparator for sorting the list by roll no*/
    public static Comparator<Ex18StudentComparatorExample> StuRollno = new Comparator<Ex18StudentComparatorExample>() {
        public int compare(Ex18StudentComparatorExample s1, Ex18StudentComparatorExample s2) {
            int rollno1 = s1.getRollno();
            int rollno2 = s2.getRollno();
            /*For ascending order*/
            return rollno1-rollno2;
            /*For descending order*/
            //rollno2-rollno1;
        }};

    public static void main(String[] args) {
        ArrayList<Ex18StudentComparatorExample> stu = new ArrayList<>();
        stu.add(new Ex18StudentComparatorExample(12,"Robin",28));
        stu.add(new Ex18StudentComparatorExample(10,"Luffy",19));
        stu.add(new Ex18StudentComparatorExample(11,"Zoro",25));

        System.out.println("Before Sorting: ");
        for(Ex18StudentComparatorExample s : stu) {
            System.out.println(s);
        }
        System.out.println();
//        Collections.sort(stu); //Using Comparable
//        stu.sort(Ex18StudentComparatorExample.StuNameComparator);//Using Comparator
        System.out.println("After Sorting by name: ");
        for(Ex18StudentComparatorExample s : stu) {
            System.out.println(s);
        }
        System.out.println();
        stu.sort(Ex18StudentComparatorExample.StuRollno);
        System.out.println("After Sorting by roll no: ");
        for(Ex18StudentComparatorExample s : stu) {
            System.out.println(s);
        }
    }

}
