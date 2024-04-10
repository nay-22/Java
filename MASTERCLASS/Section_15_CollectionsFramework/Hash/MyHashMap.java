package MASTERCLASS.Section_15_CollectionsFramework.Hash;

import java.util.LinkedList;

public class MyHashMap {
    static class HashMap<K,V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node>[] buckets; //Store HashMap

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            return Math.abs(key.hashCode()) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if(ll.get(i) == key) {
                    return i; //di
                }
            }
            return -1;
        }

        private void reHashFunction() {
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N*2];
            for (int i = 0; i < N*2; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }

        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                Node data = buckets[bi].get(di);
                data.value = value;
            }
            double lambda = (double)n/N;
            if (lambda > 2.0) {
                reHashFunction();
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("USA", 120);
        map.put("China", 180);
        map.put("Japan", 90);
        map.put("South Korea", 70);
        map.put("Italy", 30);
    }
}
