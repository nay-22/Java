package DSA.DATA_STRUCTURES.PriorityQueue;

import java.util.ArrayList;

public class Ex6Heap {
    ArrayList<Integer> arr;

    public static void main(String[] args) {
        Ex6Heap maxheap = new Ex6Heap();
        maxheap.insert(50);
        maxheap.insert(40);
        maxheap.insert(45);
        maxheap.insert(30);
        maxheap.insert(20);
        maxheap.insert(35);
        maxheap.insert(10);

        System.out.println(maxheap.arr);
    }

    public void insert(int element) {
        arr.add(element);
        int i = arr.indexOf(element);
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (parent < arr.get(i)) {
                int temp = arr.get(i);
                arr.set(i, parent);
                arr.set((i - 1) / 2, temp);
                i = parent;
            } else {
                return;
            }
        }
    }
}