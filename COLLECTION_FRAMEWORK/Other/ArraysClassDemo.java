package COLLECTION_FRAMEWORK.Other;

import java.util.Arrays;

public class ArraysClassDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(arr,4);
        System.out.println("Index of element = "+index);

        int[] array = {98,23,65,71,12,33,91,32};
        Arrays.sort(array);
        for(int i: array) {
            System.out.print(i+" ");
        }
    }
}
