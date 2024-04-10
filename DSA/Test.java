package DSA;

public class Test {
    public static void main(String[] args) {
//        System.out.println("Max = " + max(1, new int[]{2, 3, 5, 8, 9, 1, 10}));
        System.out.println("Max = " + max(1,2, 3, 5, 8, 9, 1, 10));
    }
    public static int max(int first, int... rest) {
        int max = first;
        for(int i: rest) {
            if(i>max) max = i;
        }
        return max;
    }
}
