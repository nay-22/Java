package DSA.scratch;

import java.util.HashSet;
import java.util.Set;

public class pairsum {
    public static int countPair(int[] arr, int k) {
        int i = 0;
        int j = arr.length - 1;
        int count = 0;
        while(i < j) {
            int sum = arr[i] + arr[j];
            if (sum == k) {
                i++;
                j--;
                count++;
            } else if (sum < k) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }

    public static int countPairHash(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int val : arr) {
            int comp = k - val;
            if (set.contains(comp)) count++;
            else set.add(val);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 8;
        System.out.println("Sum Pairs = " + countPair(arr, k));
        System.out.println("Sum Pairs (HashSet) = " + countPairHash(arr, k));
    }
}
