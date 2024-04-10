package DSA.DATA_STRUCTURES.Graphs;

import java.util.*;

public class SocialMediaGraph {
    private static long count = 0;
    private static class User {
        String name;
        long uid;
        List<User> followers;
        User (String name) {
            followers = new LinkedList<>();
            this.name = name;
            uid = count;
            count++;
        }
    }
    private static class Edge {
        User src;
        User dest;
        Edge (User src, User dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    private HashMap<User, LinkedList<Edge>> graph;
    public SocialMediaGraph () {
        graph = new HashMap<>();
    }

    public void add (User user) {
        if (!graph.containsKey(user)) {
            graph.put(user, new LinkedList<>());
        } else {
            System.out.println("User " + user.name + " already exists.");
        }
    }

    public void removeUtilBFS(User start) {
        Set<User> vis = new HashSet<>();
        Queue<User> queue = new ArrayDeque<>();
        queue.offer(start);
        while (!queue.isEmpty()) {
            User curr = queue.poll();
            if (!vis.contains(curr)) {
                graph.get(curr).removeIf(e -> Objects.equals(e.dest.name, curr.name));
                curr.followers.remove(curr);
                vis.add(curr);
                for (Edge e : graph.get(curr)) {
                    queue.offer(e.dest);
                }
            }
        }
    }

    public boolean remove (User user) {
        if (graph.containsKey(user)) {
//            removeUtilBFS();
            graph.remove(user);
            System.out.println("User " + user.name + " removed.");
            return true;
        }
        return false;
    }

//    public boolean follow (User A, User B) {
//        Edge e = new Edge(A, B);
//        LinkedList<Edge> temp = graph.get(A);
//        temp.add(new Edge(A, B));
//        graph.put(A, temp);
//        return true;
//    } // [LONG CODE]

    public boolean follow (User A, User B) {
        if (A == null || B == null)
            return false;

        B.followers.add(A);
        return graph.get(A).add(new Edge(A, B));
    }

    public boolean unfollow (User A, User B) {
        return graph.get(A).removeIf(e -> e.dest == A);
    }

    public void listFollowing (User user) {
        LinkedList<Edge> following = graph.get(user);
        for (Edge ele : following) {
            System.out.print(ele.dest.name + ", ");
        }
        System.out.println();
    }

    public List<String> getFollowing (User user) {
        List<String> following = new LinkedList<>();
        for (Edge e : graph.get(user)) {
            following.add(e.dest.name);
        }
        return following;
    }

    public List<String> getFollowers (User user) {
        List<String> f = new LinkedList<>();
        for (User u : user.followers) {
            f.add(u.name);
        }
        return f;
    }

    public void listFollowers (User user) {
        for (User u : user.followers) {
            System.out.print(u.name + ", ");
        }
        System.out.println();
    }

    public void listAllUsers () {
        System.out.println(graph);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<User, LinkedList<Edge>> entry : graph.entrySet()) {
            User user = entry.getKey();
            LinkedList<Edge> following = entry.getValue();
            sb.append("User ID: ").append(user.uid).append(", Name: ").append(user.name).append("\n");
            sb.append("Following List: ").append(getFollowing(user)).append("\n");
            sb.append("Followers List: ").append(getFollowers(user)).append("\n");
            sb.append("------------------------\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SocialMediaGraph graph = new SocialMediaGraph();
        User A = new User("A");
        User B = new User("B");
        User C = new User("C");
        User D = new User("D");
        User E = new User("E");
        graph.add(A);
        graph.add(B);
        graph.add(C);
        graph.add(D);
        graph.add(E);
        graph.follow(A, B);
        graph.follow(A, C);
        graph.follow(A, D);
        graph.follow(B, A);
        graph.follow(C, D);
        graph.follow(C, A);
        graph.follow(D, A);

        System.out.println("All Users: \n" + graph);

        graph.remove(C);

        System.out.println(graph);

    }
}
