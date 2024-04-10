package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Ex8ConvertArrayToList {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};

//        Method 1 - Arrays.asLIst(arr)
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

//        Method 2 - Collections.addAll(list, arr)
//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, arr);

//        Method 3 - add() using loop
//        ArrayList<Integer> list = new ArrayList<>();
//        for (Integer integer : arr) {
//            list.add(integer);
//        }
        System.out.println(list);
        list.add(7);
        list.add(8);
        System.out.println(list);
    }
}
