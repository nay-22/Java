package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex22ConvertLinkedListToArrayList {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(6);
        linkedList.add(8);
        linkedList.add(2);

        List<Integer> arrayList = new ArrayList<>(linkedList);

        System.out.println(linkedList);

        System.out.println(arrayList);
    }
}
