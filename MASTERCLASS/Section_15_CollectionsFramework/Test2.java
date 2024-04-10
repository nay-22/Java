package MASTERCLASS.Section_15_CollectionsFramework;

import java.util.Scanner;

public class Test2 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String args[]) {
        int T = in.nextInt();
        for (int t = 0; t < T; t++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(maximumDiamonds(a, b, 0));
        }
    }


    private static int maximumDiamonds(int a, int b, int tools) {
        if (a < 1 && b < 1) return tools-1;
        if (a < 1 || b < 1) return tools-1;
        return Math.max(maximumDiamonds(a-2, b-1, tools+1), maximumDiamonds(a-1, b-2, tools+1));
    }
}
