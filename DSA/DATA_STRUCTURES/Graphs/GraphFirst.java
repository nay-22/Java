package DSA.DATA_STRUCTURES.Graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class GraphFirst {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge (int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
        public Edge (int s, int d) {
            src = s;
            dest = d;
            wt = 0;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2, 3));

        graph[1].add(new Edge(1,2, 1));
        graph[1].add(new Edge(1,3, -2));

        graph[2].add(new Edge(2,0, 5));
        graph[2].add(new Edge(2,1, 7));
        graph[2].add(new Edge(2,3, -4));

        graph[3].add(new Edge(3,1, -1));
        graph[3].add(new Edge(3,2, 4));
    }

    public static ArrayList<Integer> getNeighbours(ArrayList<Edge>[] graph, int V) {
        ArrayList<Integer> neighbors = new ArrayList<>();
        for (Edge e : graph[V]) {
            neighbors.add(e.dest);
        } return neighbors;
    }

    public static void createGraphSix(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1,3));

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

    public static void BFS(ArrayList<Edge>[] graph, int start, int V) {
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
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

//    BFS for disconnected components in graph
    public static void BFS(ArrayList<Edge>[] graph, boolean[] visited, int start, int V) {
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

    public static void DFS(ArrayList<Edge>[] graph, boolean[] visited, int curr) {
        System.out.print(curr + " ");
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest])
                DFS(graph, visited, e.dest);
        }
    }

    //    All paths from Source to Target (DFS) O(V^V)
    public static void printAllPathDFS(ArrayList<Edge>[] graph, boolean[] vis, int curr, String path, int tar) {
        if (curr == tar) {
            System.out.println(path);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                vis[curr] = true; // IMP
                printAllPathDFS(graph, vis, e.dest, path + e.dest, tar);
                vis[curr] = false; // IMP
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraphSix(graph);

// ***************  BFS for disconnected components in graph  ***************
        System.out.println("************ BFS ***********");
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                BFS(graph, visited, i, V);
            }
        }
// **************************************************************************
        System.out.println();

// ***************  DFS for disconnected components in graph  ***************
        System.out.println("************ DFS ***********");
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFS(graph, visited, i);
            }
        }
        System.out.println();
// **************************************************************************
        printAllPathDFS(graph, new boolean[V], 0, "0", 5);
    }




}
