package DSA.DATA_STRUCTURES.Stack;

public class TOH {
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'B', 'C');
    }
    public static void towerOfHanoi(int N, char FROM_ROD, char TO_ROD, char AUX_ROD) {
        if (N == 0) return;
        towerOfHanoi(N-1, FROM_ROD, AUX_ROD, TO_ROD);
        System.out.println("Move disk " + N + " from rod " + FROM_ROD + " to rod " + TO_ROD);
        towerOfHanoi(N - 1, AUX_ROD, TO_ROD, FROM_ROD);
    }
}
