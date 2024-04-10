package Step_3.Step_3_1;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {8, 5, 89, 34, 77, 12, 1, 73, 52, 69};
        System.out.println(getMax(arr));
    }

    private static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }
}
