package Chapter09.TaskMapManagerDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TaskMapManager {
    private Map<Long, Task> tasks;

    public TaskMapManager() {
        //tasks = new HashMap<>();
        tasks = new TreeMap<>();
    }

    public void addTask(Task task){
        tasks.put(task.getId(),task);
    }

    public Task findTask(long id){
        return tasks.get(id);
    }

    public Task findTaskOrDefault(long id, Task defaultTask){
        return tasks.getOrDefault(id,defaultTask);
    }

    public boolean containsTask(long id){
        return tasks.containsKey(id);
    }

    public Task removeTask(long id){
        return tasks.remove(id);
    }

    public int size(){
        return tasks.size();
    }

    public void printAllTasks(){
        tasks.forEach((k,v)->
            System.out.println("key="+k+",value="+v)
        );
    }

}
