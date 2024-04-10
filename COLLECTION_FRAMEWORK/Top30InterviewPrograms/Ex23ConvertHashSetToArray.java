package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex23ConvertHashSetToArray {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(8);
        System.out.println(hashSet);

        int[] arr = new int[hashSet.size()];
        int i = 0;
        for(int ele: hashSet) {
            arr[i++] = ele;
        }
        hashSet.clear();
        System.out.println(hashSet);
        System.out.println(Arrays.toString(arr));
    }
}
