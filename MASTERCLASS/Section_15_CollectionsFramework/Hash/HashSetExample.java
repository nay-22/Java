package MASTERCLASS.Section_15_CollectionsFramework.Hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

//        INSERT - set.add()
        set.add(3);
        set.add(5);
        set.add(2);
        set.add(7);
        set.add(9);
        set.add(1);
        System.out.println(set);

//        SEARCH - set.contains()
        if (set.contains(5)) System.out.println("Set contains 5");
        if (!set.contains(99)) System.out.println("Set does not contain 99");

//        DELETE
        boolean isRemoved = set.remove(5);
        System.out.println("isRemoved = " + isRemoved);

//        ITERATION - while() with iterator or enhanced for()
        System.out.println("-".repeat(10) + "Iterator" + "-".repeat(10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("-".repeat(10) + "Enhanced for()" + "-".repeat(10));
        for (Integer num : set) {
            System.out.println(num);
        }

    }
}
