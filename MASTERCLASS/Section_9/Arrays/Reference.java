package MASTERCLASS.Section_9.Arrays;

import java.util.Arrays;

public class Reference {
    public static void main(String[] args) {
        int val = 10;
        int otherVal = val;
        System.out.println("Val = "+val);
        System.out.println("Other Val = "+otherVal);

        otherVal++;

        System.out.println("Val = "+val);
        System.out.println("Other Val = "+otherVal);

        int[] arr = new int[5];
        int[] otherArr = arr;

        System.out.println("Arr = "+ Arrays.toString(arr));
        System.out.println("Other Arr = "+ Arrays.toString(otherArr));

        otherArr[0] = 1;
        arr[4] = 3;

        System.out.println("After Arr = "+ Arrays.toString(arr));
        System.out.println("After Other Arr = "+ Arrays.toString(otherArr));
    }
}
