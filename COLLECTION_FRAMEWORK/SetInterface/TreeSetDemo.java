package COLLECTION_FRAMEWORK.SetInterface;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add(45);
        treeSet.add(12);
        treeSet.add(19);
        treeSet.add(6);
        treeSet.add(-1);
        System.out.println(treeSet);
    }
}
