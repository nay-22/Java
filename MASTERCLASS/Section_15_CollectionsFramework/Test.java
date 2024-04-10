package MASTERCLASS.Section_15_CollectionsFramework;

import java.beans.BeanProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    private static List<Integer> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int result = largestFibonacciNumber(n);
//            System.out.println(result);
            list.add(result);
        }
        list.forEach(System.out::println);
        sc.close();
    }

    static int largestFibonacciNumber(int n){
        if (n == 0) return 0;
        int a = 0;
        int b = 1;
        int c = a + b;
        while (c < n) {
            a = b;
            b = c;
            c = a + b;
        }
        return b;
    }
}
