package Step_1.Step_1_6;

import java.util.HashMap;
import java.util.Map;

public class CountOccurance {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = {10,5,10,15,10,5};
        for (int num : arr) {
            if (!map.containsKey(num)) map.put(num, 1);
            else map.put(num, map.get(num) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " occured " + entry.getValue() + " times");
        }
    }
}
