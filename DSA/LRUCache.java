package DSA;

import java.util.*;

public class LRUCache {
    private Deque<Integer> queue;
    private Set<Integer> set;
    private final int CACHE_SIZE;

    public LRUCache(int cache_size) {
        CACHE_SIZE = cache_size;
        queue = new LinkedList<>();
        set = new HashSet<>();
    }

    public void refer(int page) {
        if (!set.contains(page)) {
            if (queue.size() == CACHE_SIZE) {
                int last = queue.removeLast();
                set.remove(last);
            }
        } else {
            queue.remove(page);
        }
        queue.push(page);
        set.add(page);
    }

    public void display() {
        for (int ele : queue) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(4);
        cache.refer(1);
        cache.refer(2);
        cache.refer(3);
        cache.refer(1);
        cache.refer(4);
        cache.refer(5);
        cache.display();
    }
}
