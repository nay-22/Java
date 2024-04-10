package ALGORITHMS.Week1.UnionFind;

import edu.princeton.cs.algs4.StdIn;

// Weighted Quick-Union
public class QUImproved {
    private int[] id;
    private int[] sz;

    public QUImproved(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = i;
        }
    }

    // O(log N)
    private int root(int i) {
        while(i != id[i]) {
            id[i] = id[id[i]]; //makes it O(log N) : Path Compression
            i = id[i];
        }
        return i;
    }

    // O(log N)
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    // O(log N)
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        // IMPROVEMENT CHANGES
        if (i == j) {
            id[i] = j; 
            sz[j] += sz[i];
        } else {
            id[j] = i; 
            sz[i] += sz[j];
        }

    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        QuickFind uf = new QuickFind(N);
        while(!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(uf.connected(p, q)) {
                uf.union(p, q);
                System.out.println(p + " " + q);
            }
        }
    }
    
    
}
