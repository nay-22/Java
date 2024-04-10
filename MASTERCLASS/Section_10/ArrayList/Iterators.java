package MASTERCLASS.Section_10.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C", "B", "D", "X", "B"));
        System.out.println(list);
        var iterator = list.listIterator();
        while(iterator.hasNext()) {
            if (iterator.next().equals("B")) {
                iterator.set("Y");
            }
        }
        System.out.println(list);
    }
}
