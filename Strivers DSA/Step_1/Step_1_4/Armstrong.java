// import java.util.Scanner;

public class Armstrong {
    // private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arms = {0, 1, 123, 153, 632, 370, 170, 371, 88, 407, 1634};
//        int n = in.nextInt();
        for (int n : arms) {
            System.out.print(n + ": ");
            if (n == isArmstrong(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static int isArmstrong(int n) {
        int sum = 0;
        while (n != 0) {
            sum += Math.pow(n % 10, 3);
            n /= 10;
        }
        return sum;
    }
}
