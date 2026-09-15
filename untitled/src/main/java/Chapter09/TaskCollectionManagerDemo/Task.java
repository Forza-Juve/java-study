package Chapter09.TaskCollectionManagerDemo;

import java.util.Objects;

public class Task {
    private String title;
    private int priority;

    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return priority == task.priority && Objects.equals(title, task.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, priority);
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", priority=" + priority +
                '}';
    }
}
/*
hashcode和equals是IDEA生成的
 */