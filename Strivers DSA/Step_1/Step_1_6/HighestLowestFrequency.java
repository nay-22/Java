package Step_1.Step_1_6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HighestLowestFrequency {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        // int[] arr = {10,5,10,15,10,5};
        int[] arr = {2,2,3,4,4,2};
        for (int num : arr) {
            if (!map.containsKey(num)) map.put(num, 1);
            else map.put(num, map.get(num) + 1);
        }
        int[] highest = {0, Integer.MIN_VALUE};
        int[] lowest = {0, Integer.MAX_VALUE};
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < lowest[1]) {
                lowest[0] = entry.getKey();
                lowest[1] = entry.getValue();
            }
            if (entry.getValue() > highest[1]) {
                highest[0] = entry.getKey();
                highest[1] = entry.getValue();
            }
        }
        System.out.println("Lowest : " + Arrays.toString(lowest));
        System.out.println("Highest : " + Arrays.toString(highest));
    }
}
