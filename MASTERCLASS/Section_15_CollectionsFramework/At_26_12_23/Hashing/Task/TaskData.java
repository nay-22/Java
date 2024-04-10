package MASTERCLASS.Section_15_CollectionsFramework.At_26_12_23.Hashing.Task;

import java.util.*;

public class TaskData {
    private static final String tasks = """
            Infrastructure, Logging, High
            Infrastructure, DB Access, Medium
            Infrastructure, Security, High
            Infrastructure, Password Policy, Medium
            Data Design, Task Table, Medium
            Data Design, Employee Table, Medium
            Data Design, Cross Reference Tables, High
            Data Design, Encryption Policy, High
            Data Access, Write Views, Low
            Data Access, Set Up Users, Low
            Data Access, Set Up Access Policy, Low
            """;

    private static final String annsTasks = """
            Infrastructure, Security, High, In Progress
            Infrastructure, Password Policy,Medium, In Progress
            Research, Cloud solutions, Medium, In Progress
            Data Design, Encryption Policy, High
            Data Design, Project Table, Medium
            Data Access, Write Views, Low, In Progress
            """;

    private static final String bobsTasks = """
            Infrastructure, Security, High, In Progress
            Infrastructure, Password Policy, Medium
            Data Design, Encryption Policy, High
            Data Access, Write Views, Low, In Progress
            """;

    private static final String carolsTasks = """
            Infrastructure, Logging, High, In Progress
            Infrastructure, DB Access, Medium
            Infrastructure, Password Policy, Medium
            Data Design, Task Table, High
            Data Access, Write Views, Low
            """;

    public static Set<Task> getTasks(String owner) {
        Set<Task> taskSet = new HashSet<>();
        String user = ("ann,bob,carol".contains(owner.toLowerCase())) ? owner : null;
        String selectedTaskList = switch (owner.toLowerCase()) {
            case "ann" -> annsTasks;
            case "bob" -> bobsTasks;
            case "carol" -> carolsTasks;
            default -> tasks;
        };
        String[] taskLists = selectedTaskList.split("\n");
        for (String t : taskLists) {
            String[] data = t.split(",");
            Arrays.asList(data).replaceAll(String::trim);
            Status status = (data.length <= 3) ? Status.IN_QUEUE :
                    Status.valueOf(data[3].toUpperCase()
                            .replace(' ', '_'));
            Priority priority = Priority.valueOf(data[2].toUpperCase());
            taskSet.add(new Task(user, data[0], data[1], status, priority));
        }
        return taskSet;
    }

}
