package DSA.DATA_STRUCTURES.REVISE_V2.SEARCHING;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 11, 12, 13, 15, 16, 22, 25, 32, 45, 64, 66, 81, 99};
        int key = 82;
        int index = binarySearch(arr, 0, arr.length - 1, key);
        if (index != -1) {
            System.out.println("Key found at index = " + index + ".");
            return;
        }
        System.out.println("Key not found.");
    }
    public static int binarySearch(int[] arr, int left, int right, int key) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (key <= arr[mid]) {
            return binarySearch(arr, left, mid - 1, key);
        }
        return binarySearch(arr, mid + 1, right, key);
    }
}
