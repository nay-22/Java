public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(99));
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        int f = fib(n - 1);
        int s = fib(n - 1);
        return f + s;
    }
}
