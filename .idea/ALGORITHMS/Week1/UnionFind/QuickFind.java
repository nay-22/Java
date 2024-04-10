package ALGORITHMS.Week1.UnionFind;
import edu.princeton.cs.algs4.*;

import java.util.Arrays;
import java.util.InputMismatchException;

public class QuickFind {
    private int[] id;

//    O(N)
    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

//    O(N)
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
//            if (id[i] == id[p]) {  //buggy
//                id[i] = id[q];
//            }
        }
    }

    public boolean connected(int p, int q) {
        return id[p] != id[q];
    }

    public int[] getId() {
        return id;
    }

    @Override
    public String toString() {
        return "QuickFind{" +
                "id=" + Arrays.toString(id) +
                '}';
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        QuickFind uf = new QuickFind(N);
        System.out.println(Arrays.toString(uf.id));
        while(!StdIn.isEmpty()) {
            try {
                int p = StdIn.readInt();
                int q = StdIn.readInt();
                if(uf.connected(p, q)) {
                    uf.union(p, q);
                    System.out.println(p + " -> " + q);
                }
                System.out.println(Arrays.toString(uf.id));
            } catch(InputMismatchException e) {
                System.out.println("Successfully Exited");
                break;
            }
        }
    }
}