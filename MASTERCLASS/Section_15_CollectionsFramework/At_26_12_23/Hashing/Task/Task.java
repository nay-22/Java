package MASTERCLASS.Section_15_CollectionsFramework.At_26_12_23.Hashing.Task;

enum Status {
    ASSIGNED, IN_PROGRESS, IN_QUEUE;
}
enum Priority {
    HIGH, LOW, MEDIUM;
}

public class Task implements Comparable<Task> {

    @Override
    public int compareTo(Task o) {
        int result = this.projectName.compareTo(o.projectName);
        if (result == 0) {
            result = this.description.compareTo(o.description);
        }
        return result;
    }

    private String assignee;
    private String projectName;
    private String description;
    private Status status;
    private Priority priority;

    public Task(String assignee, String projectName, String description, Status status, Priority priority) {
        this.assignee = assignee;
        this.projectName = projectName;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public Task(String assignee, String projectName, String description, Priority priority) {
        this(assignee, projectName, description, assignee == null ? Status.IN_QUEUE : Status.ASSIGNED, priority);
    }

    public Task(String projectName, String description, Priority priority) {
        this(null,projectName, description, priority);
    }

    @Override
    public String toString() {
        return "%-20s %-25s %-10s %-10s %s".formatted(projectName, description, priority, assignee, status);
    }

    @Override
    public int hashCode() {
        int result = getProjectName().hashCode();
        result = 31 * result + getDescription().hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Task task = (Task) obj;
        if (!getProjectName().equals(task.getProjectName())) return false;
        return getDescription().equals(task.getDescription());
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
