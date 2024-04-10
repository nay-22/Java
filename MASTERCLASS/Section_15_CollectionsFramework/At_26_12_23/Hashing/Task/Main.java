package MASTERCLASS.Section_15_CollectionsFramework.At_26_12_23.Hashing.Task;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All Tasks", tasks);

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> annsTasks = TaskData.getTasks("ann");
        sortAndPrint("Ann's Tasks", annsTasks, sortByPriority);

        Set<Task> bobsTasks = TaskData.getTasks("bob");
        Set<Task> carolsTasks = TaskData.getTasks("carol");
        List<Set<Task>> sets = List.of(annsTasks, bobsTasks, carolsTasks);

        Set<Task> assignedTasks = getUnion(sets);
        sortAndPrint("Assigned Tasks", assignedTasks);


    }

    private static Set<Task> getUnion(List<Set<Task>> sets) {
        Set<Task> union = new HashSet<>();
        for (var task : sets) {
            union.addAll(task);
        }
        return union;
    }

    private static Set<Task> getIntersection(Set<Task> A, Set<Task> B) {
        Set<Task> intersect = new HashSet<>(A);
        intersect.retainAll(B);
        return intersect;
    }

    private static Set<Task> getAMinusB(Set<Task> A, Set<Task> B) {
        Set<Task> res = new HashSet<>(A);
        res.removeAll(B);
        return res;
    }

    private static void sortAndPrint(String header, Collection<Task> collection) {
        sortAndPrint(header, collection, null);
    }

    private static void sortAndPrint(String header, Collection<Task> collection, Comparator<Task> sorter) {
        System.out.println("-".repeat(80));
        System.out.println(header);
        System.out.println("-".repeat(80));
        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
        System.out.println("-".repeat(80));
    }
}
