import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        rev(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
    private static void rev(int[] arr, int pos1, int pos2) {
        if (pos1 < pos2) {
            int t = arr[pos1];
            arr[pos1] = arr[pos2];
            arr[pos2] = t;
            pos1++;
            pos2--;
            rev(arr, pos1, pos2);
        }
    }
}
