package DSA.DATA_STRUCTURES.Graphs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class AdjacencyMatrixMain {
    public static void main(String[] args) {
        int v = 7;
        int e = 8;
        Graph graph = new Graph(v, e);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);

        graph.addEdge(1, 3);

        graph.addEdge(2, 4);

        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);

        graph.addEdge(4, 2);
        graph.addEdge(4, 3);
        graph.addEdge(4, 5);

        graph.addEdge(5, 6);

        System.out.println("---------- BFS ----------");
        graph.BFS(0);

        System.out.println("\n---------- DFS ----------");
        graph.DFS();

    }
}

class Graph {
    int v;
    int e;
    int[][] adj;
    boolean[] vis;
    public Graph(int v, int e) {
        this.v = v;
        this.e = e;
        adj = new int[v][v];
        vis = new boolean[v];
        Arrays.fill(vis, false);
        for (int i = 0; i < v; i++) {
            Arrays.fill(adj[i], 0);
        }
    }

    public void addEdge(int src, int dest, int wt) {
        adj[src][dest] = wt;
        adj[dest][src] = wt;
    }

    public void addEdge(int src, int dest) {
        adj[src][dest] = 1;
        adj[dest][src] = 1;
    }

    public void BFS(int start) {
        // For disconnected graph components
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                BFS(i, vis);
            }
        }
    }

    private void BFS(int start, boolean[] vis) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < v; i++) {
                    if (adj[curr][i] > 0 && !vis[i]) {
                        queue.offer(i);
                    }
                }
            }
        }
    }

    public void DFS() {
        Arrays.fill(vis, false);
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                DFS(i, vis);
            }
        }
    }

    private void DFS(int curr, boolean[] vis) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < v; i++) {
            if (adj[curr][i] > 0 && !vis[i]) {
                DFS(i, vis);
            }
        }
    }
}
