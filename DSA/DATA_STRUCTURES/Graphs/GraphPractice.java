package DSA.DATA_STRUCTURES.Graphs;

import java.util.*;

public class GraphPractice {
    static class Edge {
        int src, dest, wt;
        public Edge (int s, int d) {
            this.src = s;
            this.dest = d;
        }
        public Edge (int s, int d, int wt) {
            this (s, d);
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

    }

    public static List<Integer> getNeighbors(ArrayList<Edge>[] graph, int V) {
        List<Integer> neighbors = new ArrayList<>();
        for (Edge e: graph[V]) {
            neighbors.add(e.dest);
        }
        return neighbors;
    }

    public static void BFS(ArrayList<Edge>[] graph, int start, boolean[] visited) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (Edge e : graph[curr]) {
                    queue.offer(e.dest);
                }
            }
        }
    }

    public static void DFS(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        System.out.print(curr + " ");
        visited[curr] = true;
        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                DFS(graph, e.dest, visited);
            }
        }
    }

    // modified DFS
    public static void printAllPaths(ArrayList<Edge>[] graph, int curr, int tar, boolean[] vis, String path) {
        if (curr == tar) {
            System.out.println(path);
            return;
        }
        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                vis[curr] = true;
                printAllPaths(graph, e.dest, tar, vis, path + " --> " + e.dest);
                vis[curr] = false;
            }
        }
    }

    public static void createGraphDirected(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }
    public static boolean isCyclicDirected(ArrayList<Edge>[] graph, boolean[] vis, int curr, boolean[] rec) {
        vis[curr] = true;
        rec[curr] = true;
        for (Edge e : graph[curr]) {
            if (rec[e.dest]) {
                return true;
            } else if (!vis[e.dest] && isCyclicDirected(graph, vis, e.dest, rec)) {
                return true;
            }
        }
        rec[curr] = false;
        return false;
    }

    public static void createGraphUndirected(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
//        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
//        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));

    }
    public static boolean isCycleUndirected(ArrayList<Edge>[] graph, boolean[] vis, int curr, int parent) {
        vis[curr] = true;
        for (Edge e : graph[curr]) {
            if (vis[e.dest] && e.dest != parent) {
                return true;
            } else if (!vis[e.dest]) {
                if(isCycleUndirected(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void createDijkstraGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }
    public static class Pair implements Comparable<Pair> {
        int node, dist;
        public Pair(int d, int n) {
            dist = d;
            node = n;
        }
        @Override
        public int compareTo(Pair pair) {
            return this.dist - pair.dist; //ascending order
        }
    }
    public static void dijkstra(ArrayList<Edge>[] graph, int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist = new int[V];
        for (int i = 0; i < V; i++)
            if (i != src)
                dist[i] = Integer.MAX_VALUE;
        Set<Integer> vis = new HashSet<>();
        pq.add(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis.contains(curr.node)) {
                vis.add(curr.node);
                for (Edge e : graph[curr.node]) {
                    int u = e.src;
                    int v = e.dest;
                    if (dist[u] + e.wt < dist[v]) { // RELAXATION CRITERIA
                        dist[v] = dist[u] + e.wt;
                        pq.add(new Pair(dist[v], v));
                    }
                }
            }
        }
        for (int i = 0; i < V; i++) {
            System.out.println("dist[" + i + "] = " + dist[i]);
        }
    }

    public static void createBellmanGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
        // graph[4].add(new Edge(4, 1, -10)); // Check for negative weight cycles
    }
    public static void bellmanFord(ArrayList<Edge>[] graph, int src, int V) {
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != src) dist[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < V-1; i++) {
            System.out.println(Arrays.toString(dist));
            for (int j = 0; j < V; j++) {
                for (Edge e : graph[j]) {
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v])
                        dist[v] = dist[u] + wt;
                }
            }
        }
        for (int j = 0; j < V; j++) {
            for (Edge e : graph[j]) {
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v])
                    System.out.println("Negative weight cycle exists");
            }
        }
        for (int d : dist) {
            System.out.print(d + " ");
        }
    }

    public static void createMSTGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }
    public static void MST_Prims(ArrayList<Edge>[] graph) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // O(ELogE)
        Set<Integer> vis = new HashSet<>();
        pq.add(new Pair(0, 0));
        int mst_cost = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis.contains(curr.node)) {
                vis.add(curr.node);
                mst_cost += curr.dist;
                for (Edge e : graph[curr.node]) {
                    if (!vis.contains(e.dest)) {
                        pq.add(new Pair(e.wt, e.dest));
                    }
                }
            }
        }
        System.out.println("Final MST Cost = " + mst_cost);
    }



    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        List<Integer> neighbors = getNeighbors(graph, 4);

        System.out.println("----------------- Neighbors of " + 4 + " ---------------------\n" + neighbors);

        System.out.println("----------------------- BFS --------------------------");
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                BFS(graph, i, visited);
            }
        }

        System.out.println("\n----------------------- DFS --------------------------");
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFS(graph, i, visited);
            }
        }

        System.out.println("\n----------------- Print All Paths --------------------");
        printAllPaths(graph, 0, 5, new boolean[V], "0");

        ArrayList<Edge>[] directedGraph = new ArrayList[4];
        createGraphDirected(directedGraph);
        System.out.println("\n---------------- isCycle? Directed -------------------");
        boolean[] vis = new boolean[4];
        boolean[] rec = new boolean[4];
//        boolean isCycle;
        for (int i = 0; i < 4; i++) {
            if (!vis[i]) {
                boolean isCycle = isCyclicDirected(directedGraph, vis, 0, rec);
                if (isCycle) {
                    System.out.println(true);
                    break;
                } else {
                    System.out.println(false);
                    break;
                }
            }
        }

        System.out.println("\n--------------- isCycle? UnDirected ------------------");
        ArrayList<Edge>[] undirectedGraph = new ArrayList[6];
        createGraphUndirected(undirectedGraph);
        boolean isIt = isCycleUndirected(graph, new boolean[undirectedGraph.length], 0, -1);
        System.out.println(isIt);

        System.out.println("\n--------------- Dijkstra's Algorithm ------------------");
        ArrayList<Edge>[] d_graph = new ArrayList[6];
        createDijkstraGraph(d_graph);
        dijkstra(d_graph, 0, 6);

        System.out.println("\n-------------- Bellman-Ford Algorithm ------------------");
        ArrayList<Edge>[] bf_graph = new ArrayList[5];
        createBellmanGraph(bf_graph);
        bellmanFord(bf_graph, 0, 5);

        System.out.println("\n--------------- MST Prim's Algorithm -------------------");
        ArrayList<Edge>[] mst_graph = new ArrayList[4];
        createMSTGraph(mst_graph);
        MST_Prims(mst_graph);
    }
}
