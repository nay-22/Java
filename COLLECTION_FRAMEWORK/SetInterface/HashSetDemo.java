package COLLECTION_FRAMEWORK.SetInterface;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
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
