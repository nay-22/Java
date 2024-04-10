package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.*;

public class Ex26SortHashMapByValue {
    public static void main(String[] args) {
        Map<Integer,String> stu = new HashMap<>();
        stu.put(5,"Guava");
        stu.put(3,"Banana");
        stu.put(2,"Apple");
        stu.put(4,"Pineapple");
        stu.put(6,"Pomegranate");
        stu.put(7,"DragonFruit");
        stu.put(9,"Litchi");
        stu.put(11,"Orange");
        stu.put(19,"Grapes");
        stu.put(12,"Cranberry");
        stu.put(1500,"Raspberry");
        stu.put(16,"Strawberry");
        stu.put(18,"Blueberry");
        stu.put(31,"Lemon");
        stu.put(121,"Lime");
        stu.put(198,"Avocado");

        System.out.println("HashMap:");
        System.out.println(stu);

        List<String> values = new LinkedList<>(stu.values());
        Map<Integer,String> sortedMap = new LinkedHashMap<>();

//        values.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        Collections.sort(values);

        for(String str : values) {
            for(Map.Entry<Integer,String> entry : stu.entrySet()) {
                if(entry.getValue().equals(str)) {
                    sortedMap.put(entry.getKey(),str);
                }
            }
        }

        System.out.println("Sorted HashMap:");
        System.out.println(sortedMap);

    }
}
