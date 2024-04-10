package DSA.scratch;

import java.util.*;

public class QuadSum {
    public static List<List<Integer>> quadSum(Integer[] arr, int target) {
        List<List<Integer>> quads = new ArrayList<>();
        List<Integer> list = Arrays.asList(arr);
        System.out.println(Arrays.toString(arr));
        Collections.sort(list);
        System.out.println(list);
        return quads;
    }
    public static void main(String[] args) {
        Integer[] arr = {1,2,-3,4,-2,-1,3};
        quadSum(arr, 3);
    }
}
