package DSA;

import java.util.*;

public class HASHING_PROBLEMS {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        displayMajorityElements(nums);

        Set<Integer> union = getUnion(new int[] { 7, 3, 9 }, new int[] { 6, 3, 9, 2, 9, 4 });
        System.out.println("Union:\n" + union);

        Set<Integer> intersection = getIntersection(new int[] { 7, 3, 9 }, new int[] { 6, 3, 9, 2, 9, 4 });
        System.out.println("Intersection:\n" + intersection);

        Map<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");
        displayItinerary(map);
        displayItineraryV2(map);
        System.out.println("\n");

        int[] arr = { 10, 2, -2, -20, 10 }; // ans = 3
        int k = -10;
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("No.of SubArrays with sum equal to " + k + " = " + subArray(arr, k));
    }

    public static void displayMajorityElements(int[] nums) {
        int f = nums.length / 3;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > f) {
                System.out.println("Frequency of " + key + " = " + map.get(key));
            }
        }
    }

    public static Set<Integer> getUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int e : arr1) {
            set.add(e);
        }
        for (int e : arr2) {
            set.add(e);
        }
        return set;
    }

    public static Set<Integer> getIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set_arr1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int num : arr1) {
            set_arr1.add(num);
        }
        for (int num : arr2) {
            if (set_arr1.contains(num)) {
                intersection.add(num);
                set_arr1.remove(num);
            }
        }
        return intersection;
    }

    // FIRST IMPLEMENTATION
    public static void displayItinerary(Map<String, String> map) {
        String start = "";
        String end = "";
        for (String key : map.keySet()) {
            if (!map.containsValue(key)) {
                start = key;
            }
        }
        for (Map.Entry<String, String> m : map.entrySet()) {
            if (!map.containsKey(m.getValue())) {
                end = m.getValue();
            }
        }
        System.out.println("Start => " + start);
        System.out.println("End => " + end);
        System.out.println("-------------Path--------------");
        System.out.print(start);
        printPath(start, end, map);
    }

    private static void printPath(String start, String end, Map<String, String> map) {
        if (map.get(start).equals(end)) {
            System.out.print(" -> " + end);
            return;
        }
        System.out.print(" -> " + map.get(start));
        printPath(map.get(start), end, map);
    }

    // SECOND IMPLEMENTATION (CONCISE)
    public static void displayItineraryV2(Map<String, String> map) {
        System.out.println("\n******* SECOND IMPLEMENTATION *******");
        String start = "";
        for (String key : map.keySet()) {
            if (!map.containsValue(key)) {
                start = key;
            }
        }
        while (map.containsKey(start)) {
            System.out.print(start + " -> ");
            start = map.get(start);
        }
        System.out.print(start);
    }

    // SubArray sum equal to K
    public static int subArray(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // empty subArray
        int ans = 0, sum = 0;
        for (int i : arr) {
            sum += i;
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return ans;
    }
}
