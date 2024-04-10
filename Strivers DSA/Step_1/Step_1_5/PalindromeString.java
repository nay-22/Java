import java.util.Scanner;

public class PalindromeString {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String str = in.next();
        System.out.println(isPalindrome(str, 0, str.length() - 1));
    }

    public static boolean isPalindrome(String str, int i, int j) {
        if (i > j) return true;
        if (str.charAt(i) != str.charAt(j)) return false;
        return isPalindrome(str, ++i, --j);
    }
}
