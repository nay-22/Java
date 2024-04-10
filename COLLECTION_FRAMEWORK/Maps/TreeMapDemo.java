package COLLECTION_FRAMEWORK.Maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);

        for(Map.Entry<String,Integer> e : numbers.entrySet()) {
//            System.out.println(e.getKey()+": "+e.getValue());
            System.out.printf("%5s: %d\n",e.getKey(),e.getValue());
        }

        System.out.println(numbers);
//        numbers.remove("One");

//        System.out.println(numbers);
    }
}
