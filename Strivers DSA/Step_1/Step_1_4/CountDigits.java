import java.util.Scanner;

public class CountDigits {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        int c = 0;
        System.out.println((int)(Math.floor(Math.log10(n)) + 1)); // O(1) => IMP!
        while (n != 0) { // O(digits)
            c++;
            n = n / 10;
        }
        System.out.println(c);
    }
}