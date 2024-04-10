package COLLECTION_FRAMEWORK.SetInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> hs = new LinkedHashSet<>();
//        Set<Integer> hs1 = new HashSet<>();
        hs.add(32);
        hs.add(2);
        hs.add(54);
        hs.add(65);
        hs.add(1);
        System.out.println(hs);

        hs.remove(54);
        System.out.println(hs);

        System.out.println(hs.contains(2));
        System.out.println(hs.isEmpty());
    }
}
