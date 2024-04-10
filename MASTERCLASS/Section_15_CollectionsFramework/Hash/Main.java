package MASTERCLASS.Section_15_CollectionsFramework.Hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = String.join("l", "He", "lo");
        String d = "He".concat("llo");
        String e = "hello";

        List<String> hellos = Arrays.asList(a, b, c ,d, e);

        hellos.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        Set<String> mySet = new HashSet<>(hellos);
        System.out.println(mySet);
        System.out.println(mySet.size());
    }
}
