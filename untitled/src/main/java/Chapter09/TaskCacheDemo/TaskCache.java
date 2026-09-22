package Chapter09.TaskCacheDemo;

import java.util.*;

public class TaskCache {
    private LinkedHashMap<String, Task> taskCache;
    private WeakHashMap<Task, String> taskMetadata;

    public TaskCache(){
        this.taskCache  = new LinkedHashMap<>(3,0.75f,true)
        {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest){
                return size() > 3;
            }
        };
        this.taskMetadata = new WeakHashMap<>();
    }
    //获取任务
    public Task get(String taskId){
        return taskCache.get(taskId);
    }
    //添加任务
    public void put(Task task){
        taskCache.put(task.getId(),task);
    }
    //保存任务元数据
    public void putMetadata(Task task, String metadata){
        taskMetadata.put(task, metadata);
    }
    //获取任务元数据
    public String getMetadata(Task task){
        return taskMetadata.get(task);
    }
    //查看当前缓存中的任务 ID
    //这里要求返回List，但是keySet默认是Set，不知道这种需求的目的是什么？
    //写了两种，由于stream还没学，所以用的是返回Set的代码
//    public List<String> getCachedTaskIds(){
//        return taskCache.keySet().stream().toList();
//    }
    public Set<String> getCachedTaskIds(){
        return taskCache.keySet();
    }
}
