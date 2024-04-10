package DSA.scratch;

import java.util.HashMap;
import java.util.Map;

public class majority {
    public static int getMajority(int[] arr) {
        int f = arr.length/2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            if (map.containsKey(ele)) map.put(ele, map.get(ele) + 1);
            else map.put(ele, 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > f) return key;
        }
        return -1;
    }

    public static int mooresVoting(int[] arr) {
        int c = 0, ele = 0;
        for ( int i = 0; i < arr.length; i++) {
            if (c == 0) ele = arr[i];
            else if (ele == arr[i]) c++;
            else c--;
        }
        return ele;
    }
    public static void main(String[] args) {
        int[] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
//        int ele = getMajority(arr);
        int ele = mooresVoting(arr);
        System.out.println("Majority Element = " + ele);
    }
}
