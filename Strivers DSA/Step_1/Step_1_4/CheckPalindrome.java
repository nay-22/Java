import java.util.Scanner;

public class CheckPalindrome {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        if (n == revNumUsingString(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static int revNumUsingString(int n) {
        StringBuilder num = new StringBuilder(String.valueOf(n)).reverse();
        return Integer.parseInt(num.toString());
    }
}
