package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex18SortArrayListUsingComparable {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(1);
        list.add(7);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);


    }
}
