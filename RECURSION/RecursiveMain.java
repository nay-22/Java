package RECURSION;

// RECURSION

import java.io.*;
import java.util.*;

class RecursiveMain {
    private static final Scanner in = new Scanner(System.in);
    private static final int[] array = {1,2,3,4,5,6,7,8,9};
    private static int[] unsortedArray = {9,4,5,1,3,8,6,7,2};

    public static void printReversedString(String str, int lastCharIndex) {
        if (lastCharIndex >= 0) {
            System.out.print(str.charAt(lastCharIndex));
            printReversedString(str, --lastCharIndex);
        }
    }

    public static String getReversedString(String str) {
        if (str.equals("")) {
            return "";
        }
        return getReversedString(str.substring(1)) + str.charAt(0);
    }

    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }

        return false;
    }

    public static String getBinary(int decimal, String ans) {
        if (decimal == 0) {
            return ans;
        }
        ans = decimal%2 + ans;
        return getBinary(decimal/2, ans);
    }

    public static int naturalSum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + naturalSum(--n);
    }

    public static int binarySearch(int num, int left, int right) {

        if (left > right)
            return -1;

        int mid = (left + right)/2;
        if (array[mid] == num)
            return mid;

        if (num > array[mid])
            return binarySearch(num, mid+1, right);

        return binarySearch(num, left, mid-1);
    }

    public static long fib(long n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    // --------------------- Merge Sort --------------------------
    public static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left+right)/2;
            mergeSort(left, mid);
            mergeSort(mid+1, right);
            merge(left, mid, right);
        }
    }
    private static void merge(int left, int mid, int right) {
        int[] temp = new int[unsortedArray.length];
        int i = left, j = mid + 1, k = left;

        // while both left & right sub-arrays have values, compare and add to temp[]
        while (i <= mid && j <= right) {
            if (unsortedArray[i] < unsortedArray[j]) {
                temp[k++] = unsortedArray[i++];
            } else {
                temp[k++] = unsortedArray[j++];
            }
        }

        // add the rest of the values, if present, from the left sub-array
        while (i <= mid) {
            temp[k++] = unsortedArray[i++];
        }

        // add the rest of the values, if present, from the right sub-array
        while (j <= right) {
            temp[k++] = unsortedArray[j++];
        }

        // Copy temp[] into unsortedArray[]
        for (k = left; k <= right; k++) {
            unsortedArray[k] = temp[k];
        }
    }
    // -----------------------------------------------------------

    public static void moveToEndOfStringLoop(String s, String ele) {
        int count = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ele.charAt(0)) {
                str.append(s.charAt(i));
            } else {
                count++;
            }
        }
        str.append(ele.repeat(count));
        System.out.println(str);
    }
    private static void moveToEndOfString(String og, StringBuilder str, String ele, int i, int c) {
        if (i < og.length()) {
            if (og.charAt(i) != ele.charAt(0)) {
                str.append(og.charAt(i));
                moveToEndOfString(og, str, ele, ++i, c);
            } else {
                moveToEndOfString(og, str, ele, ++i, ++c);
            }
        } else {
            System.out.println(str.append(ele.repeat(c)));
        }
    }
    public static void moveToEndOfString(String str, String ele) {
        moveToEndOfString(str, new StringBuilder(""), ele, 0, 0);
    }

    public static void removeDuplicatesInString(String s) {
        boolean[] contains = new boolean[26];
        Arrays.fill(new boolean[26], false);
        removeDuplicatesInString(s, new StringBuilder(""), contains, 0);
    }
    private static void removeDuplicatesInString(String s, StringBuilder str, boolean[] contains, int i) {
        if (i < s.length()) {
            char curr = s.charAt(i);
            if (!contains[curr - 'a']) {
                str.append(curr);
                contains[curr - 'a'] = true;
            }
            removeDuplicatesInString(s, str, contains, ++i);
        } else {
            System.out.println(str);
        }
    }

    // PRINT SUBSEQUENCES OF STRING (!! IMPORTANT !!)
    public static void stringSubsequences(String s, String str, int i) {
        if (i == s.length()) {
            System.out.println(str);
            return;
        }
        char curr = s.charAt(i);
        stringSubsequences(s, str + curr, i+1);
        stringSubsequences(s, str, i+1);
    }

    private static Set<String> set = new HashSet<>();
    public static void uniqueStringSubsequences(String s, String str, int i) {
        if (i == s.length()) {
            if (!set.contains(str)) {
                System.out.println(str);
                set.add(str);
            }
            return;
        }
        char curr = s.charAt(i);
        uniqueStringSubsequences(s, str + curr, i+1);
        uniqueStringSubsequences(s, str, i+1);
    }

    public static void main (String[] args) {
        // String str = in.nextLine();
        // System.out.println("printReversedString(String str, int index)");
        // printReversedString(str, str.length() - 1);

        // System.out.println("\n\ngetReversedString(String str)");
        // System.out.println(getReversedString(str));

        // System.out.println("\nisPalindrome(String str)");
        // System.out.println(isPalindrome(str));

//        int decimal = in.nextInt();
//        System.out.println("\ngetBinary(int decimal)");
//        System.out.println(getBinary(decimal, ""));
//
//        System.out.println("\nnaturalSum(int n)");
//        System.out.println(naturalSum(decimal));
//
//        System.out.println("\nbinarySearch(int num)");
//        int index = binarySearch(decimal, 0, array.length-1);
//        System.out.println((index==-1)?"Not Found":"Found At Index => " + index);
//
//        System.out.println("\nfib(int n)");
//        System.out.println(fib(decimal));
//
        System.out.println("\nUnsorted Array");
        System.out.println(Arrays.toString(unsortedArray));

        System.out.println("\nAfter MergeSort");
        mergeSort(0, unsortedArray.length-1);
        System.out.println(Arrays.toString(unsortedArray));

        // runIt();

//        System.out.println("\nMove char elements to end");
//        moveToEndOfString("axbcxxd", "x");
//
////        System.out.println(Character.getNumericValue('z'));
//        System.out.println("\nRemove Duplicates From String");
//        removeDuplicatesInString("abccda");
//
//        System.out.println("\nString Subsequences");
//        stringSubsequences("abc", "", 0);
//
//        System.out.println("\nString Unique Subsequences");
//        uniqueStringSubsequences("aaa", "", 0);

    }




































}
