package Chapter09.TaskCollectionManagerDemo;

import java.util.*;

public class TaskManager {
    private List<Task> tasks;
    private Set<String> tags;
    private Set<Integer> priorities;

    public TaskManager(List<Task> tasks, Set<String> tags, Set<Integer> priorities) {
        this.tasks = tasks;
        this.tags = tags;
        this.priorities = priorities;
    }

    //方法 1：添加任务
    public void addTask(Task task){
        tasks.add(task);
    }

    //方法 2：按索引获取任务
    public Task getTask(int index){
        return tasks.get(index);
}

    //方法 3：添加标签
    public void addTag(String tag){
        tags.add(tag);
    }

    //方法 4：判断标签是否存在
    public boolean containsTag(String tag){
        return tags.contains(tag);
    }

    //方法 5：添加优先级
    public void addPriority(int priority){
        priorities.add(priority);
    }

    //方法 6：获取所有优先级
    public Set<Integer> getPriorities(){
        return priorities;
    }
}
