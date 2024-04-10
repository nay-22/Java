package COLLECTION_FRAMEWORK.Other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(32);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Min element: "+ Collections.min(list));
        System.out.println("Min element: "+ Collections.max(list));
        System.out.println("Frequency: "+ Collections.frequency(list,30));
    }
}
