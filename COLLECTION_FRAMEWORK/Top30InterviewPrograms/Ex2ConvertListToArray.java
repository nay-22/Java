package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex2ConvertListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

//Method 1
//        int[] arr = new int[list.size()];
//        for(int i=0; i<list.size(); i++) {
//            arr[i] = list.get(i);
//        }
//        System.out.println(Arrays.toString(arr));

//Method 2
//        Integer[] numArray = list.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(numArray));

//Method 3
        Integer[] numArray = Arrays.copyOf(list.toArray(), list.size(), Integer[].class);
        System.out.println(Arrays.toString(numArray));
    }
}
