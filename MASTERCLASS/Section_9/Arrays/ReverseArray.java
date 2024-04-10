package MASTERCLASS.Section_9.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr);
        reverse(arr);
        printArray(arr);
    }
    public static void reverse(int[] arr) {
        for(int i=0; i<arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
    public static void printArray(int[] arr) {
        System.out.println("-".repeat(10)+"Array Elements"+"-".repeat(10));
        for(int i=0; i<arr.length; i++) {
            System.out.println("Array at index ["+i+"] = "+arr[i]);
        }
    }
}
