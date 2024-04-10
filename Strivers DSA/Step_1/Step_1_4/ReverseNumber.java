import java.util.Scanner;

public class ReverseNumber {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        System.out.println(revNumTypical(n));
        System.out.println(revNumUsingString(n));
    }

    private static int revNumTypical(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        return rev;
    }

    public static int revNumUsingString(int n) {
        StringBuilder num = new StringBuilder(String.valueOf(n)).reverse();
        return Integer.parseInt(num.toString());
    }
}
