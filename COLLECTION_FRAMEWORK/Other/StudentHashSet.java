package COLLECTION_FRAMEWORK.Other;

import java.util.HashSet;
import java.util.Set;

public class StudentHashSet {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("Luffy",22));
        set.add(new Student("Zoro",21));
        set.add(new Student("Luffy",22));
//        set.add(new Student("Luffy",12));
        System.out.println(set);
    }
}
