package MASTERCLASS.Section_9.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = getIntegers(7);
        printArray(arr);
        int[] arrSorted = sortIntegers(arr);
        printArray(arrSorted);
    }

    public static int[] getIntegers(int len) {
        Scanner in = new Scanner(System.in);
        System.out.println("-".repeat(10)+"Enter Array Values"+"-".repeat(10));
        int[] arr = new int[len];
        for(int i=0; i<len; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println("-".repeat(10)+"Array Elements"+"-".repeat(10));
        for(int i=0; i<arr.length; i++) {
            System.out.println("Array at index ["+i+"] = "+arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for (int j=i+1; j< arr.length; j++) {
                if(arr[j]>arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
