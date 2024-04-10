import java.util.Scanner;

public class GCD {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(getGCD(n1, n2));
        System.out.println(getGCDOptimal(n1, n2));
    }

    public static int getGCD(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) gcd = i;
        }
        return gcd;
    }

    public static int getGCDOptimal(int n1, int n2) {
        if (n2 == 0) return n1;
        return getGCDOptimal(n2, n1 % n2);
    }
}
