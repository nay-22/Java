package ALGORITHMS.Week1.UnionFind;

import edu.princeton.cs.algs4.StdIn;
import java.util.Arrays;

// All Operation take O(N) time
public class QuickUnion {
    private int[] id;

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
    }

    private int root(int i) {
        while(i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    @Override
    public String toString() {
        return "QuickUnion{" +
                "id=" + Arrays.toString(id) +
                '}';
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        QuickUnion uf = new QuickUnion(N);
        System.out.println(Arrays.toString(uf.id));
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                System.out.println(p + " -> " + q);
            }
            System.out.println(Arrays.toString(uf.id));
        }
    }
}
